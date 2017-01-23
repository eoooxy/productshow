/**
 * Created by Administrator on 2017-1-12 0012.
 */

$(function () {

    $('#desPro').window({
        title: '修改产品参数',
        width: 370,
        height: 450,
        modal: true,
        shadow: true,
        closed: true,
        resizable: false,
        draggable: false
    });

});

var page = 0, pageSize = 15, state;

function back_getProDes(totalPage, mark) {

    var data;
    var childRecId = $("#childselect option:selected").val();
    var fatherRecId = $("#fatherselect option:selected").val();
    if (childRecId == null || fatherRecId == null || childRecId == "" || fatherRecId == "") {
        msgShow('系统提示', '带*的必选！', 'warning');
        return;
    }
    var paramA = $("#parameterselect option:selected").text().trim();
    if (paramA == null || paramA == "" || paramA == " ") {
        data = {"childRecId": childRecId, "paramA": null, "page": page, "pageSize": pageSize};
    } else {
        data = {"childRecId": childRecId, "paramA": paramA, "page": page, "pageSize": pageSize};
    }

    $.ajax({
        type: "post",
        url: "table.do",
        dataType: "html",
        data: data,
        success: function (data) {
            $("#tableDiv").html(data);
            if (mark == true) {
                $("#pageNum").text("");
                var lables = page + 1 + "/" + totalPage;
                $("#pageNum").html(lables);
            }
        }
    });

}


function back_getChildType() {
    var fkRecId = $("#fatherselect option:selected").val();
    if (fkRecId == "" || fkRecId == null) {
        $("#childselect").empty();
        $("#parameterselect").empty();
        return;
    }
    console.log(fkRecId);
    var data = {"fkRecId": fkRecId};

    $.ajax({
        type: "post",
        url: "childType.json",
        dataType: "json",
        data: data,
        success: function (data) {
            var obj = data.childTypeDto;
            console.log(obj);
            $("#childselect").empty();
            $("#childselect").append("<option> </option>");
            for (var i = 0; i < obj.length; i++) {
                $("#childselect").append("<option value='" + obj[i].recId + "'>" + obj[i].productChildType + "</option>");
            }
            page = 0;
        }
    });

}

function back_getParam() {
    var fkRecId = $("#childselect option:selected").val();
    if (fkRecId == "" || fkRecId == null) {
        $("#parameterselect").empty();
        return;
    }

    console.log(fkRecId);
    var data = {"fkRecId": fkRecId};

    $.ajax({
        type: "post",
        url: "selectA.json",
        dataType: "json",
        data: data,
        success: function (data) {
            var obj = JSON.parse(data.mapList);
            console.log(obj);
            $("#parameterselect").empty();
            $("#parameterselect").append("<option> </option>");
            $.each(obj, function (idx, o) {
                console.log(o.name);
                $("#parameterselect").append("<option value='" + o.recId + "'>" + o.name + "</option>");
            });
            page = 0;
        }
    });
}


function back_addPage(totalPage) {
    page += 1;
    if (page > totalPage - 1) {
        msgShow('系统提示', '已经最后一页啦！', 'warning');
        page -= 1;
        return;
    } else {
        back_getProDes(totalPage, true);
    }
}

function back_subPage(totalPage) {
    page -= 1;
    if (page < 0) {
        msgShow('系统提示', '已经是第一页啦！', 'warning');
        page = 0;
        return;
    } else {
        back_getProDes(totalPage, true);
    }
}


function back_edit(id) {
    var data = {"recId": id};
    $.ajax({
        type: "post",
        url: "editDes.json",
        dataType: "json",
        data: data,
        success: function (data) {
            var obj = data.dto;
            console.log(obj);
            $("#conductorA").val(obj.conductorA);
            $("#conductorB").val(obj.conductorB);
            $("#modelNumber").val(obj.modelNumber);
            $("#modelType").val(obj.modelType);
            $("#powerType").val(obj.powerType);
            $("#modelClip").val(obj.modelClip);
            $("#parameter1").val(obj.parameter1);
            $("#parameter2").val(obj.parameter2);
            $("#fkChildRecId").val(obj.fkChildRecId);
            var childRecId = $("#childselect option:selected").text();
            $("#childRecId").val(childRecId);
        }
    });
    $('#desPro').window('open');
    state = "edit";
}

function back_del(id) {
    var data = {"recId": id};
}

function back_addPro() {
    $("#desProTab input").val("");
    var childRecId = $("#childselect option:selected").text();
    var fkChildRecId = $("#childselect option:selected").val();
    $("#childRecId").val(childRecId);
    $("#fkChildRecId").val(fkChildRecId);
    if (childRecId == "" || childRecId == " " || childRecId == null || fkChildRecId == "" || fkChildRecId == " " || fkChildRecId == null) {
        return;
    }
    $('#desPro').window('open');
    state = "add";
}

function saveProDes() {
    var data = $.param({'state': state}) + '&' + $('#desProForm').serialize();
    $.ajax({
        type: "post",
        url: "savePro.do",
        data: data,
        success: function (data) {

        }
    });
}
function cancelWindow() {
    $('#desPro').window('close');
}

function msgShow(title, msgString, msgType) {
    $.messager.alert(title, msgString, msgType);
}
