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
    <meta name="Keywords" content="铜焊粉，放热焊接，放热焊粉，铝热焊粉，防雷接地">
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
                        <%--<li><a href="javascript:void(0);" onclick="jumpAbout()">关于我们</a></li>--%>
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
                    <div><h3>公司简介</h3>
                        <p> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;苏州安虎电气有限公司专业从事接地技 术研究及防雷接地产品的开发、生产、销售 及技术服务。为各种工程提供专业化的接地 产品、技术支持和服务。</p>
                        <p> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;苏州安虎电气有限公司拥有一支经验丰 富、高效、专业的工程技术团队，能为客户 提供全方位的系统防雷、接地技术咨询、技
                            术培训、工程指导、工程施工等服务;在生 产车间，专业的技术工人、技术人员、质检 人员，能为您提供合格的产品和服务。</p>
                        <p> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;苏州安虎电气有限公司运行ISO9001-20 08质量管理体系，通过了质量管理体系认证， 并获得质量管理体系认证证书。
                            我们严格控制原材料的质量，严格的仓 储控制流程、层层检测确保了原材料有持续 的高标准质量。</p>
                        <p> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们从产品图纸设计、计算、工艺图的 设计、产品试样、产品测试检验，原材料的 接收到成品的配送，每个环节都有精细的检
                            查和验收，这是我们确保产品质量的基础。</p>
                        <p> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们始终坚信，优质的产品、良好的信 誉是我们得以生产和发展的基础。
                            我们为您提供的不仅仅是优质的产品， 同时我们的团队还为您提供专业的技术、专业的服务。
                        </p>
                    </div>

                </div>
            </div>
        </div>
    </section>


    <section class="clients">
        <div class="container">
            <div class="clients-slider">
                <h3 class="header-title">我们的合作企业</h3>
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
