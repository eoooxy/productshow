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
                        <li class="active"><a href="javascript:void(0);" onclick="jumpIndex()">主页</a></li>
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
                    <div><h1>Our Products</h1>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae
                        porro consequatur aliquam, incidunt eius magni provident, doloribus omnis minus temporibus
                        perferendis nesciunt quam repellendus nulla nemo ipsum odit corrupti consequuntur possimus, vero
                        mollitia velit ad consectetur. Alias, laborum excepturi nihil autem nemo numquam, ipsa
                        architecto non, magni consequuntur quam.
                    </div>

                </div>
            </div>
        </div>
    </section>


    <section id="content">
        <div class="container">
            <div class="row">
                <div class="skill-home">
                    <div class="skill-home-solid clearfix">

                        <div class="col-md-3 text-center">
                            <div class="box">
                                <span class="icons c1"><i class="icon-settings icons"></i></span>
                                <div class="box-area">
                                    <h3>Chemical</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro
                                        consequatur aliquam, incidunt eius magni provident</p>
                                    <p><a href="#">Learn More</a></p></div>
                            </div>
                        </div>

                        <div class="col-md-3 text-center">
                            <div class="box">
                                <span class="icons c2"><i class="icon-diamond icons"></i></span>
                                <div class="box-area">
                                    <h3>Rubber</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro
                                        consequatur aliquam, incidunt eius magni provident</p>
                                    <p><a href="#">Learn More</a></p></div>
                            </div>
                        </div>

                        <div class="col-md-3 text-center">
                            <div class="box">
                                <span class="icons c3"><i class="icon-user icons"></i></span>
                                <div class="box-area">
                                    <h3>Marbel</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro
                                        consequatur aliquam, incidunt eius magni provident</p>
                                    <p><a href="#">Learn More</a></p></div>
                            </div>
                        </div>

                        <div class="col-md-3 text-center">
                            <div class="box">
                                <span class="icons c4"><i class="icon-home icons"></i></span>
                                <div class="box-area">
                                    <h3>Chemical</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro
                                        consequatur aliquam, incidunt eius magni provident</p>
                                    <p><a href="#">Learn More</a></p></div>
                            </div>
                        </div>

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
                <div class="col-md-3">
                    <div class="widget">
                        <h5 class="widgetheading">Our Contact</h5>
                        <address>
                            <strong>Industry company Inc</strong><br>
                            JC Main Road, Near Silnile tower<br>
                            Pin-21542 NewYork US.
                        </address>
                        <p>
                            <i class="icon-phone"></i> (123) 456-789 - 1255-12584 <br>
                            <i class="icon-envelope-alt"></i> email@domainname.com
                        </p>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="widget">
                        <h5 class="widgetheading">Quick Links</h5>
                        <ul class="link-list">
                            <li><a href="#">Latest Events</a></li>
                            <li><a href="#">Terms and conditions</a></li>
                            <li><a href="#">Privacy policy</a></li>
                            <li><a href="#">Career</a></li>
                            <li><a href="#">Contact us</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="widget">
                        <h5 class="widgetheading">Latest posts</h5>
                        <ul class="link-list">
                            <li><a href="#">Lorem ipsum dolor sit amet, consectetur adipiscing elit.</a></li>
                            <li><a href="#">Pellentesque et pulvinar enim. Quisque at tempor ligula</a></li>
                            <li><a href="#">Natus error sit voluptatem accusantium doloremque</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-3">
                    <div class="widget">
                        <h5 class="widgetheading">Recent News</h5>
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
