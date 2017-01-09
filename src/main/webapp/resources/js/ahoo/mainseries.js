/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/26 0026
 * Time: 20:42
 */





function getParamB() {
    var fkId = $("#fkId").val();
    var paramA = $("#parameterA option:selected").val();
    var data = {"fkId": fkId, "paramA": paramA};

    $.ajax({
        type: "post",
        url: "selectB.json",
        dataType: "json",
        data: data,
        success: function (data) {

            var obj = data.dtoB;
            $("#parameterB").empty();
            $("#parameterB").append("<option>请选择您需要导体B</option>");
            for(var i =0;i<obj.length;i++){
                //console.log(obj[i].conductorB);
                $("#parameterB").append("<option>" + obj[i].conductorB + "</option>");
            }
        }
    });

}
function getOneParam() {
    var fkId = $("#fkId").val();
    var paramA = $("#parameterA option:selected").val();
    var paramB = $("#parameterB option:selected").text();
    if (paramB == undefined) {
        var data = {"fkId": fkId, "paramA": paramA, "paramB": null};
    } else {
        var data = {"fkId": fkId, "paramA": paramA, "paramB": paramB};
    }

    $.ajax({
        type: "post",
        url: "queryOne.do",
        dataType: "html",
        data: data,
        success: function (data) {
            $("#oneDesParam").html(data);
        }
    });

}

function getMainSeriesProduct() {
    //alert(div);
    $.ajax({
        type: "post",
        url: "proTotal.do",
        dataType: "html",
        //data:data,
        success: function (data) {
            $("#convert").html(data);

            $("#convert-ul").find("#child-li").remove();
            $("#convert-ul").find("#des-li").remove();
        }
    });
}

function getChildSeriesProduct(id) {

    var data = {"fkRecId": id};
    $.ajax({
        type: "post",
        url: "proChild.do",
        dataType: "html",
        data: data,
        success: function (data) {
            $("#convert").html(data);

            $("#convert-ul").find("#child-li").remove();
            $("#convert-ul").find("#des-li").remove();
            var li = "<li id='child-li'><a href='#' onclick='getChildSeriesProduct(" + id + ")'>分类选择</a></li>";
            $("#convert-ul").append(li);
        }
    });

}


function getDesProductParam(id) {

    var data = {"childFkId": id};
    $.ajax({
        type: "post",
        url: "desParam.do",
        dataType: "html",
        data: data,
        success: function (data) {
            $("#convert").html(data);

            $("#convert-ul").find("#des-li").remove();
            var li = "<li id='des-li'><a href='#' onclick='getDesProductParam(" + id + ")'>参数选择</a></li>";
            $("#convert-ul").append(li);
        }
    });

}