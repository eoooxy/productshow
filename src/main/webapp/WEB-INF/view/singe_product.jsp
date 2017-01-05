<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div class="container panel-body" style="background:#FFFFFF">
    <table class="col-lg-12">
        <tr>
            <td class="col-lg-3">
                <div>
                    <input type="checkbox" name="m" value="">导体A:${dto.productParameterList[0].conductorA}
                    <img style="width: 150px;height: 150px;"
                         src="<%=request.getContextPath()%>/resources/img/total/main_1.jpg"
                         class="img-rounded">
                </div>
            </td>

            <c:if test="${dto.productParameterList[0].conductorB !=null && dto.productParameterList[0].conductorB !=''}">
                <td class="col-lg-3">
                    <div>
                        <input type="checkbox" name="m" value="">导体B:${dto.productParameterList[0].conductorB}
                        <img style="width: 150px;height: 150px;"
                             src="<%=request.getContextPath()%>/resources/img/total/main_1.jpg"
                             class="img-rounded">
                    </div>
                </td>
            </c:if>
            <td class="col-lg-3">
                <div>
                    <input type="checkbox" name="m" value="">模具型号：${dto.productParameterList[0].modelNumber}

                    <img style="width: 150px;height: 150px;"
                         src="<%=request.getContextPath()%>/resources/img/total/main_1.jpg"
                         class="img-rounded">
                </div>
            </td>
            <td class="col-lg-3">
                <div>
                    <input type="checkbox" name="m" value="">价格体系：${dto.productParameterList[0].modelType}

                    <img style="width: 150px;height: 150px;"
                         src="<%=request.getContextPath()%>/resources/img/total/main_1.jpg"
                         class="img-rounded">
                </div>
            </td>
        </tr>
        <tr>
            <td class="col-lg-3">
                <div>
                    <input type="checkbox" name="m" value="">焊粉型号：${dto.productParameterList[0].powerType}

                    <img style="width: 150px;height: 150px;"
                         src="<%=request.getContextPath()%>/resources/img/total/main_1.jpg"
                         class="img-rounded">
                </div>
            </td>
            <td class="col-lg-3">
                <div>
                    <input type="checkbox" name="m" value="">模具夹：${dto.productParameterList[0].modelClip}
                </div>
                <img style="width: 150px;height: 150px;"
                     src="<%=request.getContextPath()%>/resources/img/total/main_1.jpg"
                     class="img-rounded">
            </td>
            <c:if test="${dto.productParameterList[0].parameter1 !=null && dto.productParameterList[0].parameter1 !=''}">
                <td class="col-lg-3">
                    <div>
                        <input type="checkbox" name="m" value="">套管(迷你模具)：${dto.productParameterList[0].parameter1}

                        <img style="width: 150px;height: 150px;"
                             src="<%=request.getContextPath()%>/resources/img/total/main_1.jpg"
                             class="img-rounded">
                    </div>
                </td>
            </c:if>
            <c:if test="${dto.productParameterList[0].parameter2 !=null && dto.productParameterList[0].parameter2 !=''}">
                <td class="col-lg-3">
                    <div>
                        <input type="checkbox" name="m" value="">整形模具(防漏材料)：${dto.productParameterList[0].parameter2}

                        <img style="width: 150px;height: 150px;"
                             src="<%=request.getContextPath()%>/resources/img/total/main_1.jpg"
                             class="img-rounded">
                    </div>
                </td>
            </c:if>
        </tr>
    </table>
</div>

<div class="panel-heading">
    <h3 class="panel-title">
        辅助工具
    </h3>
</div>
<div class="panel-body" style="background:#FFFFFF">
    <table style="width: 100% ;padding: 8px">
        <tr>
            <td class="col-lg-4">1</td>
            <td class="col-lg-4">2</td>
            <td class="col-lg-4">3</td>
        </tr>
        <tr>
            <td class="col-lg-4">4</td>
            <td class="col-lg-4">5</td>
            <td class="col-lg-4">6</td>
        </tr>
        <tr>
            <td class="col-lg-4">7</td>
            <td class="col-lg-4">8</td>
            <td class="col-lg-4">9</td>
        </tr>
    </table>
</div>
