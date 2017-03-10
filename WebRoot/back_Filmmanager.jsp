<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>Flatpoint - Responsive Web App Template</title>
  
    <meta name="description" content="">
    <meta name="author" content="">
<!-- 
    <script type="text/javascript" language="javascript">
			function deleteUser(FilmID) {
				if(confirm("您是否需要删除当前影片信息!"))
				{
					window.location.href='FilmAction!deleteFilmInfoAction?FilmID='+FilmID;
				}
			}
	</script>
 -->
    <!-- Le styles -->
     <link href="css/css_table/bootstrap.css" rel="stylesheet">
    <link href="css/css_table/bootstrap-responsive.css" rel="stylesheet">
    <link href="css/css_table/stylesheet.css" rel="stylesheet">
    <link href="css/css_table/index.css" rel="stylesheet">
    <link href="icon/font-awesome.css" rel="stylesheet">
    

    <!-- Le fav and touch icons -->
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="imges/apple-touch-icon-144-precomposed.jsp">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="imges/apple-touch-icon-114-precomposed.jsp">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="imges/apple-touch-icon-72-precomposed.jsp">
    <link rel="apple-touch-icon-precomposed" href="imges/apple-touch-icon-57-precomposed.jsp">
                                  

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="js/html5shiv.js"></script>
    <![endif]-->
  
  </head>

  <body>

    
    <div id="content"> <!-- Content start -->
      <div class="inner_content">
          <div class="widgets_area">
                <div class="row-fluid">
                    <div class="span12">
                         <div  class="daohanglink"style="">
                           <span class="daohang"></span>
                           <span>首页</span><span></span>
                           <span>社团信息</span><span></span>
						   <span>查看所有社团</span>
                           <a  href="back_addFilm.jsp" class="label label-warning" style="float:right; margin:8px;">添加</a></div>
                        <div class="well brown">
                            <div class="well-content" style="border:0px;">
                                <table class="table table-striped table-bordered table-hover datatable">
                                    <thead>
                                        <tr>
                                            <th width="5%">UsersID</th>
											<th width="10%">用户姓名</th>
                                            <th width="5%">用户性别</th>
                                            <th width="5%">用户年龄</th>
											<th width="5%">用户邮箱</th>
                                            <th width="5%">用户电话</th>
                                            <th width="5%">用户班级</th>                                         
                                            <th width="15%">管理操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    
	                                     <s:iterator value="#session.users_list" var="newusers">
										<tr class="list">
											<td><s:property value="#newusers.usersId"/></td>
											<td><s:property value="#newusers.usersName"/></td>
											<td><s:property value="#newusers.usersSex"/></td>
											<td><s:property value="#newusers.usersAge"/></td>
											<td><s:property value="#newusers.usersEmail"/></td>
											<td><s:property value="#newusers.usersPhone"/></td>
											<td><s:property value="#newusers.usersClass"/></td>
											<td>
                                            <a class="btn" href="" title="修改"><i class="icon-inbox"></i></a>
                                            <a class="btn" href="" title="删除"><i class="icon-trash"></i></a>
                                            <a class="btn" href="#" title="查看"><i class="icon-exclamation"></i></a>
                                            </td>
										</tr>
										</s:iterator>
                                  <!-- 
                                    <c:forEach items="${sessioScope.users_list}" var="newusers">
                                        <tr class="neirong_t2_z">
                                            <td>${newusers.usersId}</td>
                                            <td>${newusers.usersName}</td>
											<td>${newusers.usersSex}</td>
											<td>${newusers.usersAge}</td>                                            
                                            <td>${newusers.usersEmail}</td>
                                            <td>${newusers.usersPhone}</td>
											<td>${newusers.usersClass}</td>	
											   -->
													<!-- 							
                                            <td>
                                            <a class="btn" href="FilmAction!loadMergeInfoAction?FilmID=${film.filmId}" title="修改"><i class="icon-inbox"></i></a>
                                            <a class="btn" href="javascript:deleteUser('${film.filmId}')" title="删除"><i class="icon-trash"></i></a>
                                            <a class="btn" href="#" title="查看"><i class="icon-exclamation"></i></a>
                                            </td>
                                          </tr>
                                          </c:forEach>
                                            		 -->
                                    </tbody>
                                </table>                  
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="js/js_table/jquery-1.10.2.js"></script>
    <script src="js/js_table/jquery-ui-1.10.3.js"></script>
    <script src="js/js_table/bootstrap.js"></script>

    <script src="js/js_table/library/jquery.collapsible.min.js"></script>
    <script src="js/js_table/library/jquery.mCustomScrollbar.min.js"></script>
    <script src="js/js_table/library/jquery.mousewheel.min.js"></script>
    <script src="js/js_table/library/jquery.uniform.min.js"></script>

   
    <script src="js/js_table/library/jquery.sparkline.min.js"></script>
    <script src="js/js_table/library/chosen.jquery.min.js"></script>
    <script src="js/js_table/library/jquery.easytabs.js"></script>
    <script src="js/js_table/library/flot/excanvas.min.js"></script>
    <script src="js/js_table/library/flot/jquery.flot.js"></script>
    <script src="js/js_table/library/flot/jquery.flot.pie.js"></script>
    <script src="js/js_table/library/flot/jquery.flot.selection.js"></script>
    <script src="js/js_table/library/flot/jquery.flot.resize.js"></script>
    <script src="js/js_table/library/flot/jquery.flot.orderBars.js"></script>
    <script src="js/js_table/library/maps/jquery.vmap.js"></script>
    <script src="js/js_table/library/maps/maps/jquery.vmap.world.js"></script>
    <script src="js/js_table/library/maps/data/jquery.vmap.sampledata.js"></script>
    <script src="js/js_table/library/jquery.autosize-min.js"></script>
    <script src="js/js_table/library/charCount.js"></script>
    <script src="js/js_table/library/jquery.minicolors.js"></script>
    <script src="js/js_table/library/jquery.tagsinput.js"></script>
    <script src="js/js_table/library/fullcalendar.min.js"></script>
    <script src="js/js_table/library/footable/footable.js"></script>
    <script src="js/js_table/library/footable/data-generator.js"></script>

    <script src="js/js_table/library/bootstrap-datetimepicker.js"></script>
    <script src="js/js_table/library/bootstrap-timepicker.js"></script>
    <script src="js/js_table/library/bootstrap-datepicker.js"></script>
    <script src="js/js_table/library/bootstrap-fileupload.js"></script>
    <script src="js/js_table/library/jquery.inputmask.bundle.js"></script>

    <script src="js/js_table/library/jquery.dataTables.js"></script>

    <script src="js/js_table/flatpoint_core.js"></script>

    <script src="js/js_table/datatables.js"></script>

  </body>
</html>
