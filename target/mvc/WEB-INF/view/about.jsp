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
    <!-- end header -->
<%--    <section id="inner-headline">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <h2 class="pageTitle">关于我们</h2>
                </div>
            </div>
        </div>
    </section>--%>
    <section id="content">
        <div class="container">

            <div class="about">

                <section class="features">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-12">
                                <div><h2>Who We Are</h2>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                    Dolores quae porro consequatur aliquam, incidunt eius magni provident, doloribus
                                    omnis minus ovident, doloribus omnis minus temporibus perferendis nesciunt..
                                </div>
                                <br>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div><h2>Our Awesome Features</h2>Lorem ipsum dolor sit amet, consectetur adipisicing
                                    elit. Dolores quae porro consequatur aliquam, incidunt eius magni provident,
                                    doloribus omnis minus ovident, doloribus omnis minus temporibus perferendis
                                    nesciunt..
                                </div>
                                <br/>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="features-item">
                                    <div class="features">
                                        <div class="icon">
                                            <i class="icon-map icons"></i>
                                        </div>
                                        <div class="features-content">
                                            <h3>Premium Sliders Included</h3>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iusto quisquam
                                                id, odit dolore inventore.</p>
                                        </div>
                                    </div>
                                    <div class="features">
                                        <div class="icon">
                                            <i class="icon-envelope-open icons"></i>
                                        </div>
                                        <div class="features-content">
                                            <h3>100% Responsive Layout</h3>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iusto quisquam
                                                id, odit dolore inventore.</p>
                                        </div>
                                    </div>
                                    <div class="features">
                                        <div class="icon">
                                            <i class="icon-badge icons"></i>
                                        </div>
                                        <div class="features-content">
                                            <h3>Support System</h3>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Iusto quisquam
                                                id, odit dolore inventore.</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <img class="img-responsive" src="img/img1.png" alt="">
                            </div>
                        </div>
                    </div>
                </section>
                <div class="row">
                    <div class="col-md-4">
                        <!-- Heading and para -->
                        <div class="block-heading-two">
                            <h3><span>Why Choose Us?</span></h3>
                        </div>
                        <p>Sed ut perspiciaatis unde omnis iste natus error sit voluptatem accusantium doloremque
                            laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi
                            architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit
                            aspernatur. <br/><br/>Sed ut perspiciaatis iste natus error sit voluptatem probably haven't
                            heard of them accusamus.</p>
                    </div>
                    <div class="col-md-4">
                        <div class="block-heading-two">
                            <h3><span>Our Solution</span></h3>
                        </div>
                        <!-- Accordion starts -->
                        <div class="panel-group" id="accordion-alt3">
                            <!-- Panel. Use "panel-XXX" class for different colors. Replace "XXX" with color. -->
                            <div class="panel">
                                <!-- Panel heading -->
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion-alt3"
                                           href="#collapseOne-alt3">
                                            <i class="fa fa-angle-right"></i> Accordion Heading Text Item # 1
                                        </a>
                                    </h4>
                                </div>
                                <div id="collapseOne-alt3" class="panel-collapse collapse">
                                    <!-- Panel body -->
                                    <div class="panel-body">
                                        Sed ut perspiciaatis unde omnis iste natus error sit voluptatem accusantium
                                        doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore
                                        veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam
                                        voluptatem quia voluptas
                                    </div>
                                </div>
                            </div>
                            <div class="panel">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion-alt3"
                                           href="#collapseTwo-alt3">
                                            <i class="fa fa-angle-right"></i> Accordion Heading Text Item # 2
                                        </a>
                                    </h4>
                                </div>
                                <div id="collapseTwo-alt3" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        Sed ut perspiciaatis unde omnis iste natus error sit voluptatem accusantium
                                        doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore
                                        veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam
                                        voluptatem quia voluptas
                                    </div>
                                </div>
                            </div>
                            <div class="panel">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion-alt3"
                                           href="#collapseThree-alt3">
                                            <i class="fa fa-angle-right"></i> Accordion Heading Text Item # 3
                                        </a>
                                    </h4>
                                </div>
                                <div id="collapseThree-alt3" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        Sed ut perspiciaatis unde omnis iste natus error sit voluptatem accusantium
                                        doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore
                                        veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam
                                        voluptatem quia voluptas
                                    </div>
                                </div>
                            </div>
                            <div class="panel">
                                <div class="panel-heading">
                                    <h4 class="panel-title">
                                        <a data-toggle="collapse" data-parent="#accordion-alt3"
                                           href="#collapseFour-alt3">
                                            <i class="fa fa-angle-right"></i> Accordion Heading Text Item # 4
                                        </a>
                                    </h4>
                                </div>
                                <div id="collapseFour-alt3" class="panel-collapse collapse">
                                    <div class="panel-body">
                                        Sed ut perspiciaatis unde omnis iste natus error sit voluptatem accusantium
                                        doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore
                                        veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam
                                        voluptatem quia voluptas
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- Accordion ends -->

                    </div>

                    <div class="col-md-4">
                        <div class="block-heading-two">
                            <h3><span>Our Expertise</span></h3>
                        </div>
                        <h6>Managment</h6>
                        <div class="progress pb-sm">
                            <!-- White color (progress-bar-white) -->
                            <div class="progress-bar progress-bar-red" role="progressbar" aria-valuenow="40"
                                 aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                <span class="sr-only">40% Complete (success)</span>
                            </div>
                        </div>
                        <h6>Computerized</h6>
                        <div class="progress pb-sm">
                            <div class="progress-bar progress-bar-green" role="progressbar" aria-valuenow="60"
                                 aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                <span class="sr-only">40% Complete (success)</span>
                            </div>
                        </div>
                        <h6>Finance</h6>
                        <div class="progress pb-sm">
                            <div class="progress-bar progress-bar-lblue" role="progressbar" aria-valuenow="80"
                                 aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                <span class="sr-only">40% Complete (success)</span>
                            </div>
                        </div>
                        <h6>Managment</h6>
                        <div class="progress pb-sm">
                            <div class="progress-bar progress-bar-yellow" role="progressbar" aria-valuenow="30"
                                 aria-valuemin="0" aria-valuemax="100" style="width: 30%">
                                <span class="sr-only">40% Complete (success)</span>
                            </div>
                        </div>
                    </div>

                </div>


                <br>
                <!-- Our Team starts -->

                <!-- Heading -->
                <div class="block-heading-six">
                    <h4 class="bg-color">Our Team</h4>
                </div>
                <br>

                <!-- Our team starts -->

                <div class="team-six">
                    <div class="row">
                        <div class="col-md-3 col-sm-6">
                            <!-- Team Member -->
                            <div class="team-member">
                                <!-- Image -->
                                <img class="img-responsive" src="<%=request.getContextPath()%>/resources/img/team1.jpg"
                                     alt="">
                                <!-- Name -->
                                <h4>Johne Doe</h4>
                                <span class="deg">Creative</span>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-6">
                            <!-- Team Member -->
                            <div class="team-member">
                                <!-- Image -->
                                <img class="img-responsive" src="<%=request.getContextPath()%>/resources/img/team2.jpg"
                                     alt="">
                                <!-- Name -->
                                <h4>Jennifer</h4>
                                <span class="deg">Programmer</span>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-6">
                            <!-- Team Member -->
                            <div class="team-member">
                                <!-- Image -->
                                <img class="img-responsive" src="<%=request.getContextPath()%>/resources/img/team3.jpg"
                                     alt="">
                                <!-- Name -->
                                <h4>Christean</h4>
                                <span class="deg">CEO</span>
                            </div>
                        </div>
                        <div class="col-md-3 col-sm-6">
                            <!-- Team Member -->
                            <div class="team-member">
                                <!-- Image -->
                                <img class="img-responsive" src="<%=request.getContextPath()%>/resources/img/team4.jpg"
                                     alt="">
                                <!-- Name -->
                                <h4>Kerinele rase</h4>
                                <span class="deg">Manager</span>
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Our team ends -->


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
</body>
</html>