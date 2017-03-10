<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en-US">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<title>学生社团管理系统 - 社团申请注册</title>
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
<link href='http://fonts.useso.com/css?family=Crushed' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Puritan' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Yanone+Kaffeesatz' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Oswald' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Anonymous+Pro' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Vollkorn' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=OFL+Sorts+Mill+Goudy+TT' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Nobile' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Molengo' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Allerta' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Metrophobic' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Francois+One' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Rokkitt' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Didact+Gothic' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=News+Cycle' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Special+Elite' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Kreon' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Orbitron' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Radley' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Bentham' rel='stylesheet' type='text/css' />
<link href='http://fonts.useso.com/css?family=Josefin+Sans' rel='stylesheet' type='text/css' />
<!--GOOGLE FONTS-->
</head>
<body>
	<!-- TOP LINE --> 
    <div class="top_line"></div>
	<!-- END TOP LINE  -->
    <!-- HEADER WRAPPER -->
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
        <div class="text-align-right phone">欢迎您: <p><span class="colored number">邓程夫</span></p></div>
        </div>
            <div class="menu-right-closed"></div>
            <div class="menu-bg">
                	<ul class="sf-menu">
                        <li><a href="index.jsp">主页</a></li>
                        <li><a href="#">申请注册社团</a>
                            <ul>
                                <li class="menu-first"><a href="helpCenter.jsp">帮助中心</a></li>
                                <li><a href="#">我要申请注册</a></li>
                               
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
    <!-- END HEADER WRAPPER -->
    <div class="content-break">
        <div class="wrapper">
            <div class="page-title">
                <h3 class="colored">社团申请注册</h3>
                <p><a href="index.jsp">主页</a> /</p>
            </div>           
        </div>
    </div>        
	<!-- END SLIDER -->
	<!-- CONTENT -->
	<div class="wrapper">
        	<div class="one">
           	  <div class="one-third notopmargin">
				<div class="one-third notopmargin">
                        <h3 class="notopmargin">注意事项：</h3>
                        <p>如果你对创建社团有独特的了解，不要犹豫，请在右方的表格中填写你的社团信息，提交到主管老师办事处，我们的老师会在看到申请的第一时间审核。</p>
                        <p>审核的流程如下：</p>
                        <p>1、该生所在班级班主任初审</p>
                        <p>2、通过班主任初审后，提交至校团委社团主管老师进行终审</p>
                        <p>3、如通过终审，社团成立。</p>
                  </div>
            	</div>
                <div class="two-third notopmargin last">
                  <div class="two-third last">
                    <h3 class="notopmargin">注册信息：</h3>
                        <form id="registedForm" method="post" action="AssoRegisted!AssoRegisted">
                            <div class="one-third form left">
                            <fieldset>
                                <label>社团名称<span class="required">*</span></label>
                                <input type="text" name="AssoName" id="AssoName" value="${associationapply.assoName}" class="text"/>
                            </fieldset>
                            </div>
                            <div class="one-third form last">
                            <fieldset>
                              <label>社团负责人姓名<span class="required">*</span></label>
                                <input type="text" name="AssoResName" id="AssoResName" value="${associationapply.assoResName}" class="text"/>
                            </fieldset>
                            </div>
                            
                            <div class="one-third form left">
                            <fieldset>
                                <label>社团定位<span class="required">*</span></label>
                                <input type="text" name="AssoPosition" id="AssoPosition" value="${associationapply.assoPosition}" class="text"/>
                            </fieldset>
                            </div>
                            
                            <div class="one-third form last">
                            <fieldset>
                              <label>社团人数<span class="required">*</span></label>
                                <input type="text" name="AssoPersonNum" id="AssoPersonNum" value="${associationapply.assoPersonNum}" class="text"/>
                            </fieldset>
                            </div>
                            
                            <div class="one-third form left">
                            <fieldset>
                                <label>负责人班级<span class="required">*</span></label>
                                <input type="text" name="AssoResClass" id="AssoResClass" value="${associationapply.assoResClass}" class="text"/>
                            </fieldset>
                            </div>
                            
                            <div class="one-third form last">
                            <fieldset>
                              <label>社团负责人电话<span class="required">*</span></label>
                                <input type="text" name="AssoResPhone" id="AssoResPhone" value="${associationapply.assoResPhone}" class="text"/>
                            </fieldset>
                            </div>
                            
                            <div class="two-third form last">
                            <fieldset>
                              <label>社团简介（不超过150字）：<span class="required">*</span></label>
                                <textarea name="AssoIntroduce" id="AssoIntroduce" rows="20" cols="30" class="text"value="${associationapply.assoIntroduce}"></textarea>
                            </fieldset>
                            <fieldset>
                                <input name="Mysubmitted" id="Mysubmitted" value="确认提交" class="button black" type="submit"/>
                            </fieldset>
                            </div>
                        </form>
                  </div>
              </div>
            </div>
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