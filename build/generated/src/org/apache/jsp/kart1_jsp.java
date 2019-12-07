package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Set;
import java.sql.*;

public final class kart1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    if(session.getAttribute("namekey")==null)
        response.sendRedirect("index.jsp");
    
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
 
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
       

      out.write("\n");
      out.write("    \n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>A trial shopping site by Rajeev Ranjan</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"My Play Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- bootstrap -->\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel='stylesheet' type='text/css' media=\"all\" />\n");
      out.write("<!-- //bootstrap -->\n");
      out.write("<link href=\"css/dashboard.css\" rel=\"stylesheet\">\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<link href=\"css/style.css\" rel='stylesheet' type='text/css' media=\"all\" />\n");
      out.write("<link href=\"css/new.css\" rel='stylesheet' type='text/css' media=\"all\" />\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!--start-smoth-scrolling-->\n");
      out.write("<!-- fonts -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Poiret+One' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- //fonts -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" >\n");
      out.write("\t<div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\">\t\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"index1.jsp`\"><h1><img src=\"images/demokartlogo.jpg\" alt=\"logo\" /></h1></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"top-search\">\n");
      out.write("                <form class=\"navbar-form navbar-right\">\n");
      out.write("                    <input type=\"search\" class=\"form-control\" placeholder=\"I'm gonna find you and display you...\">\n");
      out.write("                    <input type=\"submit\" value=\" \">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header-top-right\" >\n");
      out.write("                <div class=\"file\">\n");
      out.write("                    <a href=\"kart1.jsp\">My Kart</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"signin\">\n");
      out.write("                    <a href=\"#small-dialog2\" class=\"play-icon popup-with-zoom-anim\">Sign Up</a>\n");
      out.write("                    \n");
      out.write("                    <script type=\"text/javascript\" src=\"js/modernizr.custom.min.js\"></script>\n");
      out.write("                    <link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("                    <script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\n");
      out.write("                    <script src=\"js/validator.js\"></script>\n");
      out.write("                    \n");
      out.write("                    <div id=\"small-dialog2\" class=\"mfp-hide\">\n");
      out.write("                        <h3>Create Account</h3> \n");
      out.write("                        <div class=\"social-sits\">\n");
      out.write("                            <div class=\"facebook-button\">\n");
      out.write("                                <a href=\"#\">Connect with Facebook</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"chrome-button\">\n");
      out.write("                                <a href=\"#\">Connect with Google</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"button-bottom\">\n");
      out.write("                                <p>Already have an account? <a href=\"#small-dialog\" class=\"play-icon popup-with-zoom-anim\">Login</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"signup\">\n");
      out.write("                            \n");
      out.write("                            <p>Before clicking on continue d our terms and conditions<br> by clicking on continue you agree to our terms and conditions</p>\n");
      out.write("                            <div class=\"continue-button\">\n");
      out.write("                                <a href=\"#small-dialog3\" class=\"hvr-shutter-out-horizontal play-icon popup-with-zoom-anim\">CONTINUE</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"small-dialog3\" class=\"mfp-hide\">\n");
      out.write("                        <h3>Create Account</h3> \n");
      out.write("                        <div class=\"social-sits\">\n");
      out.write("                            <div class=\"facebook-button\">\n");
      out.write("                                <a href=\"#\">Connect with Facebook</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"chrome-button\">\n");
      out.write("                                <a href=\"#\">Connect with Google</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"button-bottom\">\n");
      out.write("                                <p>Already have an account? <a href=\"#small-dialog\" class=\"play-icon popup-with-zoom-anim\">Login</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"signup\">\n");
      out.write("                            <form id=\"register\" method=\"post\" action=\"signup.jsp\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" name=\"name\" class=\"email\" maxlength=\"20\" placeholder=\"Name\" required=\"required\" title=\"Enter your name\" value=\"\"/>\n");
      out.write("                                    <div class=\"help-block with-errors\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"text\" name=\"email\" class=\"email\" maxlength=\"30\" placeholder=\"Email\" required=\"required\" pattern=\"([\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4})\" title=\"Enter a valid email address\" value=\"\"/>\n");
      out.write("                                    <div class=\"help-block with-errors\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"password\" name=\"password\" id=\"password\" maxlength=\"20\" placeholder=\"Password\" required=\"required\" pattern=\".{6,}\" title=\"Minimum 6 characters required\" autocomplete=\"off\" value=\"\"/>\n");
      out.write("                                    <div class=\"help-block with-errors\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <input type=\"password\" id=\"confirmPassword\" data-match=\"#password\" maxlength=\"20\" data-match-error=\"Whoops, these don't match\" placeholder=\"Confirm Password\" required=\"required\" pattern=\".{6,}\" title=\"Minimum 6 characters required\" autocomplete=\"off\" value=\"\"/>\n");
      out.write("                                    <div class=\"help-block with-errors\"></div>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    \n");
      out.write("                                    <input type=\"text\" name=\"phone\" class=\"email\" placeholder=\"Mobile Number\" maxlength=\"10\" required=\"required\" pattern=\"[1-9]{1}\\d{9}\" title=\"Enter a valid mobile number\" value=\"\"/>                                                                                                \n");
      out.write("                                    <div class=\"help-block with-errors\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <textarea form=\"register\" name=\"address\" class=\"email\" rows=\"5\" maxlength=\"60\" placeholder=\"Address\" required=\"required\" title=\"enter your address\"></textarea>\n");
      out.write("                                    <div class=\"help-block with-errors\"></div>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"submit\" name=\"action\" value=\"Sign Up\"/>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"small-dialog4\" class=\"mfp-hide\">\n");
      out.write("                        <h3>Feedback</h3> \n");
      out.write("                        <div class=\"feedback-grids\">\n");
      out.write("                            <div class=\"feedback-grid\">\n");
      out.write("                                <p>Suspendisse tristique magna ut urna pellentesque, ut egestas velit faucibus. Nullam mattis lectus ullamcorper dui dignissim, sit amet egestas orci ullamcorper.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"button-bottom\">\n");
      out.write("                                <p><a href=\"#small-dialog\" class=\"play-icon popup-with-zoom-anim\">Sign in</a> to get started.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"small-dialog5\" class=\"mfp-hide\">\n");
      out.write("                        <h3>Help</h3> \n");
      out.write("                        <div class=\"help-grid\">\n");
      out.write("                            <p>Suspendisse tristique magna ut urna pellentesque, ut egestas velit faucibus. Nullam mattis lectus ullamcorper dui dignissim, sit amet egestas orci ullamcorper.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"help-grids\">\n");
      out.write("                            <div class=\"help-button-bottom\">\n");
      out.write("                                <p><a href=\"#small-dialog4\" class=\"play-icon popup-with-zoom-anim\">Feedback</a></p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"help-button-bottom\">\n");
      out.write("                                <p><a href=\"#small-dialog6\" class=\"play-icon popup-with-zoom-anim\">Lorem ipsum dolor sit amet</a></p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"help-button-bottom\">\n");
      out.write("                                <p><a href=\"#small-dialog6\" class=\"play-icon popup-with-zoom-anim\">Nunc vitae rutrum enim</a></p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"help-button-bottom\">\n");
      out.write("                                <p><a href=\"#small-dialog6\" class=\"play-icon popup-with-zoom-anim\">Mauris at volutpat leo</a></p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"help-button-bottom\">\n");
      out.write("                                <p><a href=\"#small-dialog6\" class=\"play-icon popup-with-zoom-anim\">Mauris vehicula rutrum velit</a></p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"help-button-bottom\">\n");
      out.write("                                <p><a href=\"#small-dialog6\" class=\"play-icon popup-with-zoom-anim\">Aliquam eget ante non orci fac</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div id=\"small-dialog6\" class=\"mfp-hide\">\n");
      out.write("                        <div class=\"social-sits\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"video-information-text\">\n");
      out.write("                            <!-- ITEM INFORMATION-->\n");
      out.write("                            <p>Suspendisse tristique magna ut urna pellentesque, ut egestas velit faucibus. Nullam mattis lectus ullamcorper dui dignissim, sit amet egestas orci ullamcorper.</p>\n");
      out.write("                            <ol>\n");
      out.write("                                <li>Nunc vitae rutrum enim. Mauris at volutpat leo. Vivamus dapibus mi ut elit fermentum tincidunt.</li>\n");
      out.write("                                <li>Nunc vitae rutrum enim. Mauris at volutpat leo. Vivamus dapibus mi ut elit fermentum tincidunt.</li>\n");
      out.write("                                <li>Nunc vitae rutrum enim. Mauris at volutpat leo. Vivamus dapibus mi ut elit fermentum tincidunt.</li>\n");
      out.write("                                <li>Nunc vitae rutrum enim. Mauris at volutpat leo. Vivamus dapibus mi ut elit fermentum tincidunt.</li>\n");
      out.write("                                <li>Nunc vitae rutrum enim. Mauris at volutpat leo. Vivamus dapibus mi ut elit fermentum tincidunt.</li>\n");
      out.write("                            </ol>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <script>\n");
      out.write("                        $(document).ready(function() {\n");
      out.write("                            $('#register').validator({});                            \n");
      out.write("                        });\n");
      out.write("                        $(document).ready(function() {                                    \n");
      out.write("                            $('.popup-with-zoom-anim').magnificPopup({\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                type: 'inline',\n");
      out.write("                                fixedContentPos: false,\n");
      out.write("                                fixedBgPos: true,\n");
      out.write("                                overflowY: 'auto',\n");
      out.write("                                closeBtnInside: true,\n");
      out.write("                                preloader: false,\n");
      out.write("                                midClick: true,\n");
      out.write("                                removalDelay: 300,\n");
      out.write("                                mainClass: 'my-mfp-zoom-in'\n");
      out.write("                            });\n");
      out.write("                        });\n");
      out.write("                    </script>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"signin\">\n");
      out.write("                    <a href=\"#small-dialog\" class=\"play-icon popup-with-zoom-anim\">Sign in</a>\n");
      out.write("                    <!-- POP UP BOX ****************-->\n");
      out.write("                    <div id=\"small-dialog\" class=\"mfp-hide\">\n");
      out.write("                        <h3>Login</h3>\n");
      out.write("                        <div class=\"social-sits\">\n");
      out.write("                            <div class=\"facebook-button\">\n");
      out.write("                                <a href=\"#\">Connect with Facebook</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"chrome-button\">\n");
      out.write("                                <a href=\"#\">Connect with Google</a>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"button-bottom\">\n");
      out.write("                                <p>New account? <a href=\"#small-dialog2\" class=\"play-icon popup-with-zoom-anim\">Signup</a></p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"signup\">\n");
      out.write("                            <form method=\"post\" action=\"login.jsp\">\n");
      out.write("                                <input name=\"email\" type=\"text\" class=\"email\" placeholder=\"Enter email\" required=\"required\" pattern=\"([\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4})?\"/>\n");
      out.write("                                <input name=\"password\" type=\"password\" placeholder=\"Password\" required=\"required\" pattern=\".{6,}\" title=\"Minimum 6 characters required\" autocomplete=\"off\" />\n");
      out.write("                                <input name=\"login\" type=\"submit\"  value=\"LOGIN\"/>\n");
      out.write("                            </form>\n");
      out.write("                            <div class=\"forgot\">\n");
      out.write("                                <a href=\"#\">Forgot password ?</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div class=\"col-sm-3 col-md-2 sidebar\">\n");
      out.write("\t<div class=\"top-navigation\">\n");
      out.write("            <div class=\"t-menu\">MENU</div>\n");
      out.write("            <div class=\"t-img\">\n");
      out.write("\t\t<img src=\"images/lines.png\" alt=\"\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
      out.write("\t<div class=\"drop-navigation drop-navigation\" id=\"menuwrapper\">\n");
      out.write("            <ul class=\"nav nav-sidebar\">\n");
      out.write("                <li class=\"active\"><a href=\"index1.jsp`\" class=\"home-icon\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>Home</a></li>\n");
      out.write("                <li><a href=\"#first\" class=\"menu1\"><span class=\"glyphicon glyphicon-home glyphicon-gift\" aria-hidden=\"true\"></span>Fashion<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                    <ul>    \n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Men<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Clothing</a></li>\n");
      out.write("                                <li><a href=\"#\">Footwears</a></li>\n");
      out.write("                                <li><a href=\"#\">Watches</a></li>\n");
      out.write("                                <li><a href=\"#\">Accessories</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Women<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Clothing</a></li>\n");
      out.write("                                <li><a href=\"#\">Footwears</a></li>\n");
      out.write("                                <li><a href=\"#\">Jewelleries</a></li>\n");
      out.write("                                <li><a href=\"#\">Accessories</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Kids<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Clothing</a></li>\n");
      out.write("                                <li><a href=\"#\">Footwears</a></li>\n");
      out.write("                                <li><a href=\"#\">Care</a></li>\n");
      out.write("                                <li><a href=\"#\">Accessories</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \t\t\t\t\t\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Luggage<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Bagpacks</a></li>\n");
      out.write("                                <li><a href=\"#\">Strolley</a></li>\n");
      out.write("                                <li><a href=\"#\">Laptop Bags</a></li>\n");
      out.write("                                <li><a href=\"#\">RuckSacks</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#second\" class=\"menu2\"><span class=\"glyphicon glyphicon-film glyphicon-phone\" aria-hidden=\"true\"></span>Electronics<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                    <ul id=\"second\" class=\"collapse\">\t\t\t\t\t\t\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Mobiles and Accessories<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Mobiles</a></li>\n");
      out.write("                                <li><a href=\"#\">Tablets</a></li>\n");
      out.write("                                <li><a href=\"#\">Accessories</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;TV Audios Videos<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">TV</a></li>\n");
      out.write("                                <li><a href=\"#\">Audio</a></li>\n");
      out.write("                                <li><a href=\"#\">Movies</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Appliances<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Large Appliances</a></li>\n");
      out.write("                                <li><a href=\"#\">Home Appliances</a></li>\n");
      out.write("                                <li><a href=\"#\">Kitchen Appliances</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \t\t\t\t\t\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Automotive<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\t\t\t\t\n");
      out.write("                                <li><a href=\"#\">Car Accessories</a></li>\n");
      out.write("                                <li><a href=\"#\">Bike Accessories</a></li>\n");
      out.write("                                <li><a href=\"#\">Spareparts</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#third\" class=\"menu3\"><span class=\"glyphicon glyphicon-film glyphicon-cutlery\" aria-hidden=\"true\"></span>Home Needs<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                    <ul id=\"third\" class=\"collapse\">\t\t\t\t\t\t\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Kitchenwares<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Cookwares</a></li>\n");
      out.write("                                <li><a href=\"#\">Kitchen Tools</a></li>\n");
      out.write("                                <li><a href=\"#\">Dining</a></li>\n");
      out.write("                            </ul>\t\t\t\t\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Appliances<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Home Appliances</a></li>\n");
      out.write("                                <li><a href=\"#\">Kitchen Appliances</a></li>\n");
      out.write("                                <li><a href=\"#\">Large Appliances</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Furniture<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Bed/Sofa</a></li>\n");
      out.write("                                <li><a href=\"#\">Mattress</a></li>\n");
      out.write("                                <li><a href=\"#\">Fabrics</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \t\t\t\t\t\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Books<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"#\">Engineering</a></li>\n");
      out.write("                                <li><a href=\"#\">Novels</a></li>\n");
      out.write("                                <li><a href=\"#\">Magazines</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("            </ul>\t\t\t  \n");
      out.write("            <div class=\"side-bottom\">\n");
      out.write("                <div class=\"side-bottom-icons\">\n");
      out.write("                    <ul class=\"nav2\">\n");
      out.write("                        <li><a href=\"#\" class=\"facebook\"> </a></li>\n");
      out.write("                        <li><a href=\"#\" class=\"facebook twitter\"> </a></li>\n");
      out.write("                        <li><a href=\"#\" class=\"facebook chrome\"> </a></li>\n");
      out.write("                        <li><a href=\"#\" class=\"facebook dribbble\"> </a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"copyright\">\n");
      out.write("                    <p>Copyright © 2015 deMokart. All Rights Reserved | Design by <a href=\"#\">Rajeev Ranjan</a></p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\n");
      out.write("         <div class=\"heading-right\">\n");
      out.write("\t<a  href=\"#\" class=\"play-icon popup-with-zoom-anim\">BUY</a>\n");
      out.write("\t</div>\n");
      out.write("        ");

        String current=(String)session.getAttribute("currentkey"),itemcode=null;
        if(current==null || current.length()==0)
        {
            
            
      out.write("\n");
      out.write("            <div id=\"small-dialog7\">\n");
      out.write("                <h3>Blank Cart</h3>\n");
      out.write("                <div class=\"video-information-text\">\n");
      out.write("                    <p>SOrry, Currently cart is empty.aklhdsfksdahfklhasfh <br>you need to add item in cart to buy<p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");

        }
        else
        {
            int n1=0,n2=0,n3=0,n4=0,j=0,n=0;
            n=current.length();
            int i=0;
            Connection con=null;
            PreparedStatement ps=null;
            ResultSet rs=null;
            for(i=0;i<n;i=i+2)
                if(current.charAt(i)=='1')
                    n1++;
                else if(current.charAt(i)=='2')
                    n2++;
                else if(current.charAt(i)=='3')
                    n3++;
                else if(current.charAt(i)=='4')
                    n4++;
            
      out.write("\n");
      out.write("            <div class=\"main-grids\">        \n");
      out.write("            ");

            i=0;
            while(n1>0)
            {   
                
      out.write("\n");
      out.write("                <div class=\"top-grids\">\n");
      out.write("                    ");

                    if(i==0)
                    {
                        out.print("<div class=\"recommended-info\">");
                        out.print("<h3>Category : Fashion & lifeStyle</h3>");
                        out.print("</div>");
                    }
                    for(j=0;i<n && j<3;i=i+2,j++)
                    {
                        if(current.charAt(i)=='1')
                        {
                            n1--;
                            itemcode=current.substring(i, i+2);
                            int k=Integer.parseInt(itemcode)-9;
                            try		     
                            {
                            Class.forName("oracle.jdbc.OracleDriver");
                            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                            ps=con.prepareStatement("select * from fashion where code=?");
                            ps.setString(1,itemcode);
                            rs=ps.executeQuery();
                            rs.next();
                                 
                            
      out.write("\n");
      out.write("                        <div class=\"col-md-4 resent-grid recommended-grid slider-top-grids\">\n");
      out.write("                        <div class=\"resent-grid-img recommended-grid-img\">\n");
      out.write("                        <a href=\"#small-dialog6\" class=\"play-icon popup-with-zoom-anim\">\n");
      out.write("                        ");

                        String loc=new String("\"images/t"+k+".jpg\"");
                        out.println("<img src="+loc+">");
                            String itemname=rs.getString(2);
                            String itemdetails=rs.getString(3);
                            String itemprice=rs.getString(4);
                            String URL=new String("removeitem.jsp?itemcode="+itemcode);
                        
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"resent-grid-info recommended-grid-info\"><h3><a href=\"#\" class=\"title title-info\">\n");
      out.write("                        ");
 out.print(itemname+"    -   "+itemdetails+" "); 
      out.write("</a></h3>\n");
      out.write("                        ");

                            out.print("<ul>");                        
                            out.print("<li><p class=\"author author-info\">");
                        
      out.write("\n");
      out.write("                        <a href=\"");
 out.print(""+URL); 
      out.write("\" class=\"author\">Remove from cart</a>\n");
      out.write("                        ");

                            out.print("</p></li>");
                            out.print("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li>");
                            out.print("</ul>");
                        
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    ");

                            
                            
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
                
      out.write("\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                ");

            }
            
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"recommended\">\n");
      out.write("                <div class=\"recommended-grids\">\n");
      out.write("                    <div  id=\"top\" class=\"callbacks_container\">\n");
      out.write("                        \n");
      out.write("                        ");

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
                                    if(current.charAt(i)=='2')
                                    {                          
                                        n2--;
                                        itemcode=current.substring(i, i+2);
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
                                            String URL=new String("removeitem.jsp?itemcode="+itemcode);
                                            out.print(itemname+"    -   "+itemdetails+" ");
                                            out.print("</a></h5>");
                                            out.print("<div class=\"slid-bottom-grids\">");
                                            out.print("<div class=\"slid-bottom-grid\">");
                                            out.print("<p class=\"author author-info\">");
                                            
      out.write("\n");
      out.write("                                            <a href=\"");
 out.print(""+URL); 
      out.write("\" class=\"author\">Remove from cart</a>\n");
      out.write("                                            ");

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
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"recommended\">\n");
      out.write("                \n");
      out.write("                 ");

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
                        if(current.charAt(i)=='3')
                        {
                            n3--;
                            itemcode=current.substring(i, i+2);
                            int k=Integer.parseInt(itemcode)-29;
                            try		     
                            {
                            Class.forName("oracle.jdbc.OracleDriver");
                            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                            ps=con.prepareStatement("select * from audio where code=?");
                            ps.setString(1,itemcode);
                            rs=ps.executeQuery();
                            rs.next();
                            
      out.write("\n");
      out.write("                            <div class=\"col-md-3 resent-grid recommended-grid\">\n");
      out.write("                                <div class=\"resent-grid-img recommended-grid-img\">\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        ");
                                 
                            String location=new String("\"images/r"+k+".jpg\"");
                            out.print("<img src="+location+">");
                            
      out.write("                            \n");
      out.write("                                    </a>                            \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"resent-grid-info recommended-grid-info video-info-grid\">                                       \n");
      out.write("                                   <h5><a href=\"#\" class=\"title\">\n");
      out.write("                                        ");
  
                                String itemname=rs.getString(2);
                                String itemdetails=rs.getString(3);
                                String itemprice=rs.getString(4);
                                String URL=new String("removeitem.jsp?itemcode="+itemcode);
                                out.print(itemname+"    -   "+itemdetails+" ");                                
                                
      out.write("\n");
      out.write("                                       </a>\n");
      out.write("                                   </h5>                                                                              \n");
      out.write("                                ");
                                           
                                out.print("<ul><li><p class=\"author author-info\">");
                                
      out.write("\n");
      out.write("                                <a href=\"");
 out.print(""+URL); 
      out.write("\" class=\"author\">Remove from cart</a>\n");
      out.write("                                ");

                                out.print("</p></li>");
                                out.print("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li></ul>");
                                
      out.write("                                        \n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");

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
                
      out.write("\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"recommended\">\n");
      out.write("                ");

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
                        if(current.charAt(i)=='4')
                        {
                            n4--;
                            itemcode=current.substring(i, i+2);
                            int k=Integer.parseInt(itemcode)-39;
                            try		     
                            {
                                Class.forName("oracle.jdbc.OracleDriver");
                            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                            ps=con.prepareStatement("select * from electronics where code=?");
                            ps.setString(1,itemcode);
                            rs=ps.executeQuery();
                            rs.next();
                                
      out.write("\n");
      out.write("                                <div class=\"col-md-3 resent-grid recommended-grid\">\n");
      out.write("                                <div class=\"resent-grid-img recommended-grid-img\">\n");
      out.write("                                <a href=\"#small-dialog6\" class=\"play-icon popup-with-zoom-anim\">\n");
      out.write("                                ");

                                String loc=new String("\"images/g"+k+".jpg\"");
                                out.println("<img src="+loc+">");
                                
      out.write("\n");
      out.write("                                </a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"resent-grid-info recommended-grid-info video-info-grid\"><h5><a href=\"#\" class=\"title title-info\">\n");
      out.write("                                ");

                                    String itemname=rs.getString(2);
                                    String itemdetails=rs.getString(3);
                                    String itemprice=rs.getString(4);
                                    String URL=new String("removeitem.jsp?itemcode="+itemcode);
                                    out.println(itemname+"    -   "+itemdetails+" ");
                                
      out.write("\n");
      out.write("                                </a></h5>\n");
      out.write("\n");
      out.write("                                ");

                                    out.println("<ul><li><p class=\"author author-info\">"); 
                                    
      out.write("\n");
      out.write("                                <a href=\"");
 out.print(""+URL); 
      out.write("\" class=\"author\">Remove from cart</a>\n");
      out.write("                                ");

                                out.print("</p></li>");
                                    out.println("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li></ul>");
                                
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                                    ");

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
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("                ");

        }
        
      out.write("\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
