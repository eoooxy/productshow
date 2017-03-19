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
            <div><%--h2>${dto.desEntity.productTitle}</h2>--%>
                <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;放热焊接（又成为火泥熔核、火泥焊接、火泥焊接、放热溶接、放热熔焊、放热溶接）是新型的焊接的工艺，它的原理是利 
                用铜的氧化物及其其他金属材料，在高温的条件下，发生氧化还原反应，将铜置换出来，变成高温金属铜溶液、在特质模具
                的 包裹下，将需要的焊接的两种金属熔接在一起，形成分子结合，相比传统的金属连续工艺具有更强的耐腐蚀能力，裹在能
                力以及热稳定性 ，同时还有具有焊接速度快，无需水电等能源，施工效率快，能够链接多种金属类等技术特点。</p>
                <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;放热焊接为真正的分子结合，接点面积一般是所连接导体界面的两倍以上，接点的过载能力、耐受高温能力、耐腐蚀能力、
                机械强度高于导体（以铜为参照）。由于工艺的限制，机械连接点的是实际接触面往往小于所连接的导体界面，造成接点的过
                载能力、机械强度、耐腐蚀能力较差。</p>

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
                            <img style="border: 1px solid #dddddd" src="${v.productMainUrl}"
                                 alt="">
                        </li>
                    </c:forEach>
                    <!-- End Item Project -->
                </ul>
            </section>
        </div>
    </div>
</div>