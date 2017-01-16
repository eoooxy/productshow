/**
 * Created by Administrator on 2017-1-12 0012.
 */
var _menus = {
    "menus": [
        {
            "menuid": "1", "icon": "icon-sys", "menuname": "数据管理",
            "menus": [
                {"menuid": "11", "menuname": "用户管理", "icon": "icon-nav", "url": "login.do"},
                {"menuid": "12", "menuname": "角色管理", "icon": "icon-nav", "url": "demo2.html"},
                {"menuid": "13", "menuname": "权限设置", "icon": "icon-nav", "url": "demo.html"},
                {"menuid": "14", "menuname": "系统日志", "icon": "icon-nav", "url": "demo1.html"}
            ]
        }/*, {
         "menuid": "2", "icon": "icon-sys", "menuname": "主页数据修改",
         "menus": [{"menuid": "21", "menuname": "员工列表", "icon": "icon-nav", "url": "demo.html"},
         {"menuid": "22", "menuname": "视频监控", "icon": "icon-nav", "url": "demo1.html"}
         ]
         }, {
         "menuid": "3", "icon": "icon-sys", "menuname": "服务页数据维护",
         "menus": [{"menuid": "31", "menuname": "添加部门", "icon": "icon-nav", "url": "demo1.html"},
         {"menuid": "32", "menuname": "部门列表", "icon": "icon-nav", "url": "demo2.html"}
         ]
         }, {
         "menuid": "4", "icon": "icon-sys", "menuname": "关于页数据维护",
         "menus": [{"menuid": "41", "menuname": "收支分类", "icon": "icon-nav", "url": "demo.html"},
         {"menuid": "42", "menuname": "报表统计", "icon": "icon-nav", "url": "demo1.html"},
         {"menuid": "43", "menuname": "添加支出", "icon": "icon-nav", "url": "demo2.html"}
         ]
         }*/
    ]
};

//设置登录窗口
function openPwd() {
    $('#w').window({
        title: '修改密码',
        width: 300,
        modal: true,
        shadow: true,
        closed: true,
        height: 160,
        resizable: false
    });
}
//关闭登录窗口
function closePwd() {
    $('#w').window('close');
}


//修改密码
function serverLogin() {
    var $newpass = $('#txtNewPass');
    var $rePass = $('#txtRePass');

    if ($newpass.val() == '') {
        msgShow('系统提示', '请输入密码！', 'warning');
        return false;
    }
    if ($rePass.val() == '') {
        msgShow('系统提示', '请在一次输入密码！', 'warning');
        return false;
    }

    if ($newpass.val() != $rePass.val()) {
        msgShow('系统提示', '两次密码不一至！请重新输入', 'warning');
        return false;
    }

    $.post('/ajax/editpassword.ashx?newpass=' + $newpass.val(), function (msg) {
        msgShow('系统提示', '恭喜，密码修改成功！<br>您的新密码为：' + msg, 'info');
        $newpass.val('');
        $rePass.val('');
        close();
    })

}

$(function () {

    openPwd();

    $('#editpass').click(function () {
        $('#w').window('open');
    });

    $('#btnEp').click(function () {
        serverLogin();
    })

    $('#btnCancel').click(function () {
        closePwd();
    })

    $('#loginOut').click(function () {
        $.messager.confirm('系统提示', '您确定要退出本次登录吗?', function (r) {

            if (r) {
                location.href = '/ajax/loginout.ashx';
            }
        });
    })
});

