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
        焊粉、模具、模具夹、以及其他主要配套部件
    </h3>
</div>
<div class="panel-body" style="background:#FFFFFF">
    <input type="hidden" id="pagNumFlag" value="0">
    <div id="tableDiv">
        <c:if test="">
            <table class="table table-striped col-lg-12" style="text-align: center">
                <tr>
                    <td class="col-lg-2">产品规格</td>
                    <td class="col-lg-2">棒体直径（mm）</td>
                    <td class="col-lg-2">棒体长度（mm）</td>
                    <td class="col-lg-2">螺纹制式（inch）</td>
                    <td class="col-lg-1">铜层厚度（mm）</td>
                    <td class="col-lg-2">重量（kg）</td>
                    <td class="col-lg-1">操作</td>
                </tr>
                <c:forEach items="${dto.tfgList}" var="v">
                    <tr>
                        <td>${v.productNorms}</td>
                        <td>${v.productSize}</td>
                        <td>${v.productDiameter}</td>
                        <td>${v.tagline}</td>
                        <td>${v.cuPly}</td>
                        <td>${v.weight}</td>
                        <td><input type="button" class="btn btn-default" value="选择" onclick="selectThis()"></td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
        <c:if test="">
            <table class="table table-striped col-lg-12" style="text-align: center">
                <tr>
                    <td class="col-lg-2">产品规格</td>
                    <td class="col-lg-2">棒体直径（mm）</td>
                    <td class="col-lg-2">棒体长度（mm）</td>
                    <td class="col-lg-2">螺纹制式（inch）</td>
                    <td class="col-lg-2">重量（kg）</td>
                    <td class="col-lg-1">操作</td>
                </tr>
                <c:forEach items="${dto.tfgList}" var="v">
                    <tr>
                        <td>${v.productNorms}</td>
                        <td>${v.productSize}</td>
                        <td>${v.productDiameter}</td>
                        <td>${v.tagline}</td>
                        <td>${v.weight}</td>
                        <td><input type="button" class="btn btn-default" value="选择" onclick="selectThis()"></td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
        <c:if test="">
            <table class="table table-striped col-lg-12" style="text-align: center">
                <tr>
                    <td class="col-lg-2">产品名称</td>
                    <td class="col-lg-2">产品规格</td>
                    <td class="col-lg-2">材质</td>
                    <td class="col-lg-2">螺纹制式（inch）</td>
                    <td class="col-lg-2">防腐工艺</td>
                    <td class="col-lg-2">重量（kg）</td>
                    <td class="col-lg-1">操作</td>
                </tr>
                <c:forEach items="${dto.tfgList}" var="v">
                    <tr>
                        <td>${v.productNorms}</td>
                        <td>${v.productName}</td>
                        <td>${v.productMaterial}</td>
                        <td>${v.productWenli}</td>
                        <td>${v.isfangfu}</td>
                        <td>${v.weight}</td>
                        <td><input type="button" class="btn btn-default" value="选择" onclick="selectThis()"></td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </div>
    <div>
        <input type="button" class="btn btn-default" style="float: right;" value="下一页"
               onclick="addPage('${fn:length(dto.productParameterList)}')">
        <label style="float: right;margin-top:5px;margin-left: 5px;margin-right: 5px"
               id="pageNum">1/${fn:length(dto.productParameterList)}</label>
        <input type="button" class="btn btn-default" style="float: right;" value="上一页"
               onclick="subPage('${fn:length(dto.productParameterList)}')">
    </div>
</div>

