<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
<div class="panel-body" style="background:#FFFFFF">
    <input type="hidden" id="pagNumFlag" value="0">
    <div id="tableDiv">
        <table class="col-lg-12">
            <tr>
                <td class="col-lg-3">
                    <div align="center">
                    <span style="font-size: 14px;align-content: center"><input type="checkbox" name="m"
                                                                               value="">导体A:${dto.productParameterList[0].conductorA}</span><br/>
                        <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('导体')"
                             src="${dto.productParameterPicUrlEntity.conductorUrl}"
                             class="img-rounded">
                    </div>
                </td>

                <td class="col-lg-3">
                    <div align="center">
                    <span style="font-size: 14px"><input type="checkbox" name="m"
                                                         value="">焊粉型号:${dto.productParameterList[0].powerType}</span><br/>

                        <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('焊粉型号')"
                             src="${dto.productParameterPicUrlEntity.powerTypeUrl}"
                             class="img-rounded">
                    </div>
                </td>


                <td class="col-lg-3">
                    <div align="center">
                    <span style="font-size: 14px"><input type="checkbox" name="m"
                                                         value="">模具型号:${dto.productParameterList[0].modelNumber}</span><br/>

                        <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('模具型号')"
                             src="${dto.productParameterPicUrlEntity.modelNumberUrl}"
                             class="img-rounded">
                    </div>
                </td>
                <c:if test="${dto.productParameterList[0].modelType !=null && dto.productParameterList[0].modelType !=''}">
                    <td class="col-lg-3">
                        <div align="center">

                    <span style="font-size: 14px"><input type="checkbox" name="m"
                                                         value="">价格体系:${dto.productParameterList[0].modelType}</span><br/>

                            <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('价格体系')"
                                 src="${dto.productParameterPicUrlEntity.modelTypeUrl}"
                                 class="img-rounded">
                        </div>
                    </td>
                </c:if>
            </tr>
            <tr>
                <c:if test="${dto.productParameterList[0].conductorB !=null && dto.productParameterList[0].conductorB !=''}">
                    <td class="col-lg-3">
                        <div align="center">
                        <span style="font-size: 14px"><input type="checkbox" name="m"
                                                             value="">导体B:${dto.productParameterList[0].conductorB}</span><br/>
                            <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('导体')"
                                 src="${dto.productParameterPicUrlEntity.conductorUrl}"
                                 class="img-rounded">
                        </div>
                    </td>
                </c:if>
                <c:if test="${dto.productParameterList[0].modelClip !=null && dto.productParameterList[0].modelClip !=''}">
                    <td class="col-lg-3">
                        <div align="center">
                    <span style="font-size: 14px"><input type="checkbox" name="m"
                                                         value="">模具夹:${dto.productParameterList[0].modelClip}</span><br/>

                            <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('模具夹')"
                                 src="${dto.productParameterPicUrlEntity.modelClipUrl}"
                                 class="img-rounded">
                        </div>
                    </td>
                </c:if>
                <c:if test="${dto.productParameterList[0].parameter1 !=null && dto.productParameterList[0].parameter1 !=''}">
                    <td class="col-lg-3">
                        <div align="center">
                        <span style="font-size: 14px"><input type="checkbox" name="m"
                                                             value="">套管(迷你模具):${dto.productParameterList[0].parameter1}</span><br/>

                            <img style="width:200px;height:150px;border: 1px solid #dddddd;"
                                 onclick="queryDes('套管')"
                                 src="${dto.productParameterPicUrlEntity.parameter1Url}"
                                 class="img-rounded">
                        </div>
                    </td>
                </c:if>
                <c:if test="${dto.productParameterList[0].parameter2 !=null && dto.productParameterList[0].parameter2 !=''}">
                    <td class="col-lg-3">
                        <div align="center">
                        <span style="font-size: 14px"><input type="checkbox" name="m"
                                                             value="">整形模具(防漏材料):${dto.productParameterList[0].parameter2}</span><br/>

                            <img style="width:200px;height:150px;border: 1px solid #dddddd;"
                                 onclick="queryDes('整形模具')"
                                 src="${dto.productParameterPicUrlEntity.parameter2Url}"
                                 class="img-rounded">
                        </div>
                    </td>
                </c:if>
            </tr>
        </table>
    </div>
    <div>
        <input type="button" class="btn btn-default" style="float: right;" value="下一页"
               onclick="addPage('${fn:length(dto.productParameterList)}')">
        <label style="float: right;margin-top:5px;margin-left: 5px;margin-right: 5px"
               id="pageNum">1/${fn:length(dto.productParameterList)}</label>
        <input type="button" class="btn btn-default" style="float: right;" value="上一页"
               onclick="subPage('${fn:length(dto.productParameterList)}')">
    </div>
</div>

<div class="panel-heading">
    <h3 class="panel-title">
        辅助工具
    </h3>
</div>
<div class="panel-body" style="background:#FFFFFF">
    <table class="col-lg-12">
        <tr>
            <td class="col-lg-3">
                <div align="center">
                    <span style="font-size: 14px"><input type="checkbox" name="m"
                                                         value="">工具箱:${dto.supProductParameterEntity.toolbox}</span>

                    <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('工具箱')"
                         src="<%=request.getContextPath()%>${dto.supProductParameterUrlEntity.toolboxUrl}"
                         class="img-rounded">
                </div>
            </td>
            <td class="col-lg-3">
                <div align="center">
                    <span style="font-size: 14px"><input type="checkbox" name="m"
                                                         value="">点火枪:${dto.supProductParameterEntity.dhq}</span>

                    <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('点火枪')"
                         src="<%=request.getContextPath()%>${dto.supProductParameterUrlEntity.dhqUrl}"
                         class="img-rounded">
                </div>
            </td>
            <td class="col-lg-3">
                <div align="center">
                    <span style="font-size: 14px"><input type="checkbox" name="m"
                                                         value="">喷灯(套装):${dto.supProductParameterEntity.pd3}</span>

                    <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('喷灯')"
                         src="<%=request.getContextPath()%>${dto.supProductParameterUrlEntity.pd3Url}"
                         class="img-rounded">
                </div>
            </td>
            <td class="col-lg-3">
                <div align="center">
                    <span style="font-size: 14px"><input type="checkbox" name="m"
                                                         value="">清模铜刷:${dto.supProductParameterEntity.qm1}</span>

                    <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('清模铜刷')"
                         src="<%=request.getContextPath()%>${dto.supProductParameterUrlEntity.qm1Url}"
                         class="img-rounded">
                </div>
            </td>
        </tr>
        <tr>
            <td class="col-lg-3">
                <div align="center">
                    <span style="font-size: 14px"><input type="checkbox" name="m"
                                                         value="">清模毛刷:${dto.supProductParameterEntity.qm2}</span>

                    <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('清模毛刷')"
                         src="<%=request.getContextPath()%>${dto.supProductParameterUrlEntity.qm2Url}"
                         class="img-rounded">
                </div>
            </td>
            <td class="col-lg-3">
                <div align="center">
                    <span style="font-size: 14px"><input type="checkbox" name="m"
                                                         value="">C型夹:${dto.supProductParameterEntity.mj1}</span>

                    <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('C型夹')"
                         src="<%=request.getContextPath()%>${dto.supProductParameterUrlEntity.mj1Url}"
                         class="img-rounded">
                </div>
            </td>
            <td class="col-lg-3">
                <div align="center">
                    <span style="font-size: 14px"><input type="checkbox" name="m"
                                                         value="">F型夹:${dto.supProductParameterEntity.mj2}</span>

                    <img style="width:200px;height:150px;border: 1px solid #dddddd;" onclick="queryDes('F型夹')"
                         src="<%=request.getContextPath()%>${dto.supProductParameterUrlEntity.mj2Url}"
                         class="img-rounded">
                </div>
            </td>
        </tr>
    </table>
    <input type="button" class="btn btn-default" style="float: right;margin-top: 20px" value="确定"
           onclick="select_checkbox()">

</div>
