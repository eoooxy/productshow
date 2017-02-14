<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-1-11 0011
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table class="table table-striped col-lg-12" style="text-align: center">
    <tr>
        <td class="col-lg-2">产品规格</td>
        <td class="col-lg-2">产品规格</td>
        <td class="col-lg-2">材质</td>
        <td class="col-lg-2">终端引线</td>
        <td class="col-lg-1">PH值</td>
        <td class="col-lg-2">外型</td>
        <td class="col-lg-1">操作</td>
    </tr>
    <c:forEach items="${dto.lzjdList}" var="v">
        <tr>
            <td>${v.productNormsA}</td>
            <td>${v.productNormsB}</td>
            <td>${v.model}</td>
            <td>${v.tagline}</td>
            <td>${v.ph}</td>
            <td>${v.shape}</td>
            <td><input type="button" class="btn btn-default" value="选择" onclick="selectThis()"></td>
        </tr>
    </c:forEach>
</table>