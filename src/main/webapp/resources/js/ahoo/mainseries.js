/**
 * Created by IntelliJ IDEA.
 * User: xueyuan
 * Date: 2016/12/26 0026
 * Time: 20:42
 */

function getMainSeriesProduct() {
    $.ajax({
        type: "post",
        url: "products.do",
        //data:data,
        success: function (data) {
            /*if(data.eq("success")){

             }*/
            //location.href = "/product.do";
        }
    });
}