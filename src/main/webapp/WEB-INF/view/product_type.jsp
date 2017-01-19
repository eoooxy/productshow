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
                        <li><a href="javascript:void(0);" onclick="jumpIndex()">主页</a></li>
                        <li class="active"><a href="javascript:void(0);" onclick="jumpProduct()">产品</a></li>
                        <li><a href="javascript:void(0);" onclick="jumpServices()">服务</a></li>
                        <li><a href="javascript:void(0);" onclick="jumpAbout()">关于我们</a></li>
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
            <div class="row" style="margin-top:-55px">
                <div class="col-md-12">
                    <div>
                        <div><h2>整个产品类型介绍</h2>
                            整个产品类型介绍巴拉巴拉巴拉巴拉……
                        </div>
                    </div>
                    <br>
                </div>
            </div>

            <div class="row">
                <div class="skill-home">
                    <div class="skill-home-solid clearfix">

                        <div class="col-md-4 text-center" onclick="getProductOne()">
                            <div class="box">
                                <span class="icons c1"><i class="icon-settings icons"></i></span>
                                <div class="box-area">
                                    <h3>Chemical</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro
                                        consequatur aliquam, incidunt eius magni provident</p>
                                    <p><a href="#">Learn More</a></p></div>
                            </div>
                        </div>

                        <div class="col-md-4 text-center" onclick="getProductTwo()">
                            <div class="box">
                                <span class="icons c2"><i class="icon-diamond icons"></i></span>
                                <div class="box-area">
                                    <h3>Rubber</h3>
                                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Dolores quae porro
                                        consequatur aliquam, incidunt eius magni provident</p>
                                    <p><a href="#">Learn More</a></p></div>
                            </div>
                        </div>

                        <div class="col-md-4 text-center" onclick="getProductThere()">
                            <div class="box">
                                <span class="icons c3"><i class="icon-user icons"></i></span>
                                <div class="box-area">
                                    <h3>Marbel</h3>
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

<script src="<%=request.getContextPath()%>/resources/js/artdialog/jquery.artDialog.source.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/artdialog/artDialog.source.js?skin=aero"></script>
<script src="<%=request.getContextPath()%>/resources/js/artdialog/iframeTools.source.js"></script>
</body>
</html>