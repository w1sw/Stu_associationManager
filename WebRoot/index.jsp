<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>学生社团管理系统</title>
<link href="css/reset.css" rel="stylesheet" type="text/css" />
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="css/nivo-default.css" type="text/css" media="screen" />
<link rel="stylesheet" href="css/nivo-slider.css" type="text/css" media="screen" />
<link rel="stylesheet" href="css/prettyPhoto.css" type="text/css" media="screen" />
<script type="text/javascript" src="js/jquery-1.6.1.min.js"></script>
<script type="text/javascript" src="js/custom.js"></script>
<script type="text/javascript" src="js/slides.min.jquery.js"></script>
<script type="text/javascript" src="js/nivo-slider/jquery.nivo.slider.pack.js"></script>
<script type="text/javascript" src="js/superfish-menu/hoverIntent.js"></script>
<script type="text/javascript" src="js/superfish-menu/superfish.js"></script>
<script type="text/javascript" src="js/scrolltop/scrolltopcontrol.js"></script>
<script type="text/javascript" src="js/prettyPhoto/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="js/jquery.featureList-1.0.0.js"></script>
<script type="text/javascript" src="js/swfobject/swfobject.js"></script>
<script type="text/javascript" src="js/easing/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="js/kwicks/jquery.kwicks-1.5.1.pack.js"></script>
<script type="text/javascript" src="js/mosaic/mosaic.1.0.1.js"></script>
<!--GOOGLE FONTS-->
<link href='http://fonts.useso.com/css?family=Shanti' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Mako' rel='stylesheet' type='text/css' />
<link rel='stylesheet' href='http://fonts.useso.com/css?family=Crimson+Text:regular,regularitalic,600,600italic,bold,bolditalic' type='text/css'/>
<link href='http://fonts.useso.com/css?family=Droid+Sans:regular,bold' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Play' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Terminal+Dosis+Light' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Pacifico' rel='stylesheet' type='text/css' />

<!--GOOGLE FONTS-->
</head>
<body>
	<!-- TOP LINE --> 
    <div class="top_line"></div>
	<!-- END TOP LINE  -->
    <!-- HEADER WRAPPER -->
    <div class="wrapper">
		<!-- HEADER -->
        <!-- LOGOTYP -->
        <div class="one-third logo">	
        	<a href="index.jsp"><img src="images/1px.png" alt="" width="220px" height="240px" /></a>
        </div>
        <!-- END LOGOTYP -->
        <!-- ADDDITIONAL INFORMATION -->
        <div class="two-third header-menu last">
        <!-- END ADDDITIONAL INFORMATION -->
        <!-- MAIN NAVIGATION -->
        <div class="menu">
        <div class="menu-cloud">
        <div class="text-align-right phone"><a href="stu_login.jsp">登录</a><span ><a href="stu_registed.jsp">&nbsp;&nbsp;&nbsp;&nbsp;注册</a></span></div>
        </div>
            <div class="menu-right-closed"></div>
            <div class="menu-bg">
                	<ul class="sf-menu">
                        <li><a href="index.jsp">主页</a></li>
                        <li><a href="#">申请注册社团</a>
                            <ul>
                                <li class="menu-first"><a href="helpCenter.jsp">帮助中心</a></li>
                                <li><a href="registration.jsp">我要申请注册</a></li>
                               
						  </ul>
                        </li>
                        <li><a href="#">社团信息</a>
                            <ul>
                                <li class="menu-first "><a href="queryAllsocieties.jsp">查看所有社团</a>
                                   
                              </li>
                                <li><a href="niceAsociations.jsp">优秀社团展示</a></li>
                              
                            </ul>
                        </li>
                        <li><a href="#">新闻资讯</a>
                            <ul>
                                <li class="menu-first"><a href="1-column-portfolio.jsp">1 Column Portfolio</a></li>
                                <li><a href="2-column-portfolio.jsp">2 Columns Portfolio</a></li>
                                <li><a href="3-column-portfolio.jsp">3 Columns Portfolio</a></li>
                                <li><a href="4-column-portfolio.jsp">4 Columns Portfolio</a></li>
                                <li><a href="portfolio-with-sidebar.jsp">Portfolio With Sidebar</a></li>
                                <li><a href="gallery.jsp">Gallery</a></li>
                                <li class="menu-last"><a href="portfolio-details.jsp">Portfolio Details</a></li>
                            </ul>
                        </li>
                        <li><a href="#">我的社团</a>
                            <ul>
                                <li class="menu-first"><a href="blog.jsp">查看社团成员</a></li>
                                <li><a href="blog-2.jsp">社团详细信息</a></li>
                                <li class="menu-last"><a href="blog-post.jsp">发布社团动态</a></li>
                            </ul>
                        </li>
                        <li><a href="contact-us.jsp">联系主管老师</a></li>		
                	</ul>
				</div>
            <div class="menu-left-closed"></div>
            </div>
        </div>
        <!-- END MAIN NAVIGATION -->
		<!-- END HEADER -->
        <!-- SLIDER -->
        <div class="top-decor-right"></div>        
	</div>
    <!-- END HEADER WRAPPER -->
    <div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="网站模板">网站模板</a></div>
    <div class="break1">
        <div class="wrapper shadow">
            <div id="feature_list">
                <ul id="tabs">
                    <li>
                    	<a href="javascript:;">
                        <ins>
                    	<img class="icon left" src="images/icons/icon-13.png" alt="" />
                        <h2>社团风采</h2>
                        <p>丰富的社团生活，绽放你的青春</p>
                    	</ins>
                        </a>
                    </li>
                    <li>
                    	<a href="javascript:;">
                        <ins>
                    	<img class="icon left" src="images/icons/icon-4.png" alt="" />
                        <h2>通知公告</h2>
                        <p>关注最新的通知信息</p>
                    	</ins>
                        </a>
                    </li>
                    <li>
                    	<a href="javascript:;">
                        <ins>
                    	<img class="icon left" src="images/icons/icon-26.png" alt="" />
                        <h2>管理团队</h2>
                        <p>全面了解本平台运行管理团队</p>
                    	</ins>
                        </a>
                    </li>
               </ul>
                <ul id="output">
                    <li>
                    	<img src="images/abc-3.jpg" alt="" />
                    	
                    </li>
                    <li>
                    	<img src="images/abc-4.jpg" alt="" />
                    	
                    </li>
                    <li>
                    	<img src="images/abc-3.jpg" alt="" />
                    	
                    </li>
                    <li>
                    	<img src="images/abc-4.jpg" alt="" />
                    	
                    </li>
                </ul>
            </div>
        </div>
    </div>        
    <!-- END SLIDER -->
    <!-- CONTENT WRAPPER -->
	<div class="wrapper">
	<!-- TESTIMONIALS -->
    <div class=" decor-box testimonials">
        <div class="quote">
            <span class="quote-text">Enjoy your university time</span>
            <p class="quote-author">Mr. Deng</p>
        </div>
      </div>
        <!-- END TESTIMONIALS -->
		<!-- SERVICES -->
      	<div class="one service">
            <div class="header-one">
                <div class="header-content">如果你是一名新生，那么请看这里！
                </div>
            </div>
            <div class="one-half-left notopmargin">
                <h3>加入社团能给你带来什么 ？</h3>
				<img class="icon left margin15"  src="images/icons/icon-55.png" alt=" "/>
                <p class="border">学习力：加入了社团，或许该领域不是你擅长的，但是你可以提高自己的学习力。从而在不同的领域里也可以得到锻炼和提高</p>
            	<div class="one-half notopmargin">
                    <div class="service-list">
                        <ol>
                            <li class="lamp first-service-list "><p><em>沟通能力</em>在社团里，你会接触到各式各样的人，他们都来自五湖四海，来自不同的学院，你可以在这里提高你与人的沟通能力</p>&nbsp;</p>&nbsp;</p></li>
                            <li class="links"><p><em>增加你的人脉</em>社团内外的同学和老师，都是你生活中不可或缺的一部分，你应该好好珍惜每一个人</p>&nbsp;</p>&nbsp;</p></li>
                            <li class="money"><p class="last-achievement"><em>扩大你的视野</em>在这里，你会接触到许多在日常课堂中接触不到的人和事，其中许多都是会对你产生重大影响的</p>&nbsp;</p>&nbsp;</p></li>
                        </ol>
                    </div>
                </div>
            </div>
            <div class="one-half-right notopmargin last">
                <h3>该如何选择？</h3>
				<img class="icon left margin15"  src="images/icons/icon-56.png" alt=" "/>
                <p class="border">方向：方向很重要，面对众多的社团，你该如何选择最适合你的那一个？</p>
            	<div class="one-fourth notopmargin">
                    <div class="service-list">
                        <ol>
                            <li class="billboard first-service-list "><p class="first-achievement"><em>准确的自我定位</em>知道自己想要什么，才下定决心去做。先给自己一个准确的定位，再去寻找你的目标</p></p></li>
                            <li class="car">
                              <p><em>是否能为之付出</em>加入社团后，你就是其中的一员了，你要做的就是付出你的精力去让它变得更好，你也可以从中获得到你想要的东西</p></p></li>
                            <li class="house">
                              <p class="last-achievement"><em>建立你的圈子</em>加入社团后是不是能够使你真正建立起你自己的生活圈，如果可以的话，毫不犹豫，就是它了！</p>
                              </p></li>
                        </ol>
                    </div>
                </div>
           </div>
        </div>
		<!-- END SERVICES -->
		<!-- FROM PORTFOLIO -->
        <div class="two-third">
			<div class="header-two-third">
            	<div class="header-content">优秀社团展示</div>
            </div>
            <div id="slides">
                <div class="slides_container">
                    <div>
                    	<a href="images/slide-1-1.jpg" class="item-preview" rel="prettyPhoto" title=""><img  class="bordered-img img-preview" src="images/gallery/2-3col-1.jpg" alt=""/></a>
                        <h5>文学戏曲社</h5>
                    	<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam pharetra urna et mauris laoreet pellentesque. Pellentesque pellentesque, mauris in consectetur aliquet.</p>
                    </div>
                    <div>
                    	<a href="images/slide-1-1.jpg" class="item-preview" rel="prettyPhoto" title=""><img  class="bordered-img img-preview" src="images/gallery/2-3col-2.jpg" alt=""/></a>
                        <h5>街舞社</h5>
                    	<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam pharetra urna et mauris laoreet pellentesque. Pellentesque pellentesque, mauris in consectetur aliquet.</p>
                    </div>
                    <div>
                        <div class="one-third notopmargin">
                            <a href="images/slide-1-1.jpg" class="item-preview" rel="prettyPhoto" title=""><img class="bordered-img img-preview"  src="images/gallery/3col-1.jpg" alt=" "/></a>
                        </div>
                        <div class="one-third notopmargin last">
                            <a href="images/slide-1-1.jpg" class="item-preview" rel="prettyPhoto" title=""><img class="bordered-img img-preview"  src="images/gallery/3col-2.jpg" alt=" "/></a>
                        </div>
                        <div class="clear"></div>
                        <div class="clear"><h5>棒球社</h5></div>
                        <p>Sed laoreet rhoncus purus sed egestas. Duis quis placerat arcu. Proin id augue in nulla tempus commodo sed ac tellus. Ut nibh arcu, molestie in vulputate at, elementum eget risus.</p>
                    </div>
                    <div>
                        <div class="one-fourth notopmargin">
                        	<div class="one-fourth notopmargin">
                           	 <a href="images/slide-1-1.jpg" class="item-preview" rel="prettyPhoto" title=""><img class="bordered-img img-preview"  src="images/gallery/4col-11.jpg" alt=" " /></a>
                        	</div>
                            <div class="one-fourth margin20">
                            	<a href="images/slide-1-1.jpg" class="item-preview" rel="prettyPhoto" title=""><img class="bordered-img img-preview"  src="images/gallery/4col-9.jpg" alt=" " /></a>
                        	</div>
                        </div>
                        <h5 class=" notopmargin">台球社</h5>
                    	<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. In rutrum mollis leo eu vulputate. Vivamus tincidunt ipsum sit amet quam blandit gravida. Aliquam volutpat sollicitudin ornare. Aliquam ante nunc, molestie nec pulvinar non, venenatis a eros. Etiam at massa leo, sed mattis velit. Praesent eu quam turpis. Morbi ac ligula justo, semper convallis tellus. Nunc non tempus nibh. Duis enim nisi, congue et fermentum nec, fringilla id lorem.</p><p>Suspendisse nibh mauris, euismod quis elementum facilisis, gravida pellentesque risus. Maecenas vitae volutpat urna. Mauris non ante non nisi tincidunt vehicula. Vestibulum pretium, nulla sed fermentum malesuada, nulla nibh fermentum nulla, ac pretium nisl libero ac erat.</p>
                    </div>
                </div>
            </div>  
		</div>
        <!-- END FROM PORTFOLIO -->
		<!-- WHY? -->
        <div class="one-third last">
            <div class="header-one-third">
            	<div class="header-content">最受欢迎的社团</div>
            </div>
			<p><img class="icon left"  src="images/icons/icon-26.png" alt=" "/>每个月我们都会评选出最受欢迎的社团</p>
			<h5>本月最受欢迎社团：</h5>
            <div id="list">
                <ol>
                    <li><p class="first-achievement"><em>文学戏曲社</em>Ut ut felis erat. Etiam viverra, sem nec suscipit hendrerit, purus libero sollicitudin.</p></li>
                    <li><p><em>话剧社</em>Ut ut felis erat. Etiam viverra, sem nec suscipit hendrerit, purus libero sollicitudin.</p></li>
                    <li><p class="last-achievement"><em>街舞社</em>Ut ut felis erat. Etiam viverra, sem nec suscipit hendrerit, purus libero sollicitudin.</p></li>
                </ol>
            </div>
        </div>
		<!-- END WHY? -->
        <!-- Easy to Customize -->
        <div class="one-third">
            <div class="header-one-third">
            	<div class="header-content">注册前期筹备</div>
            </div>
            <img class="icon left" src="images/icons/icon-1.png" alt="" />
            <p>在提交注册申请之前，请准备好申请社团所需要的资料</p> 
        </div>
        <!-- END Easy to Customize -->
        <!-- Browsers Compatible -->
        <div class="one-third">
            <div class="header-one-third">
            	<div class="header-content">提交社团注册申请
            </div>
        </div>
            <img class="icon left" src="images/icons/icon-36.png" alt="" />
            <p>登陆本平台，点击注册社团，并提交申请</p> 
        </div>
        <!-- END Browsers Compatible -->
        <!-- Full Documentation -->
        <div class="one-third last">
            <div class="header-one-third">
            	<div class="header-content">社团通过审核成立
            </div>
        </div>
            <img class="icon left" src="images/icons/icon-52.png" alt="" />
            <p>经过我们的审核流程后，如通过，则社团成立</p>
        </div>
        <!-- END Full Documentation -->
        <!-- ORDER -->
        <div class="one order">
            <img class="left" src="images/round-left.png" alt="" /><h3 class="left">如果你有疑问，请联系我们的 <a href="contact-us.jsp" class="link">主管老师</a></h3><img class="right" src="images/round-right.png" alt="" />
        </div>
        <!-- END ORDER -->
		<div class="footerdecor-left left"></div>
	</div>
	<!-- END CONTENT -->
	<!-- FOOTER -->
	<div class="break2">
	<div class="wrapper">
        <div class="footer">
            <div class="one-third notopmargin">
                <h4>常见问题</h4>
                <div class="one-third notopmargin last"><span>Q:在社团列表里找不到我的社团？</span>
                  <p class="one-third notopmargin last">A:确认列表中无该社团名称后，联系主管老师询问</p>
                </div>
				<div class="one-third margin20 last"><span>Q:发布社团动态需要经过老师的批准吗？</span>
                  <p class="one-third notopmargin las">A：不需要</p>
                  <p class="one-third notopmargin las">&nbsp;</p>
                  <p class="one-third notopmargin las"><a class="link" href="">More</a>
                </div>
			</div>
			<div class="one-third notopmargin">
                <h4>相关说明</h4>
                <div >
                <p class="tweet"><a class="link">社团负责人说明</a></p>
				
                </div>
                <div>
               <p class="tweet"><a class="link">社团管理说明</a></p>
                </div>
                <div>
                <p class="tweet"><a class="link">社团注册说明</a></p>
                </div> 
                
            </div>
            <div class="one-third notopmargin last">
                <h4>地址：</h4>
                <span>重庆市沙坪坝区沙正街174号</span>
                <p class="notopmargin">
                    电话: <span class="colored">023-65102222</span><br/>
                    邮编: <span class="colored">400030</span>
                </p>
				<p>关注我们:</p>
                <a href=""><img class="soc-icon" src="images/footer-fb.png" alt=" "/></a><img src="images/footer-sep.png" alt=" "/><a href=""><img class="soc-icon" src="images/footer-tw.png" alt=" "/></a><img src="images/footer-sep.png" alt=" "/><a href=""><img class="soc-icon" src="images/footer-dr.png" alt=" "/></a><img src="images/footer-sep.png" alt=" "/><a href=""><img class="soc-icon" src="images/footer-ms.png" alt=" "/></a>
        	</div>
        </div>
	</div>
	</div>
	<div class="footer-line">
    <div class="wrapper"><!-- 落款-->
      <span class="colored">(C) Copyright: Chongqing University DengChengFu All rights reserved.</span><br/>
        </div>
    </div>
    <div class="wrapper">
        <div class="footerdecor-right right"></div>  
    </div>
</body>
</html>