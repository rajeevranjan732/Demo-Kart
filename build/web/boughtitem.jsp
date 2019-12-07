<%@page import="java.util.Set"%>
<%@page pageEncoding="UTF-8"%>
<%@ page language="java" import="java.sql.*"%>
<!DOCTYPE HTML>
<% 
    System.out.println(" "+session.getAttribute("currentkey"));
        if(session.isNew())
        {
            String name=null,phone=null,address=null,email=null,password=null,kart=null,bought=null,current=null;
            
        session.setAttribute("namekey",name);
        session.setAttribute("addresskey",address);
        session.setAttribute("emailkey",email);
        session.setAttribute("passwordkey",password);
        session.setAttribute("phonekey",phone);
        session.setAttribute("currentkey",current);
        session.setAttribute("kartkey",kart);
        }
       
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
		<a class="navbar-brand" href="index1.jsp`"><h1><img src="images/demokartlogo.jpg" alt="logo" /></h1></a>
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
                    <a href="#small-dialog2" class="play-icon popup-with-zoom-anim">Sign Up</a>
                    
                    <script type="text/javascript" src="js/modernizr.custom.min.js"></script>
                    <link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
                    <script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
                    <script src="js/validator.js"></script>
                    
                    <div id="small-dialog2" class="mfp-hide">
                        <h3>Create Account</h3> 
                        <div class="social-sits">
                            <div class="facebook-button">
                                <a href="#">Connect with Facebook</a>
                            </div>
                            <div class="chrome-button">
                                <a href="#">Connect with Google</a>
                            </div>
                            <div class="button-bottom">
                                <p>Already have an account? <a href="#small-dialog" class="play-icon popup-with-zoom-anim">Login</a></p>
                            </div>
                        </div>
                        <div class="signup">
                            
                            <p>Before clicking on continue d our terms and conditions<br> by clicking on continue you agree to our terms and conditions</p>
                            <div class="continue-button">
                                <a href="#small-dialog3" class="hvr-shutter-out-horizontal play-icon popup-with-zoom-anim">CONTINUE</a>
                            </div>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                    <div id="small-dialog3" class="mfp-hide">
                        <h3>Create Account</h3> 
                        <div class="social-sits">
                            <div class="facebook-button">
                                <a href="#">Connect with Facebook</a>
                            </div>
                            <div class="chrome-button">
                                <a href="#">Connect with Google</a>
                            </div>
                            <div class="button-bottom">
                                <p>Already have an account? <a href="#small-dialog" class="play-icon popup-with-zoom-anim">Login</a></p>
                            </div>
                        </div>
                        <div class="signup">
                            <form id="register" method="post" action="signup.jsp">
                                <div class="form-group">
                                    <input type="text" name="name" class="email" maxlength="20" placeholder="Name" required="required" title="Enter your name" value=""/>
                                    <div class="help-block with-errors"></div>
                                </div>
                                <div class="form-group">
                                    <input type="text" name="email" class="email" maxlength="30" placeholder="Email" required="required" pattern="([\w-\.]+@([\w-]+\.)+[\w-]{2,4})" title="Enter a valid email address" value=""/>
                                    <div class="help-block with-errors"></div>
                                </div>
                                <div class="form-group">
                                    <input type="password" name="password" id="password" maxlength="20" placeholder="Password" required="required" pattern=".{6,}" title="Minimum 6 characters required" autocomplete="off" value=""/>
                                    <div class="help-block with-errors"></div>
                                </div>
                                <div class="form-group">
                                    <input type="password" id="confirmPassword" data-match="#password" maxlength="20" data-match-error="Whoops, these don't match" placeholder="Confirm Password" required="required" pattern=".{6,}" title="Minimum 6 characters required" autocomplete="off" value=""/>
                                    <div class="help-block with-errors"></div>
                                    
                                </div>
                                <div class="form-group">
                                    
                                    <input type="text" name="phone" class="email" placeholder="Mobile Number" maxlength="10" required="required" pattern="[1-9]{1}\d{9}" title="Enter a valid mobile number" value=""/>                                                                                                
                                    <div class="help-block with-errors"></div>
                                </div>
                                <div class="form-group">
                                    <textarea form="register" name="address" class="email" rows="5" maxlength="60" placeholder="Address" required="required" title="enter your address"></textarea>
                                    <div class="help-block with-errors"></div>
                                </div>
                                <input type="submit" name="action" value="Sign Up"/>
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
                    
                    <script>
                        $(document).ready(function() {
                            $('#register').validator({});                            
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
                    <a href="#small-dialog" class="play-icon popup-with-zoom-anim">Sign in</a>
                    <!-- POP UP BOX ****************-->
                    <div id="small-dialog" class="mfp-hide">
                        <h3>Login</h3>
                        <div class="social-sits">
                            <div class="facebook-button">
                                <a href="#">Connect with Facebook</a>
                            </div>
                            <div class="chrome-button">
                                <a href="#">Connect with Google</a>
                            </div>
                            <div class="button-bottom">
                                <p>New account? <a href="#small-dialog2" class="play-icon popup-with-zoom-anim">Signup</a></p>
                            </div>
                        </div>
                        <div class="signup">
                            <form method="post" action="login.jsp">
                                <input name="email" type="text" class="email" placeholder="Enter email" required="required" pattern="([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?"/>
                                <input name="password" type="password" placeholder="Password" required="required" pattern=".{6,}" title="Minimum 6 characters required" autocomplete="off" />
                                <input name="login" type="submit"  value="LOGIN"/>
                            </form>
                            <div class="forgot">
                                <a href="#">Forgot password ?</a>
                            </div>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
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
                <li class="active"><a href="index1.jsp`" class="home-icon"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>Home</a></li>
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
                    <p>Copyright © 2015 deMokart. All Rights Reserved | Design by <a href="#">Rajeev Ranjan</a></p>
                </div>
            </div>
        </div>
    </div>
    <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
        <%
        String bought=(String)session.getAttribute("boughttkey");
        if(bought==null || bought.length()==0)
        {
            
            %>
            <div id="small-dialog7">
                <h3>Blank Cart</h3>
                <div class="video-information-text">
                    <p>You haven't bought any item..<br><a href="index1.jsp">Home page </a> is waiting for you add item in this list<p>
                </div>
            </div>
            <%
        }
        else
        {
            String itemcode=null;
            int n1=0,n2=0,n3=0,n4=0,j=0,n=0;
            n=bought.length();
            int i=0;
            Connection con=null;
            PreparedStatement ps=null;
            ResultSet rs=null;
            for(i=0;i<n;i=i+2)
                if(bought.charAt(i)=='1')
                    n1++;
                else if(bought.charAt(i)=='2')
                    n2++;
                else if(bought.charAt(i)=='3')
                    n3++;
                else if(bought.charAt(i)=='4')
                    n4++;
            %>
            <div class="main-grids">        
            <%
            i=0;
            while(n1>0)
            {   
                %>
                <div class="top-grids">
                    <%
                    if(i==0)
                    {
                        out.print("<div class=\"recommended-info\">");
                        out.print("<h3>Category : Fashion & lifeStyle</h3>");
                        out.print("</div>");
                    }
                    for(j=0;i<n && j<3;i=i+2,j++)
                    {
                        if(bought.charAt(i)=='1')
                        {
                            n1--;
                            itemcode=bought.substring(i, i+2);
                            int k=Integer.parseInt(itemcode)-9;
                            try		     
                            {
                            Class.forName("oracle.jdbc.OracleDriver");
                            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                            ps=con.prepareStatement("select * from fashion where code=?");
                            ps.setString(1,itemcode);
                            rs=ps.executeQuery();
                            rs.next();
                                 
                            %>
                        <div class="col-md-4 resent-grid recommended-grid slider-top-grids">
                        <div class="resent-grid-img recommended-grid-img">
                        <a href="#small-dialog6" class="play-icon popup-with-zoom-anim">
                        <%
                        String loc=new String("\"images/t"+k+".jpg\"");
                        out.println("<img src="+loc+">");
                            String itemname=rs.getString(2);
                            String itemdetails=rs.getString(3);
                            String itemprice=rs.getString(4);
                            String URL=new String("removeboughtitem.jsp?itemcode="+itemcode);
                        %>
                        </a>
                        </div>
                        <div class="resent-grid-info recommended-grid-info"><h3><a href="#" class="title title-info">
                        <% out.print(itemname+"    -   "+itemdetails+" "); %></a></h3>
                        <%
                            out.print("<ul>");                        
                            out.print("<li><p class=\"author author-info\">");
                        %>
                        <a href="<% out.print(""+URL); %>" class="author">Remove from list</a>
                        <%
                            out.print("</p></li>");
                            out.print("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li>");
                            out.print("</ul>");
                        %>
                        </div>
                        </div>
                    <%
                            
                            
                            con.close();
                            ps.close();
                            rs.close();
                            }
                            catch(Exception e1)
                            {
                                System.out.println(e1.toString()+"fashion");
                            }
                        }
                    }
                %>
                    <div class="clearfix"> </div>
                </div>
                <%
            }
            %>
            
            <div class="recommended">
                <div class="recommended-grids">
                    <div  id="top" class="callbacks_container">
                        
                        <%
                            out.print("<ul class=\"rslides\" id=\"slider3\">");
                            i=0;
                            while(n2>0)
                            {
                                if(i==0)
                                {
                                    out.print("<div class=\"recommended-info\">");
                                    out.print("<h3>Category : Videos Collections</h3>");
                                    out.print("</div>");
                                }
                                out.print("<li><div class=\"animated-grids\">");
                                for(j=0;i<n && j<4;i=i+2,j++)
                                {
                                    if(bought.charAt(i)=='2')
                                    {                          
                                        n2--;
                                        itemcode=bought.substring(i, i+2);
                                        int k=Integer.parseInt(itemcode)-19;
                                        try		     
                                        {
                                            Class.forName("oracle.jdbc.OracleDriver");                           
                                            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                                            ps=con.prepareStatement("select * from video where code=?");
                                            ps.setString(1,itemcode);
                                            rs=ps.executeQuery();
                                            rs.next();
                                             out.print("<div class=\"col-md-3 resent-grid recommended-grid slider-first\">");
                                            out.print("<div class=\"resent-grid-img recommended-grid-img\">");
                                            out.print("<a href=\"#\">");
                                            String location=new String("\"images/c"+k+".jpg\"");
                                            out.print("<img src="+location+">"); 
                                            out.print("</a>");
                                            out.print("</div>");
                                            out.print("<div class=\"resent-grid-info recommended-grid-info\">");
                                            out.print("<h5><a href=\"#\" class=\"title\">");
                                    
                                            String itemname=rs.getString(2);
                                            String itemdetails=rs.getString(3);
                                            String itemprice=rs.getString(4);
                                            String URL=new String("removebougthitem.jsp?itemcode="+itemcode);
                                            out.print(itemname+"    -   "+itemdetails+" ");
                                            out.print("</a></h5>");
                                            out.print("<div class=\"slid-bottom-grids\">");
                                            out.print("<div class=\"slid-bottom-grid\">");
                                            out.print("<p class=\"author author-info\">");
                                            %>
                                            <a href="<% out.print(""+URL); %>" class="author">Remove from cart</a>
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
                                        catch(Exception e)
                                        {
                                            System.out.print(e+"video");
                                        }
                                    }
                                }
                                out.print("<div class=\"clearfix\"> </div></div></li>");
                            }
                            out.print("</ul>");
                        %>
                    </div>
                </div>
            </div>
            
            <div class="recommended">
                
                 <%
                i=0;
                while(n3>0)
                {   
                out.print("<div class=\"recommended-grids\">");
                    if(i==0)
                    {
                        out.print("<div class=\"recommended-info\">");
                        out.print("<h3>Category : audio Collections</h3>");
                        out.print("</div>");
                    }
                    for(j=0;i<n && j<4;i=i+2,j++)
                    {
                        if(bought.charAt(i)=='3')
                        {
                            n3--;
                            itemcode=bought.substring(i, i+2);
                            int k=Integer.parseInt(itemcode)-29;
                            try		     
                            {
                            Class.forName("oracle.jdbc.OracleDriver");
                            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                            ps=con.prepareStatement("select * from audio where code=?");
                            ps.setString(1,itemcode);
                            rs=ps.executeQuery();
                            rs.next();
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
                                String itemname=rs.getString(2);
                                String itemdetails=rs.getString(3);
                                String itemprice=rs.getString(4);
                                String URL=new String("removebougthitem.jsp?itemcode="+itemcode);
                                out.print(itemname+"    -   "+itemdetails+" ");                                
                                %>
                                       </a>
                                   </h5>                                                                              
                                <%                                           
                                out.print("<ul><li><p class=\"author author-info\">");
                                %>
                                <a href="<% out.print(""+URL); %>" class="author">Remove from cart</a>
                                <%
                                out.print("</p></li>");
                                out.print("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li></ul>");
                                %>                                        
                                </div>
                                </div>
                                <%
                                con.close();
                            ps.close();
                            rs.close();
                            }
                            catch(Exception e)
                            {
                                System.out.print(e.toString()+"audio");
                            }   
                        }
                    }
                out.print("<div class=\"clearfix\"> </div></div>");
                }
                %>
                
            </div>
            <div class="recommended">
                <%
                i=0;
                while(n4>0)
                {   
                    out.print("<div class=\"recommended-grids\">");
                    if(i==0)
                    {
                        out.print("<div class=\"recommended-info\">");
                       out.print("<h3>Category : Electronics and Appliances</h3>");
                       out.print("</div>");
                    }
                    for(j=0;i<n && j<=3;i=i+2,j++)
                    {
                        if(bought.charAt(i)=='4')
                        {
                            n4--;
                            itemcode=bought.substring(i, i+2);
                            int k=Integer.parseInt(itemcode)-39;
                            try		     
                            {
                                Class.forName("oracle.jdbc.OracleDriver");
                            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                            ps=con.prepareStatement("select * from electronics where code=?");
                            ps.setString(1,itemcode);
                            rs=ps.executeQuery();
                            rs.next();
                                %>
                                <div class="col-md-3 resent-grid recommended-grid">
                                <div class="resent-grid-img recommended-grid-img">
                                <a href="#small-dialog6" class="play-icon popup-with-zoom-anim">
                                <%
                                String loc=new String("\"images/g"+k+".jpg\"");
                                out.println("<img src="+loc+">");
                                %>
                                </a>
                                </div>
                                <div class="resent-grid-info recommended-grid-info video-info-grid"><h5><a href="#" class="title title-info">
                                <%
                                    String itemname=rs.getString(2);
                                    String itemdetails=rs.getString(3);
                                    String itemprice=rs.getString(4);
                                    String URL=new String("removebougthitem.jsp?itemcode="+itemcode);
                                    out.println(itemname+"    -   "+itemdetails+" ");
                                %>
                                </a></h5>

                                <%
                                    out.println("<ul><li><p class=\"author author-info\">"); 
                                    %>
                                <a href="<% out.print(""+URL); %>" class="author">Remove from cart</a>
                                <%
                                out.print("</p></li>");
                                    out.println("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li></ul>");
                                %>

                                </div>
                                </div>
                                    <%
                            con.close();
                            ps.close();
                            rs.close();
                            }
                            catch(Exception e)
                            {
                                System.out.print(e.toString()+"electronics");
                            }
                        }
                    }
                out.print("<div class=\"clearfix\"> </div></div>");
                }
                %>
            </div>

        </div>
                <%
        }
        %>
    </div>
</body>
</html>
