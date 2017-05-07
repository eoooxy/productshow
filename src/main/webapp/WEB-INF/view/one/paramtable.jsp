<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017-1-11 0011
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table class="col-lg-12">
    <tr>
        <td class="col-lg-3">
            <div align="center">
                    <span style="font-size: 14px"><input type="checkbox" name="m"
                                                         value="">焊粉型号:${dto.powerType}</span><br/>

                <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('焊粉型号')"
                     src="${entity.powerTypeUrl}"
                     class="img-rounded">
            </div>
        </td>

        <td class="col-lg-3">
            <div align="center">
                    <span style="font-size: 14px"><input type="checkbox" name="m"
                                                         value="">模具型号:${dto.modelNumber}</span><br/>

                <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('模具型号')"
                     src="${entity.modelNumberUrl}"
                     class="img-rounded">
            </div>
        </td>
        <c:if test="${dto.modelClip !=null && dto.modelClip !=''}">
            <td class="col-lg-3">

                <div align="center">
                    <span style="font-size: 14px"><input type="checkbox" name="m"
                                                         value="">模具夹:${dto.modelClip}</span><br/>
                    <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('模具夹')"
                         src="${entity.modelClipUrl}"
                         class="img-rounded">
                </div>
            </td>
        </c:if>
        <c:if test="${dto.parameter1 !=null && dto.parameter1 !=''}">
            <td class="col-lg-3">
                <div align="center">
                        <span style="font-size: 14px"><input type="checkbox" name="m"
                                                             value="">套管(迷你模具):${dto.parameter1}</span><br/>
                    <img style="width:200px;height:150px;border: 1px solid #dddddd;"
                         onclick="queryDes('套管')"
                         src="${entity.parameter1Url}"
                         class="img-rounded">
                </div>
            </td>
        </c:if>
    </tr>
    <tr>
        <c:if test="${dto.parameter2 !=null && dto.parameter2 !=''}">
            <td class="col-lg-3">
                <div align="center">
                        <span style="font-size: 14px"><input type="checkbox" name="m"
                                                             value="">整形模具(防漏材料):${dto.parameter2}</span><br/>
                    <img style="width:200px;height:150px;border: 1px solid #dddddd;"
                         onclick="queryDes('整形模具')"
                         src="${entity.parameter2Url}"
                         class="img-rounded">
                </div>
            </td>
        </c:if>
    </tr>
</table>