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
            <div>
                <div style="width: 35%;float: left">
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;电解离子接地系统由先进的可逆性缓释化合物组成。电极外表材质为纯铜或者为铜覆钢，以确保高导电性能及较长的寿命。
                        电解离子接地系统在 高土壤电阻率的地区提供一个较低电阻接地系统。在季节因素导致土壤电阻率波动的地区，电解离子
                        接地系统也能保证稳定和可靠的低电阻接地效果。</p>
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;电解离子接地极已普遍应用于通信、电力交通、金融、石化、建筑系统等等诸多领域，如发电厂、变电站、电力输电线路、通信
                        局（站）、移动基站、调度机房、高速公路、铁路（地铁、高铁）化工厂、加油站、石油库、军事基地、银行、计算机房、智能
                        化小区等系统的接地建设或改造。
                    </p>
                </div>
                <div style="width: 63%;float: right">
                    <img src="<%=request.getContextPath()%>/resources/img/djlz.jpg" style="height: 250px">
                </div>
            </div>


            <div style="margin-top: 50px;clear: both;">
                <select id="parameterA" class="form-control" style="width:190px;" onchange="getParamB()">
                    <option>请选择规格A</option>
                    <c:forEach items="${dto.strings}" var="v">
                        <option>${v}</option>
                    </c:forEach>
                </select>


                <select id="parameterB" class="form-control" style="width:190px; margin-left: 10px;">
                    <option>请选择规格B</option>
                </select>

                <input type="button" class="btn btn-default" style="margin-left: 10px" value="查询"
                       onclick="getOneParam()">
            </div>
        </div>

        <div class="panel panel-default" style="margin-top: 20px" id="oneDesParam">

        </div>

    </div>
</div>
