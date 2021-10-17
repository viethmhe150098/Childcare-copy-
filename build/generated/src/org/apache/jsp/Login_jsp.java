package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("              integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/fevicon.ico.png\" type=\"image/x-icon\" />\r\n");
      out.write("        <style>\r\n");
      out.write("            .contain {\r\n");
      out.write("                height: 100vh;\r\n");
      out.write("                width: 100vw;\r\n");
      out.write("                background-image: url(\"images/backgroundlogin.jpg\"), linear-gradient(rgba(255, 255, 255, 0.5),\r\n");
      out.write("                    rgba(255, 255, 255, 0.5));\r\n");
      out.write("\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .wrapper {\r\n");
      out.write("                padding: 25px;\r\n");
      out.write("                width: 40%;\r\n");
      out.write("                background-color: rgba(255, 255, 255, 0.8);\r\n");
      out.write("\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            form {\r\n");
      out.write("                display: flex;\r\n");
      out.write("                flex-direction: column;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            h1 {\r\n");
      out.write("                font-size: 24px;\r\n");
      out.write("                font-weight: 300;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            input {\r\n");
      out.write("                flex: 1;\r\n");
      out.write("                min-width: 40%;\r\n");
      out.write("                margin: 10px 0px;\r\n");
      out.write("                padding: 10px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            button {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                border: none;\r\n");
      out.write("                padding: 15px 20px;\r\n");
      out.write("                background-color: teal;\r\n");
      out.write("                color: white;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                font-weight: 700;\r\n");
      out.write("                margin-bottom: 10px;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            a {\r\n");
      out.write("                margin: 5px 0px;\r\n");
      out.write("                font-size: 12px;\r\n");
      out.write("                text-decoration: underline;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        <title>Login Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"contain\">\r\n");
      out.write("            <div class=\"wrapper\">\r\n");
      out.write("                <form action=\"login\" method=\"post\">\r\n");
      out.write("                    <h1>LOGIN</h1>\r\n");
      out.write("                    <p class=\"text-danger\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                    <input placeholder=\"USERNAME\" type=\"text\" name=\"adUser\"/>\r\n");
      out.write("                    <input id=\"pass\" placeholder=\"PASSWORD\" type=\"password\" name=\"adPass\" minlength=\"8\"/>\r\n");
      out.write("                    <img onclick=\"myFunction()\" src=\"images/eye2.jpg\" width=\"30\" height=\"30\">\r\n");
      out.write("                    <button>LOGIN</button>\r\n");
      out.write("                    <a>DO NOT REMEMBER THE PASSWORD?</a>\r\n");
      out.write("                    <a href=\"register\">CREATE A NEW ACCOUNT</a>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            var x = true;\r\n");
      out.write("            function myFunction() {\r\n");
      out.write("                if (x) {\r\n");
      out.write("                    document.getElementById('pass').type = \"text\";\r\n");
      out.write("                    x = false;\r\n");
      out.write("                } else {\r\n");
      out.write("                    document.getElementById('pass').type = \"password\";\r\n");
      out.write("                    x = true;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
