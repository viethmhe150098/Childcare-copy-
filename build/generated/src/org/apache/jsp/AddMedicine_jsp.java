package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddMedicine_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
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
      out.write("    <title>Document</title>\n");
      out.write("    <style>\n");
      out.write("        .display {\n");
      out.write("            width: 70%;\n");
      out.write("            height: 500px;\n");
      out.write("\n");
      out.write("            margin: 0 auto;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        img {\n");
      out.write("            max-width: 180px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input{\n");
      out.write("            border: none;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <header>\n");
      out.write("        <div class=\"header-top fadeIn\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.html\"><img src=\"images/logo.png\" alt=\"image\"></a>\n");
      out.write("                <div class=\"right-header\">\n");
      out.write("                    <div class=\"header-info\">\n");
      out.write("                        <div class=\"info-inner\">\n");
      out.write("                            <span class=\"icontop\"><img src=\"images/phone-icon.png\" alt=\"#\"></span>\n");
      out.write("                            <span class=\"iconcont\"><a href=\"tel:800 123 456\">800 123 456</a></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"info-inner\">\n");
      out.write("                            <span class=\"icontop\"><i class=\"fa fa-envelope\" aria-hidden=\"true\"></i></span>\n");
      out.write("                            <span class=\"iconcont\"><a data-scroll\n");
      out.write("                                    href=\"mailto:info@yoursite.com\">info@Lifecare.com</a></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"info-inner\">\n");
      out.write("                            <span class=\"icontop\"><i class=\"fa fa-clock-o\" aria-hidden=\"true\"></i></span>\n");
      out.write("                            <span class=\"iconcont\"><a data-scroll href=\"#\">Daily: 7:00am - 8:00pm</a></span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"header-bottom fadeIn\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <nav class=\"main-menu\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\"\n");
      out.write("                            data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\"><i class=\"fa fa-bars\"\n");
      out.write("                                aria-hidden=\"true\"></i></button>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("                            <li><a href=\"index.html\">HOME</a></li>\n");
      out.write("                            <li><a href=\"index.html\">RESERVATION</a></li>\n");
      out.write("                            <li><a data-scroll href=\"#about\">POST</a></li>\n");
      out.write("                            <li><a data-scroll href=\"#service\">SLOT</a></li>\n");
      out.write("                            <li><a data-scroll href=\"#doctors\">MEDICINE</a></li>\n");
      out.write("                            <li><a data-scroll href=\"#price\">FEEDBACK</a></li>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <div style=\"margin-top: 200px; \">\n");
      out.write("        <div class=\"row display\">\n");
      out.write("            <form method=\"POST\" action=\"Medicine?service=add\">\n");
      out.write("                <table style=\"margin: 0 auto\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Name</td>\n");
      out.write("                        <td><input type=\"text\" autofocus></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Quantity</td>\n");
      out.write("                        <td><input type=\"text\" ></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Price</td>\n");
      out.write("                        <td><input type=\"text\" ></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Description</td>\n");
      out.write("                        <td><input type=\"text\" ></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Image</td>\n");
      out.write("                        <td><input type=\"file\" ></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <button type=\"submit\">ADD</button>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
