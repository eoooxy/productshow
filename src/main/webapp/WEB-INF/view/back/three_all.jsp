<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <link href="<%=request.getContextPath()%>/resources/css/default.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css"
          href="<%=request.getContextPath()%>/resources/js/easyuijs/themes/default/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/js/easyuijs/themes/icon.css"/>
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="easyui-layout" style="width:980px;margin: 0 auto;text-align: center">
    <div style="margin-top: 20px;">
        <span style="color: red;font-size: 13px">* 焊接父类:</span>
        <select id="fatherselect" style="width:130px;" onchange="back_getChildType()" on>
            <option></option>
            <c:forEach items="${dto.mainSeriesProductList}" var="d">
                <option value="${d.recId}">${d.productMainType}</option>
            </c:forEach>
        </select>
        <span style="color: red;font-size: 13px">* 焊接子类:</span>
        <select id="childselect" style="width:120px;" onchange="back_getParam()">
        </select>
        <span style="font-size: 13px"> 导体型号:</span>
        <select id="parameterselect" style="width:140px;">
        </select>
        <a class="easyui-linkbutton" icon="icon-search" href="javascript:void(0)" onclick="back_getProDes()">查询</a>
        <a class="easyui-linkbutton" icon="icon-add" href="javascript:void(0)" onclick="back_addPro()">增加</a>
    </div>

    <div class="easyui-layout" id="tableDiv" style="margin-top:30px;width: 100%;"></div>


    <!--修改参数的界面-->
    <div id="desPro" class="easyui-window" title="修改产品参数" collapsible="false" minimizable="false" maximizable="false"
         icon="icon-edit" style="width: 370px; height: 450px; padding: 5px; background: #fafafa;">
        <div class="easyui-layout" fit="true">
            <div region="center" border="false"
                 style=" text-align:center;padding: 10px;background: #fff; border: 1px solid #ccc;">
                <form id="desProForm">
                    <table id="desProTab" style="margin-top:20px;border-collapse:separate; border-spacing:10px;">
                        <span style="color: red; font-size: 11px">*注：如若为空输入"---"或者不填</span>
                        <tr>
                            <td>导体A：</td>
                            <td><input id="conductorA" name="conductorA" class="txt01"/></td>
                        </tr>
                        <tr>
                            <td>导体B：</td>
                            <td><input id="conductorB" name="conductorB" class="txt01"/></td>
                        </tr>
                        <tr>
                            <td>模具型号：</td>
                            <td><input id="modelNumber" name="modelNumber" class="txt01"/></td>
                        </tr>
                        <tr>
                            <td>价格体系：</td>
                            <td><input id="modelType" name="modelType" class="txt01"/></td>
                        </tr>
                        <tr>
                            <td>焊粉型号：</td>
                            <td><input id="powerType" name="powerType" class="txt01"/></td>
                        </tr>
                        <tr>
                            <td>模具夹：</td>
                            <td><input id="modelClip" name="modelClip" class="txt01"/></td>
                        </tr>
                        <tr>
                            <td>套管(迷你模具)：</td>
                            <td><input id="parameter1" name="parameter1" class="txt01"/></td>
                        </tr>
                        <tr>
                            <td>整形模具(防漏材料)：</td>
                            <td><input id="parameter2" name="parameter2" class="txt01"/></td>
                        </tr>
                        <tr>
                            <td>隶属子类：</td>
                            <td><input id="childRecId" disabled="disabled" class="txt01"/></td>
                        </tr>
                        <input type="hidden" id="recId" name="recId">
                        <input type="hidden" id="fkChildRecId" name="fkChildRecId">
                    </table>
                </form>
            </div>
            <div region="south" border="false" style="text-align: right;height: 35px; padding: 3px 0 0;">
                <a id="btnEp" class="easyui-linkbutton" icon="icon-ok" onclick="saveProDes()" href="javascript:void(0)">确定</a>
                <a id="btnCancel" class="easyui-linkbutton" icon="icon-cancel" onclick="cancelWindow()"
                   href="javascript:void(0)">取消</a>
            </div>
        </div>
    </div>

</div>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/easyuijs/jquery.min.js"></script>
<script type="text/javascript"
        src="<%=request.getContextPath()%>/resources/js/easyuijs/jquery.easyui.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src='<%=request.getContextPath()%>/resources/js/ahoo/back/backjs.js'></script>
<script type="text/javascript" src='<%=request.getContextPath()%>/resources/js/ahoo/back/product.js'></script>

</body>
<style>.panel-title {
    font-size: 13px;
}</style>
</html>
