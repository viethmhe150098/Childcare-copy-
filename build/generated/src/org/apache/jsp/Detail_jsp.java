package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <!-- Basic -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <!-- Mobile Metas -->\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\r\n");
      out.write("        <!-- Site Metas -->\r\n");
      out.write("        <title>Service Detail page</title>\r\n");
      out.write("        <meta name=\"keywords\" content=\"\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <!-- Site Icons -->\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/fevicon.ico.png\" type=\"image/x-icon\" />\r\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <!-- Site CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("        <!-- Colors CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/colors.css\">\r\n");
      out.write("        <!-- ALL VERSION CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/versions.css\">\r\n");
      out.write("        <!-- Responsive CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("        <!-- Custom CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/custom.css\">\r\n");
      out.write("        <!-- Modernizer for Portfolio -->\r\n");
      out.write("        <script src=\"js/modernizer.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"./img/logo_web.png\" type=\"image/x-icon\">\r\n");
      out.write("        <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\r\n");
      out.write("        <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper/swiper-bundle.min.css\" />\r\n");
      out.write("        <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/service.css\">\r\n");
      out.write("        <!-- [if lt IE 9] -->\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <!-- LOADER -->\r\n");
      out.write("        <div id=\"preloader\">\r\n");
      out.write("            <img class=\"preloader\" src=\"images/loaders/heart-loading2.gif\" alt=\"\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- END LOADER -->\r\n");
      out.write("        <header>\r\n");
      out.write("            <div class=\"header-top wow fadeIn\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logo.png\" alt=\"image\"></a>\r\n");
      out.write("                    <div class=\"right-header\">\r\n");
      out.write("                        <div class=\"header-info\">\r\n");
      out.write("                            <div class=\"info-inner\">\r\n");
      out.write("                                <span class=\"icontop\"><img src=\"images/phone-icon.png\" alt=\"#\"></span>\r\n");
      out.write("                                <span class=\"iconcont\"><a href=\"tel:800 123 456\">800 123 456</a></span>\t\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"info-inner\">\r\n");
      out.write("                                <span class=\"icontop\"><i class=\"fa fa-envelope\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                <span class=\"iconcont\"><a data-scroll href=\"mailto:info@yoursite.com\">info@Lifecare.com</a></span>\t\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"info-inner\">\r\n");
      out.write("                                <span class=\"icontop\"><i class=\"fa fa-clock-o\" aria-hidden=\"true\"></i></span>\r\n");
      out.write("                                <span class=\"iconcont\"><a data-scroll href=\"#\">Daily: 7:00am - 8:00pm</a></span>\t\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"info-inner\">\r\n");
      out.write("                                <ul class=\"list-main\">\r\n");
      out.write("                                    <!--                                    <li><i class=\"fa fa-user-circle\"></i> <a href=\"#\">My account</a></li>\r\n");
      out.write("                                                                        <li><i class=\"fa fa-sign-in\"></i><a href=\"login\">Login</a></li>-->\r\n");
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    ");
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"header-bottom wow fadeIn\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <nav class=\"main-menu\">\r\n");
      out.write("                        <div class=\"navbar-header\">\r\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\"><i class=\"fa fa-bars\" aria-hidden=\"true\"></i></button>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"navbar\" class=\"navbar-collapse collapse\">\r\n");
      out.write("                            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                <li><a class=\"active\" href=\"index.html\">Home</a></li>\r\n");
      out.write("                                <li><a data-scroll href=\"#about\">About us</a></li>\r\n");
      out.write("                                <li><a data-scroll href=\"#service\">Services</a></li>\r\n");
      out.write("                                <li><a data-scroll href=\"#doctors\">Doctors</a></li>\r\n");
      out.write("                                <li><a data-scroll href=\"#price\">Price</a></li>\r\n");
      out.write("                                <li><a data-scroll href=\"#testimonials\">Testimonials</a></li>\r\n");
      out.write("                                <li><a data-scroll href=\"#getintouch\">Contact</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                    <div class=\"serch-bar\">\r\n");
      out.write("                        <div id=\"custom-search-input\">\r\n");
      out.write("                            <div class=\"input-group col-md-12\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control input-lg\" placeholder=\"Search\" />\r\n");
      out.write("                                <span class=\"input-group-btn\">\r\n");
      out.write("                                    <button class=\"btn btn-info btn-lg\" type=\"button\">\r\n");
      out.write("                                        <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\r\n");
      out.write("                                    </button>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header>\r\n");
      out.write("        <div id=\"home\" class=\"parallax first-section wow fadeIn\" data-stellar-background-ratio=\"0.4\" style=\"background-image:url('images/slider-bg.png');\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12 col-sm-12\">\r\n");
      out.write("                        <div class=\"text-contant\">\r\n");
      out.write("                            <h2>\r\n");
      out.write("                                <span class=\"center\"><span class=\"icon\"><img src=\"images/icon-logo.png\" alt=\"#\" /></span></span>\r\n");
      out.write("                                <a href=\"\" class=\"typewrite\" data-period=\"2000\" data-type='[ \"Welcome to Life Care\", \"We Care Your Health\", \"We are Expert!\" ]'>\r\n");
      out.write("                                    <span class=\"wrap\"></span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </h2>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- end row -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- end container -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- end section -->\r\n");
      out.write("        <div id=\"about\" class=\"section wow fadeIn\" style=\"padding:0; margin:0;\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"heading\">\r\n");
      out.write("                    <span class=\"icon-logo\"><img src=\"images/icon-logo.png\" alt=\"#\"></span>\r\n");
      out.write("                    <h2>The Detail Service</h2>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- end title -->\r\n");
      out.write("\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <div class=\"message-box\">\r\n");
      out.write("                            <!--<h4>What We Do</h4>-->\r\n");
      out.write("                            <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Sdetail2.scCateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("                            <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Sdetail1.sname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\r\n");
      out.write("                            <div class=\"service-price\" style=\"background-color:#39b49a;color:white;width: 50%; \">\r\n");
      out.write("                                <p style = \"text-decoration: underline;\r\n");
      out.write("                                   text-underline-offset: -2px; text-decoration: line-through;text-align: center\">$");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Sdetail1.sprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                                <p style=\"text-align: center\">Sale Price</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <p class=\"lead\">max quantity: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Sdetail1.maxquantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" people/turn</p>\r\n");
      out.write("                            <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Sdetail1.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                            <a href=\"#services\" data-scroll class=\"btn btn-light btn-radius btn-brd grd1 effect-1\">Contact</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- end messagebox -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- end col -->\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <div class=\"post-media wow fadeIn\">\r\n");
      out.write("                            <img src=\"images/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Sdetail1.ser_image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" alt=\"\" class=\"img-responsive\">\r\n");
      out.write("                            <!--<a href=\"http://www.youtube.com/watch?v=nrJtHemSPW4\" data-rel=\"prettyPhoto[gal]\" class=\"playbutton\"><i class=\"flaticon-play-button\"></i></a>-->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- end media -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- end col -->\r\n");
      out.write("                </div>\r\n");
      out.write("                ");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- end row -->\r\n");
      out.write("            <footer id=\"footer\" class=\"footer-area wow fadeIn\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"logo padding\">\r\n");
      out.write("                                <a href=\"\"><img src=\"images/logo.png\" alt=\"\"></a>\r\n");
      out.write("                                <p>Locavore pork belly scen ester pine est chill wave microdosing pop uple itarian cliche artisan.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"footer-info padding\">\r\n");
      out.write("                                <h3>CONTACT US</h3>\r\n");
      out.write("                                <p><i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i> PO Box 16122 Collins Street West Victoria 8007 Australia</p>\r\n");
      out.write("                                <p><i class=\"fa fa-paper-plane\" aria-hidden=\"true\"></i> info@gmail.com</p>\r\n");
      out.write("                                <p><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> (+1) 800 123 456</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"subcriber-info\">\r\n");
      out.write("                                <h3>SUBSCRIBE</h3>\r\n");
      out.write("                                <p>Get healthy news, tip and solutions to your problems from our experts.</p>\r\n");
      out.write("                                <div class=\"subcriber-box\">\r\n");
      out.write("                                    <form id=\"mc-form\" class=\"mc-form\">\r\n");
      out.write("                                        <div class=\"newsletter-form\">\r\n");
      out.write("                                            <input type=\"email\" autocomplete=\"off\" id=\"mc-email\" placeholder=\"Email address\" class=\"form-control\" name=\"EMAIL\">\r\n");
      out.write("                                            <button class=\"mc-submit\" type=\"submit\"><i class=\"fa fa-paper-plane\"></i></button> \r\n");
      out.write("                                            <div class=\"clearfix\"></div>\r\n");
      out.write("                                            <!-- mailchimp-alerts Start -->\r\n");
      out.write("                                            <div class=\"mailchimp-alerts\">\r\n");
      out.write("                                                <div class=\"mailchimp-submitting\"></div>\r\n");
      out.write("                                                <!-- mailchimp-submitting end -->\r\n");
      out.write("                                                <div class=\"mailchimp-success\"></div>\r\n");
      out.write("                                                <!-- mailchimp-success end -->\r\n");
      out.write("                                                <div class=\"mailchimp-error\"></div>\r\n");
      out.write("                                                <!-- mailchimp-error end -->\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <!-- mailchimp-alerts end -->\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("            <div class=\"copyright-area wow fadeIn\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-8\">\r\n");
      out.write("                            <div class=\"footer-text\">\r\n");
      out.write("                                <p>© 2018 Lifecare. All Rights Reserved.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-4\">\r\n");
      out.write("                            <div class=\"social\">\r\n");
      out.write("                                <ul class=\"social-links\">\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-rss\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-youtube\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"\"><i class=\"fa fa-pinterest\"></i></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a href=\"#home\" data-scroll class=\"dmtop global-radius\"><i class=\"fa fa-angle-up\"></i></a>\r\n");
      out.write("            <!-- all js files -->\r\n");
      out.write("            <script src=\"js/all.js\"></script>\r\n");
      out.write("            <!-- all plugins -->\r\n");
      out.write("            <script src=\"js/custom.js\"></script>\r\n");
      out.write("            <!-- map -->\r\n");
      out.write("            <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCNUPWkb4Cjd7Wxo-T4uoUldFjoiUA1fJc&callback=myMap\"></script>\r\n");
      out.write("\r\n");
      out.write("            <script src=\"https://unpkg.com/swiper/swiper-bundle.min.js\"></script>\r\n");
      out.write("            <script src=\"https://unpkg.com/scrollreveal\"></script>\r\n");
      out.write("            <script src=\"./js/main.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer_account == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <!--<li><i class=\"fa fa-user-circle\"></i> <a href=\"#\">My account</a></li>-->\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <li><i class=\"fa fa-user-circle\"></i> <a href=\"#\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer_account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                                ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer_account == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <li><i class=\"fa fa-sign-in\"></i><a href=\"login\">Login</a></li>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                            <li><i class=\"fa fa-sign-in\"></i><a href=\"validateCustomer\">Logout</a></li>\r\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }
}
