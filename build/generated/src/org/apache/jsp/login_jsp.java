package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("                <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                var x_timer;\n");
      out.write("                $(\"#email\").keyup(function (e) {\n");
      out.write("                    clearTimeout(x_timer);\n");
      out.write("                    var user_name = $(this).val();\n");
      out.write("                    x_timer = setTimeout(function () {\n");
      out.write("                        check_username_ajax(user_name);\n");
      out.write("                    }, 1000);\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                function check_username_ajax(username) {\n");
      out.write("                    $(\"#user-result\").html('<img src=\"img/ajax-loader.gif\" />');\n");
      out.write("                    $.post('CheckEmailServlet', {'username': username}, function (data) {\n");
      out.write("                        $(\"#user-result\").html(data);\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        \t<section id=\"form\"><!--form-->\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-sm-4 col-sm-offset-1\">\n");
      out.write("\t\t\t\t\t<div class=\"login-form\"><!--login form-->\n");
      out.write("\t\t\t\t\t\t<h2>Login to your account</h2>\n");
      out.write("\t\t\t\t\t\t<form action=\"#\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Email Address\" />\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" placeholder=\"Password\" />\n");
      out.write("\t\t\t\t\t\t\t<span>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"checkbox\"> \n");
      out.write("\t\t\t\t\t\t\t\tKeep me signed in\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\">Login</button>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div><!--/login form-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-sm-1\">\n");
      out.write("\t\t\t\t\t<h2 class=\"or\">OR</h2>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t<div class=\"signup-form\"><!--sign up form-->\n");
      out.write("\t\t\t\t\t\t<h2>New User Signup!</h2>\n");
      out.write("\t\t\t\t\t\t<form action=\"UsersServlet\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"email\" id=\"email\" placeholder=\"Email Address\" />\n");
      out.write("                                                        <span id=\"user-result\"></span>\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"pass\" placeholder=\"Password\"/>\n");
      out.write("                                                        <span></span>\n");
      out.write("                                                        <input type=\"hidden\" value=\"insert\" name=\"command\">\n");
      out.write("\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\">Signup</button>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div><!--/sign up form-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section><!--/form-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
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
