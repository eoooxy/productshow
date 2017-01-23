<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/23
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <head>
        <link href="<%=request.getContextPath()%>/resources/css/default.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" type="text/css"
              href="<%=request.getContextPath()%>/resources/js/easyuijs/themes/default/easyui.css"/>
        <link rel="stylesheet" type="text/css"
              href="<%=request.getContextPath()%>/resources/js/easyuijs/themes/icon.css"/>
        <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet"/>
    </head>
</head>
<body>
<div class="easyui-layout" style="width:980px;margin: 0 auto;text-align: center">
    <div style="margin-top: 20px;width:100%">
        <span style="font-size: 13px">选择你需要查询的类别：</span>
        <input type="radio" name="proType" id="mainType" value="mainType"> <span
            style="font-size: 13px;margin-right: 20px">父类</span>
        <input type="radio" name="proType" id="childType" value="childType"> <span style="font-size: 13px">子类</span>
        <select id="fatherselect" style="width:130px; margin-right: 20px"></select>
        <a class="easyui-linkbutton" icon="icon-search" href="javascript:void(0)" onclick="back_getProDes()">查询</a>
    </div>

    <div id="desTableDiv" style="margin-top:30px;width: 40%;float: left"></div>

    <div id="desEditMain"
         style="padding:15px;margin-top:30px;width: 50%;height: 400px;float: right;border: 1px solid #ddd">
        <span style="color: red; font-size: 11px;"> *注：标题与内容分别是页面产品展示中的标题介绍</span>
        <form id="desProFormMain">
            <table id="desProTabMain" style="margin-top:20px;border-collapse:separate; border-spacing:10px;">
                <tr>
                    <td><span style="color: red; font-size: 11px;">*类别：</span></td>
                    <td><input id="productMainType" name="productMainType" class="txt01"/></td>
                </tr>
                <tr>
                    <td><span style="color: red; font-size: 11px;">*标题：</span></td>
                    <td><input id="productTitleMain" name="productTitle" class="txt01" style="width: 350px"/></td>
                </tr>
                <tr>
                    <td><span style="color: red; font-size: 11px;">*内容：</span></td>
                    <td><textarea id="productDesMain" name="productDes" class="txt01"
                                  style="width: 350px;height: 150px;resize: none"></textarea></td>
                </tr>
                <tr>
                    <td><span style="color: red; font-size: 11px;">*图片：</span></td>
                    <td>
                        <input type="file" accept=".gif,.jpg,.jpeg,.png" id="mainpic" onchange="imgChange(this,'main')"/>
                        <input type="hidden" id="productMainUrl" name="productMainUrl">
                    </td>
                </tr>
                <input type="hidden" id="recIdMain" name="recId">
                <input type="hidden" id="recIdMainDes" name="recDesId">
            </table>
        </form>
        <div style="text-align: right;height: 35px; padding: 0 10px;">
            <a class="easyui-linkbutton" icon="icon-add" href="javascript:void(0)" onclick="back_addPro('main')">增加</a>
            <a class="easyui-linkbutton" icon="icon-reload" href="javascript:void(0)"
               onclick="saveProDes('main')">更新</a>
        </div>
    </div>

    <div id="desEditChild"
         style=" padding:15px;margin-top:30px;width: 50%;height: 400px;float: right;border: 1px solid #ddd;display: none">
        <span style="color: red; font-size: 11px;">*注：标题与内容分别是页面产品展示中的标题介绍</span>
        <form id="desProFormChild">
            <table id="desProTabChild" style="margin-top:20px;border-collapse:separate; border-spacing:10px;">
                <tr>
                    <td><span style="color: red; font-size: 11px;">*类别：</span></td>
                    <td>
                        <input id="productChildType" name="productChildType" class="txt01"/>
                        <input id="fkChildValue" disabled="disabled" class="txt01"/>
                    </td>
                </tr>
                <tr>
                    <td><span style="color: red; font-size: 11px;">*标题：</span></td>
                    <td><input id="productTitleChild" name="productTitle" class="txt01" style="width: 350px"/></td>
                </tr>
                <tr>
                    <td><span style="color: red; font-size: 11px;">*内容：</span></td>
                    <td><textarea id="productDesChild" name="productDes" class="txt01"
                                  style="width: 350px;height: 150px;resize: none"></textarea></td>
                </tr>
                <tr>
                    <td><span style="color: red; font-size: 11px;">*图片：</span></td>
                    <td>
                        <input type="file" accept=".gif,.jpg,.jpeg,.png" id="childPic" onchange="imgChange(this,'child')"/>
                        <input type="hidden" id="productChildUrl" name="productChildUrl">
                    </td>
                </tr>
                <input type="hidden" id="recIdChild" name="recId">
                <input type="hidden" id="recIdChildDes" name="recDesId">
                <input type="hidden" id="fkChildRecIdChild" name="fkChildRecId">
            </table>
        </form>
        <div style="text-align: right;height: 35px; padding: 3px 0 0;">
            <a class="easyui-linkbutton" icon="icon-add" href="javascript:void(0)" onclick="back_addPro('child')">增加</a>
            <a class="easyui-linkbutton" icon="icon-reload" href="javascript:void(0)"
               onclick="saveProDes('child')">更新</a>
        </div>
    </div>

</div>
</body>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/easyuijs/jquery.min.js"></script>
<script type="text/javascript"
        src="<%=request.getContextPath()%>/resources/js/easyuijs/jquery.easyui.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src='<%=request.getContextPath()%>/resources/js/ahoo/back/backjs.js'></script>
<script type="text/javascript" src='<%=request.getContextPath()%>/resources/js/ahoo/back/pro_des.js'></script>
<style>.panel-title {
    font-size: 13px;
}</style>
</html>
