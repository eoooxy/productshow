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
    <title>服务</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>

    <link href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css" rel="stylesheet"/>
    <link href="<%=request.getContextPath()%>/resources/css/fancybox/jquery.fancybox.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/css/jcarousel.css" rel="stylesheet"/>
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
                        <li><a href="javascript:void(0);" onclick="jumpProduct()">产品</a></li>
                        <li class="active"><a href="javascript:void(0);" onclick="jumpServices()">服务</a></li>
                       <%-- <li><a href="javascript:void(0);" onclick="jumpAbout()">关于我们</a></li>--%>
                    </ul>
                </div>
            </div>
        </div>
    </header>
    <!-- end header -->
    <%--  <section id="inner-headline">
          <div class="container">
              <div class="row">
                  <div class="col-lg-12">
                      <h2 class="pageTitle">服务</h2>
                  </div>
              </div>
          </div>
      </section>--%>
    <section id="content">
        <div class="container content">
            <div class="row">
                <div class="col-md-12">
                    <div><h2>我们提供的服务</h2>
                    </div>
                </div>
            </div>
            <!-- Service Blcoks -->
            <div class="row service-v1 margin-bottom-40">
                <div class="col-md-4 md-margin-bottom-40">
                    <img class="img-responsive" src="<%=request.getContextPath()%>/resources/img/service1.jpg" alt=""><br/>
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;苏州安虎电气有限公司拥有一支经验丰富、高效、专业的工程技术团队，能为客户提供全方位的系统防雷、接地技术咨询、技术
                        培训、工程指导、工程施工等服务;在生产车间，专业的技术工人、技术人员、质检人员，能为您提供合格的产品和服务。
                    </p>
                </div>
                <div class="col-md-4 md-margin-bottom-40">
                    <img class="img-responsive" src="<%=request.getContextPath()%>/resources/img/service2.jpg" alt=""><br/>
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;苏州安虎电气有限公司运行ISO9001-20 08质量管理体系，通过了质量管理体系认证， 并获得质量管理体系认证证书。
                        </p>
                </div>
                <div class="col-md-4">
                    <img class="img-responsive" src="<%=request.getContextPath()%>/resources/img/service3.jpg" alt=""><br/>
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 我们严格控制原材料的质量，对各种原材料，各中间生产环、以及最终的产品，进行全面的检测试和控制，确保产品质量。生产中
                        需要的原材料均严格按照产品技术指标进行采购；原材料进场后公司对其检测完毕方可入库，生产过程中严格批次抽查；通过层层把关，全面的严格的控制产品质量。</p>
                </div>
            </div>
            <!-- End Service Blcoks -->
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