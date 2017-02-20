/**
 * Created by eoooxy on 2017/2/19.
 */
function login() {

    var data = $("#userForm").serialize();

    $.ajax({
        type: "post",
        url: "isLogin.json",
        dataType: "json",
        data: data,
        success: function (data) {
            if (data.msg && data.msg.code == "1") {
                location.href = "/back/index.do";
            } else {
                location.href = "/back/login.do";
            }

        }
    });

}