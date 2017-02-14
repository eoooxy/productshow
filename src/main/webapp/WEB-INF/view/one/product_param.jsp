<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
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
                <select id="parameterA" class="form-control" style="width:190px;" onchange="getParamB()">
                    <option>请选择您需要导体A</option>
                    <c:forEach items="${dto.strings}" var="v">
                        <option>${v}</option>
                    </c:forEach>
                </select>


                <c:if test="${dto.productParameterList[0].conductorB !=null && dto.productParameterList[0].conductorB !=''}">
                    <select id="parameterB" class="form-control" style="width:190px; margin-left: 10px;">
                        <option>请选择您需要导体B</option>
                    </select>
                </c:if>

                <input type="button" class="btn btn-default" style="margin-left: 10px" value="查询"
                       onclick="getOneParam()">
            </div>
        </div>

        <div class="panel panel-default" style="margin-top: 20px" id="oneDesParam">

        </div>

    </div>
</div>
