package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Set;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<a class=\"navbar-brand\" href=\"index.jsp\"><h1><img src=\"images/demokartlogo.jpg\" alt=\"logo\" /></h1></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"top-search\">\n");
      out.write("                <form class=\"navbar-form navbar-right\">\n");
      out.write("                    <input type=\"search\" class=\"form-control\" placeholder=\"I'm gonna find you and display you...\">\n");
      out.write("                    <input type=\"submit\" value=\" \">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"header-top-right\" >\n");
      out.write("                <div class=\"file\">\n");
      out.write("                    <a href=\"kart.jsp\">My Kart</a>\n");
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
      out.write("                <li class=\"active\"><a href=\"index.jsp\" class=\"home-icon\"><span class=\"glyphicon glyphicon-home\" aria-hidden=\"true\"></span>Home</a></li>\n");
      out.write("                <li><a href=\"#\" class=\"menu1\"><span class=\"glyphicon glyphicon-home glyphicon-gift\" aria-hidden=\"true\"></span>Fashion<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                    <ul>    \n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Men<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"fashion.jsp\">Clothing</a></li>\n");
      out.write("                                <li><a href=\"fashion.jsp\">Footwears</a></li>\n");
      out.write("                                <li><a href=\"fashion.jsp\">Watches</a></li>\n");
      out.write("                                <li><a href=\"fashion.jsp\">Accessories</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Women<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"fashion.jsp\">Clothing</a></li>\n");
      out.write("                                <li><a href=\"fahsion.jsp\">Footwears</a></li>\n");
      out.write("                                <li><a href=\"fashion.jsp\">Jewelleries</a></li>\n");
      out.write("                                <li><a href=\"fashion.jsp\">Accessories</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Kids<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"fahsion.jsp\">Clothing</a></li>\n");
      out.write("                                <li><a href=\"fashion.jsp\">Footwears</a></li>\n");
      out.write("                                <li><a href=\"fashion.jsp\">Care</a></li>\n");
      out.write("                                <li><a href=\"fashion.jsp\">Accessories</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \t\t\t\t\t\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Luggage<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"fashion.jsp\">Bagpacks</a></li>\n");
      out.write("                                <li><a href=\"fashion.jsp\">Strolley</a></li>\n");
      out.write("                                <li><a href=\"fashion.jsp\">Laptop Bags</a></li>\n");
      out.write("                                <li><a href=\"fashion.jsp\">RuckSacks</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#second\" class=\"menu2\"><span class=\"glyphicon glyphicon-film glyphicon-phone\" aria-hidden=\"true\"></span>Electronics<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                    <ul id=\"second\" class=\"collapse\">\t\t\t\t\t\t\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Mobiles and Accessories<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"electronics\">Mobiles</a></li>\n");
      out.write("                                <li><a href=\"electronics\">Tablets</a></li>\n");
      out.write("                                <li><a href=\"electronics\">Accessories</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;TV Audios Videos<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"electronics\">TV</a></li>\n");
      out.write("                                <li><a href=\"electronics\">Audio</a></li>\n");
      out.write("                                <li><a href=\"electronics\">Movies</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Appliances<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"electronics\">Large Appliances</a></li>\n");
      out.write("                                <li><a href=\"electronics\">Home Appliances</a></li>\n");
      out.write("                                <li><a href=\"electronics\">Kitchen Appliances</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \t\t\t\t\t\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Automotive<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\t\t\t\t\n");
      out.write("                                <li><a href=\"electronics\">Car Accessories</a></li>\n");
      out.write("                                <li><a href=\"electronics\">Bike Accessories</a></li>\n");
      out.write("                                <li><a href=\"electronics\">Spareparts</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#third\" class=\"menu3\"><span class=\"glyphicon glyphicon-film glyphicon-cutlery\" aria-hidden=\"true\"></span>Home Needs<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                    <ul id=\"third\" class=\"collapse\">\t\t\t\t\t\t\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Kitchenwares<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"homeneed.jsp\">Cookwares</a></li>\n");
      out.write("                                <li><a href=\"homeneed.jsp\">Kitchen Tools</a></li>\n");
      out.write("                                <li><a href=\"homeneed.jsp\">Dining</a></li>\n");
      out.write("                            </ul>\t\t\t\t\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Appliances<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"homeneed.jsp\">Home Appliances</a></li>\n");
      out.write("                                <li><a href=\"homeneed.jsp\">Kitchen Appliances</a></li>\n");
      out.write("                                <li><a href=\"homeneed.jsp\">Large Appliances</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Furniture<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"homeneed.jsp\">Bed/Sofa</a></li>\n");
      out.write("                                <li><a href=\"homeneed.jsp\">Mattress</a></li>\n");
      out.write("                                <li><a href=\"homeneed.jsp\">Fabrics</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li> \t\t\t\t\t\n");
      out.write("                        <li><a href=\"#\"><span class=\"glyphicon glyphicon-pushpin\" aria-hidden=\"true\"></span>&nbsp;Books<span class=\"glyphicon glyphicon-menu-down\" aria-hidden=\"true\"></span></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"homeneed.jsp\">Engineering</a></li>\n");
      out.write("                                <li><a href=\"homeneed.jsp\">Novels</a></li>\n");
      out.write("                                <li><a href=\"homeneed.jsp\">Magazines</a></li>\n");
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
      out.write("        <div class=\"main-grids\">\n");
      out.write("            <div class=\"top-grids\">\n");
      out.write("                <div class=\"recommended-info\">\n");
      out.write("                    <h3><a href=\"#\">Fashion & Lifestyle</a></h3>\n");
      out.write("                </div>\n");
      out.write("                ");

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
                        
      out.write("\n");
      out.write("                        <div class=\"col-md-4 resent-grid recommended-grid slider-top-grids\">\n");
      out.write("                        <div class=\"resent-grid-img recommended-grid-img\">\n");
      out.write("                        <a href=\"#small-dialog6\" class=\"play-icon popup-with-zoom-anim\">\n");
      out.write("                        ");

                        String loc=new String("\"images/t"+i+".jpg\"");
                        out.println("<img src="+loc+">");
                        String itemcode=rs.getString(1);
                        String itemname=rs.getString(2);
                        String itemdetails=rs.getString(3);
                        String itemprice=rs.getString(4);
                        String URL=new String("additem.jsp?itemcode="+itemcode);
                        
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"resent-grid-info recommended-grid-info\"><h3><a href=\"");
 out.print(""+URL); 
      out.write("\" class=\"title title-info\">\n");
      out.write("                        ");
 out.print(itemname+"    -   "+itemdetails+" "); 
      out.write("</a></h3>\n");
      out.write("                        ");

                            out.print("<ul>");                        
                            out.print("<li><p class=\"author author-info\">");
                        
      out.write("\n");
      out.write("                        <a href=\"");
 out.print(""+URL); 
      out.write("\" class=\"author\">Add to cart</a>\n");
      out.write("                        ");

                            out.print("</p></li>");
                            out.print("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li>");
                            out.print("</ul>");
                        
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    ");

                    }
                    con.close();
                    ps.close();
                    rs.close();
                    }
                    catch(Exception e1)
                    {
                        System.out.println(e1.toString());
                    }
                
      out.write("\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"recommended\">\n");
      out.write("                <div class=\"recommended-grids\">\n");
      out.write("                    <div class=\"recommended-info\">\n");
      out.write("                        <h3><a href=\"#\">Recommended Videos Collection</a></h3>\n");
      out.write("                    </div>\n");
      out.write("                    <script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("                    <script>\n");
      out.write("                        // You can also use \"$(window).load(function() {\"\n");
      out.write("\t\t\t$(function () {\n");
      out.write("\t\t\t// Slideshow 4\n");
      out.write("                        $(\"#slider3\").responsiveSlides({\n");
      out.write("                            auto: true,\n");
      out.write("                            pager: false,\n");
      out.write("                            nav: true,\n");
      out.write("                            speed: 500,\n");
      out.write("                            namespace: \"callbacks\",\n");
      out.write("                            before: function () {\n");
      out.write("                                $('.events').append(\"<li>before event fired.</li>\");\n");
      out.write("                            },\n");
      out.write("                            after: function () {\n");
      out.write("                                $('.events').append(\"<li>after event fired.</li>\");\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("                    </script>\n");
      out.write("                    <div  id=\"top\" class=\"callbacks_container\">\n");
      out.write("                        <ul class=\"rslides\" id=\"slider3\">\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"animated-grids\">\n");
      out.write("                                ");
 
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
                                                
      out.write("\n");
      out.write("                                                <a href=\"");
 out.print(""+URL); 
      out.write("\" class=\"author\">Add to cart</a>\n");
      out.write("                                                ");

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
                                
      out.write("\n");
      out.write("                                    <div class=\"clearfix\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                \n");
      out.write("                                <div class=\"animated-grids\">\n");
      out.write("                               \n");
      out.write("                                ");
 
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
                                                
      out.write("\n");
      out.write("                                            <a href=\"");
 out.print(""+URL); 
      out.write("\" class=\"author\">Add to cart</a>\n");
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
                                    con.close();
                                    ps.close();
                                    rs.close();
                                    
                                    }catch(Exception e1)
                                    {
                                        System.out.println(e1.toString()+" hello viseo"+k);
                                    } 
                                
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"clearfix\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"animated-grids\">\n");
      out.write("                                ");
 
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
                                                
      out.write("\n");
      out.write("                        <a href=\"");
 out.print(""+URL); 
      out.write("\" class=\"author\">Add to cart</a>\n");
      out.write("                        ");

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
                                
      out.write("\n");
      out.write("                                \n");
      out.write("                                    \n");
      out.write("                                    <div class=\"clearfix\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"animated-grids\">\n");
      out.write("                                    ");
 
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
                                                
      out.write("\n");
      out.write("                        <a href=\"");
 out.print(""+URL); 
      out.write("\" class=\"author\">Add to cart</a>\n");
      out.write("                        ");

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
                                
      out.write("\n");
      out.write("                                    <div class=\"clearfix\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"recommended\">\n");
      out.write("                <div class=\"recommended-grids\">\t\t\t\t\t\n");
      out.write("                    <div class=\"recommended-info\">\n");
      out.write("                        <h3><b><a href=\"#\">Recommended Audios Collection</a></b></h3>\n");
      out.write("                    </div>\n");
      out.write("                    ");

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
                                
      out.write("\n");
      out.write("                                <div class=\"col-md-3 resent-grid recommended-grid\">\n");
      out.write("                                    <div class=\"resent-grid-img recommended-grid-img\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                ");
 
                                
                                String location=new String("\"images/r"+k+".jpg\"");
                                out.print("<img src="+location+">");
                                
      out.write("\n");
      out.write("                                       \n");
      out.write("                                        </a>                            \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"resent-grid-info recommended-grid-info video-info-grid\">\n");
      out.write("                                        <h5><a href=\"#\" class=\"title\">\n");
      out.write("                                ");
  
                                i=2;
                                String itemcode=rs.getString(1);
                                
                                String itemname=rs.getString(2);
                                String itemdetails=rs.getString(3);
                                String itemprice=rs.getString(4);
                                String URL=new String("additem.jsp?itemcode="+itemcode);
                                out.print(itemname+"    -   "+itemdetails+" ");
                                
                                
      out.write("\n");
      out.write("                                            </a>\n");
      out.write("                                        </h5>\n");
      out.write("                                                                              \n");
      out.write("                                ");
                                           
                                out.print("<ul><li><p class=\"author author-info\">");
                                
      out.write("\n");
      out.write("                        <a href=\"");
 out.print(""+URL); 
      out.write("\" class=\"author\">Add to cart</a>\n");
      out.write("                        ");

                                out.print("</p></li>");
                                out.print("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li></ul>");
                                
      out.write("\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");

                            }
                            i=5;                       
                        }
                        catch(Exception e1)
                        {
                            System.out.println(e1.toString()+"hello sudio"+i);
                        }
                        
      out.write("\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"recommended-grids\">\n");
      out.write("                    ");

                        i=0;
                        try                       
                        {
                            for(k=4;k<=7 && rs.next();k++)
                            {
                                
      out.write("\n");
      out.write("                                <div class=\"col-md-3 resent-grid recommended-grid\">\n");
      out.write("                                    <div class=\"resent-grid-img recommended-grid-img\">\n");
      out.write("                                        <a href=\"#\">\n");
      out.write("                                ");
 
                                String location=new String("\"images/r"+k+".jpg\"");
                                out.print("<img src="+location+">");
                                
      out.write("\n");
      out.write("                                       \n");
      out.write("                                        </a>                            \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"resent-grid-info recommended-grid-info video-info-grid\">\n");
      out.write("                                        <h5><a href=\"#\" class=\"title\">\n");
      out.write("                                ");
  
                                i=2;
                                String itemcode=rs.getString(1);
                                
                                String itemname=rs.getString(2);
                                String itemdetails=rs.getString(3);
                                String itemprice=rs.getString(4);
                                String URL=new String("additem.jsp?itemcode="+itemcode);
                                out.print(itemname+"    -   "+itemdetails+" ");
                                
                                
      out.write("\n");
      out.write("                                            </a>\n");
      out.write("                                        </h5>\n");
      out.write("                                                                             \n");
      out.write("                                ");
                                           
                                out.print("<ul><li><p class=\"author author-info\">");
                              
      out.write("\n");
      out.write("                                <a href=\"");
 out.print(""+URL); 
      out.write("\" class=\"author\">Add to cart</a>\n");
      out.write("                                ");

                                out.print("</p></li>");
                                out.print("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li></ul>");
                                
      out.write("\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");

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
                        
      out.write("\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"recommended\">\n");
      out.write("                <div class=\"recommended-grids\">\n");
      out.write("                    <div class=\"recommended-info\">\n");
      out.write("                        <h3>Electronics and Appliances</h3>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                    i=0;
                    try		     
                    {
                    Class.forName("oracle.jdbc.OracleDriver");
                    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                    ps=con.prepareStatement("select * from electronics");
                    rs=ps.executeQuery();
                    for(i=1;i<=4 && rs.next() ;i++)
                    {
                        
      out.write("\n");
      out.write("                        <div class=\"col-md-3 resent-grid recommended-grid\">\n");
      out.write("                        <div class=\"resent-grid-img recommended-grid-img\">\n");
      out.write("                        <a href=\"#small-dialog6\" class=\"play-icon popup-with-zoom-anim\">\n");
      out.write("                        ");

                        String loc=new String("\"images/g"+i+".jpg\"");
                        out.println("<img src="+loc+">");
                        
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"resent-grid-info recommended-grid-info video-info-grid\"><h5><a href=\"#\" class=\"title title-info\">\n");
      out.write("                        ");

                            String itemcode=rs.getString(1);
                            String itemname=rs.getString(2);
                            String itemdetails=rs.getString(3);
                            String itemprice=rs.getString(4);
                            String URL=new String("additem.jsp?itemcode="+itemcode);
                            out.println(itemname+"    -   "+itemdetails+" ");
                        
      out.write("\n");
      out.write("                        </a></h5>\n");
      out.write("                        \n");
      out.write("                        ");

                            out.println("<ul><li><p class=\"author author-info\">");
                            
      out.write("\n");
      out.write("                        <a href=\"");
 out.print(""+URL); 
      out.write("\" class=\"author\">Add to cart</a>\n");
      out.write("                        ");

                            out.print("</p></li>");
                            out.println("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li></ul>  ");
                        
      out.write("               \n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    ");

                    }
                    con.close();
                    ps.close();
                    rs.close();
                    }
                    catch(Exception e1)
                    {
                        System.out.println(e1.toString());
                    }
                
      out.write("\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"recommended-grids\">\n");
      out.write("                    ");

                   
                    try		     
                    {
                    Class.forName("oracle.jdbc.OracleDriver");
                    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","iamthewinner");
                    ps=con.prepareStatement("select * from electronics");
                    rs=ps.executeQuery();
                    for(i=5;i<=8 && rs.next() ;i++)
                    {
                        
      out.write("\n");
      out.write("                        <div class=\"col-md-3 resent-grid recommended-grid\">\n");
      out.write("                        <div class=\"resent-grid-img recommended-grid-img\">\n");
      out.write("                        <a href=\"#small-dialog6\" class=\"play-icon popup-with-zoom-anim\">\n");
      out.write("                        ");

                        String loc=new String("\"images/g"+i+".jpg\"");
                        out.println("<img src="+loc+">");
                        
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"resent-grid-info recommended-grid-info video-info-grid\"><h5><a href=\"#\" class=\"title title-info\">\n");
      out.write("                        ");

                            String itemcode=rs.getString(1);
                            String itemname=rs.getString(2);
                            String itemdetails=rs.getString(3);
                            String itemprice=rs.getString(4);
                            String URL=new String("additem.jsp?itemcode="+itemcode);
                            out.println(itemname+"    -   "+itemdetails+" ");
                        
      out.write("\n");
      out.write("                        </a></h5>\n");
      out.write("                       \n");
      out.write("                        ");

                            out.println("<ul><li><p class=\"author author-info\">"); 
                            
      out.write("\n");
      out.write("                        <a href=\"");
 out.print(""+URL); 
      out.write("\" class=\"author\">Add to cart</a>\n");
      out.write("                        ");

                        out.print("</p></li>");
                            out.println("<li class=\"right-list\"><p class=\"views views-info\"> Rs "+itemprice+"</p></li></ul>");
                        
      out.write("\n");
      out.write("                                       \n");
      out.write("                        </div>\n");
      out.write("                        </div>\n");
      out.write("                    ");

                    }
                    con.close();
                    ps.close();
                    rs.close();
                    }
                    catch(Exception e1)
                    {
                        System.out.println(e1.toString());
                    }
                
      out.write("\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div class=\"footer-grids\">\n");
      out.write("                <div class=\"footer-top\">\n");
      out.write("                    <div class=\"footer-top-nav\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"about.html\">About</a></li>\n");
      out.write("                            <li><a href=\"press.html\">Press</a></li>\n");
      out.write("                            <li><a href=\"copyright.html\">Copyright</a></li>\n");
      out.write("                            <li><a href=\"creators.html\">Creators</a></li>\n");
      out.write("                            <li><a href=\"#\">Advertise</a></li>\n");
      out.write("                            <li><a href=\"developers.html\">Developers</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-bottom-nav\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"terms.html\">Terms</a></li>\n");
      out.write("                            <li><a href=\"privacy.html\">Privacy</a></li>\n");
      out.write("                            <li><a href=\"#small-dialog4\" class=\"play-icon popup-with-zoom-anim\">Send feedback</a></li>\n");
      out.write("                            <li><a href=\"privacy.html\">Policy & Safety </a></li>\n");
      out.write("                            <li><a href=\"try.html\">Try something new!</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer-bottom\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"languages\">\n");
      out.write("                            <select class=\"form-control bfh-countries\" data-country=\"US\">\n");
      out.write("                                <option value=\"\">Select Language</option>\n");
      out.write("                                <option>Spanish</option>\n");
      out.write("                                <option>French</option>\n");
      out.write("                                <option>German</option>\n");
      out.write("                                <option>Italian</option>\n");
      out.write("                                <option>Chinese</option>\n");
      out.write("                                <option>Tagalog</option>\n");
      out.write("                                <option>Polish</option>\n");
      out.write("                                <option>Korean</option>\n");
      out.write("                                <option>Vietnamese</option>\n");
      out.write("                                <option>Portuguese</option>\n");
      out.write("                                <option>Japanese</option>\n");
      out.write("                                <option>Greek</option>\n");
      out.write("                                <option>Arabic</option>\n");
      out.write("                                <option>Hindi (urdu)</option>\n");
      out.write("                                <option>Russian</option>\n");
      out.write("                                <option>Yiddish</option>\n");
      out.write("                                <option>Thai (laotian)</option>\n");
      out.write("                                <option>Persian</option>\n");
      out.write("                                <option>French Creole</option>\n");
      out.write("                                <option>Armenian</option>\n");
      out.write("                                <option>Navaho</option>\n");
      out.write("                                <option>Hungarian</option>\n");
      out.write("                                <option>Hebrew</option>\n");
      out.write("                                <option>Dutch</option>\n");
      out.write("                                <option>Mon-khmer (cambodian)</option>\n");
      out.write("                                <option>Gujarathi</option>\n");
      out.write("                                <option>Ukrainian</option>\n");
      out.write("                                <option>Czech</option>\n");
      out.write("                                <option>Pennsylvania Dutch</option>\n");
      out.write("                                <option>Miao (hmong)</option>\n");
      out.write("                                <option>Norwegian</option>\n");
      out.write("                                <option>Slovak</option>\n");
      out.write("                                <option>Swedish</option>\n");
      out.write("                                <option>Serbocroatian</option>\n");
      out.write("                                <option>Kru</option>\n");
      out.write("                                <option>Rumanian</option>\n");
      out.write("                                <option>Lithuanian</option>\n");
      out.write("                                <option>Finnish</option>\n");
      out.write("                                <option>Panjabi</option>\n");
      out.write("                                <option>Formosan</option>\n");
      out.write("                                <option>Croatian</option>\n");
      out.write("                                <option>Turkish</option>\n");
      out.write("                                <option>Ilocano</option>\n");
      out.write("                                <option>Bengali</option>\n");
      out.write("                                <option>Danish</option>\n");
      out.write("                                <option>Syriac</option>\t\t\t\n");
      out.write("                                <option>Samoan</option>\n");
      out.write("                                <option>Malayalam</option>\n");
      out.write("                                <option>Cajun</option>\n");
      out.write("                                <option>Amharic</option>\n");
      out.write("                            </select>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"languages\">\n");
      out.write("                            <select class=\"form-control bfh-countries\">\n");
      out.write("                                <option value=\"\">Select Country</option>\n");
      out.write("                                <option value=\"AFG\">Afghanistan</option>\n");
      out.write("                                <option value=\"ALA\">Åland Islands</option>\n");
      out.write("                                <option value=\"ALB\">Albania</option>\n");
      out.write("                                <option value=\"DZA\">Algeria</option>\n");
      out.write("                                <option value=\"ASM\">American Samoa</option>\n");
      out.write("                                <option value=\"AND\">Andorra</option>\t\t\t\t\t\t\t\n");
      out.write("                                <option value=\"AGO\">Angola</option>\n");
      out.write("                                <option value=\"AIA\">Anguilla</option>\n");
      out.write("                                <option value=\"ATA\">Antarctica</option>\n");
      out.write("                                <option value=\"ATG\">Antigua and Barbuda</option>\n");
      out.write("                                <option value=\"ARG\">Argentina</option>\n");
      out.write("                                <option value=\"ARM\">Armenia</option>\n");
      out.write("                                <option value=\"ABW\">Aruba</option>\n");
      out.write("                                <option value=\"AUS\">Australia</option>\n");
      out.write("                                <option value=\"AUT\">Austria</option>\n");
      out.write("                                <option value=\"AZE\">Azerbaijan</option>\n");
      out.write("                                <option value=\"BHS\">Bahamas</option>\n");
      out.write("                                <option value=\"BHR\">Bahrain</option>\n");
      out.write("                                <option value=\"BGD\">Bangladesh</option>\n");
      out.write("                                <option value=\"BRB\">Barbados</option>\n");
      out.write("                                <option value=\"BLR\">Belarus</option>\n");
      out.write("                                <option value=\"BEL\">Belgium</option>\n");
      out.write("                                <option value=\"BLZ\">Belize</option>\t\t\t\t\t\t\t\t\n");
      out.write("                                <option value=\"BEN\">Benin</option>\n");
      out.write("                                <option value=\"BMU\">Bermuda</option>\n");
      out.write("                                <option value=\"BTN\">Bhutan</option>\n");
      out.write("                                <option value=\"BOL\">Bolivia, Plurinational State of</option>\n");
      out.write("                                <option value=\"BES\">Bonaire, Sint Eustatius and Saba</option>\n");
      out.write("                                <option value=\"BIH\">Bosnia and Herzegovina</option>\n");
      out.write("                                <option value=\"BWA\">Botswana</option>\n");
      out.write("                                <option value=\"BVT\">Bouvet Island</option>\n");
      out.write("                                <option value=\"BRA\">Brazil</option>\n");
      out.write("                                <option value=\"IOT\">British Indian Ocean Territory</option>\n");
      out.write("                                <option value=\"BRN\">Brunei Darussalam</option>\n");
      out.write("                                <option value=\"BGR\">Bulgaria</option>\n");
      out.write("                                <option value=\"BFA\">Burkina Faso</option>\n");
      out.write("                                <option value=\"BDI\">Burundi</option>\n");
      out.write("                                <option value=\"KHM\">Cambodia</option>\n");
      out.write("                                <option value=\"CMR\">Cameroon</option>\n");
      out.write("                                <option value=\"CAN\">Canada</option>\n");
      out.write("                                <option value=\"CPV\">Cape Verde</option>                                                              \n");
      out.write("                                <option value=\"CYM\">Cayman Islands</option>\t\n");
      out.write("                                <option value=\"CAF\">Central African Republic</option>\n");
      out.write("                                <option value=\"TCD\">Chad</option>\n");
      out.write("                                <option value=\"CHL\">Chile</option>\n");
      out.write("                                <option value=\"CHN\">China</option>\n");
      out.write("                                <option value=\"CXR\">Christmas Island</option>\n");
      out.write("                                <option value=\"CCK\">Cocos (Keeling) Islands</option>\n");
      out.write("                                <option value=\"COL\">Colombia</option>\n");
      out.write("                                <option value=\"COM\">Comoros</option>\n");
      out.write("                                <option value=\"COG\">Congo</option>\n");
      out.write("                                <option value=\"COD\">Congo, the Democratic Republic of the</option>\n");
      out.write("                                <option value=\"COK\">Cook Islands</option>\n");
      out.write("                                <option value=\"CRI\">Costa Rica</option>\n");
      out.write("                                <option value=\"CIV\">Côte d'Ivoire</option>\n");
      out.write("                                <option value=\"HRV\">Croatia</option>\n");
      out.write("                                <option value=\"CUB\">Cuba</option>\n");
      out.write("                                <option value=\"CUW\">Curaçao</option>\n");
      out.write("                                <option value=\"CYP\">Cyprus</option>\n");
      out.write("                                <option value=\"CZE\">Czech Republic</option>\n");
      out.write("                                <option value=\"DNK\">Denmark</option>\n");
      out.write("                                <option value=\"DJI\">Djibouti</option>\n");
      out.write("                                <option value=\"DMA\">Dominica</option>\n");
      out.write("                                <option value=\"DOM\">Dominican Republic</option>\n");
      out.write("                                <option value=\"ECU\">Ecuador</option>\n");
      out.write("                                <option value=\"EGY\">Egypt</option>\n");
      out.write("                                <option value=\"SLV\">El Salvador</option>\n");
      out.write("                                <option value=\"GNQ\">Equatorial Guinea</option>\n");
      out.write("                                <option value=\"ERI\">Eritrea</option>\n");
      out.write("                                <option value=\"EST\">Estonia</option>\n");
      out.write("                                <option value=\"ETH\">Ethiopia</option>\n");
      out.write("                                <option value=\"FLK\">Falkland Islands (Malvinas)</option>\n");
      out.write("                                <option value=\"FRO\">Faroe Islands</option>\n");
      out.write("                                <option value=\"FJI\">Fiji</option>\n");
      out.write("                                <option value=\"FIN\">Finland</option>\n");
      out.write("                                <option value=\"FRA\">France</option>\n");
      out.write("                                <option value=\"GUF\">French Guiana</option>\n");
      out.write("                                <option value=\"PYF\">French Polynesia</option>\n");
      out.write("                                <option value=\"ATF\">French Southern Territories</option>\n");
      out.write("                                <option value=\"GAB\">Gabon</option>\n");
      out.write("                                <option value=\"GMB\">Gambia</option>\n");
      out.write("                                <option value=\"GEO\">Georgia</option>\n");
      out.write("                                <option value=\"DEU\">Germany</option>\n");
      out.write("                                <option value=\"GHA\">Ghana</option>\n");
      out.write("                                <option value=\"GIB\">Gibraltar</option>\n");
      out.write("                                <option value=\"GRC\">Greece</option>\n");
      out.write("                                <option value=\"GRL\">Greenland</option>\n");
      out.write("                                <option value=\"GRD\">Grenada</option>\n");
      out.write("                                <option value=\"GLP\">Guadeloupe</option>\t\t\t\n");
      out.write("                                <option value=\"GUM\">Guam</option>\n");
      out.write("                                <option value=\"GTM\">Guatemala</option>\n");
      out.write("                                <option value=\"GGY\">Guernsey</option>\n");
      out.write("                                <option value=\"GIN\">Guinea</option>\n");
      out.write("                                <option value=\"GNB\">Guinea-Bissau</option>\n");
      out.write("                                <option value=\"GUY\">Guyana</option>\n");
      out.write("                                <option value=\"HTI\">Haiti</option>\n");
      out.write("                                <option value=\"HMD\">Heard Island and McDonald Islands</option>\n");
      out.write("                                <option value=\"VAT\">Holy See (Vatican City State)</option>\n");
      out.write("                                <option value=\"HND\">Honduras</option>\n");
      out.write("                                <option value=\"HKG\">Hong Kong</option>\n");
      out.write("                                <option value=\"HUN\">Hungary</option>\n");
      out.write("                                <option value=\"ISL\">Iceland</option>\n");
      out.write("                                <option value=\"IND\">India</option>\n");
      out.write("                                <option value=\"IDN\">Indonesia</option>\n");
      out.write("                                <option value=\"IRN\">Iran, Islamic Republic of</option>\n");
      out.write("                                <option value=\"IRQ\">Iraq</option>\n");
      out.write("                                <option value=\"IRL\">Ireland</option>\n");
      out.write("                                <option value=\"IMN\">Isle of Man</option>\n");
      out.write("                                <option value=\"ISR\">Israel</option>\n");
      out.write("                                <option value=\"ITA\">Italy</option>\n");
      out.write("                                <option value=\"JAM\">Jamaica</option>\n");
      out.write("                                <option value=\"JPN\">Japan</option>\n");
      out.write("                                <option value=\"JEY\">Jersey</option>\n");
      out.write("                                <option value=\"JOR\">Jordan</option>\n");
      out.write("                                <option value=\"KAZ\">Kazakhstan</option>\n");
      out.write("                                <option value=\"KEN\">Kenya</option>\n");
      out.write("                                <option value=\"KIR\">Kiribati</option>\n");
      out.write("                                <option value=\"PRK\">Korea, Democratic People's Republic of</option>\n");
      out.write("                                <option value=\"KOR\">Korea, Republic of</option>\n");
      out.write("                                <option value=\"KWT\">Kuwait</option>\n");
      out.write("                                <option value=\"KGZ\">Kyrgyzstan</option>\n");
      out.write("                                <option value=\"LAO\">Lao People's Democratic Republic</option>\n");
      out.write("                                <option value=\"LVA\">Latvia</option>\n");
      out.write("                                <option value=\"LBN\">Lebanon</option>\n");
      out.write("                                <option value=\"LSO\">Lesotho</option>\n");
      out.write("                                <option value=\"LBR\">Liberia</option>\n");
      out.write("                                <option value=\"LBY\">Libya</option>\n");
      out.write("                                <option value=\"LIE\">Liechtenstein</option>\n");
      out.write("                                <option value=\"LTU\">Lithuania</option>\n");
      out.write("                                <option value=\"LUX\">Luxembourg</option>\n");
      out.write("                                <option value=\"MAC\">Macao</option>\n");
      out.write("                                <option value=\"MKD\">Macedonia, the former Yugoslav Republic of</option>\n");
      out.write("                                <option value=\"MDG\">Madagascar</option>\n");
      out.write("                                <option value=\"MWI\">Malawi</option>\n");
      out.write("                                <option value=\"MYS\">Malaysia</option>\n");
      out.write("                                <option value=\"MDV\">Maldives</option>\n");
      out.write("                                <option value=\"MLI\">Mali</option>\n");
      out.write("                                <option value=\"MLT\">Malta</option>\n");
      out.write("                                <option value=\"MHL\">Marshall Islands</option>\n");
      out.write("                                <option value=\"MTQ\">Martinique</option>\n");
      out.write("                                <option value=\"MRT\">Mauritania</option>\n");
      out.write("                                <option value=\"MUS\">Mauritius</option>\n");
      out.write("                                <option value=\"MYT\">Mayotte</option>\n");
      out.write("                                <option value=\"MEX\">Mexico</option>\n");
      out.write("                                <option value=\"FSM\">Micronesia, Federated States of</option>\n");
      out.write("                                <option value=\"MDA\">Moldova, Republic of</option>\n");
      out.write("                                <option value=\"MCO\">Monaco</option>\n");
      out.write("                                <option value=\"MNG\">Mongolia</option>\n");
      out.write("                                <option value=\"MNE\">Montenegro</option>\n");
      out.write("                                <option value=\"MSR\">Montserrat</option>\n");
      out.write("                                <option value=\"MAR\">Morocco</option>\n");
      out.write("                                <option value=\"MOZ\">Mozambique</option>\n");
      out.write("                                <option value=\"MMR\">Myanmar</option>\n");
      out.write("                                <option value=\"NAM\">Namibia</option>\n");
      out.write("                                <option value=\"NRU\">Nauru</option>\n");
      out.write("                                <option value=\"NPL\">Nepal</option>\n");
      out.write("                                <option value=\"NLD\">Netherlands</option>\n");
      out.write("                                <option value=\"NCL\">New Caledonia</option>\n");
      out.write("                                <option value=\"NZL\">New Zealand</option>\n");
      out.write("                                <option value=\"NIC\">Nicaragua</option>\n");
      out.write("                                <option value=\"NER\">Niger</option>\n");
      out.write("                                <option value=\"NGA\">Nigeria</option>\n");
      out.write("                                <option value=\"NIU\">Niue</option>\n");
      out.write("                                <option value=\"NFK\">Norfolk Island</option>\n");
      out.write("                                <option value=\"MNP\">Northern Mariana Islands</option>\n");
      out.write("                                <option value=\"NOR\">Norway</option>\n");
      out.write("                                <option value=\"OMN\">Oman</option>\n");
      out.write("                                <option value=\"PAK\">Pakistan</option>\n");
      out.write("                                <option value=\"PLW\">Palau</option>\n");
      out.write("                                <option value=\"PSE\">Palestinian Territory, Occupied</option>\n");
      out.write("                                <option value=\"PAN\">Panama</option>\n");
      out.write("                                <option value=\"PNG\">Papua New Guinea</option>\n");
      out.write("                                <option value=\"PRY\">Paraguay</option>\n");
      out.write("                                <option value=\"PER\">Peru</option>\n");
      out.write("                                <option value=\"PHL\">Philippines</option>\n");
      out.write("                                <option value=\"PCN\">Pitcairn</option>\n");
      out.write("                                <option value=\"POL\">Poland</option>\n");
      out.write("                                <option value=\"PRT\">Portugal</option>\n");
      out.write("                                <option value=\"PRI\">Puerto Rico</option>                                \n");
      out.write("                                <option value=\"QAT\">Qatar</option>\n");
      out.write("                                <option value=\"REU\">Réunion</option>\n");
      out.write("                                <option value=\"ROU\">Romania</option>\n");
      out.write("                                <option value=\"RUS\">Russian Federation</option>\n");
      out.write("                                <option value=\"RWA\">Rwanda</option>\n");
      out.write("                                <option value=\"BLM\">Saint Barthélemy</option>\n");
      out.write("                                <option value=\"SHN\">Saint Helena, Ascension and Tristan da Cunha</option>\n");
      out.write("                                <option value=\"KNA\">Saint Kitts and Nevis</option>\n");
      out.write("                                <option value=\"LCA\">Saint Lucia</option>\n");
      out.write("                                <option value=\"MAF\">Saint Martin (French part)</option>\n");
      out.write("                                <option value=\"SPM\">Saint Pierre and Miquelon</option>\n");
      out.write("                                <option value=\"VCT\">Saint Vincent and the Grenadines</option>\n");
      out.write("                                <option value=\"WSM\">Samoa</option>\n");
      out.write("                                <option value=\"SMR\">San Marino</option>\n");
      out.write("                                <option value=\"STP\">Sao Tome and Principe</option>\n");
      out.write("                                <option value=\"SAU\">Saudi Arabia</option>\n");
      out.write("                                <option value=\"SEN\">Senegal</option>\n");
      out.write("                                <option value=\"SRB\">Serbia</option>\n");
      out.write("                                <option value=\"SYC\">Seychelles</option>\n");
      out.write("                                <option value=\"SLE\">Sierra Leone</option>\n");
      out.write("                                <option value=\"SGP\">Singapore</option>\n");
      out.write("                                <option value=\"SXM\">Sint Maarten (Dutch part)</option>\n");
      out.write("                                <option value=\"SVK\">Slovakia</option>\n");
      out.write("                                <option value=\"SVN\">Slovenia</option>\n");
      out.write("                                <option value=\"SLB\">Solomon Islands</option>\n");
      out.write("                                <option value=\"SOM\">Somalia</option>\n");
      out.write("                                <option value=\"ZAF\">South Africa</option>\n");
      out.write("                                <option value=\"SGS\">South Georgia and the South Sandwich Islands</option>\n");
      out.write("                                <option value=\"SSD\">South Sudan</option>\n");
      out.write("                                <option value=\"ESP\">Spain</option>\n");
      out.write("                                <option value=\"LKA\">Sri Lanka</option>\n");
      out.write("                                <option value=\"SDN\">Sudan</option>\n");
      out.write("                                <option value=\"SUR\">Suriname</option>\n");
      out.write("                                <option value=\"SJM\">Svalbard and Jan Mayen</option>\n");
      out.write("                                <option value=\"SWZ\">Swaziland</option>\n");
      out.write("                                <option value=\"SWE\">Sweden</option>\n");
      out.write("                                <option value=\"CHE\">Switzerland</option>\n");
      out.write("                                <option value=\"SYR\">Syrian Arab Republic</option>\t\t\t\t\t\t\t\t\t<option value=\"TWN\">Taiwan, Province of China</option>\n");
      out.write("                                <option value=\"TJK\">Tajikistan</option>\n");
      out.write("                                <option value=\"TZA\">Tanzania, United Republic of</option>\n");
      out.write("                                <option value=\"THA\">Thailand</option>\n");
      out.write("                                <option value=\"TLS\">Timor-Leste</option>\n");
      out.write("                                <option value=\"TGO\">Togo</option>\n");
      out.write("                                <option value=\"TKL\">Tokelau</option>\n");
      out.write("                                <option value=\"TON\">Tonga</option>\n");
      out.write("                                <option value=\"TTO\">Trinidad and Tobago</option>\n");
      out.write("                                <option value=\"TUN\">Tunisia</option>\n");
      out.write("                                <option value=\"TUR\">Turkey</option>\n");
      out.write("                                <option value=\"TKM\">Turkmenistan</option>\n");
      out.write("                                <option value=\"TCA\">Turks and Caicos Islands</option>\n");
      out.write("                                <option value=\"TUV\">Tuvalu</option>\n");
      out.write("                                <option value=\"UGA\">Uganda</option>\n");
      out.write("                                <option value=\"UKR\">Ukraine</option>\n");
      out.write("                                <option value=\"ARE\">United Arab Emirates</option>\n");
      out.write("                                <option value=\"GBR\">United Kingdom</option>\n");
      out.write("                                <option value=\"USA\">United States</option>\n");
      out.write("                                <option value=\"UMI\">United States Minor Outlying Islands</option>\n");
      out.write("                                <option value=\"URY\">Uruguay</option>\n");
      out.write("                                <option value=\"UZB\">Uzbekistan</option>\n");
      out.write("                                <option value=\"VUT\">Vanuatu</option>\n");
      out.write("                                <option value=\"VEN\">Venezuela, Bolivarian Republic of</option>\n");
      out.write("                                <option value=\"VNM\">Viet Nam</option>\n");
      out.write("                                <option value=\"VGB\">Virgin Islands, British</option>\n");
      out.write("                                <option value=\"VIR\">Virgin Islands, U.S.</option>\n");
      out.write("                                <option value=\"WLF\">Wallis and Futuna</option>\n");
      out.write("                                <option value=\"ESH\">Western Sahara</option>\n");
      out.write("                                <option value=\"YEM\">Yemen</option>\n");
      out.write("                                <option value=\"ZMB\">Zambia</option>\n");
      out.write("                                <option value=\"ZWE\">Zimbabwe</option>                           \n");
      out.write("                            </select>                       \n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"languages\">\n");
      out.write("                            <select class=\"form-control bfh-countries\" data-country=\"US\">\n");
      out.write("                                <option value=\"\">Safety Off</option>\n");
      out.write("                                <option value=\"\">Safety On</option>\n");
      out.write("                            </select>\n");
      out.write("                        </li>\n");
      out.write("                        <li><a href=\"history.html\" class=\"f-history\">History</a></li>\n");
      out.write("                        <li><a href=\"#small-dialog5\" class=\"play-icon popup-with-zoom-anim f-history f-help\">Help</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //footer -->\n");
      out.write("   </div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
