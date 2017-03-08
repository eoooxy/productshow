<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/18 0018
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Home</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <!-- css -->
    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="<%=request.getContextPath()%>/resources/simple-line-icons/css/simple-line-icons.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/css/fancybox/jquery.fancybox.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/css/jcarousel.css" rel="stylesheet"/>
    <link href="<%=request.getContextPath()%>/resources/css/flexslider.css" rel="stylesheet"/>
    <link href="<%=request.getContextPath()%>/resources/js/owl-carousel/owl.carousel.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/css/style.css" rel="stylesheet"/>

</head>
<body>
<div id="wrapper" class="home-page">
    <!-- start header -->
    <header>
        <div class="navbar navbar-default navbar-static-top">
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
                        <li class="active"><a href="javascript:void(0);" onclick="jumpIndex()">首页</a></li>
                        <li><a href="javascript:void(0);" onclick="jumpProduct()">产品</a></li>
                        <li><a href="javascript:void(0);" onclick="jumpServices()">服务</a></li>
                        <li><a href="javascript:void(0);" onclick="jumpAbout()">关于我们</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header>
    <!-- end header -->
    <section id="banner">

        <!-- Slider -->
        <div id="main-slider" class="flexslider">
            <ul class="slides">
                <li>
                    <img src="<%=request.getContextPath()%>/resources/img/slides/1.jpg" alt=""/>
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="flex-caption">
                                    <h3>INDUSTRIAL PRODUCTS</h3>
                                    <p>Doloribus omnis minus temporibus perferendis ipsa architecto.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
                <li>
                    <img src="<%=request.getContextPath()%>/resources/img/slides/2.jpg" alt=""/>
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-12">
                                <div class="flex-caption">
                                    <h3>manufacturing</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elitincidunt.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
            </ul>
        </div>

        <!-- end slider -->

    </section>
    <section class="jumbobox">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div><h1>产品简介</h1>
                        <p>苏州安虎电器有限公司是专业从事接地技术研究及防雷接地产品的研发、生产、原材料加工的专业生产厂家，公司目前主要产品，
                            有放热焊接焊粉、放热焊接相关模具及配件、钢轨（导轨）与导线（回流线）放热焊接产品及全套解决方案、阴极保护系列放热
                            焊接产品等。使用放热焊接系列产品可以使接地工程达到免维护条件且施工运输方便安装造价大幅度降低，广泛应用于轨道交通、
                            电力、通讯、石油化工、铁路、航空等领域。
                            公司拥有一支经验丰富、高效、专业的技术团队，能为用户提供各种工程提供专业化接地技术支持和服务。公司凭借精湛的技术、
                            严格的质量管理、高品质的产品、丰富的工程经验和优质完善的售前、售中、售后服务，赢得了广大用户的信任。公司将以高质量
                            、全方位的接地技术服务于广大用户！</p>
                    </div>

                </div>
            </div>
        </div>
    </section>


    <section class="clients">
        <div class="container">
            <div class="clients-slider">
                <h3 class="header-title">Our Clients</h3>
                <div class="clients-control pull-right">
                    <a class="prev btn btn-gray btn-xs"><i class="fa fa-angle-left fa-2x"></i></a>
                    <a class="next btn btn-gray btn-xs"><i class="fa fa-angle-right fa-2x"></i></a>
                </div>
                <span class="line"></span>
                <div id="clients-slider" class="owl-carousel">
                    <div class="item">
                        <a href="#">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/amazon-grey.png">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/amazon.png"
                                 class="colored">
                        </a>
                    </div>
                    <div class="item">
                        <a href="#">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/cisco_grey.png">
                            <img alt="Our Client" src="<%=request.getContextPath()%>/resources/img/OurClients/cisco.png"
                                 class="colored">
                        </a>
                    </div>
                    <div class="item">
                        <a href="#">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/cityairline-grey.png">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/cityairline.png"
                                 class="colored">
                        </a>
                    </div>
                    <div class="item">
                        <a href="#">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/dell-grey.png">
                            <img alt="Our Client" src="<%=request.getContextPath()%>/resources/img/OurClients/dell.png"
                                 class="colored">
                        </a>
                    </div>
                    <div class="item">
                        <a href="#">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/ebay-grey.png">
                            <img alt="Our Client" src="<%=request.getContextPath()%>/resources/img/OurClients/ebay.png"
                                 class="colored">
                        </a>
                    </div>
                    <div class="item">
                        <a href="#">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/google-grey.png">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/google.png"
                                 class="colored">
                        </a>
                    </div>
                    <div class="item">
                        <a href="#">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/hp_grey.png">
                            <img alt="Our Client" src="<%=request.getContextPath()%>/resources/img/OurClients/hp.png"
                                 class="colored">
                        </a>
                    </div>
                    <div class="item">
                        <a href="#">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/igneus_grey.png">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/igneus.png"
                                 class="colored">
                        </a>
                    </div>
                    <div class="item">
                        <a href="#">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/natural_grey.png">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/natural.png"
                                 class="colored">
                        </a>
                    </div>
                    <div class="item">
                        <a href="#">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/shell_grey.png">
                            <img alt="Our Client" src="<%=request.getContextPath()%>/resources/img/OurClients/shell.png"
                                 class="colored">
                        </a>
                    </div>
                    <div class="item">
                        <a href="#">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/vadafone_grey.png">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/vadafone.png"
                                 class="colored">
                        </a>
                    </div>
                    <div class="item">
                        <a href="#">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/walmart_grey.png">
                            <img alt="Our Client"
                                 src="<%=request.getContextPath()%>/resources/img/OurClients/walmart.png"
                                 class="colored">
                        </a>
                    </div>
                </div>
                <div class="fullwidth margin-bottom-20">
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
<a href="#" class="scrollup"><i class="fa fa-angle-up"></i></a>
<!-- javascript
    ================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="<%=request.getContextPath()%>/resources/js/jquery.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/jquery.easing.1.3.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/jquery.fancybox.pack.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/jquery.fancybox-media.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/portfolio/jquery.quicksand.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/portfolio/setting.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/jquery.flexslider.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/animate.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/custom.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/owl-carousel/owl.carousel.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/ahoo/ahoo.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/ahoo/anchor.js"></script>
</body>
</html>
