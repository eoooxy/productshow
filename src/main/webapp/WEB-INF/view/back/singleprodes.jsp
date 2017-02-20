<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/24
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<%=request.getContextPath()%>/resources/css/default.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css"
          href="<%=request.getContextPath()%>/resources/js/easyuijs/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css"
          href="<%=request.getContextPath()%>/resources/js/easyuijs/themes/icon.css"/>
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div style="width:980px;margin: 0 auto;text-align: center">
    <div style="margin-top: 20px;width:100%">
        <span style="font-size: 13px">选择你需要更改的产品：</span>
        <select id="fatherselect" style="width:100px; margin-right: 20px" onchange="back_getProDes()">
            <c:forEach items="${dto.lists}" var="v">
                <option value="${v.recId}">${v.proType}</option>
            </c:forEach>
        </select>

        <%-- <a class="easyui-linkbutton" icon="icon-ok" href="javascript:void(0)" onclick="back_getProDes()">确定</a>--%>
        <a class="easyui-linkbutton" icon="icon-reload" href="javascript:void(0)" onclick="back_saveProDes()">保存修改</a>
    </div>
    <div style="margin-top: 20px;width:100% ;text-align: center ">
        <div align="center">
            <textarea id="editHtml"></textarea>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/easyuijs/jquery.min.js"></script>
<script type="text/javascript"
        src="<%=request.getContextPath()%>/resources/js/easyuijs/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/tinymce/jquery.form.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/tinymce/tinymce.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/tinymce/jquery.tinymce.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src='<%=request.getContextPath()%>/resources/js/ahoo/back/singlepro_des.js'></script>


</html>
