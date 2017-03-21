/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/26 0026
 * Time: 20:42
 */

var pageFlag = 0;


function getParamB() {
    var fkRecId = $("#fkId").val();
    var paramA = $("#parameterA option:selected").val();
    var data = {"fkRecId": fkRecId, "paramA": paramA};

    $.ajax({
        type: "post",
        url: "twoSelectB.json",
        dataType: "json",
        data: data,
        success: function (data) {
            var obj = data.dtoB;
            $("#parameterB").empty();
            $("#parameterB").append("<option>请选择规格B</option>");
            for (var i = 0; i < obj.length; i++) {
                //console.log(obj[i].conductorB);
                $("#parameterB").append("<option>" + obj[i].productNormsB + "</option>");
            }
        }
    });

}

function getOneParam() {

    pageFlag = 0;
    var fkRecId = $("#fkId").val();
    var data = {"fkRecId": fkRecId};
    var paramA = $("#parameterA option:selected").val();
    var paramB = $("#parameterB option:selected").val();
    if (paramA != undefined && paramA != '请选择规格A') {
        data.paramA = paramA;
    }
    if (paramB != undefined && paramB != '请选择规格B') {
        data.paramB = paramB;
    }

    $.ajax({
        type: "post",
        url: "twoQueryOne.do",
        dataType: "html",
        data: data,
        success: function (data) {
            $("#oneDesParam").html(data);
        }
    });

}

function getMainSeriesProduct() {
    Loading();
    $.ajax({
        type: "post",
        url: "twoTotal.do",
        dataType: "html",
        //data:data,
        success: function (data) {
            //art.dialog.list['loading'].close();
            //$("#convert").html(data);

            //$("#convert-ul").find("#child-li").remove();
            //$("#convert-ul").find("#des-li").remove();
            getChildSeriesProduct(1);

        }
    });
}

function getChildSeriesProduct(id) {
    Loading();
    var data = {"fkRecId": id};
    $.ajax({
        type: "post",
        url: "twoPros.do",
        dataType: "html",
        data: data,
        success: function (data) {
            art.dialog.list['loading'].close();
            $("#convert").html(data);

            $("#convert-ul").find("#child-li").remove();
            $("#convert-ul").find("#des-li").remove();
            var li = "<li id='child-li'><a href='#' onclick='getChildSeriesProduct(" + id + ")'>详细参数</a></li>";
            $("#convert-ul").append(li);

            getOneParam();
        }
    });

}


function getDesProductParam(id) {
    Loading();

    var data = {"childFkId": id};
    $.ajax({
        type: "post",
        url: "desParam.do",
        dataType: "html",
        data: data,
        success: function (data) {
            art.dialog.list['loading'].close();

            $("#convert").html(data);

            $("#convert-ul").find("#des-li").remove();
            var li = "<li id='des-li'><a href='#' onclick='getDesProductParam(" + id + ")'>详细参数</a></li>";
            $("#convert-ul").append(li);
        }
    });

}

//1/${dto.productParameterList.size()}
function subPage(listSize) {
    pageFlag -= 1;
    if (pageFlag < 0) {
        art.dialog({
            title: '提示',
            id: 'alert',
            left: '50%',
            top: '10%',
            background: '#000', // 背景色
            opacity: 0.2, // 透明度
            content: '已经是第一页啦！',
            lock: true,
            drag: false,
            resize: false,
            fixed: true
        });
        pageFlag = 0;
    } else {
        getOneProTab(pageFlag, listSize);
    }

}
function addPage(listSize) {
    pageFlag += 1;
    if (pageFlag > listSize - 1) {
        art.dialog({
            title: '提示',
            id: 'alert',
            left: '50%',
            top: '10%',
            background: '#000', // 背景色
            opacity: 0.2, // 透明度
            content: '已经是最后一页啦！',
            lock: true,
            drag: false,
            resize: false,
            fixed: true
        });
        pageFlag -= 1;
    } else {
        getOneProTab(pageFlag, listSize);
    }

}

function getOneProTab(pageFlag, listSize) {

    var fkId = $("#fkId").val();
    var paramA = $("#parameterA option:selected").val();
    var paramB = $("#parameterB option:selected").text();
    var data = {"page": pageFlag, "fkId": fkId, "paramA": paramA, "paramB": paramB};

    $.ajax({
        type: "post",
        url: "page.do",
        dataType: "html",
        data: data,
        success: function (data) {

            $("#tableDiv").html(data);

            $("#pageNum").text("");
            var lables = pageFlag + 1 + "/" + listSize;
            $("#pageNum").html(lables);
        }
    });
}