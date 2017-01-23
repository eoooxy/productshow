/**
 * Created by Administrator on 2017/1/23.
 */

var page = 0, pageSize = 15

$(function () {
    $('#childType').click(function () {
        //给select赋值
        $.ajax({
            type: "post",
            url: "three_mainType.json",
            dataType: "json",
            //data: data,
            success: function (data) {
                var obj = data.dtos;
                console.log(obj);
                $("#fatherselect").empty();
                $("#fatherselect").append("<option> </option>");
                for (var i = 0; i < obj.length; i++) {
                    $("#fatherselect").append("<option value='" + obj[i].recId + "'>" + obj[i].productMainType + "</option>");
                }
            }
        });
    });
    $('#mainType').click(function () {
        $("#fatherselect").empty();
    });

})


function back_getProDes(totalPage, mark) {

    $("#desEditMain input").val("");
    $("#desEditChild input").val("");

    var val = $('input:radio[name="proType"]:checked').val();
    var data;
    if (val == null) {
        msgShow('系统提示', '必须选定一个类别！', 'warning');
        return false;
    }
    if (val == "mainType") {
        page = 0;
        data = {"pageSize": pageSize, "page": page};
        $.ajax({
            type: "post",
            url: "mainType.do",
            dataType: "html",
            data: data,
            success: function (data) {
                $("#desTableDiv").html(data);
                if (mark == true) {
                    $("#pageNum").text("");
                    var lables = page + 1 + "/" + totalPage;
                    $("#pageNum").html(lables);
                }
            }
        });
    } else {
        page = 0;
        var fkRecId = $("#fatherselect option:selected").val();
        if (fkRecId == "" || fkRecId == null) {
            msgShow('系统提示', '必须选定一个子类', 'warning');
            return false;
        } else {
            data = {"fkRecId": fkRecId, "pageSize": pageSize, "page": page};
            $.ajax({
                type: "post",
                url: "childType.do",
                dataType: "html",
                data: data,
                success: function (data) {
                    $("#desTableDiv").html(data);
                    if (mark == true) {
                        $("#pageNum").text("");
                        var lables = page + 1 + "/" + totalPage;
                        $("#pageNum").html(lables);
                    }
                }
            });
        }
    }
}

function back_addPage(totalPage) {
    page += 1;
    if (page > totalPage - 1) {
        msgShow('系统提示', '已经最后一页啦！', 'warning');
        page -= 1;
        return false;
    } else {
        back_getProDes(totalPage, true);
    }
}

function back_subPage(totalPage) {
    page -= 1;
    if (page < 0) {
        msgShow('系统提示', '已经是第一页啦！', 'warning');
        page = 0;
        return false;
    } else {
        back_getProDes(totalPage, true);
    }
}

function back_edit(id, mark) {
    console.log(mark);
    var data;
    switch (mark) {
        case 'child' :
            data = {"id": id};
            $.ajax({
                type: "post",
                url: "getChildByPk.json",
                dataType: "json",
                data: data,
                success: function (data) {
                    var obj = data.dto;
                    $("#recIdChild").val(obj.recId);
                    $("#productChildType").val(obj.productChildType);
                    $("#productTitleChild").val(obj.productTitle);
                    $("#productDesChild").val(obj.productDes);
                    $("#fkChildRecIdChild").val(obj.fkRecId);
                    $("#recIdChildDes").val(obj.recIdDes);

                    $("#fkChildValue").val("隶属于：" + $("#fatherselect option:selected").text());
                    $("#desEditMain").hide();
                    $("#desEditChild").show();

                }
            });
            break;
        case'main':
            data = {"id": id};
            $.ajax({
                type: "post",
                url: "getMainByPk.json",
                dataType: "json",
                data: data,
                success: function (data) {
                    var obj = data.dto;
                    $("#recIdMain").val(obj.recId);
                    $("#productMainType").val(obj.productMainType);
                    $("#productTitleMain").val(obj.productTitle);
                    $("#productDesMain").val(obj.productDes);
                    $("#recIdMainDes").val(obj.recIdDes);

                    $("#desEditChild").hide();
                    $("#desEditMain").show();
                }
            });
            break;
    }
}


function back_addPro(mark) {

    var val = $('input:radio[name="proType"]:checked').val();
    if (val == null) {
        msgShow('系统提示', '必须选定一个类别！', 'warning');
        return false;
    }
    switch (mark) {
        case 'child' :
            if ($("#productChildType").val() == "" || $("#productTitleChild").val() == "" || $("#productDesChild").val() == "" || $("#mainpic").val()) {
                msgShow('系统提示', '类别、标题、内容、图片不能为空', 'warning');
                return false;
            }
            break;
        case 'main':
            if ($("#productMainType").val() == "" || $("#productTitleMain").val() == "" || $("#productDesMain").val() == "" || $("#childPic").val()) {
                msgShow('系统提示', '类别、标题、内容、图片不能为空', 'warning');
                return false;
            }
            break;
    }

    var data = $("#desProFormMain").serialize();
    console.log(data);

}

function saveProDes(mark) {

    var val = $('input:radio[name="proType"]:checked').val();
    if (val == null) {
        msgShow('系统提示', '必须选定一个类别！', 'warning');
        return false;
    }
    switch (mark) {
        case 'child' :
            if ($("#productChildType").val() == "" || $("#productTitleChild").val() == "" || $("#productDesChild").val() == "" || $("#mainpic").val()) {
                msgShow('系统提示', '类别、标题、内容、图片不能为空', 'warning');
                return false;
            }
            break;
        case 'main':
            if ($("#productMainType").val() == "" || $("#productTitleMain").val() == "" || $("#productDesMain").val() == "" || $("#childPic").val()) {
                msgShow('系统提示', '类别、标题、内容、图片不能为空', 'warning');
                return false;
            }
            break;

    }
    var data = $("#desProFormMain").serialize();
    console.log(data);
    $.ajax({
        type: "post",
        url: "editDes.json",
        dataType: "json",
        data: data,
        success: function (data) {
        }
    });


}


// 图片转base64
function imgChange(obj, mark) {
    var file = obj.files[0];
    //判断类型是不是图片
    if (!/image\/\w+/.test(file.type)) {
        msgShow('系统提示', '请确保文件为图像类型', 'warning');
        return false;
    }
    var reader = new FileReader();
    reader.readAsDataURL(file);
    reader.onload = function (e) {
        if (mark == "main") {
            $("#productMainUrl").val(this.result);
        } else {
            $("#productChildUrl").val(this.result);
        }
    }

}
function msgShow(title, msgString, msgType) {
    $.messager.alert(title, msgString, msgType);
}