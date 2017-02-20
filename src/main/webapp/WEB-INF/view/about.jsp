<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/12/18 0018
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>关于我们</title>
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
                        <li><a href="javascript:void(0);" onclick="jumpProduct()">产品</a></li>
                        <li><a href="javascript:void(0);" onclick="jumpServices()">服务</a></li>
                        <li class="active"><a href="javascript:void(0);" onclick="jumpAbout()">关于我们</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header>

    <section id="content">
        <div class="container">

            <div class="about">

                <section class="features">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12">
                                <div><h2>我们是谁</h2>
                                    <p>
                                        苏州安虎电气有限公司是专业从事接地技术研究及防雷接地产品的研发、生产、原材料加工的专业生产厂家，
                                        公司目前主要产品，有放热焊接焊粉、放热焊接相关模具及配件、钢轨（导轨）与导线（回流线）放热焊接
                                        产品及全套解决方案、阴极保护系列放热焊接产品等。使用放热焊接系列产品可以使接地工程达到免维护条件
                                        且施工运输方便安装造价大幅度降低，广泛应用于轨道交通、电力、通讯、石油化工、铁路、航空等领域。 公
                                        司拥有一支经验丰富、高效、专业的技术团队，能为用户提供各种工程提供专业化接地技术支持和服务。公司凭
                                        借精湛的技术、严格的质量管理、高品质的产品、丰富的工程经验和优质完善的售前、售中、售后服务，赢得了广
                                        大用户的信任。公司将以高质量、全方位的接地技术服务于广大用户。
                                    </p>
                                </div>
                                <br>
                            </div>
                        </div>

                        <hr class="margin-bottom-50">

                        <div class="row">
                            <div class="col-md-12">
                                <div><h2>为什么选择我们</h2>
                                    <p>
                                        苏州安虎电气有限公司是专业从事接地技术研究及防雷接地产品的研发、生产、原材料加工的专业生产厂家，
                                        公司目前主要产品，有放热焊接焊粉、放热焊接相关模具及配件、钢轨（导轨）与导线（回流线）放热焊接
                                        产品及全套解决方案、阴极保护系列放热焊接产品等。使用放热焊接系列产品可以使接地工程达到免维护条件
                                        且施工运输方便安装造价大幅度降低，广泛应用于轨道交通、电力、通讯、石油化工、铁路、航空等领域。 公
                                        司拥有一支经验丰富、高效、专业的技术团队，能为用户提供各种工程提供专业化接地技术支持和服务。公司凭
                                        借精湛的技术、严格的质量管理、高品质的产品、丰富的工程经验和优质完善的售前、售中、售后服务，赢得了广
                                        大用户的信任。公司将以高质量、全方位的接地技术服务于广大用户。
                                    </p>
                                </div>
                                <br/>
                            </div>
                        </div>
                    </div>
                </section>
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
<script src="<%=request.getContextPath()%>/resources/js/ahoo/ahoo.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/ahoo/anchor.js"></script>
<script src="<%=request.getContextPath()%>/resources/js/owl-carousel/owl.carousel.js"></script>
</body>
</html>