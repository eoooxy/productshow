<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-1-17 0017
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css"
          href="<%=request.getContextPath()%>/resources/js/easyuijs/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/js/easyuijs/themes/icon.css"/>
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/easyuijs/jquery.min.js"></script>
    <script type="text/javascript"
            src="<%=request.getContextPath()%>/resources/js/easyuijs/jquery.easyui.min.js"></script>
    <script type="text/javascript" src='<%=request.getContextPath()%>/resources/js/ahoo/back/product.js'></script>
</head>
<body>
<div style="width:960px;">
    <div style="margin-top: 20px;">
        <span style="color: red;font-size: 13px">* 焊接父类:</span>
        <select id="fatherselect" style="width:130px;" onchange="back_getChildType()" on>
            <c:forEach items="${dto.mainSeriesProductList}" var="d">
                <option value="${d.recId}">${d.productMainType}</option>
            </c:forEach>
        </select>
        <span style="color: red;font-size: 13px">* 焊接子类:</span>
        <select id="childselect" style="width:120px;" onchange="back_getParam()">
        </select>
        <span style="font-size: 13px"> 导体型号:</span>
        <select id="parameterselect" style="width:120px;">
        </select>
        <a class="easyui-linkbutton" icon="icon-search" href="javascript:void(0)" onclick="back_getProDes()">查询</a>
    </div>

    <div id="tableDiv">


    </div>
</div>
</body>
</html>
