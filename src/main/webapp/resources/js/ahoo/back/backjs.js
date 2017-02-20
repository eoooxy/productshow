/**
 * Created by Administrator on 2017-1-12 0012.
 */
var _menus = {
    "menus": [
        {
            "menuid": "1", "icon": "icon-sys", "menuname": "产品数据",
            "menus": [
                {"menuid": "11", "menuname": "用户管理", "icon": "icon-nav", "url": "login.do"},
                {"menuid": "12", "menuname": "角色管理", "icon": "icon-nav", "url": "demo2.html"},
                {"menuid": "13", "menuname": "焊接类产品参数", "icon": "icon-nav", "url": "three_all.do"}
            ]
        }, {
            "menuid": "2", "icon": "icon-sys", "menuname": "产品分类与介绍",
            "menus": [{"menuid": "21", "menuname": "员工列表", "icon": "icon-nav", "url": "demo.html"},
                {"menuid": "22", "menuname": "视频监控", "icon": "icon-nav", "url": "demo1.html"},
                {"menuid": "23", "menuname": "焊接类别与描述", "icon": "icon-nav", "url": "three_des.do"},
                {"menuid": "24", "menuname": "产品细节描述", "icon": "icon-nav", "url": "singleprodes.do"}
            ]
        }, {
            "menuid": "3", "icon": "icon-sys", "menuname": "其他数据管理",
            "menus": [
                {"menuid": "31", "menuname": "添加部门", "icon": "icon-nav", "url": "demo1.html"},
                {"menuid": "32", "menuname": "部门列表", "icon": "icon-nav", "url": "demo2.html"},
                {"menuid": "32", "menuname": "焊接类产品", "icon": "icon-nav", "url": "demo2.html"}
            ]
        }
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
        resizable: false,
        draggable: false
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

    /* $.post('/ajax/editpassword.ashx?newpass=' + $newpass.val(), function (msg) {
     msgShow('系统提示', '恭喜，密码修改成功！<br>您的新密码为：' + msg, 'info');
     $newpass.val('');
     $rePass.val('');
     close();
     })
     */
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
                location.href = '/back/loginOut.do';
            }
        });
    })
});

