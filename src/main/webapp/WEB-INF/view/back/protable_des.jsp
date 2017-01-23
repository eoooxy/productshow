<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/23
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="easyui-layout">
    <table class="table table-striped " id="proDes" style="font-size: 13px; text-align: center;border: 1px solid #ddd">
        <thead>
        <tr>
            <td>类别</td>
            <td>图片</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody>

        <c:if test="${dto.mark =='main' }">
            <c:forEach items="${dto.mainSeriesProductList}" var="v">
                <tr>
                    <td>${v.productMainType}</td>
                    <td>
                        <a class="easyui-linkbutton l-btn l-btn-small" icon="icon-large-picture"
                           href="javascript:void(0)"
                           onclick="back_edit('${v.productMainUrl}')"><span class="l-btn-left l-btn-icon-left"><span
                                class="l-btn-text">预览</span><span
                                class="l-btn-icon icon-large-picture">&nbsp;</span></span></a>
                    </td>
                    <td>
                        <a class="easyui-linkbutton l-btn l-btn-small" icon="icon-edit" href="javascript:void(0)"
                           onclick="back_edit('${v.recId}','${dto.mark}')"><span class="l-btn-left l-btn-icon-left"><span
                                class="l-btn-text">编辑</span><span class="l-btn-icon icon-edit">&nbsp;</span></span></a>
                        <a class="easyui-linkbutton l-btn l-btn-small" icon="icon-clear" href="javascript:void(0)"
                           onclick="back_del('${v.recId}','${dto.mark}')"><span class="l-btn-left l-btn-icon-left"><span
                                class="l-btn-text">删除</span><span class="l-btn-icon icon-clear">&nbsp;</span></span></a>

                    </td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${dto.mark =='child' }">
            <c:forEach items="${dto.childSeriesProductList}" var="v">
                <tr>
                    <td>${v.productChildType}</td>
                    <td>
                        <a class="easyui-linkbutton l-btn l-btn-small" icon="icon-large-picture"
                           href="javascript:void(0)"
                           onclick="back_edit('${v.productChildUrl}')"><span class="l-btn-left l-btn-icon-left"><span
                                class="l-btn-text">预览</span><span
                                class="l-btn-icon icon-large-picture">&nbsp;</span></span></a>
                    </td>
                    <td>
                        <a class="easyui-linkbutton l-btn l-btn-small" icon="icon-edit" href="javascript:void(0)"
                           onclick="back_edit('${v.recId}','${dto.mark}')"><span class="l-btn-left l-btn-icon-left"><span
                                class="l-btn-text">编辑</span><span class="l-btn-icon icon-edit">&nbsp;</span></span></a>
                        <a class="easyui-linkbutton l-btn l-btn-small" icon="icon-clear" href="javascript:void(0)"
                           onclick="back_del('${v.recId}','${dto.mark}')"><span class="l-btn-left l-btn-icon-left"><span
                                class="l-btn-text">删除</span><span class="l-btn-icon icon-clear">&nbsp;</span></span></a>

                    </td>
                </tr>
            </c:forEach>
        </c:if>
        </tbody>
    </table>
</div>
<div>

    <a class="easyui-linkbutton l-btn l-btn-small" style="float: right;" icon="icon-redo" href="javascript:void(0)"
       onclick="back_addPage('${dto.totalPage}')"><span class="l-btn-left l-btn-icon-right"><span
            class="l-btn-text">下一页</span><span class="l-btn-icon icon-redo">&nbsp;</span></span></a>
    <label style="float: right;margin-top:5px;margin-left: 5px;margin-right: 5px"
           id="pageNum">1/${dto.totalPage}</label>
    <a class="easyui-linkbutton l-btn l-btn-small" style="float: right;" icon="icon-undo" href="javascript:void(0)"
       onclick="back_subPage('${dto.totalPage}')"><span class="l-btn-left l-btn-icon-left"><span
            class="l-btn-text">上一页</span><span class="l-btn-icon icon-undo">&nbsp;</span></span></a>
</div>
