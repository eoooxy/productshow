<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-1-4 0004
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="panel-heading">
    <h3 class="panel-title">
        离子接地系统的主要参数
    </h3>
</div>
<div class="panel-body" style="background:#FFFFFF">
    <input type="hidden" id="pagNumFlag" value="0">
    <div id="tableDiv">
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
    </div>
    <div>
        <input type="button" class="btn btn-default" style="float: right;" value="下一页"
               onclick="addPage('${dto.pageNumber}')">
        <label style="float: right;margin-top:5px;margin-left: 5px;margin-right: 5px"
               id="pageNum">1/${dto.pageNumber}</label>
        <input type="button" class="btn btn-default" style="float: right;" value="上一页"
               onclick="subPage('${dto.pageNumber}')">
    </div>
</div>

