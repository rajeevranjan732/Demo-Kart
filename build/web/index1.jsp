<%@page import="java.sql.*"%>
<!DOCTYPE HTML>
<%
    if(session.getAttribute("namekey")==null)
        response.sendRedirect("index.jsp");
    %>
<html>
<head>
<title>A trial shopping site by Rajeev Ranjan</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="My Play Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- bootstrap -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' media="all" />
<!-- //bootstrap -->
<link href="css/dashboard.css" rel="stylesheet">
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' media="all" />
<link href="css/new.css" rel='stylesheet' type='text/css' media="all" />
<script src="js/jquery-1.11.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<!--start-smoth-scrolling-->
<!-- fonts -->
<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Poiret+One' rel='stylesheet' type='text/css'>
<!-- //fonts -->
</head>
<body>
    <nav class="navbar navbar-inverse navbar-fixed-top" >
	<div class="container-fluid">
            <div class="navbar-header">	
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
		<a class="navbar-brand" href="index1.jsp"><h1><img src="images/demokartlogo.jpg" alt="logo" /></h1></a>
            </div>
            <div class="top-search">
                <form class="navbar-form navbar-right">
                    <input type="search" class="form-control" placeholder="I'm gonna find you and display you...">
                    <input type="submit" value=" ">
                </form>
            </div>
            <div class="header-top-right" >
                <div class="file">
                    <a href="kart1.jsp">My Kart</a>
                </div>
                <div class="signin">
                    <a href="#small-dialog2" class="play-icon popup-with-zoom-anim"><% out.print(session.getAttribute("namekey")+"!"); %></a>
                    
                    <script type="text/javascript" src="js/modernizr.custom.min.js"></script>
                    <link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
                    <script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
                    <script src="js/validator.js"></script>
                    
                    <div id="small-dialog2" class="mfp-hide">
                        <h3>Your PROFILE</h3> 
                        <div class="help-grid">
                            <p>List of actions that can be performed on your profile is high.AFterall you are our priority</p>
                        </div>
                        <div class="help-grids">
                            <div class="help-button-bottom">
                                <p><a href="#small-dialog3" class="play-icon popup-with-zoom-anim">Update Details</a></p>
                            </div>
                            <div class="help-button-bottom">
                                <p><a href="#small-dialog" class="play-icon popup-with-zoom-anim">Change Password</a></p>
                            </div>
                            <div class="help-button-bottom">
                                <p><a href="boughtitem.jsp">View Items bought</a></p>
                            </div>
                            <div class="help-button-bottom">
                                <p><a href="#small-dialog6" class="play-icon popup-with-zoom-anim">FAQS</a></p>
                            </div>
                            <div class="help-button-bottom">
                                <p><a href="#small-dialog7" class="play-icon popup-with-zoom-anim">delete account</a></p>
                            </div>
                        </div>
                    </div>
                    <div id="small-dialog3" class="mfp-hide">
                        <h3>Change details</h3> 
                        <div class="social-sits">
                            <p>Again the same ols Blah Balh thet you need to periodiacally update your details for our cinvenience to contact you aso that we can send you loads of promotional emails and messages ,Obviously for your conveniency dimbo</p>
                        </div>
                        <div class="signup">
                            <form id="register" method="post" action="updatedetail.jsp">
                                <% 
                                String name=(String)session.getAttribute("namekey");
                                String address=(String)session.getAttribute("addresskey");
                                String email=(String)session.getAttribute("emailkey");
                                String phone=(String)session.getAttribute("phonekey");
                                %>
                                <div class="form-group">
                                    <input type="text" name="name" class="email" maxlength="20" placeholder="Name" required="required" title="Enter your name" value="<% out.print(""+name); %>"/>
                                    <div class="help-block with-errors"></div>
                                </div>
                                <div class="form-group">
                                    <input type="text" name="phone" class="email" placeholder="Mobile Number" maxlength="10" required="required" pattern="[1-9]{1}\d{9}" title="Enter a valid mobile number" value="<% out.print(""+phone); %>"/>
                                    <div class="help-block with-errors"></div>
                                </div>
                                <div class="form-group">
                                    <textarea form="register" name="address" class="email" rows="5" maxlength="60" placeholder="Address" required="required" title="enter your address"><% out.print(""+address); %></textarea>
                                    <div class="help-block with-errors"></div>
                                </div>
                                <input type="submit" name="action" value="UPDATE"/>
                            </form>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                    <div id="small-dialog4" class="mfp-hide">
                        <h3>Feedback</h3> 
                        <div class="feedback-grids">
                            <div class="feedback-grid">
                                <p>Suspendisse tristique magna ut urna pellentesque, ut egestas velit faucibus. Nullam mattis lectus ullamcorper dui dignissim, sit amet egestas orci ullamcorper.</p>
                            </div>
                            <div class="button-bottom">
                                <p><a href="#small-dialog" class="play-icon popup-with-zoom-anim">Sign in</a> to get started.</p>
                            </div>
                        </div>
                    </div>
                    <div id="small-dialog5" class="mfp-hide">
                        <h3>Help</h3> 
                        <div class="help-grid">
                            <p>Suspendisse tristique magna ut urna pellentesque, ut egestas velit faucibus. Nullam mattis lectus ullamcorper dui dignissim, sit amet egestas orci ullamcorper.</p>
                        </div>
                        <div class="help-grids">
                            <div class="help-button-bottom">
                                <p><a href="#small-dialog4" class="play-icon popup-with-zoom-anim">Feedback</a></p>
                            </div>
                            <div class="help-button-bottom">
                                <p><a href="#small-dialog6" class="play-icon popup-with-zoom-anim">Lorem ipsum dolor sit amet</a></p>
                            </div>
                            <div class="help-button-bottom">
                                <p><a href="#small-dialog6" class="play-icon popup-with-zoom-anim">Nunc vitae rutrum enim</a></p>
                            </div>
                            <div class="help-button-bottom">
                                <p><a href="#small-dialog6" class="play-icon popup-with-zoom-anim">Mauris at volutpat leo</a></p>
                            </div>
                            <div class="help-button-bottom">
                                <p><a href="#small-dialog6" class="play-icon popup-with-zoom-anim">Mauris vehicula rutrum velit</a></p>
                            </div>
                            <div class="help-button-bottom">
                                <p><a href="#small-dialog6" class="play-icon popup-with-zoom-anim">Aliquam eget ante non orci fac</a></p>
                            </div>
                        </div>
                    </div>
                    <div id="small-dialog6" class="mfp-hide">
                        <div class="social-sits">
                            
                        </div>
                        <div class="video-information-text">
                            <!-- ITEM INFORMATION-->
                            <p>Suspendisse tristique magna ut urna pellentesque, ut egestas velit faucibus. Nullam mattis lectus ullamcorper dui dignissim, sit amet egestas orci ullamcorper.</p>
                            <ol>
                                <li>Nunc vitae rutrum enim. Mauris at volutpat leo. Vivamus dapibus mi ut elit fermentum tincidunt.</li>
                                <li>Nunc vitae rutrum enim. Mauris at volutpat leo. Vivamus dapibus mi ut elit fermentum tincidunt.</li>
                                <li>Nunc vitae rutrum enim. Mauris at volutpat leo. Vivamus dapibus mi ut elit fermentum tincidunt.</li>
                                <li>Nunc vitae rutrum enim. Mauris at volutpat leo. Vivamus dapibus mi ut elit fermentum tincidunt.</li>
                                <li>Nunc vitae rutrum enim. Mauris at volutpat leo. Vivamus dapibus mi ut elit fermentum tincidunt.</li>
                            </ol>
                        </div>
                    </div>
                    <div id="small-dialog7" class="mfp-hide">
                        <h3>Password?</h3> 
                        <div class="social-sits">
                            <p>please enter your password again for confimation</p>
                        </div>
                        
                        <div class="signup">
                            <form method="post" action="deleteaccount.jsp" id="deleteaccount">
                                <div class="form-group">
                                <input name="password" type="password" placeholder="Password" required="required" pattern=".{6,}" title="Type old password" autocomplete="off"  />
                                <div class="help-block with-errors"></div>
                                </div>
                                <input name="login" type="submit"  value="Delete"/>
                            </form>
                        </div>
                        <div class="clearfix"></div>
                    </div>
                    <script>
                        $(document).ready(function() {
                            $('#register').validator({});                            
                        });
                        $(document).ready(function() {
                            $('#changepwd').validator({});                            
                        });
                        $(document).ready(function() {
                            $('#deleteaccount').validator({});                            
                        });
                        $(document).ready(function() {                                    
                            $('.popup-with-zoom-anim').magnificPopup({												
                                type: 'inline',
                                fixedContentPos: false,
                                fixedBgPos: true,
                                overflowY: 'auto',
                                closeBtnInside: true,
                                preloader: false,
                                midClick: true,
                                removalDelay: 300,
                                mainClass: 'my-mfp-zoom-in'
                            });
                        });
                    </script>
                </div>
                <div class="signin">
                    <a href="logout.jsp">Log Out</a>
                    <!-- POP UP BOX ****************-->
                    <div id="small-dialog" class="mfp-hide">
                        <h3>Change Password</h3>
                        <div class="social-sits">
                                <p>It is highly recommneded to periodivcally update you password for the benefit of your account and I do not give a shi =t about wat you think ,, just GEt lost</p>
                        </div>
                        <div class="signup">
                            <form method="post" action="changepassword.jsp" id="changepwd">
                                <div class="form-group">
                                <input name="oldpassword" type="password" placeholder="Old Password" required="required" pattern=".{6,}" title="Type yout old password" autocomplete="off" />
                                <div class="help-block with-errors"></div>
                                </div>
                                <div class="form-group">
                                <input type="password" name="password" id="password" maxlength="20" placeholder="NEW Password" required="required" pattern=".{6,}" title="Minimum 6 characters required" autocomplete="off" value=""/>
                                <div class="help-block with-errors"></div>
                                </div>
                                <div class="form-group">
                                <input type="password" id="confirmPassword" data-match="#password" maxlength="20" data-match-error="Whoops, these don't match" placeholder="Confirm Password" required="required" pattern=".{6,}" title="Minimum 6 characters required" autocomplete="off" value=""/>
                                <div class="help-block with-errors"></div>
                                </div>
                                <input name="login" type="submit"  value="CHANGE"/>
                            </form>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                    <script>
                    $(document).ready(function() {
                            $('#changepwd').validator({});                            
                        });
                                        </script>
                </div>
            </div>
        </div>
    </nav>
    <div class="col-sm-3 col-md-2 sidebar">
	<div class="top-navigation">
            <div class="t-menu">MENU</div>
            <div class="t-img">
		<img src="images/lines.png" alt="" />
            </div>
            <div class="clearfix"> </div>
	</div>
	<div class="drop-navigation drop-navigation" id="menuwrapper">
            <ul class="nav nav-sidebar">
                <li class="active"><a href="index1.jsp" class="home-icon"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
                <li><a href="#first" class="menu1"><span class="glyphicon glyphicon-home glyphicon-gift" aria-hidden="true"></span>Fashion<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                    <ul>    
                        <li><a href="#"><span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span>&nbsp;Men<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                            <ul>
                                <li><a href="#">Clothing</a></li>
                                <li><a href="#">Footwears</a></li>
                                <li><a href="#">Watches</a></li>
                                <li><a href="#">Accessories</a></li>
                            </ul>
                        </li>
                        <li><a href="#"><span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span>&nbsp;Women<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                            <ul>
                                <li><a href="#">Clothing</a></li>
                                <li><a href="#">Footwears</a></li>
                                <li><a href="#">Jewelleries</a></li>
                                <li><a href="#">Accessories</a></li>
                            </ul>
                        </li> 
                        <li><a href="#"><span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span>&nbsp;Kids<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                            <ul>
                                <li><a href="#">Clothing</a></li>
                                <li><a href="#">Footwears</a></li>
                                <li><a href="#">Care</a></li>
                                <li><a href="#">Accessories</a></li>
                            </ul>
                        </li> 					
                        <li><a href="#"><span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span>&nbsp;Luggage<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                            <ul>
                                <li><a href="#">Bagpacks</a></li>
                                <li><a href="#">Strolley</a></li>
                                <li><a href="#">Laptop Bags</a></li>
                                <li><a href="#">RuckSacks</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
                <li><a href="#second" class="menu2"><span class="glyphicon glyphicon-film glyphicon-phone" aria-hidden="true"></span>Electronics<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                    <ul id="second" class="collapse">						
                        <li><a href="#"><span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span>&nbsp;Mobiles and Accessories<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                            <ul>
                                <li><a href="#">Mobiles</a></li>
                                <li><a href="#">Tablets</a></li>
                                <li><a href="#">Accessories</a></li>
                            </ul>
                        </li>
                        <li><a href="#"><span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span>&nbsp;TV Audios Videos<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                            <ul>
                                <li><a href="#">TV</a></li>
                                <li><a href="#">Audio</a></li>
                                <li><a href="#">Movies</a></li>
                            </ul>
                        </li> 
                        <li><a href="#"><span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span>&nbsp;Appliances<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                            <ul>
                                <li><a href="#">Large Appliances</a></li>
                                <li><a href="#">Home Appliances</a></li>
                                <li><a href="#">Kitchen Appliances</a></li>
                            </ul>
                        </li> 					
                        <li><a href="#"><span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span>&nbsp;Automotive<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                            <ul>				
                                <li><a href="#">Car Accessories</a></li>
                                <li><a href="#">Bike Accessories</a></li>
                                <li><a href="#">Spareparts</a></li>
                            </ul>
                        </li> 
                    </ul>
                </li>
                <li><a href="#third" class="menu3"><span class="glyphicon glyphicon-film glyphicon-cutlery" aria-hidden="true"></span>Home Needs<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                    <ul id="third" class="collapse">						
                        <li><a href="#"><span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span>&nbsp;Kitchenwares<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                            <ul>
                                <li><a href="#">Cookwares</a></li>
                                <li><a href="#">Kitchen Tools</a></li>
                                <li><a href="#">Dining</a></li>
                            </ul>				
                        </li>
                        <li><a href="#"><span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span>&nbsp;Appliances<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                            <ul>
                                <li><a href="#">Home Appliances</a></li>
                                <li><a href="#">Kitchen Appliances</a></li>
                                <li><a href="#">Large Appliances</a></li>
                            </ul>
                        </li> 
                        <li><a href="#"><span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span>&nbsp;Furniture<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                            <ul>
                                <li><a href="#">Bed/Sofa</a></li>
                                <li><a href="#">Mattress</a></li>
                                <li><a href="#">Fabrics</a></li>
                            </ul>
                        </li> 					
                        <li><a href="#"><span class="glyphicon glyphicon-pushpin" aria-hidden="true"></span>&nbsp;Books<span class="glyphicon glyphicon-menu-down" aria-hidden="true"></span></a>
                            <ul>
                                <li><a href="#">Engineering</a></li>
                                <li><a href="#">Novels</a></li>
                                <li><a href="#">Magazines</a></li>
                            </ul>
                        </li> 
                    </ul>
                </li>
            </ul>			  
            <div class="side-bottom">
                <div class="side-bottom-icons">
                    <ul class="nav2">
                        <li><a href="#" class="facebook"> </a></li>
                        <li><a href="#" class="facebook twitter"> </a></li>
                        <li><a href="#" class="facebook chrome"> </a></li>
                        <li><a href="#" class="facebook dribbble"> </a></li>
                    </ul>
                </div>
                <div class="copyright">
                    <p>Copyright � 2015 deMokart. All Rights Reserved | Design by <a href="#">Rajeev Ranjan</a></p>
                </div>
            </div>
        </div>
    </div>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
        <div class="main-grids">
            <div class="top-grids">
                <div class="recommended-info">
                    <h3><a href="#">Fashion & Lifestyle</a></h3>
                </div>
                <%
                    int i=0;
                    Connection con=null;
                    PreparedStatement ps=null;
                    ResultSet rs=null;
                    try		     
                    {
                    Class.forName("oracle.jdbc.OracleDriver");
                    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                    ps=con.prepareStatement("select * from fashion");
                    rs=ps.executeQuery();
                    while(rs.next())
                    {
                        i++;
                        %>
                        <div class="col-md-4 resent-grid recommended-grid slider-top-grids">
                        <div class="resent-grid-img recommended-grid-img">
                        <a href="#small-dialog6" class="play-icon popup-with-zoom-anim">
                        <%
                        String loc=new String("\"images/t"+i+".jpg\"");
                        out.println("<img src="+loc+">");
                        String itemcode=rs.getString(1);
                        String itemname=rs.getString(2);
                        String itemdetails=rs.getString(3);
                        String itemprice=rs.getString(4);
                        String URL=new String("additem.jsp?itemcode="+itemcode);
                        %>
                        </a>
                        </div>
                        <div class="resent-grid-info recommended-grid-info"><h3><a href="<% out.print(""+URL); %>" class="title title-info">
                        <% out.print(itemname+"    -   "+itemdetails+" "); %></a></h3>
                        <%
                            out.print("<ul>");                        
                            out.print("<li><p class=\"author author-info\">");
                        %>
                        <a href="<% out.print(""+URL); %>" class="author">Add to cart</a>
                        <%
                            out.print("</p></li>");
                            out.print("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li>");
                            out.print("</ul>");
                        %>
                        </div>
                        </div>
                    <%
                    }
                    con.close();
                    ps.close();
                    rs.close();
                    }
                    catch(Exception e1)
                    {
                        System.out.println(e1.toString());
                    }
                %>
                <div class="clearfix"> </div>
            </div>
            <div class="recommended">
                <div class="recommended-grids">
                    <div class="recommended-info">
                        <h3><a href="#">Recommended Videos Collection</a></h3>
                    </div>
                    <script src="js/responsiveslides.min.js"></script>
                    <script>
                        // You can also use "$(window).load(function() {"
			$(function () {
			// Slideshow 4
                        $("#slider3").responsiveSlides({
                            auto: true,
                            pager: false,
                            nav: true,
                            speed: 500,
                            namespace: "callbacks",
                            before: function () {
                                $('.events').append("<li>before event fired.</li>");
                            },
                            after: function () {
                                $('.events').append("<li>after event fired.</li>");
                            }
                        });
                    });
                    </script>
                    <div  id="top" class="callbacks_container">
                        <ul class="rslides" id="slider3">
                            <li>
                                <div class="animated-grids">
                                <% 
                                    i=0;
                                    int k=0;
                                    try		     
                                    {
                                    Class.forName("oracle.jdbc.OracleDriver");
                                    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                                    ps=con.prepareStatement("select * from video");
                                    rs=ps.executeQuery();
                                    for(i=1;i<=4 && rs.next();i++)
                                    { 
                                        
                                        
                                    out.print("<div class=\"col-md-3 resent-grid recommended-grid slider-first\">");
                                        out.print("<div class=\"resent-grid-img recommended-grid-img\">");
                                            out.print("<a href=\"#\">");
                                            String location=new String("\"images/c"+i+".jpg\"");
                                            out.print("<img src="+location+">"); 
                                            out.print("</a>");
                                            out.print("</div>");
                                            out.print("<div class=\"resent-grid-info recommended-grid-info\">");
                                            out.print("<h5><a href=\"#\" class=\"title\">");
                                            String itemcode=rs.getString(1); 
                                            String itemname=rs.getString(2);
                                            String itemdetails=rs.getString(3);
                                            String itemprice=rs.getString(4);
                                            String URL=new String("additem.jsp?itemcode="+itemcode);
                                            out.print(itemname+"    -   "+itemdetails+" ");
                                           
                                            out.print("</a></h5>");
                                            out.print("<div class=\"slid-bottom-grids\">");
                                                out.print("<div class=\"slid-bottom-grid\">");
                                                out.print("<p class=\"author author-info\">");
                                                %>
                                                <a href="<% out.print(""+URL); %>" class="author">Add to cart</a>
                                                <%
                                                out.print("</p>");
                                                out.print("</div>");
                                                out.print("<div class=\"slid-bottom-grid slid-bottom-right\">");
                                                out.print("<p class=\"views views-info\">Rs "+itemprice+"</p>");
                                                out.print("</div>");
                                                out.print("<div class=\"clearfix\"> </div>");
                                            out.print("</div>");
                                            
                                        out.print("</div>");
                                    out.print("</div>");
                                    }
                                    con.close();
                                    ps.close();
                                    rs.close();
                                    
                                    }catch(Exception e1)
                                    {
                                        System.out.println(e1.toString()+" hello viseo"+k);
                                    } 
                                %>
                                    <div class="clearfix"> </div>
                                </div>
                            </li>
                            <li>
                                
                                <div class="animated-grids">
                               
                                <% 
                                    i=0;
                                    k=0;
                                    try		     
                                    {
                                    Class.forName("oracle.jdbc.OracleDriver");
                                    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                                    ps=con.prepareStatement("select * from video");
                                    rs=ps.executeQuery();
                                    for(i=1;i<=4;i++)
                                    { 
                                        rs.next();
                                        k=(i+1)%4+1;
                                    out.print("<div class=\"col-md-3 resent-grid recommended-grid slider-first\">");
                                        out.print("<div class=\"resent-grid-img recommended-grid-img\">");
                                            out.print("<a href=\"#\">");
                                            String location=new String("\"images/c"+k+".jpg\"");
                                            out.print("<img src="+location+">"); 
                                            out.print("</a>");
                                            out.print("</div>");
                                            out.print("<div class=\"resent-grid-info recommended-grid-info\">");
                                            out.print("<h5><a href=\"#\" class=\"title\">");
                                            String itemcode=rs.getString(1); 
                                            String itemname=rs.getString(2);
                                            String itemdetails=rs.getString(3);
                                            String itemprice=rs.getString(4);                                       
                                            String URL=new String("additem.jsp?itemcode="+itemcode);
                                            out.print(itemname+"    -   "+itemdetails+" ");
                                           
                                            out.print("</a></h5>");
                                            out.print("<div class=\"slid-bottom-grids\">");
                                                out.print("<div class=\"slid-bottom-grid\">");
                                                out.print("<p class=\"author author-info\">");
                                                %>
                                            <a href="<% out.print(""+URL); %>" class="author">Add to cart</a>
                                            <%
                                                out.print("</p>");
                                                out.print("</div>");
                                                out.print("<div class=\"slid-bottom-grid slid-bottom-right\">");
                                                out.print("<p class=\"views views-info\">Rs "+itemprice+"</p>");
                                                out.print("</div>");
                                                out.print("<div class=\"clearfix\"> </div>");
                                            out.print("</div>");
                                            
                                        out.print("</div>");
                                    out.print("</div>");
                                    }
                                    con.close();
                                    ps.close();
                                    rs.close();
                                    
                                    }catch(Exception e1)
                                    {
                                        System.out.println(e1.toString()+" hello viseo"+k);
                                    } 
                                %>
                                    
                                    <div class="clearfix"> </div>
                                </div>
                            </li>
                            <li>
                                <div class="animated-grids">
                                <% 
                                    i=0;
                                    k=0;
                                    try		     
                                    {
                                    Class.forName("oracle.jdbc.OracleDriver");
                                    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                                    ps=con.prepareStatement("select * from video");
                                    rs=ps.executeQuery();
                                    for(i=1;i<=4;i++)
                                    { 
                                        rs.next();
                                        k=(i+2)%4+1;
                                    out.print("<div class=\"col-md-3 resent-grid recommended-grid slider-first\">");
                                        out.print("<div class=\"resent-grid-img recommended-grid-img\">");
                                            out.print("<a href=\"#\">");
                                            String location=new String("\"images/c"+k+".jpg\"");
                                            out.print("<img src="+location+">"); 
                                            out.print("</a>");
                                            out.print("</div>");
                                            out.print("<div class=\"resent-grid-info recommended-grid-info\">");
                                            out.print("<h5><a href=\"#\" class=\"title\">");
                                            String itemcode=rs.getString(1); 
                                            String itemname=rs.getString(2);
                                            String itemdetails=rs.getString(3);
                                            String itemprice=rs.getString(4);
                                            String URL=new String("additem.jsp?itemcode="+itemcode);
                                            out.print(itemname+"    -   "+itemdetails+" ");
                                           
                                            out.print("</a></h5>");
                                            out.print("<div class=\"slid-bottom-grids\">");
                                                out.print("<div class=\"slid-bottom-grid\">");
                                                out.print("<p class=\"author author-info\">");
                                                %>
                        <a href="<% out.print(""+URL); %>" class="author">Add to cart</a>
                        <%
                                                out.print("</p>");
                                                out.print("</div>");
                                                out.print("<div class=\"slid-bottom-grid slid-bottom-right\">");
                                                out.print("<p class=\"views views-info\">Rs "+itemprice+"</p>");
                                                out.print("</div>");
                                                out.print("<div class=\"clearfix\"> </div>");
                                            out.print("</div>");
                                            
                                        out.print("</div>");
                                    out.print("</div>");
                                    }
                                    con.close();
                                    ps.close();
                                    rs.close();
                                    
                                    }catch(Exception e1)
                                    {
                                        System.out.println(e1.toString()+" hello viseo"+k);
                                    } 
                                %>
                                
                                    
                                    <div class="clearfix"> </div>
                                </div>
                            </li>
                            <li>
                                <div class="animated-grids">
                                    <% 
                                    i=0;
                                    k=0;
                                    try		     
                                    {
                                    Class.forName("oracle.jdbc.OracleDriver");
                                    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                                    ps=con.prepareStatement("select * from video");
                                    rs=ps.executeQuery();
                                    for(i=1;i<=4;i++)
                                    { 
                                        rs.next();
                                        k=(i+3)%4+1;
                                    out.print("<div class=\"col-md-3 resent-grid recommended-grid slider-first\">");
                                        out.print("<div class=\"resent-grid-img recommended-grid-img\">");
                                            out.print("<a href=\"#\">");
                                            String location=new String("\"images/c"+k+".jpg\"");
                                            out.print("<img src="+location+">"); 
                                            out.print("</a>");
                                            out.print("</div>");
                                            out.print("<div class=\"resent-grid-info recommended-grid-info\">");
                                            out.print("<h5><a href=\"#\" class=\"title\">");
                                            String itemcode=rs.getString(1); 
                                            String itemname=rs.getString(2);
                                            String itemdetails=rs.getString(3);
                                            String itemprice=rs.getString(4);                       
                                            String URL=new String("additem.jsp?itemcode="+itemcode);
                                            out.print(itemname+"    -   "+itemdetails+" ");
                                           
                                            out.print("</a></h5>");
                                            out.print("<div class=\"slid-bottom-grids\">");
                                                out.print("<div class=\"slid-bottom-grid\">");
                                                out.print("<p class=\"author author-info\">");
                                                %>
                        <a href="<% out.print(""+URL); %>" class="author">Add to cart</a>
                        <%
                                                out.print("<</p>");
                                                out.print("</div>");
                                                out.print("<div class=\"slid-bottom-grid slid-bottom-right\">");
                                                out.print("<p class=\"views views-info\">Rs "+itemprice+"</p>");
                                                out.print("</div>");
                                                out.print("<div class=\"clearfix\"> </div>");
                                            out.print("</div>");
                                            
                                        out.print("</div>");
                                    out.print("</div>");
                                    }
                                    con.close();
                                    ps.close();
                                    rs.close();
                                    
                                    }catch(Exception e1)
                                    {
                                        System.out.println(e1.toString()+" hello viseo"+k);
                                    } 
                                %>
                                    <div class="clearfix"> </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="recommended">
                <div class="recommended-grids">					
                    <div class="recommended-info">
                        <h3><b><a href="#">Recommended Audios Collection</a></b></h3>
                    </div>
                    <%
                        i=0;
                        try                       
                        {
                            Class.forName("oracle.jdbc.OracleDriver");
                            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                            ps=con.prepareStatement("select * from audio");
                            rs=ps.executeQuery();
                            i=1;
                            for(k=1;k<=4 && rs.next();k++)
                            {
                                %>
                                <div class="col-md-3 resent-grid recommended-grid">
                                    <div class="resent-grid-img recommended-grid-img">
                                        <a href="#">
                                <% 
                                
                                String location=new String("\"images/r"+k+".jpg\"");
                                out.print("<img src="+location+">");
                                %>
                                       
                                        </a>                            
                                    </div>
                                    <div class="resent-grid-info recommended-grid-info video-info-grid">
                                        <h5><a href="#" class="title">
                                <%  
                                i=2;
                                String itemcode=rs.getString(1);
                                
                                String itemname=rs.getString(2);
                                String itemdetails=rs.getString(3);
                                String itemprice=rs.getString(4);
                                String URL=new String("additem.jsp?itemcode="+itemcode);
                                out.print(itemname+"    -   "+itemdetails+" ");
                                
                                %>
                                            </a>
                                        </h5>
                                                                              
                                <%                                           
                                out.print("<ul><li><p class=\"author author-info\">");
                                %>
                        <a href="<% out.print(""+URL); %>" class="author">Add to cart</a>
                        <%
                                out.print("</p></li>");
                                out.print("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li></ul>");
                                %>
                                        
                                    </div>
                                </div>
                                <%
                            }
                            i=5;                       
                        }
                        catch(Exception e1)
                        {
                            System.out.println(e1.toString()+"hello sudio"+i);
                        }
                        %>
                        <div class="clearfix"> </div>
                </div>
                <div class="recommended-grids">
                    <%
                        i=0;
                        try                       
                        {
                            for(k=4;k<=7 && rs.next();k++)
                            {
                                %>
                                <div class="col-md-3 resent-grid recommended-grid">
                                    <div class="resent-grid-img recommended-grid-img">
                                        <a href="#">
                                <% 
                                String location=new String("\"images/r"+k+".jpg\"");
                                out.print("<img src="+location+">");
                                %>
                                       
                                        </a>                            
                                    </div>
                                    <div class="resent-grid-info recommended-grid-info video-info-grid">
                                        <h5><a href="#" class="title">
                                <%  
                                i=2;
                                String itemcode=rs.getString(1);
                                
                                String itemname=rs.getString(2);
                                String itemdetails=rs.getString(3);
                                String itemprice=rs.getString(4);
                                String URL=new String("additem.jsp?itemcode="+itemcode);
                                out.print(itemname+"    -   "+itemdetails+" ");
                                
                                %>
                                            </a>
                                        </h5>
                                                                             
                                <%                                           
                                out.print("<ul><li><p class=\"author author-info\">");
                              %>
                                <a href="<% out.print(""+URL); %>" class="author">Add to cart</a>
                                <%
                                out.print("</p></li>");
                                out.print("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li></ul>");
                                %>
                                        
                                    </div>
                                </div>
                                <%
                            }
                            i=5;
                            con.close();
                            ps.close();
                            rs.close();                       
                        }
                        catch(Exception e1)
                        {
                            System.out.println(e1.toString()+"hello sudio"+i);
                        }
                        %>
                    <div class="clearfix"> </div>
                </div>
            </div>
            <div class="recommended">
                <div class="recommended-grids">
                    <div class="recommended-info">
                        <h3>Electronics and Appliances</h3>
                    </div>
                    <%
                    i=0;
                    try		     
                    {
                    Class.forName("oracle.jdbc.OracleDriver");
                    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                    ps=con.prepareStatement("select * from electronics");
                    rs=ps.executeQuery();
                    for(i=1;i<=4 && rs.next() ;i++)
                    {
                        %>
                        <div class="col-md-3 resent-grid recommended-grid">
                        <div class="resent-grid-img recommended-grid-img">
                        <a href="#small-dialog6" class="play-icon popup-with-zoom-anim">
                        <%
                        String loc=new String("\"images/g"+i+".jpg\"");
                        out.println("<img src="+loc+">");
                        %>
                        </a>
                        </div>
                        <div class="resent-grid-info recommended-grid-info video-info-grid"><h5><a href="#" class="title title-info">
                        <%
                            String itemcode=rs.getString(1);
                            String itemname=rs.getString(2);
                            String itemdetails=rs.getString(3);
                            String itemprice=rs.getString(4);
                            String URL=new String("additem.jsp?itemcode="+itemcode);
                            out.println(itemname+"    -   "+itemdetails+" ");
                        %>
                        </a></h5>
                        
                        <%
                            out.println("<ul><li><p class=\"author author-info\">");
                            %>
                        <a href="<% out.print(""+URL); %>" class="author">Add to cart</a>
                        <%
                            out.print("</p></li>");
                            out.println("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li></ul>  ");
                        %>               
                        </div>
                        </div>
                    <%
                    }
                    con.close();
                    ps.close();
                    rs.close();
                    }
                    catch(Exception e1)
                    {
                        System.out.println(e1.toString());
                    }
                %>
                <div class="clearfix"> </div>
                </div>
                <div class="recommended-grids">
                    <%
                   
                    try		     
                    {
                    Class.forName("oracle.jdbc.OracleDriver");
                    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                    ps=con.prepareStatement("select * from electronics");
                    rs=ps.executeQuery();
                    for(i=5;i<=8 && rs.next() ;i++)
                    {
                        %>
                        <div class="col-md-3 resent-grid recommended-grid">
                        <div class="resent-grid-img recommended-grid-img">
                        <a href="#small-dialog6" class="play-icon popup-with-zoom-anim">
                        <%
                        String loc=new String("\"images/g"+i+".jpg\"");
                        out.println("<img src="+loc+">");
                        %>
                        </a>
                        </div>
                        <div class="resent-grid-info recommended-grid-info video-info-grid"><h5><a href="#" class="title title-info">
                        <%
                            String itemcode=rs.getString(1);
                            String itemname=rs.getString(2);
                            String itemdetails=rs.getString(3);
                            String itemprice=rs.getString(4);
                            String URL=new String("additem.jsp?itemcode="+itemcode);
                            out.println(itemname+"    -   "+itemdetails+" ");
                        %>
                        </a></h5>
                       
                        <%
                            out.println("<ul><li><p class=\"author author-info\">"); 
                            %>
                        <a href="<% out.print(""+URL); %>" class="author">Add to cart</a>
                        <%
                        out.print("</p></li>");
                            out.println("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li></ul>");
                        %>
                                       
                        </div>
                        </div>
                    <%
                    }
                    con.close();
                    ps.close();
                    rs.close();
                    }
                    catch(Exception e1)
                    {
                        System.out.println(e1.toString());
                    }
                %>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
        
        
       
        <div class="footer">
            <div class="footer-grids">
                <div class="footer-top">
                    <div class="footer-top-nav">
                        <ul>
                            <li><a href="about1.html">About</a></li>
                            <li><a href="press1.html">Press</a></li>
                            <li><a href="copyright1.html">Copyright</a></li>
                            <li><a href="creators1.html">Creators</a></li>
                            <li><a href="#">Advertise</a></li>
                            <li><a href="developers1.html">Developers</a></li>
                        </ul>
                    </div>
                    <div class="footer-bottom-nav">
                        <ul>
                            <li><a href="terms1.html">Terms</a></li>
                            <li><a href="privacy1.html">Privacy</a></li>
                            <li><a href="#small-dialog4" class="play-icon popup-with-zoom-anim">Send feedback</a></li>
                            <li><a href="privacy1.html">Policy & Safety </a></li>
                            <li><a href="try1.html">Try something new!</a></li>
                        </ul>
                    </div>
                </div>
                <div class="footer-bottom">
                    <ul>
                        <li class="languages">
                            <select class="form-control bfh-countries" data-country="US">
                                <option value="">Select Language</option>
                                <option>Spanish</option>
                                <option>French</option>
                                <option>German</option>
                                <option>Italian</option>
                                <option>Chinese</option>
                                <option>Tagalog</option>
                                <option>Polish</option>
                                <option>Korean</option>
                                <option>Vietnamese</option>
                                <option>Portuguese</option>
                                <option>Japanese</option>
                                <option>Greek</option>
                                <option>Arabic</option>
                                <option>Hindi (urdu)</option>
                                <option>Russian</option>
                                <option>Yiddish</option>
                                <option>Thai (laotian)</option>
                                <option>Persian</option>
                                <option>French Creole</option>
                                <option>Armenian</option>
                                <option>Navaho</option>
                                <option>Hungarian</option>
                                <option>Hebrew</option>
                                <option>Dutch</option>
                                <option>Mon-khmer (cambodian)</option>
                                <option>Gujarathi</option>
                                <option>Ukrainian</option>
                                <option>Czech</option>
                                <option>Pennsylvania Dutch</option>
                                <option>Miao (hmong)</option>
                                <option>Norwegian</option>
                                <option>Slovak</option>
                                <option>Swedish</option>
                                <option>Serbocroatian</option>
                                <option>Kru</option>
                                <option>Rumanian</option>
                                <option>Lithuanian</option>
                                <option>Finnish</option>
                                <option>Panjabi</option>
                                <option>Formosan</option>
                                <option>Croatian</option>
                                <option>Turkish</option>
                                <option>Ilocano</option>
                                <option>Bengali</option>
                                <option>Danish</option>
                                <option>Syriac</option>			
                                <option>Samoan</option>
                                <option>Malayalam</option>
                                <option>Cajun</option>
                                <option>Amharic</option>
                            </select>
                        </li>
                        <li class="languages">
                            <select class="form-control bfh-countries">
                                <option value="">Select Country</option>
                                <option value="AFG">Afghanistan</option>
                                <option value="ALA">�land Islands</option>
                                <option value="ALB">Albania</option>
                                <option value="DZA">Algeria</option>
                                <option value="ASM">American Samoa</option>
                                <option value="AND">Andorra</option>							
                                <option value="AGO">Angola</option>
                                <option value="AIA">Anguilla</option>
                                <option value="ATA">Antarctica</option>
                                <option value="ATG">Antigua and Barbuda</option>
                                <option value="ARG">Argentina</option>
                                <option value="ARM">Armenia</option>
                                <option value="ABW">Aruba</option>
                                <option value="AUS">Australia</option>
                                <option value="AUT">Austria</option>
                                <option value="AZE">Azerbaijan</option>
                                <option value="BHS">Bahamas</option>
                                <option value="BHR">Bahrain</option>
                                <option value="BGD">Bangladesh</option>
                                <option value="BRB">Barbados</option>
                                <option value="BLR">Belarus</option>
                                <option value="BEL">Belgium</option>
                                <option value="BLZ">Belize</option>								
                                <option value="BEN">Benin</option>
                                <option value="BMU">Bermuda</option>
                                <option value="BTN">Bhutan</option>
                                <option value="BOL">Bolivia, Plurinational State of</option>
                                <option value="BES">Bonaire, Sint Eustatius and Saba</option>
                                <option value="BIH">Bosnia and Herzegovina</option>
                                <option value="BWA">Botswana</option>
                                <option value="BVT">Bouvet Island</option>
                                <option value="BRA">Brazil</option>
                                <option value="IOT">British Indian Ocean Territory</option>
                                <option value="BRN">Brunei Darussalam</option>
                                <option value="BGR">Bulgaria</option>
                                <option value="BFA">Burkina Faso</option>
                                <option value="BDI">Burundi</option>
                                <option value="KHM">Cambodia</option>
                                <option value="CMR">Cameroon</option>
                                <option value="CAN">Canada</option>
                                <option value="CPV">Cape Verde</option>                                                              
                                <option value="CYM">Cayman Islands</option>	
                                <option value="CAF">Central African Republic</option>
                                <option value="TCD">Chad</option>
                                <option value="CHL">Chile</option>
                                <option value="CHN">China</option>
                                <option value="CXR">Christmas Island</option>
                                <option value="CCK">Cocos (Keeling) Islands</option>
                                <option value="COL">Colombia</option>
                                <option value="COM">Comoros</option>
                                <option value="COG">Congo</option>
                                <option value="COD">Congo, the Democratic Republic of the</option>
                                <option value="COK">Cook Islands</option>
                                <option value="CRI">Costa Rica</option>
                                <option value="CIV">C�te d'Ivoire</option>
                                <option value="HRV">Croatia</option>
                                <option value="CUB">Cuba</option>
                                <option value="CUW">Cura�ao</option>
                                <option value="CYP">Cyprus</option>
                                <option value="CZE">Czech Republic</option>
                                <option value="DNK">Denmark</option>
                                <option value="DJI">Djibouti</option>
                                <option value="DMA">Dominica</option>
                                <option value="DOM">Dominican Republic</option>
                                <option value="ECU">Ecuador</option>
                                <option value="EGY">Egypt</option>
                                <option value="SLV">El Salvador</option>
                                <option value="GNQ">Equatorial Guinea</option>
                                <option value="ERI">Eritrea</option>
                                <option value="EST">Estonia</option>
                                <option value="ETH">Ethiopia</option>
                                <option value="FLK">Falkland Islands (Malvinas)</option>
                                <option value="FRO">Faroe Islands</option>
                                <option value="FJI">Fiji</option>
                                <option value="FIN">Finland</option>
                                <option value="FRA">France</option>
                                <option value="GUF">French Guiana</option>
                                <option value="PYF">French Polynesia</option>
                                <option value="ATF">French Southern Territories</option>
                                <option value="GAB">Gabon</option>
                                <option value="GMB">Gambia</option>
                                <option value="GEO">Georgia</option>
                                <option value="DEU">Germany</option>
                                <option value="GHA">Ghana</option>
                                <option value="GIB">Gibraltar</option>
                                <option value="GRC">Greece</option>
                                <option value="GRL">Greenland</option>
                                <option value="GRD">Grenada</option>
                                <option value="GLP">Guadeloupe</option>			
                                <option value="GUM">Guam</option>
                                <option value="GTM">Guatemala</option>
                                <option value="GGY">Guernsey</option>
                                <option value="GIN">Guinea</option>
                                <option value="GNB">Guinea-Bissau</option>
                                <option value="GUY">Guyana</option>
                                <option value="HTI">Haiti</option>
                                <option value="HMD">Heard Island and McDonald Islands</option>
                                <option value="VAT">Holy See (Vatican City State)</option>
                                <option value="HND">Honduras</option>
                                <option value="HKG">Hong Kong</option>
                                <option value="HUN">Hungary</option>
                                <option value="ISL">Iceland</option>
                                <option value="IND">India</option>
                                <option value="IDN">Indonesia</option>
                                <option value="IRN">Iran, Islamic Republic of</option>
                                <option value="IRQ">Iraq</option>
                                <option value="IRL">Ireland</option>
                                <option value="IMN">Isle of Man</option>
                                <option value="ISR">Israel</option>
                                <option value="ITA">Italy</option>
                                <option value="JAM">Jamaica</option>
                                <option value="JPN">Japan</option>
                                <option value="JEY">Jersey</option>
                                <option value="JOR">Jordan</option>
                                <option value="KAZ">Kazakhstan</option>
                                <option value="KEN">Kenya</option>
                                <option value="KIR">Kiribati</option>
                                <option value="PRK">Korea, Democratic People's Republic of</option>
                                <option value="KOR">Korea, Republic of</option>
                                <option value="KWT">Kuwait</option>
                                <option value="KGZ">Kyrgyzstan</option>
                                <option value="LAO">Lao People's Democratic Republic</option>
                                <option value="LVA">Latvia</option>
                                <option value="LBN">Lebanon</option>
                                <option value="LSO">Lesotho</option>
                                <option value="LBR">Liberia</option>
                                <option value="LBY">Libya</option>
                                <option value="LIE">Liechtenstein</option>
                                <option value="LTU">Lithuania</option>
                                <option value="LUX">Luxembourg</option>
                                <option value="MAC">Macao</option>
                                <option value="MKD">Macedonia, the former Yugoslav Republic of</option>
                                <option value="MDG">Madagascar</option>
                                <option value="MWI">Malawi</option>
                                <option value="MYS">Malaysia</option>
                                <option value="MDV">Maldives</option>
                                <option value="MLI">Mali</option>
                                <option value="MLT">Malta</option>
                                <option value="MHL">Marshall Islands</option>
                                <option value="MTQ">Martinique</option>
                                <option value="MRT">Mauritania</option>
                                <option value="MUS">Mauritius</option>
                                <option value="MYT">Mayotte</option>
                                <option value="MEX">Mexico</option>
                                <option value="FSM">Micronesia, Federated States of</option>
                                <option value="MDA">Moldova, Republic of</option>
                                <option value="MCO">Monaco</option>
                                <option value="MNG">Mongolia</option>
                                <option value="MNE">Montenegro</option>
                                <option value="MSR">Montserrat</option>
                                <option value="MAR">Morocco</option>
                                <option value="MOZ">Mozambique</option>
                                <option value="MMR">Myanmar</option>
                                <option value="NAM">Namibia</option>
                                <option value="NRU">Nauru</option>
                                <option value="NPL">Nepal</option>
                                <option value="NLD">Netherlands</option>
                                <option value="NCL">New Caledonia</option>
                                <option value="NZL">New Zealand</option>
                                <option value="NIC">Nicaragua</option>
                                <option value="NER">Niger</option>
                                <option value="NGA">Nigeria</option>
                                <option value="NIU">Niue</option>
                                <option value="NFK">Norfolk Island</option>
                                <option value="MNP">Northern Mariana Islands</option>
                                <option value="NOR">Norway</option>
                                <option value="OMN">Oman</option>
                                <option value="PAK">Pakistan</option>
                                <option value="PLW">Palau</option>
                                <option value="PSE">Palestinian Territory, Occupied</option>
                                <option value="PAN">Panama</option>
                                <option value="PNG">Papua New Guinea</option>
                                <option value="PRY">Paraguay</option>
                                <option value="PER">Peru</option>
                                <option value="PHL">Philippines</option>
                                <option value="PCN">Pitcairn</option>
                                <option value="POL">Poland</option>
                                <option value="PRT">Portugal</option>
                                <option value="PRI">Puerto Rico</option>                                
                                <option value="QAT">Qatar</option>
                                <option value="REU">R�union</option>
                                <option value="ROU">Romania</option>
                                <option value="RUS">Russian Federation</option>
                                <option value="RWA">Rwanda</option>
                                <option value="BLM">Saint Barth�lemy</option>
                                <option value="SHN">Saint Helena, Ascension and Tristan da Cunha</option>
                                <option value="KNA">Saint Kitts and Nevis</option>
                                <option value="LCA">Saint Lucia</option>
                                <option value="MAF">Saint Martin (French part)</option>
                                <option value="SPM">Saint Pierre and Miquelon</option>
                                <option value="VCT">Saint Vincent and the Grenadines</option>
                                <option value="WSM">Samoa</option>
                                <option value="SMR">San Marino</option>
                                <option value="STP">Sao Tome and Principe</option>
                                <option value="SAU">Saudi Arabia</option>
                                <option value="SEN">Senegal</option>
                                <option value="SRB">Serbia</option>
                                <option value="SYC">Seychelles</option>
                                <option value="SLE">Sierra Leone</option>
                                <option value="SGP">Singapore</option>
                                <option value="SXM">Sint Maarten (Dutch part)</option>
                                <option value="SVK">Slovakia</option>
                                <option value="SVN">Slovenia</option>
                                <option value="SLB">Solomon Islands</option>
                                <option value="SOM">Somalia</option>
                                <option value="ZAF">South Africa</option>
                                <option value="SGS">South Georgia and the South Sandwich Islands</option>
                                <option value="SSD">South Sudan</option>
                                <option value="ESP">Spain</option>
                                <option value="LKA">Sri Lanka</option>
                                <option value="SDN">Sudan</option>
                                <option value="SUR">Suriname</option>
                                <option value="SJM">Svalbard and Jan Mayen</option>
                                <option value="SWZ">Swaziland</option>
                                <option value="SWE">Sweden</option>
                                <option value="CHE">Switzerland</option>
                                <option value="SYR">Syrian Arab Republic</option>									<option value="TWN">Taiwan, Province of China</option>
                                <option value="TJK">Tajikistan</option>
                                <option value="TZA">Tanzania, United Republic of</option>
                                <option value="THA">Thailand</option>
                                <option value="TLS">Timor-Leste</option>
                                <option value="TGO">Togo</option>
                                <option value="TKL">Tokelau</option>
                                <option value="TON">Tonga</option>
                                <option value="TTO">Trinidad and Tobago</option>
                                <option value="TUN">Tunisia</option>
                                <option value="TUR">Turkey</option>
                                <option value="TKM">Turkmenistan</option>
                                <option value="TCA">Turks and Caicos Islands</option>
                                <option value="TUV">Tuvalu</option>
                                <option value="UGA">Uganda</option>
                                <option value="UKR">Ukraine</option>
                                <option value="ARE">United Arab Emirates</option>
                                <option value="GBR">United Kingdom</option>
                                <option value="USA">United States</option>
                                <option value="UMI">United States Minor Outlying Islands</option>
                                <option value="URY">Uruguay</option>
                                <option value="UZB">Uzbekistan</option>
                                <option value="VUT">Vanuatu</option>
                                <option value="VEN">Venezuela, Bolivarian Republic of</option>
                                <option value="VNM">Viet Nam</option>
                                <option value="VGB">Virgin Islands, British</option>
                                <option value="VIR">Virgin Islands, U.S.</option>
                                <option value="WLF">Wallis and Futuna</option>
                                <option value="ESH">Western Sahara</option>
                                <option value="YEM">Yemen</option>
                                <option value="ZMB">Zambia</option>
                                <option value="ZWE">Zimbabwe</option>                           
                            </select>                       
                        </li>
                        <li class="languages">
                            <select class="form-control bfh-countries" data-country="US">
                                <option value="">Safety Off</option>
                                <option value="">Safety On</option>
                            </select>
                        </li>
                        <li><a href="history.html" class="f-history">History</a></li>
                        <li><a href="#small-dialog5" class="play-icon popup-with-zoom-anim f-history f-help">Help</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- //footer -->
   </div>
</body>
</html>