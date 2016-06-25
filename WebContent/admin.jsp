<%@page import="com.aranea.db.Dbconn"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.aranea.rep.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Ադմինիստրատիվ էջ</title>
    <!-- MY SCRIPTS -->
    	<link rel="stylesheet" href="libs/fancybox/jquery.fancybox.css" />
	    <link rel="stylesheet" href="libs/owl-carousel/owl.carousel.css" />
	    <link rel="stylesheet" href="libs/countdown/jquery.countdown.css" />
    
    <!-- END OF THE MY SCRIPTS -->
    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/sb-admin.css" rel="stylesheet">
   
    <!-- Morris Charts CSS -->
    <link href="css/plugins/morris.css" rel="stylesheet">
    
    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
          
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <script type="text/javascript">
    
    function open_values(f_name,l_name,u_name,priv,pass){
    
    	document.getElementById("id_name").value = f_name;
    	document.getElementById("id_lname").value = l_name;
    	document.getElementById("id_uname").value = u_name;
    	document.getElementById("id_priv").value = priv;
    	document.getElementById("id_pass").value = pass;
    }
    function delateData(user_name){
    	
      document.getElementById("id_uname").value = user_name;
      alert("Հեռացնել ցանկից "+user_name+"-ին?");
      confirm("Հեռացնել ?");
    }
    
    
    
    </script>
</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="admin.jsp">Ադմինիստրատիվ էջ</a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a>
                    <ul class="dropdown-menu message-dropdown">
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>John Smith</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>John Smith</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>John Smith</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-footer">
                            <a href="#">Read All New Messages</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a>
                    <ul class="dropdown-menu alert-dropdown">
                        <li>
                            <a href="#">Alert Name <span class="label label-default">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-primary">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-success">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-info">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-warning">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-danger">Alert Badge</span></a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">View All</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li class="active">
                        <a href="admin.jsp">Մենեջերներ</a>
                    </li>
                    <li>
                        <a href="sign_meneger.jsp">Գրանցել</a>
                    </li>
                    <li>
                        <a href="tables.html">Tables</a>
                    </li>
                    <li>
                        <a href="forms.html">Forms</a>
                    </li>
                    <li>
                        <a href="bootstrap-elements.html">Bootstrap Elements</a>
                    </li>
                    <li>
                        <a href="bootstrap-grid.html">Bootstrap Grid</a>
                    </li>
                    <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#demo">Dropdown </a>
                        <ul id="demo" class="collapse">
                            <li>
                                <a href="#">Dropdown Item</a>
                            </li>
                            <li>
                                <a href="#">Dropdown Item</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="blank-page.html"><i class="fa fa-fw fa-file"></i> Blank Page</a>
                    </li>
                    <li>
                        <a href="index-rtl.html"><i class="fa fa-fw fa-dashboard"></i> RTL Dashboard</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                             Մենեջերներ
                        </h1>
          
                  </div>
                </div>
                <!-- /.row -->

                <!-- /.row************************************************************** -->
               <%
                 Dbconn db = new Dbconn();      
                 ArrayList<Manager> arr = db.getMangerList();%>
               <%
                 for(Manager mon : arr)
                 {
               %>
               <div style="display:none;"id="rename_div">
               
                    <form name="myForm" class="signup-page" action="Edit" onsubmit="return validateForm()"  method="POST" >
						<div class="signup-header">
							<h2>Գրանցել նոր Մենեջեր</h2>
						</div>
						<label>Անուն</label>
						<input placeholder="Անուն" id="id_name"
						 name="edit_f_name"class="form-control margin-bottom-20" type="text">
						
						<label>Ազգանուն</label>
						<input placeholder="Ազգանուն" id="id_lname"
						 name="edit_l_name" class="form-control margin-bottom-20" type="text">
						
						<label>Օգտագործողի անունը</label>
						<input placeholder="Օգտագործողի անունը" id="id_uname" 
						name="edit_u_name" value="" class="form-control margin-bottom-20" type="text" readonly>
						
						<label>Արտոնություն</label>
						<input placeholder="Արտոնություն" id="id_priv" 
						name="edit_priv"  class="form-control margin-bottom-20" type="text" >
						
						
						<div class="row">
							<div class="col-sm-6">
								<label >Գաղտնաբառ<span class="color-red">*</span></label>
								<input name="edit_password" id="id_pass" class="form-control margin-bottom-20" placeholder="Գաղտնաբառ" type="text">
							</div>
							<div class="col-sm-6">
								<label>Հաստատել<span class="color-red">*</span></label>
								<input class="form-control margin-bottom-20" placeholder="Հաստատել գաղտնաբառը" type="password">
							</div>
						</div>
						<hr>
						<div class="row">
							<div class="col-lg-12">
								<input id="sub_but_menger" type="submit" value="Փոփոխություն"  />
							</div>
						</div>
						
					</form>
                 
               </div>
                 <div class="row">
                    <div class="col-lg-3 col-md-6">
                        <div class="panel panel-primary">
                            <div class="panel-heading">
                                <div class="row">
                                    <div class="col-xs-12 text-left">
                                        <div>Անուն : <%= mon.getF_name() %></div>
                                        <div>Ազգանուն : <%= mon.getL_name() %></div>
                                        <div>Օգտագործող : <%= mon.getU_name() %></div>
                                        <div>Արտոնություն : <%= mon.getPriv_id() %></div>
                                        <button class="fancybox" href="#rename_div" onclick="open_values('<%= mon.getF_name() %>','<%= mon.getL_name() %>','<%= mon.getU_name() %>','<%= mon.getPriv_id() %>','<%= mon.getPass() %>')"   >
                                         փոխել
                                        </button>
                                        <form  name="myForm" id="DelateForm" action="Del" method="POST" onclick="delateData('<%= mon.getU_name() %>')">
                                           <button class="delate" >ջնջել</button>
                                           <input type="hidden" name="edit_u_name" value="<%= mon.getU_name() %>">
                                           
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                     </div>
                      <%
                          }
                      %>   
                   </div>
              </div>
            <!-- /.container-fluid -->
       </div>
        <!-- /#page-wrapper -->
  </div>
    <!-- /#wrapper -->
   <!-- MY SCRIPTS -->
    <script src="libs/jquery/jquery-1.11.1.min.js"></script>
	<script src="libs/jquery-mousewheel/jquery.mousewheel.min.js"></script>
	<script src="libs/fancybox/jquery.fancybox.pack.js"></script>
	<script src="libs/waypoints/waypoints-1.6.2.min.js"></script>
	<script src="libs/scrollto/jquery.scrollTo.min.js"></script>
	<script src="libs/owl-carousel/owl.carousel.min.js"></script>
	<script src="libs/countdown/jquery.plugin.js"></script>
	<script src="libs/countdown/jquery.countdown.min.js"></script>
	<script src="libs/countdown/jquery.countdown-ru.js"></script>
	<script src="libs/landing-nav/navigation.js"></script>
	<script src="js/common.js"></script>
	<script src="js/carousel.js"></script>
   
    <!-- END OF MY SCRIPTS -->
    <!-- jQuery -->
    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Morris Charts JavaScript -->
    <script src="js/plugins/morris/raphael.min.js"></script>
    <script src="js/plugins/morris/morris.min.js"></script>
    <script src="js/plugins/morris/morris-data.js"></script>

</body>

</html>
