/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/26 0026
 * Time: 20:42
 */


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
            var li = "<li id='des-li'><a href='#' onclick='getDesProductParam(" + id + ")'>参数列表</a></li>";
            $("#convert-ul").append(li);
        }
    });

}