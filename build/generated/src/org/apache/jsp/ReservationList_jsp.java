package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ReservationList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_forEach_var_items_end_begin.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <!-- Basic -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <!-- Mobile Metas -->\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\n");
      out.write("    <!-- Site Metas -->\n");
      out.write("    <title>Life Care - Responsive HTML5 Multi Page Template</title>\n");
      out.write("    <meta name=\"keywords\" content=\"\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <!-- Site Icons -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/fevicon.ico.png\" type=\"image/x-icon\" />\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"images/apple-touch-icon.png\">\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("    <!-- Site CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <!-- Colors CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/colors.css\">\n");
      out.write("    <!-- ALL VERSION CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/versions.css\">\n");
      out.write("    <!-- Responsive CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsive.css\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/custom.css\">\n");
      out.write("    <!-- Modernizer for Portfolio -->\n");
      out.write("    <script src=\"js/modernizer.js\"></script>\n");
      out.write("\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"./img/logo_web.png\" type=\"image/x-icon\">\n");
      out.write("    <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("    <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper/swiper-bundle.min.css\" />\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./css/service.css\">\n");
      out.write("    <!-- [if lt IE 9] -->\n");
      out.write("</head>\n");
      out.write("<body class=\"clinic_version\">\n");
      out.write("    <!-- LOADER -->\n");
      out.write("    <div id=\"preloader\">\n");
      out.write("        <img class=\"preloader\" src=\"images/loaders/heart-loading2.gif\" alt=\"\">\n");
      out.write("    </div>\n");
      out.write("    <!-- END LOADER -->\n");
      out.write("    <header>\n");
      out.write("        <div class=\"header-top wow fadeIn\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logo.png\" alt=\"image\"></a>\n");
      out.write("                <div class=\"right-header\">\n");
      out.write("                    <div class=\"header-info\">\n");
      out.write("                        <div class=\"info-inner\">\n");
      out.write("                            <span class=\"icontop\"><img src=\"images/phone-icon.png\" alt=\"#\"></span>\n");
      out.write("                            <span class=\"iconcont\"><a href=\"tel:800 123 456\">800 123 456</a></span>\t\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"info-inner\">\n");
      out.write("                            <span class=\"icontop\"><i class=\"fa fa-envelope\" aria-hidden=\"true\"></i></span>\n");
      out.write("                            <span class=\"iconcont\"><a data-scroll href=\"mailto:info@yoursite.com\">info@Lifecare.com</a></span>\t\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"info-inner\">\n");
      out.write("                            <span class=\"icontop\"><i class=\"fa fa-clock-o\" aria-hidden=\"true\"></i></span>\n");
      out.write("                            <span class=\"iconcont\"><a data-scroll href=\"#\">Daily: 7:00am - 8:00pm</a></span>\t\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"info-inner\">\n");
      out.write("                            <ul class=\"list-main\">\n");
      out.write("                                <!--<li><i class=\"fa fa-user-circle\"></i> <a href=\"#\">My account</a></li>\n");
      out.write("                                <li><i class=\"fa fa-sign-in\"></i><a href=\"login\">Login</a></li>-->\n");
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");
      out.write("\n");
      out.write("                                \n");
      out.write("                                ");
      out.write("\n");
      out.write("                                \n");
      out.write("                                ");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"header-bottom wow fadeIn\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <nav class=\"main-menu\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\"><i class=\"fa fa-bars\" aria-hidden=\"true\"></i></button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li><a class=\"active\" href=\"index.html\">Home</a></li>\n");
      out.write("                            <li><a data-scroll href=\"#about\">About us</a></li\n");
      out.write("                            <li><a data-scroll href=\"#blogs\">Blogs</a></li>\n");
      out.write("                            <li><a data-scroll href=\"#service\">Services</a></li>\n");
      out.write("                            <li><a data-scroll href=\"#doctors\">Doctors</a></li>\n");
      out.write("                            <li><a data-scroll href=\"#price\">Price</a></li>\n");
      out.write("                            <li><a data-scroll href=\"#testimonials\">Testimonials</a></li>\n");
      out.write("                            <li><a data-scroll href=\"#getintouch\">Contact</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                <div class=\"serch-bar\">\n");
      out.write("                    <div id=\"custom-search-input\">\n");
      out.write("                        <div class=\"input-group col-md-12\">\n");
      out.write("                            <input type=\"text\" class=\"form-control input-lg\" placeholder=\"Search\" />\n");
      out.write("                            <span class=\"input-group-btn\">\n");
      out.write("                                <button class=\"btn btn-info btn-lg\" type=\"button\">\n");
      out.write("                                    <i class=\"fa fa-search\" aria-hidden=\"true\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <div id=\"home\" class=\"parallax first-section wow fadeIn\" data-stellar-background-ratio=\"0.4\" style=\"background-image:url('images/slider-bg.png');\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 col-sm-12\">\n");
      out.write("                    <div class=\"text-contant\">\n");
      out.write("                        <h2>\n");
      out.write("                            <span class=\"center\"><span class=\"icon\"><img src=\"images/icon-logo.png\" alt=\"#\" /></span></span>\n");
      out.write("                            <a href=\"\" class=\"typewrite\" data-period=\"2000\" data-type='[ \"Welcome to Life Care\", \"We Care Your Health\", \"We are Expert!\" ]'>\n");
      out.write("                                <span class=\"wrap\"></span>\n");
      out.write("                            </a>\n");
      out.write("                        </h2>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- end row -->\n");
      out.write("        </div>\n");
      out.write("        <!-- end container -->\n");
      out.write("    </div>\n");
      out.write("    <!-- end section -->\n");
      out.write("    <div id=\"time-table\" class=\"time-table-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-lg-4 col-md-4 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"service-time one\" style=\"background:#2895f1;\">\n");
      out.write("                        <span class=\"info-icon\"><i class=\"fa fa-ambulance\" aria-hidden=\"true\"></i></span>\n");
      out.write("                        <h3>Emergency Case</h3>\n");
      out.write("                        <p>Dignissimos ducimus qui blanditii sentium volta tum deleniti atque cori as quos dolores et quas mole.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-4 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"service-time middle\" style=\"background:#0071d1;\">\n");
      out.write("                        <span class=\"info-icon\"><i class=\"fa fa-clock-o\" aria-hidden=\"true\"></i></span> \n");
      out.write("                        <h3>Working Hours</h3>\n");
      out.write("                        <div class=\"time-table-section\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li><span class=\"left\">Monday - Friday</span><span class=\"right\">8.00 – 18.00</span></li>\n");
      out.write("                                <li><span class=\"left\">Saturday</span><span class=\"right\">8.00 – 16.00</span></li>\n");
      out.write("                                <li><span class=\"left\">Sunday</span><span class=\"right\">8.00 – 13.00</span></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-4 col-sm-12 col-xs-12\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"service-time three\" style=\"background:#0060b1;\">\n");
      out.write("                        <span class=\"info-icon\"><i class=\"fa fa-hospital-o\" aria-hidden=\"true\"></i></span>\n");
      out.write("                        <h3>Clinic Timetable</h3>\n");
      out.write("                        <p>Dignissimos ducimus qui blanditii sentium volta tum deleniti atque cori as quos dolores et quas mole.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"about\" class=\"section wow fadeIn\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"heading\">\n");
      out.write("                <span class=\"icon-logo\"><img src=\"images/icon-logo.png\" alt=\"#\"></span>\n");
      out.write("                <h2>The Specialist Clinic</h2>\n");
      out.write("            </div>\n");
      out.write("            <!-- end title -->\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"message-box\">\n");
      out.write("                        <h4>What We Do</h4>\n");
      out.write("                        <h2>Clinic Service</h2>\n");
      out.write("                        <div class=\"service-price\" style=\"background-color:#39b49a;color:white;width: 50%; \">\n");
      out.write("                            <p style = \"text-decoration: underline;\n");
      out.write("                               text-underline-offset: -2px; text-decoration: line-through;text-align: center\"> 120$</p>\n");
      out.write("                            <p style=\"text-align: center\"> Sale :50$</p>\n");
      out.write("                        </div>\n");
      out.write("                        <p class=\"lead\">Quisque eget nisl id nulla sagittis auctor quis id. Aliquam quis vehicula enim, non aliquam risus. Sed a tellus quis mi rhoncus dignissim.</p>\n");
      out.write("                        <p> Integer rutrum ligula eu dignissim laoreet. Pellentesque venenatis nibh sed tellus faucibus bibendum. Sed fermentum est vitae rhoncus molestie. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.  </p>\n");
      out.write("                        <a href=\"#services\" data-scroll class=\"btn btn-light btn-radius btn-brd grd1 effect-1\">Learn More</a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end messagebox -->\n");
      out.write("                </div>\n");
      out.write("                <!-- end col -->\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <div class=\"post-media wow fadeIn\">\n");
      out.write("                        <img src=\"images/about_03.jpg\" alt=\"\" class=\"img-responsive\">\n");
      out.write("                        <a href=\"http://www.youtube.com/watch?v=nrJtHemSPW4\" data-rel=\"prettyPhoto[gal]\" class=\"playbutton\"><i class=\"flaticon-play-button\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end media -->\n");
      out.write("                </div>\n");
      out.write("                <!-- end col -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- end row -->\n");
      out.write("            <hr class=\"hr1\">\n");
      out.write("            <div class=\"row\">            \n");
      out.write("                <div class=\"col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("                    <div class=\"service-widget\">\n");
      out.write("                        <div class=\"post-media wow fadeIn\">\n");
      out.write("                            <a href=\"images/clinic_01.jpg\" data-rel=\"prettyPhoto[gal]\" class=\"hoverbutton global-radius\"><i class=\"flaticon-unlink\"></i></a>\n");
      out.write("                            <img src=\"images/clinic_01.jpg\" alt=\"\" class=\"img-responsive\">\n");
      out.write("                        </div>\n");
      out.write("                        <h3>Digital Control Center</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end service -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("                    <div class=\"service-widget\">\n");
      out.write("                        <div class=\"post-media wow fadeIn\">\n");
      out.write("                            <a href=\"images/clinic_02.jpg\" data-rel=\"prettyPhoto[gal]\" class=\"hoverbutton global-radius\"><i class=\"flaticon-unlink\"></i></a>\n");
      out.write("                            <img src=\"images/clinic_02.jpg\" alt=\"\" class=\"img-responsive\">\n");
      out.write("                        </div>\n");
      out.write("                        <h3>Hygienic Operating Room</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end service -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("                    <div class=\"service-widget\">\n");
      out.write("                        <div class=\"post-media wow fadeIn\">\n");
      out.write("                            <a href=\"images/clinic_03.jpg\" data-rel=\"prettyPhoto[gal]\" class=\"hoverbutton global-radius\"><i class=\"flaticon-unlink\"></i></a>\n");
      out.write("                            <img src=\"images/clinic_03.jpg\" alt=\"\" class=\"img-responsive\">\n");
      out.write("                        </div>\n");
      out.write("                        <h3>Specialist Physicians</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end service -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("                    <div class=\"service-widget\">\n");
      out.write("                        <div class=\"post-media wow fadeIn\">\n");
      out.write("                            <a href=\"images/clinic_01.jpg\" data-rel=\"prettyPhoto[gal]\" class=\"hoverbutton global-radius\"><i class=\"flaticon-unlink\"></i></a>\n");
      out.write("                            <img src=\"images/clinic_01.jpg\" alt=\"\" class=\"img-responsive\">\n");
      out.write("                        </div>\n");
      out.write("                        <h3>Digital Control Center</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end service -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- end row -->\n");
      out.write("        </div>\n");
      out.write("        <!-- end container -->\n");
      out.write("\n");
      out.write("        <section id=\"service\" class=\"home\">\n");
      out.write("\n");
      out.write("            <div class=\"home__container\">\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                <div class=\"navigation\">\n");
      out.write("                    <div class=\"prev-btn\"><i class=\"fas fa-chevron-left prev\"></i></div>\n");
      out.write("                    <div class=\"next-btn\"><i class=\"fas fa-chevron-right next\"></i></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div id=\"Apply\" class=\"services wow fadeIn\">\n");
      out.write("        <div class=\"container\">     \n");
      out.write("           \n");
      out.write("               <div class=\"dropdown\">\n");
      out.write("                   <div class=\"dropdown__select\">\n");
      out.write("                   <span class=\"dropdown__selected\">Category of Service</span>\n");
      out.write("                   <i class=\"fa fa-caret-down dropdown__caret\"></i>\n");
      out.write("                 </div>\n");
      out.write("                    \n");
      out.write("                   <ul class=\"dropdown__list\">\n");
      out.write("                    <li class=\"dropdown__item\">\n");
      out.write("                        <a  href=\"ServiceControl#Apply\" class=\"dropdown__text\" style=\"color:#fff;\">TẤT CẢ CÁC LOẠI DỊCH VỤ</a>\n");
      out.write("                      <i class=\"fa fa-plus-circle dropdown__icon\"></i>\n");
      out.write("                    </li>\n");
      out.write("                     ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                 </ul>\n");
      out.write("                   \n");
      out.write("               </div>\n");
      out.write("               <form action=\"Searching\" method=\"post\">\n");
      out.write("                 <div class=\"search1\">\n");
      out.write("                    <input type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${txtS}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"txt\" placeholder=\"Type your search :\" />\n");
      out.write("                    <button  type=\"submit\" style=\"background: -webkit-linear-gradient(left, #39b49a 0%, #1d86df 100%);\n");
      out.write("               background: linear-gradient(to right, #39b49a 0%, #1d86df 100%);\">Search</button>\n");
      out.write("               </form>\n");
      out.write("    \n");
      out.write("      </div>\n");
      out.write("           <div class=\"row\">\n");
      out.write("              \n");
      out.write("              <div class=\"col-lg-8 col-md-8 col-sm-6 col-xs-12\">\n");
      out.write("                 <div class=\"inner-services\">\n");
      out.write("                      ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                 </div>\n");
      out.write("                         \n");
      out.write("              </div>\n");
      out.write("                          \n");
      out.write("                  \n");
      out.write("              <div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n");
      out.write("                 <div class=\"appointment-form\">\n");
      out.write("                    <h3><span>+</span> Book Appointment</h3>\n");
      out.write("                    <div class=\"form\">\n");
      out.write("                       <form action=\"index.html\">\n");
      out.write("                          <fieldset>\n");
      out.write("                             <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                   <div class=\"form-group\">\n");
      out.write("                                      <input type=\"text\" id=\"name\" placeholder=\"Your Name\"  />\n");
      out.write("                                   </div>\n");
      out.write("                                </div>\n");
      out.write("                             </div>\n");
      out.write("                             <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                   <div class=\"form-group\">\n");
      out.write("                                      <input type=\"email\" placeholder=\"Email Address\" id=\"email\" />\n");
      out.write("                                   </div>\n");
      out.write("                                </div>\n");
      out.write("                             </div>\n");
      out.write("                             <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 select-section\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                   <div class=\"form-group\">\n");
      out.write("                                      <select class=\"form-control\">\n");
      out.write("                                         <option>Day</option>\n");
      out.write("                                         <option>Sunday</option>\n");
      out.write("                                         <option>Monday</option>\n");
      out.write("                                      </select>\n");
      out.write("                                   </div>\n");
      out.write("                                   <div class=\"form-group\">\n");
      out.write("                                      <select class=\"form-control\">\n");
      out.write("                                         <option>Time</option>\n");
      out.write("                                         <option>AM</option>\n");
      out.write("                                         <option>PM</option>\n");
      out.write("                                      </select>\n");
      out.write("                                   </div>\n");
      out.write("                                </div>\n");
      out.write("                             </div>\n");
      out.write("                             <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                   <div class=\"form-group\">\n");
      out.write("                                      <select class=\"form-control\">\n");
      out.write("                                         <option>Doctor Name</option>\n");
      out.write("                                         <option>Mr.XYZ</option>\n");
      out.write("                                         <option>Mr.ABC</option>\n");
      out.write("                                      </select>\n");
      out.write("                                   </div>\n");
      out.write("                                </div>\n");
      out.write("                             </div>\n");
      out.write("                             <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                   <div class=\"form-group\">\n");
      out.write("                                      <textarea rows=\"4\" id=\"textarea_message\" class=\"form-control\" placeholder=\"Your Message...\"></textarea>\n");
      out.write("                                   </div>\n");
      out.write("                                </div>\n");
      out.write("                             </div>\n");
      out.write("                             <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                   <div class=\"form-group\">\n");
      out.write("                                      <div class=\"center\"><button type=\"submit\">Submit</button></div>\n");
      out.write("                                   </div>\n");
      out.write("                                </div>\n");
      out.write("                             </div>\n");
      out.write("                          </fieldset>\n");
      out.write("                       </form>\n");
      out.write("                    </div>\n");
      out.write("                 </div>\n");
      out.write("              </div>\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("     </div>\n");
      out.write("     <!-- end section -->\n");
      out.write("     \n");
      out.write("\n");
      out.write("<!-- doctor -->\n");
      out.write("\n");
      out.write("<div id=\"doctors\" class=\"parallax section db\" data-stellar-background-ratio=\"0.4\" style=\"background:#fff;\" data-scroll-id=\"doctors\" tabindex=\"-1\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"heading\">\n");
      out.write("            <span class=\"icon-logo\"><img src=\"images/icon-logo.png\" alt=\"#\"></span>\n");
      out.write("            <h2>The Specialist Clinic</h2>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row dev-list text-center\">\n");
      out.write("            <div class=\"col-lg-4 col-md-4 col-sm-12 col-xs-12 wow fadeIn\" data-wow-duration=\"1s\" data-wow-delay=\"0.2s\" style=\"visibility: visible; animation-duration: 1s; animation-delay: 0.2s; animation-name: fadeIn;\">\n");
      out.write("                <div class=\"widget clearfix\">\n");
      out.write("                    <img src=\"images/doctor_01.jpg\" alt=\"\" class=\"img-responsive img-rounded\">\n");
      out.write("                    <div class=\"widget-title\">\n");
      out.write("                        <h3>Soren Bo Bostian</h3>\n");
      out.write("                        <small>Clinic Owner</small>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end title -->\n");
      out.write("                    <p>Hello guys, I am Soren from Sirbistana. I am senior art director and founder of Violetta.</p>\n");
      out.write("\n");
      out.write("                    <div class=\"footer-social\">\n");
      out.write("                        <a href=\"#\" class=\"btn grd1\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"btn grd1\"><i class=\"fa fa-github\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"btn grd1\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"btn grd1\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--widget -->\n");
      out.write("            </div><!-- end col -->\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-4 col-md-4 col-sm-12 col-xs-12 wow fadeIn\" data-wow-duration=\"1s\" data-wow-delay=\"0.4s\" style=\"visibility: visible; animation-duration: 1s; animation-delay: 0.4s; animation-name: fadeIn;\">\n");
      out.write("                <div class=\"widget clearfix\">\n");
      out.write("                    <img src=\"images/doctor_02.jpg\" alt=\"\" class=\"img-responsive img-rounded\">\n");
      out.write("                    <div class=\"widget-title\">\n");
      out.write("                        <h3>Bryan Saftler</h3>\n");
      out.write("                        <small>Internal Diseases</small>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end title -->\n");
      out.write("                    <p>Hello guys, I am Soren from Sirbistana. I am senior art director and founder of Violetta.</p>\n");
      out.write("\n");
      out.write("                    <div class=\"footer-social\">\n");
      out.write("                        <a href=\"#\" class=\"btn grd1\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"btn grd1\"><i class=\"fa fa-github\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"btn grd1\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"btn grd1\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--widget -->\n");
      out.write("            </div><!-- end col -->\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-4 col-md-4 col-sm-12 col-xs-12 wow fadeIn\">\n");
      out.write("                <div class=\"widget clearfix\">\n");
      out.write("                    <img src=\"images/doctor_03.jpg\" alt=\"\" class=\"img-responsive img-rounded\">\n");
      out.write("                    <div class=\"widget-title\">\n");
      out.write("                        <h3>Matthew Bayliss</h3>\n");
      out.write("                        <small>Orthopedics Expert</small>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end title -->\n");
      out.write("                    <p>Hello guys, I am Soren from Sirbistana. I am senior art director and founder of Violetta.</p>\n");
      out.write("\n");
      out.write("                    <div class=\"footer-social\">\n");
      out.write("                        <a href=\"#\" class=\"btn grd1\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"btn grd1\"><i class=\"fa fa-github\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"btn grd1\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                        <a href=\"#\" class=\"btn grd1\"><i class=\"fa fa-linkedin\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--widget -->\n");
      out.write("            </div><!-- end col -->\n");
      out.write("\n");
      out.write("        </div><!-- end row -->\n");
      out.write("    </div><!-- end container -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"price\" class=\"section pr wow fadeIn\" style=\"background-image:url('images/price-bg.png');\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"tab-content\">\n");
      out.write("                    <div class=\"tab-pane active fade in\" id=\"tab1\">\n");
      out.write("                        <div class=\"row text-center\">\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <div class=\"pricing-table\">\n");
      out.write("                                    <div class=\"pricing-table-header\">\n");
      out.write("                                        <h2>Shared Hosting</h2>\n");
      out.write("                                        <h3>$85/month</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pricing-table-features\">\n");
      out.write("                                        <p><i class=\"fa fa-envelope-o\"></i> <strong>250</strong> Email Addresses</p>\n");
      out.write("                                        <p><i class=\"fa fa-rocket\"></i> <strong>125GB</strong> of Storage</p>\n");
      out.write("                                        <p><i class=\"fa fa-database\"></i> <strong>140</strong> Databases</p>\n");
      out.write("                                        <p><i class=\"fa fa-link\"></i> <strong>60</strong> Domains</p>\n");
      out.write("                                        <p><i class=\"fa fa-life-ring\"></i> <strong>24/7 Unlimited</strong> Support</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pricing-table-sign-up\">\n");
      out.write("                                        <a href=\"#contact\" data-scroll=\"\" class=\"btn btn-dark btn-radius btn-brd\">Order Now</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <div class=\"pricing-table pricing-table-highlighted\">\n");
      out.write("                                    <div class=\"pricing-table-header grd1\">\n");
      out.write("                                        <h2>WordPress Hosting</h2>\n");
      out.write("                                        <h3>$59/year</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pricing-table-space\"></div>\n");
      out.write("                                    <div class=\"pricing-table-text\">\n");
      out.write("                                        <p>This is a perfect choice for small businesses and startups.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pricing-table-features\">\n");
      out.write("                                        <p><i class=\"fa fa-envelope-o\"></i> <strong>150</strong> Email Addresses</p>\n");
      out.write("                                        <p><i class=\"fa fa-rocket\"></i> <strong>65GB</strong> of Storage</p>\n");
      out.write("                                        <p><i class=\"fa fa-database\"></i> <strong>60</strong> Databases</p>\n");
      out.write("                                        <p><i class=\"fa fa-link\"></i> <strong>30</strong> Domains</p>\n");
      out.write("                                        <p><i class=\"fa fa-life-ring\"></i> <strong>24/7 Unlimited</strong> Support</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pricing-table-sign-up\">\n");
      out.write("                                        <a href=\"#contact\" data-scroll=\"\" class=\"btn btn-light btn-radius btn-brd grd1 effect-1\">Order Now</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <div class=\"pricing-table\">\n");
      out.write("                                    <div class=\"pricing-table-header\">\n");
      out.write("                                        <h2>Reseller Hosting</h2>\n");
      out.write("                                        <h3>$85/one-time</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pricing-table-features\">\n");
      out.write("                                        <p><i class=\"fa fa-envelope-o\"></i> <strong>250</strong> Email Addresses</p>\n");
      out.write("                                        <p><i class=\"fa fa-rocket\"></i> <strong>125GB</strong> of Storage</p>\n");
      out.write("                                        <p><i class=\"fa fa-database\"></i> <strong>140</strong> Databases</p>\n");
      out.write("                                        <p><i class=\"fa fa-link\"></i> <strong>60</strong> Domains</p>\n");
      out.write("                                        <p><i class=\"fa fa-life-ring\"></i> <strong>24/7 Unlimited</strong> Support</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pricing-table-sign-up\">\n");
      out.write("                                        <a href=\"#contact\" data-scroll=\"\" class=\"btn btn-dark btn-radius btn-brd\">Order Now</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end row -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end pane -->\n");
      out.write("                    <div class=\"tab-pane fade\" id=\"tab2\">\n");
      out.write("                        <div class=\"row text-center\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"pricing-table\">\n");
      out.write("                                    <div class=\"pricing-table-header\">\n");
      out.write("                                        <h2>Dedicated Server</h2>\n");
      out.write("                                        <h3>$85/month</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pricing-table-space\"></div>\n");
      out.write("                                    <div class=\"pricing-table-features\">\n");
      out.write("                                        <p><i class=\"fa fa-envelope-o\"></i> <strong>250</strong> Email Addresses</p>\n");
      out.write("                                        <p><i class=\"fa fa-rocket\"></i> <strong>125GB</strong> of Storage</p>\n");
      out.write("                                        <p><i class=\"fa fa-database\"></i> <strong>140</strong> Databases</p>\n");
      out.write("                                        <p><i class=\"fa fa-link\"></i> <strong>60</strong> Domains</p>\n");
      out.write("                                        <p><i class=\"fa fa-life-ring\"></i> <strong>24/7 Unlimited</strong> Support</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pricing-table-sign-up\">\n");
      out.write("                                        <a href=\"#contact\" data-scroll=\"\" class=\"btn btn-dark btn-radius btn-brd\">Order Now</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"pricing-table pricing-table-highlighted\">\n");
      out.write("                                    <div class=\"pricing-table-header grd1\">\n");
      out.write("                                        <h2>VPS Server</h2>\n");
      out.write("                                        <h3>$59/month</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pricing-table-space\"></div>\n");
      out.write("                                    <div class=\"pricing-table-text\">\n");
      out.write("                                        <p>This is a perfect choice for small businesses and startups.</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pricing-table-features\">\n");
      out.write("                                        <p><i class=\"fa fa-envelope-o\"></i> <strong>150</strong> Email Addresses</p>\n");
      out.write("                                        <p><i class=\"fa fa-rocket\"></i> <strong>65GB</strong> of Storage</p>\n");
      out.write("                                        <p><i class=\"fa fa-database\"></i> <strong>60</strong> Databases</p>\n");
      out.write("                                        <p><i class=\"fa fa-link\"></i> <strong>30</strong> Domains</p>\n");
      out.write("                                        <p><i class=\"fa fa-life-ring\"></i> <strong>24/7 Unlimited</strong> Support</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pricing-table-sign-up\">\n");
      out.write("                                        <a href=\"#contact\" data-scroll=\"\" class=\"btn btn-light btn-radius btn-brd grd1 effect-1\">Order Now</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- end row -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end pane -->\n");
      out.write("                </div>\n");
      out.write("                <!-- end content -->\n");
      out.write("            </div>\n");
      out.write("            <!-- end col -->\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- end doctor section -->\n");
      out.write("\n");
      out.write("<div id=\"testimonials\" class=\"section wb wow fadeIn\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"heading\">\n");
      out.write("            <span class=\"icon-logo\"><img src=\"images/icon-logo.png\" alt=\"#\"></span>\n");
      out.write("            <h2>Testimonials</h2>\n");
      out.write("        </div>\n");
      out.write("        <!-- end title -->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6 col-sm-12 wow fadeIn\" data-wow-duration=\"1s\" data-wow-delay=\"0.2s\">\n");
      out.write("                <div class=\"testimonial clearfix\">\n");
      out.write("                    <div class=\"desc\">\n");
      out.write("                        <h3><i class=\"fa fa-quote-left\"></i> The amazing clinic! Wonderful Support!</h3>\n");
      out.write("                        <p class=\"lead\">They have got my project on time with the competition with a sed highly skilled, and experienced & professional team.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"testi-meta\">\n");
      out.write("                        <img src=\"images/testi_01.png\" alt=\"\" class=\"img-responsive alignleft\">\n");
      out.write("                        <h4>James Fernando <small>- Manager of Racer</small></h4>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end testi-meta -->\n");
      out.write("                </div>\n");
      out.write("                <!-- end testimonial -->\n");
      out.write("            </div>\n");
      out.write("            <!-- end col -->\n");
      out.write("            <div class=\"col-md-6 col-sm-12 wow fadeIn\" data-wow-duration=\"1s\" data-wow-delay=\"0.4s\">\n");
      out.write("                <div class=\"testimonial clearfix\">\n");
      out.write("                    <div class=\"desc\">\n");
      out.write("                        <h3><i class=\"fa fa-quote-left\"></i> Thanks for Help us!</h3>\n");
      out.write("                        <p class=\"lead\">They have got my project on time with the competition with a sed highly skilled, and experienced & professional team.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"testi-meta\">\n");
      out.write("                        <img src=\"images/testi_02.png\" alt=\"\" class=\"img-responsive alignleft\">\n");
      out.write("                        <h4>Andrew Atkinson <small>- Life Manager</small></h4>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end testi-meta -->\n");
      out.write("                </div>\n");
      out.write("                <!-- end testimonial -->\n");
      out.write("            </div>\n");
      out.write("            <!-- end col -->\n");
      out.write("        </div>\n");
      out.write("        <!-- end row -->\n");
      out.write("        <hr class=\"invis\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6 col-sm-12 wow fadeIn\" data-wow-duration=\"1s\" data-wow-delay=\"0.6s\">\n");
      out.write("                <div class=\"testimonial clearfix\">\n");
      out.write("                    <div class=\"desc\">\n");
      out.write("                        <h3><i class=\"fa fa-quote-left\"></i> The amazing clinic! Wonderful Support!</h3>\n");
      out.write("                        <p class=\"lead\">They have got my project on time with the competition with a sed highly skilled, and experienced & professional team.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"testi-meta\">\n");
      out.write("                        <img src=\"images/testi_03.png\" alt=\"\" class=\"img-responsive alignleft\">\n");
      out.write("                        <h4>Amanda DOE <small>- Manager of Racer</small></h4>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end testi-meta -->\n");
      out.write("                </div>\n");
      out.write("                <!-- end testimonial -->\n");
      out.write("            </div>\n");
      out.write("            <!-- end col -->\n");
      out.write("            <div class=\"col-md-6 col-sm-12 wow fadeIn\" data-wow-duration=\"1s\" data-wow-delay=\"0.8s\">\n");
      out.write("                <div class=\"testimonial clearfix\">\n");
      out.write("                    <div class=\"desc\">\n");
      out.write("                        <h3><i class=\"fa fa-quote-left\"></i> Thanks for Help us!</h3>\n");
      out.write("                        <p class=\"lead\">They have got my project on time with the competition with a sed highly skilled, and experienced & professional team.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"testi-meta\">\n");
      out.write("                        <img src=\"images/testi_01.png\" alt=\"\" class=\"img-responsive alignleft\">\n");
      out.write("                        <h4>Martin Johnson <small>- Founder of Goosilo</small></h4>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- end testi-meta -->\n");
      out.write("                </div>\n");
      out.write("                <!-- end testimonial -->\n");
      out.write("            </div>\n");
      out.write("            <!-- end col -->\n");
      out.write("        </div>\n");
      out.write("        <!-- end row -->\n");
      out.write("    </div>\n");
      out.write("    <!-- end container -->\n");
      out.write("</div>\n");
      out.write("<!-- end section -->\n");
      out.write("<div id=\"getintouch\" class=\"section wb wow fadeIn\" style=\"padding-bottom:0;\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"heading\">\n");
      out.write("            <span class=\"icon-logo\"><img src=\"images/icon-logo.png\" alt=\"#\"></span>\n");
      out.write("            <h2>Get in Touch</h2>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"contact-section\">\n");
      out.write("        <div class=\"form-contant\">\n");
      out.write("            <form id=\"ajax-contact\" action=\"assets/mailer.php\" method=\"post\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group in_name\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Name\" required=\"required\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group in_email\">\n");
      out.write("                            <input type=\"email\" class=\"form-control\" placeholder=\"E-mail\" required=\"required\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group in_email\">\n");
      out.write("                            <input type=\"tel\" class=\"form-control\" id=\"phone\" placeholder=\"Phone\" required=\"required\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"form-group in_email\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" id=\"subject\" placeholder=\"Subject\" required=\"required\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"form-group in_message\"> \n");
      out.write("                            <textarea class=\"form-control\" id=\"message\" rows=\"5\" placeholder=\"Message\" required=\"required\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"actions\">\n");
      out.write("                            <input type=\"submit\" value=\"Send Message\" name=\"submit\" id=\"submitButton\" class=\"btn small\" title=\"Submit Your Message!\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"googleMap\" style=\"width:100%;height:450px;\"></div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<footer id=\"footer\" class=\"footer-area wow fadeIn\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"logo padding\">\n");
      out.write("                    <a href=\"\"><img src=\"images/logo.png\" alt=\"\"></a>\n");
      out.write("                    <p>Locavore pork belly scen ester pine est chill wave microdosing pop uple itarian cliche artisan.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"footer-info padding\">\n");
      out.write("                    <h3>CONTACT US</h3>\n");
      out.write("                    <p><i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i> PO Box 16122 Collins Street West Victoria 8007 Australia</p>\n");
      out.write("                    <p><i class=\"fa fa-paper-plane\" aria-hidden=\"true\"></i> info@gmail.com</p>\n");
      out.write("                    <p><i class=\"fa fa-phone\" aria-hidden=\"true\"></i> (+1) 800 123 456</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"subcriber-info\">\n");
      out.write("                    <h3>SUBSCRIBE</h3>\n");
      out.write("                    <p>Get healthy news, tip and solutions to your problems from our experts.</p>\n");
      out.write("                    <div class=\"subcriber-box\">\n");
      out.write("                        <form id=\"mc-form\" class=\"mc-form\">\n");
      out.write("                            <div class=\"newsletter-form\">\n");
      out.write("                                <input type=\"email\" autocomplete=\"off\" id=\"mc-email\" placeholder=\"Email address\" class=\"form-control\" name=\"EMAIL\">\n");
      out.write("                                <button class=\"mc-submit\" type=\"submit\"><i class=\"fa fa-paper-plane\"></i></button> \n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                                <!-- mailchimp-alerts Start -->\n");
      out.write("                                <div class=\"mailchimp-alerts\">\n");
      out.write("                                    <div class=\"mailchimp-submitting\"></div>\n");
      out.write("                                    <!-- mailchimp-submitting end -->\n");
      out.write("                                    <div class=\"mailchimp-success\"></div>\n");
      out.write("                                    <!-- mailchimp-success end -->\n");
      out.write("                                    <div class=\"mailchimp-error\"></div>\n");
      out.write("                                    <!-- mailchimp-error end -->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- mailchimp-alerts end -->\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("<div class=\"copyright-area wow fadeIn\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                <div class=\"footer-text\">\n");
      out.write("                    <p>© 2018 Lifecare. All Rights Reserved.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4\">\n");
      out.write("                <div class=\"social\">\n");
      out.write("                    <ul class=\"social-links\">\n");
      out.write("                        <li><a href=\"\"><i class=\"fa fa-rss\"></i></a></li>\n");
      out.write("                        <li><a href=\"\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                        <li><a href=\"\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                        <li><a href=\"\"><i class=\"fa fa-google-plus\"></i></a></li>\n");
      out.write("                        <li><a href=\"\"><i class=\"fa fa-youtube\"></i></a></li>\n");
      out.write("                        <li><a href=\"\"><i class=\"fa fa-pinterest\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!-- end copyrights -->\n");
      out.write("<a href=\"#home\" data-scroll class=\"dmtop global-radius\"><i class=\"fa fa-angle-up\"></i></a>\n");
      out.write("<!-- all js files -->\n");
      out.write("<script src=\"js/all.js\"></script>\n");
      out.write("<!-- all plugins -->\n");
      out.write("<script src=\"js/custom.js\"></script>\n");
      out.write("<!-- map -->\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCNUPWkb4Cjd7Wxo-T4uoUldFjoiUA1fJc&callback=myMap\"></script>\n");
      out.write("\n");
      out.write("<script src=\"https://unpkg.com/swiper/swiper-bundle.min.js\"></script>\n");
      out.write("<script src=\"https://unpkg.com/scrollreveal\"></script>\n");
      out.write("<script src=\"./js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
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
        out.write("\n");
        out.write("                                        <!--<li><i class=\"fa fa-user-circle\"></i> <a href=\"#\">My account</a></li>-->\n");
        out.write("                                        ");
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
        out.write("\n");
        out.write("                                        <li><i class=\"fa fa-user-circle\"></i> <a href=\"Userprofile.jsp\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.customer_account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a></li>\n");
        out.write("                                        ");
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
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
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
        out.write("\n");
        out.write("                                        <li><i class=\"fa fa-sign-in\"></i><a href=\"login\">Login</a></li>\n");
        out.write("                                            ");
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
        out.write("\n");
        out.write("                                        <li><i class=\"fa fa-sign-in\"></i><a href=\"validateCustomer\">Logout</a></li>\n");
        out.write("                                            ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setBegin(0);
    _jspx_th_c_forEach_0.setEnd(0);
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                <div class=\"slide slide-1\">\n");
          out.write("                    <img src=\"./images/cloud.png\" alt=\"\" class=\"img-cloud\">\n");
          out.write("                    <div class=\"slide__container\">\n");
          out.write("                        <div class=\"slide-img\">\n");
          out.write("                            <img src=\"images/clinic_01.jpg\" alt=\"\" class=\"img-content\">\n");
          out.write("                            <img src=\"https://png.pngtree.com/template/20190926/ourlarge/pngtree-healthcare-medical-logo-vector-icon-for-ambulance-hospital-pharm-image_309802.jpg\" alt=\"\" class=\"img-rocket\">\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"home-content\">\n");
          out.write("                            <h2 class=\"content-h2 text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.scCateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                            <div class=\"service-price\" style=\"background-color:#39b49a;color:white;width: 100%; \">\n");
          out.write("                                <p style = \"text-decoration: underline;\n");
          out.write("                                   text-underline-offset: -2px; text-decoration: line-through;text-align: center\"> 120$</p>\n");
          out.write("                                <p style=\"text-align: center\"> Sale :50$</p>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("                            <!-- <button type=\"button\" class='btn-content apply-button'><a data-scroll href=\"#Apply\">Đặt lịch ngay</a> </button>\n");
          out.write("                            -->\n");
          out.write("\n");
          out.write("                            <a data-scroll href=\"#Apply\" class=\"link apply-button\">Đặt lịch ngay</a>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(1);
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"slide slide-2\">\n");
          out.write("                        <img src=\"./images/cloud.png\" alt=\"\" class=\"img-cloud\">\n");
          out.write("                        <div class=\"slide__container\">\n");
          out.write("                            <div class=\"slide-img\">\n");
          out.write("                                <img src=\"images/clinic_02.jpg\" alt=\"\" class=\"img-content\">\n");
          out.write("                                <img src=\"https://png.pngtree.com/template/20190926/ourlarge/pngtree-healthcare-medical-logo-vector-icon-for-ambulance-hospital-pharm-image_309802.jpg\" alt=\"\" class=\"img-rocket\">\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"home-content\">\n");
          out.write("                                <h2 class=\"content-h2 text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.scCateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("\n");
          out.write("                                <div class=\"service-price\" style=\"background-color:#39b49a;color:white;width: 100%; \">\n");
          out.write("                                    <p style = \"text-decoration: underline;\n");
          out.write("                                       text-underline-offset: -2px; text-decoration: line-through;text-align: center\"> 120$</p>\n");
          out.write("                                    <p style=\"text-align: center\"> Sale :50$</p>\n");
          out.write("                                </div>        \n");
          out.write("\n");
          out.write("                                <a data-scroll href=\"#Apply\" class=\"link apply-button\">Đặt lịch ngay</a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setBegin(2);
    _jspx_th_c_forEach_2.setEnd(2);
    _jspx_th_c_forEach_2.setVar("o");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"slide slide-3\">\n");
          out.write("                        <img src=\"./images/cloud.png\" alt=\"\" class=\"img-cloud active\">\n");
          out.write("                        <div class=\"slide__container\">\n");
          out.write("                            <div class=\"slide-img\">\n");
          out.write("                                <img src=\"images/clinic_03.jpg\" alt=\"\" class=\"img-content\">\n");
          out.write("                            <img src=\"https://png.pngtree.com/template/20190926/ourlarge/pngtree-healthcare-medical-logo-vector-icon-for-ambulance-hospital-pharm-image_309802.jpg\" alt=\"\" class=\"img-rocket\">\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"home-content\">\n");
          out.write("                                <h2 class=\"content-h2 text-center\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.scCateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h2>\n");
          out.write("                                <div class=\"service-price\" style=\"background-color:#39b49a;color:white;width: 100%; \">\n");
          out.write("                                    <p style = \"text-decoration: underline;\n");
          out.write("                                       text-underline-offset: -2px; text-decoration: line-through;text-align: center\"> 120$</p>\n");
          out.write("                                    <p style=\"text-align: center\"> Sale :50$</p>\n");
          out.write("                                </div>\n");
          out.write("                                <a data-scroll href=\"#Apply\" class=\"link apply-button\">Đặt lịch ngay</a>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listC}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("o");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                   <li class=\"dropdown__item\">\n");
          out.write("                       <a  href=\"CategoryControl?cid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.scID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("#Apply\" class=\"dropdown__text\" style=\"color:#fff;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.scCateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                     <i class=\"fa fa-plus-circle dropdown__icon\"></i>\n");
          out.write("                   </li>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listReser}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("o");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"col-lg-4 col-md-6 col-sm-6 col-xs-12\">\n");
          out.write("                       <div class=\"serv\">\n");
          out.write("<!--                          <span class=\"icon-service\"><img  class=\"img-service\"src=\"images/clinic_03.jpg\" alt=\"#\"  style=\"width: 220px;height:220px;border-radius: 10px;\"/></span>            \n");
          out.write("                           <p class=\"card-title show_txt\"><a class=\"name_service\" href=\"ServiceDetail?sid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.sID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&&scID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.scID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.sname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></p>\n");
          out.write("                          <p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>   -->\n");
          out.write("                          \n");
          out.write("                            <span class=\"service-price1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("$</span>\n");
          out.write("                           <span class=\"service-quantity\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.fullname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span>\n");
          out.write("                                     \n");
          out.write("                           \n");
          out.write("                           \n");
          out.write("\n");
          out.write("                       </div>\n");
          out.write("                    </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }
}
