<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/27 0027
  Time: 16:44
  To change this template use File | Settings | File Templates.


--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row">
    <div class="col-lg-12">
        <div>
            <div><h2>${dto.desEntity.productTitle}</h2>
                ${dto.desEntity.productDes}
            </div>
        </div>
        <br>
    </div>
</div>
<div class="row">
    <div class="col-lg-12">
        <div class="clearfix">
        </div>
        <div class="row">
            <section id="projects">
                <ul id="thumbs" class="portfolio">
                    <!-- Item Project and Filter Name -->
                    <c:forEach items="${dto.childSeriesProductList}" var="v">
                        <li class="item-thumbs design" data-id="id-0" data-type="web">
                            <!-- Fancybox - Gallery Enabled - Title - Full Image -->
                            <a class="hover-wrap fancybox" data-fancybox-group="gallery" title="Portfolio name"
                               href="javascript:void(0);" onclick="getDesProductParam(${v.recId})">
                                <span class="overlay-img"></span>
                                <span class="overlay-img-thumb"><i
                                        class="icon-info-blocks fa fa-check-square"></i></span>
                            </a>
                            <!-- Thumb Image and Description -->
                            <img style="border: 1px solid #dddddd" src="<%=request.getContextPath()%>${v.productChildUrl}"
                                 alt="">
                        </li>
                    </c:forEach>
                    <!-- End Item Project -->
                </ul>
            </section>
        </div>
    </div>
</div>