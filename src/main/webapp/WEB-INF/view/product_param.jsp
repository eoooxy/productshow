<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/26 0026
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-md-12">
        <div>
            <h2>&nbsp;&nbsp;&nbsp;请选择您需要的规格:</h2>
        </div>
        <br>
        <div>
            <table class="table table-bordered table-striped" style="text-align: center;font-size: 14px">
                <tr>
                    <td>导体A</td>
                    <td>导体B</td>
                    <td>模具型号</td>
                    <td>价格体系</td>
                    <td>放热焊粉型号</td>
                    <td>模具夹</td>
                    <td>其他1</td>
                    <td>其他2</td>
                    <td>操作</td>
                </tr>
                <c:forEach items="${dto.productParameterList}" var="v">
                    <tr>
                        <td>${v.conductorA}</td>
                        <td>${v.conductorB}</td>
                        <td>${v.modelNumber}</td>
                        <td>${v.modelType}</td>
                        <td>${v.powerType}</td>
                        <td>${v.modelClip}</td>
                        <td>${v.parameter1}</td>
                        <td>${v.parameter2}</td>
                        <td>
                            <button type="button" class="btn btn-sm btn-default">选   择 &raquo;</button>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>

    </div>
</div>
