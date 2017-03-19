<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/18 0018
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>产品信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <!-- css -->
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="<%=request.getContextPath()%>/resources/css/fancybox/jquery.fancybox.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/css/flexslider.css" rel="stylesheet"/>
    <link href="<%=request.getContextPath()%>/resources/css/style.css" rel="stylesheet"/>
    <link href="<%=request.getContextPath()%>/resources/js/owl-carousel/owl.carousel.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/simple-line-icons/css/simple-line-icons.css" rel="stylesheet">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

</head>
<body>
<div id="wrapper">

    <!-- start header -->
    <header>
        <div class="navbar navbar-default navbar-static-top" style="border-bottom: 10px solid #c98f0f ">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="javascript:void(0);" onclick="jumpIndex()"><img
                            src="<%=request.getContextPath()%>/resources/img/logo.png" alt="logo"/></a>
                </div>
                <div class="navbar-collapse collapse ">
                    <ul class="nav navbar-nav">
                        <li><a href="javascript:void(0);" onclick="jumpIndex()">首页</a></li>
                        <li class="active"><a href="javascript:void(0);" onclick="jumpProduct()">产品</a></li>
                        <li><a href="javascript:void(0);" onclick="jumpServices()">服务</a></li>
                        <%--<li><a href="javascript:void(0);" onclick="jumpAbout()">关于我们</a></li>--%>
                    </ul>
                </div>
            </div>
        </div>
    </header>
    <!-- end header -->
    <section id="content">
        <div class="container">

            <div class="row">
                <div class="col-lg-12">
                    <ul class="portfolio-categ" id="convert-ul">
                        <li><a href="javascript:void(0);" onclick="jumpProduct()">产品类型：</a></li>
                    </ul>
                </div>
            </div>
            <%--<div class="row" style="margin-top:-55px">
                <div class="col-md-12">
                    <div>
                        <div><h2>整个产品类型介绍</h2>
                            整个产品类型介绍巴拉巴拉巴拉巴拉……
                        </div>
                    </div>
                    <br>
                </div>
            </div>--%>

            <div class="row">
                <div class="skill-home">
                    <div class="skill-home-solid clearfix">

                        <div class="col-md-4 text-center" onclick="getProductTwo()">
                            <div class="box">
                                <%--<span class="icons c2"><i class="icon-wrench icons"></i></span>--%>
                                <div class="box-area">
                                    <h3>电解离子接地极</h3>
                                    <p>电解离子接地系统由先进的可逆性缓释化合物组成。电极外表材质为纯铜或者为铜覆钢，以确保高导电性能及较长的寿命。电解离子接地系统在
                                    高土壤电阻率的地区提供一个较低电阻接地系统。在季节因素导致土壤电阻率波动的地区，电解离子接地系统也能保证稳定和可靠的低电阻接地效果。</p>
                                </div>
                            </div>
                        </div>


                        <div class="col-md-4 text-center" onclick="getProductOne()">
                            <div class="box">
                                <%--<span class="icons c1"><i class="icon-settings icons"></i></span>--%>
                                <div class="box-area">
                                    <h3>放热焊接</h3>
                                    <p>放热焊接是新型的焊接的工艺，它的原理是利用铜的氧化物及其其他金属材料，在高温的条件下，发生氧化还原反应，将铜置换出来，变成高温金属铜溶
                                        液、在特质模具的包裹下，将需要的焊接的两种金属熔接在一起。</p>
                                </div>
                            </div>
                        </div>

                        <div class="col-md-4 text-center" onclick="getProductThere()">
                            <div class="box">
                                <%--<span class="icons c3"><i class="icon-magic-wand icons"></i></span>--%>
                                <div class="box-area">
                                    <h3>铜覆钢接地棒</h3>
                                    <p>铜覆钢垂直接地棒采用电镀、连铸或包覆的生产工艺将电解铜覆盖到特定的高温度低碳铜芯生产制成，具备
                                    足够的致密均匀放入同层厚度和铜层纯度，由于集肤效应的存在使其导电能力和防腐能力近似纯铜，但价格比纯铜材质低廉很多，
                                        同时由于内部的高强度铜芯，使其具有足够的机械强度,能够使用冲击锤安装到相当的深度，具备铜和钢两种材料的优点，是
                                        最适合做接地用途的复合型接地材料。
                                    </p>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </section>
    <footer>
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                    <div class="widget">
                        <h5 class="widgetheading">联系我们</h5>
                        <p>
                            <i class="icon-user-female"></i> 邱女士<br>
                            <i class="icon-phone"></i> 150-5020-4116<br>
                            <i class="icon-link"></i><a href="https://400528.1688.com/"
                                                        style="text-decoration:none;color: #888;" target="_blank"> 旺
                            铺：400528.1688.com</a><br>
                            <i class="icon-map"></i> 江苏省昆山市千灯镇
                        </p>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="widget">
                        <h5 class="widgetheading">友情链接</h5>
                        <ul class="link-list">
                            <li><a href="#">暂无</a></li>
                            <%-- <li><a href="#">Terms and conditions</a></li>
                             <li><a href="#">Privacy policy</a></li>
                             <li><a href="#">Career</a></li>
                             <li><a href="#">Contact us</a></li>--%>
                        </ul>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="widget">
                        <h5 class="widgetheading">关注我们</h5>
                        <ul class="link-list">
                            <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</a></li>
                            <li><a href="#">Pellentesque et pulvinar enim. Quisque at tempor ligula</a></li>
                            <li><a href="#">Natus error sit voluptatem accusantium doloremque</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

    </footer>
</div>
<a href="#" class="scrollup"><i class="fa fa-angle-up active"></i></a>
<!-- javascript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="<%=request.getContextPath()%>/resources/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>

<%--<script src="<%=request.getContextPath()%>/resources/js/jquery.easing.1.3.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/jquery.fancybox.pack.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/jquery.fancybox-media.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/portfolio/jquery.quicksand.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/portfolio/setting.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/jquery.flexslider.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/animate.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/custom.js"></script>--%>
<script src="<%=request.getContextPath()%>/resources/js/ahoo/ahoo.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/ahoo/anchor.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/ahoo/mainseries.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/ahoo/back/product.js"></script>

<script src="<%=request.getContextPath()%>/resources/js/owl-carousel/owl.carousel.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/artdialog/jquery.artDialog.source.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/artdialog/artDialog.source.js?skin=aero"></script>
<script src="<%=request.getContextPath()%>/resources/js/artdialog/iframeTools.source.js"></script>
</body>
</html>