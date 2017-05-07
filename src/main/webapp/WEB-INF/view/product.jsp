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
    <title>产品套餐</title>
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
        <%--放热焊接部分--%>
        <div class="container">
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
            <div class="panel panel-default" style="margin-top: 20px">
                <div class="panel-heading" style="background-color:#c98f0f">
                    <span style="font-size: 16px;color: white">放热焊粉及放热焊接模具</span><br/>
                </div>
                <div class="panel-body" style="background:#FFFFFF">
                    <table class="col-lg-12" style="border-collapse: separate;border-spacing: 0px 20px">
                        <tr>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/product/hf.jpg"
                                            class="img-rounded"></a>
                                    <span style="font-size: 14px;align-content: center;">10~300#放热焊粉</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"> <img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/branch/1_cc1.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">"一"字放热焊接模具</span><br/>
                                </div>
                            </td>

                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/branch/1_cc2.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">"T"型放热焊接模具</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/branch/1_cc4.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">"十"字放热焊接模具</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/branch/6_cb1.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">电缆与导线"一"字焊接模具</span><br/>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/branch/6_cb5.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">电缆与导线"T"型焊接模具</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/branch/4_br2.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">扁铜与接地棒焊接模具</span><br/>
                                </div>
                            </td>
                            <td class="_20">

                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/branch/3_bb7.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">扁铜水平"一"字焊接模具</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/branch/3_bb14.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">扁铜水平"T"型焊接模具</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/branch/3_bb44.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">扁铜水平"十"字焊接模具</span><br/>
                                </div>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <%--阴级系列--%>
        <div class="container">
            <div class="panel panel-default" style="margin-top: 20px">
                <div class="panel-heading" style="background-color:#c98f0f">
                    <span style="font-size: 16px;color: white"> 阴极保护系列</span><br/>
                </div>
                <div class="panel-body" style="background:#FFFFFF">
                    <table class="col-lg-12" style="border-collapse: separate;border-spacing: 0px 20px">
                        <tr>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/product/hf.jpg"
                                            class="img-rounded"></a>
                                    <span style="font-size: 14px;align-content: center;">10~25#放热焊粉</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/product/yjmj.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">迷你模具(阴极保护专用)</span><br/>
                                </div>
                            </td>

                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/suppic/dhq.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">点火枪</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/suppic/pd.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">喷灯</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/suppic/qm2.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">清模毛刷</span><br/>
                                </div>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
        <%--导线与钢轨--%>
        <div class="container">
            <div class="panel panel-default" style="margin-top: 20px">
                <div class="panel-heading" style="background-color:#c98f0f">
                    <span style="font-size: 16px;color: white"> 导线与钢轨焊接系列</span><br/>
                </div>
                <div class="panel-body" style="background:#FFFFFF">
                    <table class="col-lg-12" style="border-collapse: separate;border-spacing: 0px 20px">
                        <tr>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/product/hf.jpg"
                                            class="img-rounded"></a>
                                    <span style="font-size: 14px;align-content: center;">65~250#放热焊粉</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/product/ggmj.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">导轨与导线焊接专用模具</span><br/>
                                </div>
                            </td>

                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/product/ggmj.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">轨道模具夹</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/product/dmj.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">"D"型整形模具</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/product/tt.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">配套铜套</span><br/>
                                </div>
                            </td>
                        </tr>

                    </table>
                </div>
            </div>
        </div>
        <%--辅助配件--%>
        <div class="container">
            <div class="panel panel-default" style="margin-top: 20px">
                <div class="panel-heading" style="background-color:#c98f0f">
                    <span style="font-size: 16px;color: white">辅助配件</span><br/>
                </div>
                <div class="panel-body" style="background:#FFFFFF">
                    <table class="col-lg-12" style="border-collapse: separate;border-spacing: 0px 20px">
                        <tr>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"> <img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/suppic/toolbox.jpg"
                                            class="img-rounded"></a>
                                    <span style="font-size: 14px;align-content: center;">工具箱</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/suppic/cgmjj.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">常规模具夹</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/suppic/xpxmjj.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">小偏心模具夹</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/suppic/xpxmjj.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">大偏心模具夹</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/suppic/dhq.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">点火枪</span><br/>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/suppic/pd.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">喷灯(套装)</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"> <img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/suppic/qm1.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">清模铜刷</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/suppic/qm2.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">清模毛刷</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"><img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/suppic/c_clip.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">C型夹</span><br/>
                                </div>
                            </td>
                            <td class="_20">
                                <div align="center">
                                    <a href="https://400528.1688.com/" target="_blank"> <img
                                            style="width:200px;height:150px;border: 1px solid #dddddd;margin-bottom: 10px;"
                                            src="<%=request.getContextPath()%>/resources/img/suppic/f_clip.jpg"
                                            class="img-rounded"></a>
                                    <br/><span style="font-size: 14px;align-content: center">F型夹</span><br/>
                                </div>
                            </td>
                        </tr>
                    </table>
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
                            <i class="icon-link"></i><a
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