<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/19
  Time: 13:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>
    <table class="table table-striped " id="proDes" style="font-size: 13px; text-align: center;border: 1px solid #ddd">
        <thead>
        <tr>
            <td>导体A</td>
            <td>导体B</td>
            <td>模具型号</td>
            <td>价格体系</td>
            <td>焊粉型号</td>
            <td>模具夹</td>
            <td>套管(迷你模具)</td>
            <td>整形模具(防漏材料)</td>
            <td>操作</td>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${dto.productParameterList}" var="v">
            <tr>

                <td>${v.conductorA}</td>

                <c:if test="${v.conductorB !=null && v.conductorB !=''  && v.conductorB !=' '}">
                    <td>${v.conductorB}</td>
                </c:if>
                <c:if test="${v.conductorB ==null || v.conductorB =='' || v.conductorB ==' '}">
                    <td>---</td>
                </c:if>
                <c:if test="${v.modelNumber !=null && v.modelNumber !=''  && v.modelNumber !=' '}">
                    <td>${v.modelNumber}</td>
                </c:if>
                <c:if test="${v.modelNumber ==null || v.modelNumber =='' || v.modelNumber ==' '}">
                    <td>---</td>
                </c:if>
                <c:if test="${v.modelType !=null && v.modelType !='' && v.modelType !=' '}">
                    <td>${v.modelType}</td>
                </c:if>
                <c:if test="${v.modelType ==null || v.modelType =='' || v.modelType ==' '}">
                    <td>---</td>
                </c:if>
                <c:if test="${v.powerType !=null && v.powerType !='' && v.powerType !=' '}">
                    <td>${v.powerType}</td>
                </c:if>
                <c:if test="${v.powerType ==null || v.powerType =='' || v.powerType ==' '}">
                    <td>---</td>
                </c:if>
                <c:if test="${v.modelClip !=null && v.modelClip !='' && v.modelClip !=' '}">
                    <td>${v.modelClip}</td>
                </c:if>
                <c:if test="${v.modelClip ==null || v.modelClip =='' || v.modelClip ==' '}">
                    <td>---</td>
                </c:if>
                <c:if test="${v.parameter1 !=null && v.parameter1 !='' && v.parameter1 !=' '}">
                    <td>${v.parameter1}</td>
                </c:if>
                <c:if test="${v.parameter1 ==null || v.parameter1 =='' || v.parameter1 ==' '}">
                    <td>---</td>
                </c:if>
                <c:if test="${v.parameter2 !=null && v.parameter2 !='' && v.parameter2 !=' '}">
                    <td>${v.parameter2}</td>
                </c:if>
                <c:if test="${v.parameter2 ==null || v.parameter2 =='' || v.parameter2 ==' '}">
                    <td>---</td>
                </c:if>
                <td>
                    <a class="easyui-linkbutton l-btn l-btn-small" icon="icon-edit" href="javascript:void(0)"
                       onclick="back_edit('${v.recId}')"><span class="l-btn-left l-btn-icon-left"><span
                            class="l-btn-text">编辑</span><span class="l-btn-icon icon-edit">&nbsp;</span></span></a>
                    <a class="easyui-linkbutton l-btn l-btn-small" icon="icon-clear" href="javascript:void(0)"
                       onclick="back_del('${v.recId}')"><span class="l-btn-left l-btn-icon-left"><span
                            class="l-btn-text">删除</span><span class="l-btn-icon icon-clear">&nbsp;</span></span></a>

                </td>
            </tr>
        </c:forEach>
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


