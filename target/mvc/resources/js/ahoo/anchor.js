/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/18 0018
 * Time: 20:54
 *
 * a标签的 js跳转事件
 */

function jumpIndex() {
    location.href = "/index.do";
}

function jumpProduct() {
    location.href = "/product.do";
    getMainSeriesProduct();
}

function jumpServices() {
    location.href = "/services.do";
}

function jumpAbout() {
    location.href = "/about.do";
}

function getMainSeriesProduct() {
    $.ajax({
        type: "post",
        url: "products.do",
        //data:data,
        success: function (data) {
            console.log(data);
            $("#convert").innerHTML = "<h1>123</h1>"

            $("#convert").load(data);
            window.location.reload();
        }
    });
}