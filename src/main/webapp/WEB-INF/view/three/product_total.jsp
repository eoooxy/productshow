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
        <!-- 铜覆钢-->
        <div>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;铜覆钢垂直接地棒采用电镀、连铸或包覆的生产工艺将电解铜覆盖到特定的高温度低碳铜芯生产制成，具备 足够的致密均匀放入
                同层厚度（大约0.254mm）和铜层纯度（99.9%及以上），由于集肤效应的存在（特别在流过 高频电流情况下，例如雷电流，
                集肤效应更为明显）使其导电能力和防腐能力（决定了接地网的寿命，非常重要） 近似纯铜，但价格比纯铜材质低廉很多，同时
                由于内部的高强度铜芯，使其具有足够的机械强度（抗拉强度大于等于 60000N/mm2),能够使用冲击锤安装到相当的深度，具备
                铜和钢两种材料的优点，是最适合做接地用途的复合型接地材料。</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我公司采用连续四维电镀法生产铜覆钢接地棒，采用全自动化生产线，完成调查、剥壳、酸洗、水洗、电镀（连续滚动）、烘干、滚轧
                螺纹等各种工艺，相比传统点电镀法生产的产品，铜层厚度更为均匀，铜分子间致密无电镀液残留，具有更高的铜层纯度，铜钢之
                间不含杂质，铜层和铜芯真正为分子结合，结合度好。组合型铜覆钢接地棒螺纹是在电镀工艺完成后滚轧制成，铜和钢一起滚轧在螺
                纹中，使得螺纹出钢和铜的结合异常牢固，是目前作为先进电镀法生产工艺。</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;铜覆钢接地棒氛围组合式和整体式两种。组合式接地棒由驱动头、接地棒、连接器和破土尖端组成，分为英制螺纹和公制螺纹两种制式。</p>
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
                    <c:forEach items="${dto.tfglxList}" var="v">
                        <li class="item-thumbs design" data-id="id-0" data-type="web">
                            <!-- Fancybox - Gallery Enabled - Title - Full Image -->
                            <a class="hover-wrap fancybox" data-fancybox-group="gallery" title="Portfolio name"
                               href="javascript:void(0);" onclick="getChildSeriesProduct(${v.recId})">
                                <span class="overlay-img"></span>
                                <span class="overlay-img-thumb"><i
                                        class="icon-info-blocks fa fa-check-square"></i></span>
                            </a>
                            <!-- Thumb Image and Description -->
                            <img style="border: 1px solid #dddddd" src="<%=request.getContextPath()%>${v.productUrl}"
                                 alt="">
                        </li>
                    </c:forEach>
                    <!-- End Item Project -->
                </ul>
            </section>
        </div>
    </div>
</div>