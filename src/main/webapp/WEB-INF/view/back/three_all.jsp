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
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div style="width:980px;margin: 0 auto;text-align: center">
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
    </div>

    <div id="tableDiv" style="margin-top:30px;width: 100%;">


    </div>



    <!--修改密码窗口-->
    <div id="w" class="easyui-window" title="修改密码" collapsible="false" minimizable="false"
         maximizable="false" icon="icon-save" style="width: 300px; height: 150px; padding: 5px;
        background: #fafafa;">
        <div class="easyui-layout" fit="true">
            <div region="center" border="false" style="padding: 10px; background: #fff; border: 1px solid #ccc;">
                <table cellpadding=3>
                    <tr>
                        <td>新密码：</td>
                        <td><input id="txtNewPass" type="Password" class="txt01"/></td>
                    </tr>
                    <tr>
                        <td>确认密码：</td>
                        <td><input id="txtRePass" type="Password" class="txt01"/></td>
                    </tr>
                </table>
            </div>
            <div region="south" border="false" style="text-align: right; height: 30px; line-height: 30px;">
                <a id="btnEp" class="easyui-linkbutton" icon="icon-ok" href="javascript:void(0)">确定</a>
                <a id="btnCancel" class="easyui-linkbutton" icon="icon-cancel" href="javascript:void(0)">取消</a>
            </div>
        </div>
    </div>



    <div id="window_des" class="easyui-window" title="编辑数据" icon="icon-edit" style="width:500px;height:200px;padding:5px;background: #fafafa;">
        <div class="easyui-layout" data-options="fit:true">
            <div data-options="region:'center'" style="padding:10px;">
                内容
            </div>
            <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
                <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="" style="width:80px">Ok</a>
                <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="" style="width:80px">Cancel</a>
            </div>
        </div>
    </div>

</div>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/easyuijs/jquery.min.js"></script>
<script type="text/javascript"
        src="<%=request.getContextPath()%>/resources/js/easyuijs/jquery.easyui.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src='<%=request.getContextPath()%>/resources/js/ahoo/back/product.js'></script>

<script src="<%=request.getContextPath()%>/resources/js/artdialog/jquery.artDialog.source.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/artdialog/artDialog.source.js?skin=aero"></script>
<script src="<%=request.getContextPath()%>/resources/js/artdialog/iframeTools.source.js"></script>
</body>
</html>
