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
            <div><h2>${dto.desEntity.productTitle}</h2>
                ${dto.desEntity.productDes}
            </div>
        </div>
        <br>
    </div>
</div>
<div class="row">
    <div class="col-lg-12">
        <%--<ul class="portfolio-categ filter">--%>
        <%--<li class="all active"><a href="#">All</a></li>--%>
        <%--<li class="web"><a href="#" title="">Finance</a></li>--%>
        <%--<li class="icon"><a href="#" title="">Products</a></li>--%>
        <%--<li class="graphic"><a href="#" title="">Services</a></li>--%>
        <%--</ul>--%>
        <div class="clearfix">
        </div>
        <div class="row">
            <section id="projects">
                <ul id="thumbs" class="portfolio">
                    <!-- Item Project and Filter Name -->
                    <c:forEach items="${dto.mainSeriesProductList}" var="v">
                        <li class="item-thumbs design" data-id="id-0" data-type="web">
                            <!-- Fancybox - Gallery Enabled - Title - Full Image -->
                            <a class="hover-wrap fancybox" data-fancybox-group="gallery" title="Portfolio name"
                               href="javascript:void(0);" onclick="getChildSeriesProduct(${v.recId})">
                                <span class="overlay-img"></span>
                                <span class="overlay-img-thumb"><i
                                        class="icon-info-blocks fa fa-check-square"></i></span>
                            </a>
                            <!-- Thumb Image and Description -->
                            <img style="border: 1px solid" src="<%=request.getContextPath()%>${v.productMainUrl}"
                                 alt="">
                        </li>
                    </c:forEach>
                    <!-- End Item Project -->
                </ul>
            </section>
        </div>
    </div>
</div>