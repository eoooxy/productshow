<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/26 0026
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="form-group">
    <div class="input-group col-lg-12">
        <input type="hidden" id="fkId" value="${dto.recId}"/>
        <div>
            <div><h2>${dto.desEntity.productTitle}</h2>
                ${dto.desEntity.productDes}
            </div>

            <div style="margin-top: 50px;">
                <c:if test="${dto.proType =='组合式接地棒配件'}">
                    <select id="parameterA" class="form-control" onchange="getParamB()" style="width:190px;">
                        <option>请选择产品名称</option>
                        <c:forEach items="${dto.nStrings}" var="v">
                            <option>${v}</option>
                        </c:forEach>
                    </select>
                </c:if>
                <select id="parameterB" class="form-control" style="width:190px;margin-left: 10px;">
                    <option>请选择产品规格</option>
                    <c:forEach items="${dto.strings}" var="v">
                        <option>${v}</option>
                    </c:forEach>
                </select>


                <input type="button" class="btn btn-default" style="margin-left: 10px" value="查询"
                       onclick="getOneParam()">

            </div>
        </div>

        <div class="panel panel-default" style="margin-top: 20px" id="oneDesParam">

        </div>

    </div>
</div>
