package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ResetPassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/fevicon.ico.png\" type=\"image/x-icon\" />\n");
      out.write("        <style>\n");
      out.write("            .contain {\n");
      out.write("                height: 100vh;\n");
      out.write("                width: 100vw;\n");
      out.write("                background-image: url(\"images/backgroundlogin.jpg\"), linear-gradient(rgba(255, 255, 255, 0.5),\n");
      out.write("                    rgba(255, 255, 255, 0.5));\n");
      out.write("\n");
      out.write("                background-size: cover;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .wrapper {\n");
      out.write("                padding: 25px;\n");
      out.write("                width: 40%;\n");
      out.write("                background-color: rgba(255, 255, 255, 0.8);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form {\n");
      out.write("                display: flex;\n");
      out.write("                flex-direction: column;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                font-size: 24px;\n");
      out.write("                font-weight: 300;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input {\n");
      out.write("                flex: 1;\n");
      out.write("                min-width: 40%;\n");
      out.write("                margin: 10px 0px;\n");
      out.write("                padding: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button {\n");
      out.write("                width: 100%;\n");
      out.write("                border: none;\n");
      out.write("                padding: 15px 20px;\n");
      out.write("                background-color: teal;\n");
      out.write("                color: white;\n");
      out.write("                cursor: pointer;\n");
      out.write("                font-weight: 700;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a {\n");
      out.write("                margin: 5px 0px;\n");
      out.write("                font-size: 12px;\n");
      out.write("                text-decoration: underline;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>RESET Page</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contain\">\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("                <form action=\"ResetPassword\" method=\"post\">\n");
      out.write("                    <h1>RESET PASSWORD</h1>\n");
      out.write("\n");
      out.write("                    <input  placeholder=\"PASSWORD\" type=\"password\" name=\"password\"  minlength=\"8\" id=\"password\" onkeyup='check();'/>\n");
      out.write("                    <input   placeholder=\"ENTER YOUR PASSWORD AGAIN\" type=\"password\" name=\"confirm_password\" minlength=\"8\" id=\"confirm_password\" onkeyup='check();'/>\n");
      out.write("                    <img onclick=\"myFunction()\" src=\"images/eye2.jpg\" width=\"30\" height=\"30\" >\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" name=\"submit\" value=\"CHANGE\" id=\"submit\" disabled />\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var x = true;\n");
      out.write("            function myFunction() {\n");
      out.write("                if (x) {\n");
      out.write("                    document.getElementById('pass').type = \"text\";\n");
      out.write("                    x = false;\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById('pass').type = \"password\";\n");
      out.write("                    x = true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            var check = function () {\n");
      out.write("                if (document.getElementById('password').value ==\n");
      out.write("                        document.getElementById('confirm_password').value) {\n");
      out.write("                    document.getElementById('message').style.color = 'green';\n");
      out.write("                    document.getElementById('message').innerHTML = 'matching';\n");
      out.write("                } else {\n");
      out.write("                    document.getElementById('message').style.color = 'red';\n");
      out.write("                    document.getElementById('message').innerHTML = 'not matching';\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
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
