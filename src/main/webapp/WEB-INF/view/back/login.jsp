<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-1-12 0012
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>后台管理</title>
    <link href="<%=request.getContextPath()%>/resources/css/login.css" rel="stylesheet"/>
</head>
<body>
<div class="logo_box">
    <h3>后台管理</h3>
    <form id="userForm" name="userForm" method="post">
        <div class="input_outer">
            <span class="u_user"></span>
            <input name="username" class="text" onFocus=" if(this.value=='输入用户名') this.value=''"
                   onBlur="if(this.value=='') this.value='输入用户名'" value="输入用户名"
                   style="color: #FFFFFF !important" type="text">
        </div>

        <div class="input_outer">
            <span class="us_uer"></span>
            <label class="l-login login_password" style="color: rgb(255, 255, 255);display: block;">输入密码</label>
            <input name="passwd" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"
                   onFocus="$('.login_password').hide()" onBlur="if(this.value=='') $('.login_password').show()"
                   value="" type="password">
        </div>
        <div class="mb2"><a class="act-but submit" onclick="login()" style="color: #FFFFFF;">登录</a></div>
    </form>

</div>

<script src="<%=request.getContextPath()%>/resources/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/ahoo/back/login.js"></script>
</body>
</html>
