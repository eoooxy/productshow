/**
 * Created by eoooxy on 2017/2/19.
 */
function login() {

    var data = $("#userForm").serialize();

    $.ajax({
        type: "post",
        url: "isLogin.do",
        dataType: "html",
        data: data,
        success: function () {
            location.href = "/back/index.do";
        },
        error: function () {
            location.href = "/back/login.do";
        }
    });

}