package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manager_002dcategory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${root}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/mos-style.css\" rel='stylesheet' type='text/css' />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("    \n");
      out.write("   \n");
      out.write("        <h3>Tabel</h3>\n");
      out.write("\t\n");
      out.write("\t<div class=\"informasi\">\n");
      out.write("\tini adalah notifikasi pertanda informasi\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"gagal\">\n");
      out.write("\tini adalah notifikasi pertanda gagal\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div class=\"sukses\">\n");
      out.write("\tini adalah notifikasi pertanda sukses\n");
      out.write("\t</div>\n");
      out.write("\t\t<table class=\"data\">\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<th class=\"data\" width=\"30px\">No</th>\n");
      out.write("\t\t\t\t<th class=\"data\">Nama</th>\n");
      out.write("\t\t\t\t<th class=\"data\">Email</th>\n");
      out.write("\t\t\t\t<th class=\"data\">Telepon</th>\n");
      out.write("\t\t\t\t<th class=\"data\" width=\"75px\">Pilihan</th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">1</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">2</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">3</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">4</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">5</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">6</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">7</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">8</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">9</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">10</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">11</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">12</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">13</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">14</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">15</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr class=\"data\">\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"30px\">16</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\">Data Anda</td>\n");
      out.write("\t\t\t\t<td class=\"data\" width=\"75px\">\n");
      out.write("\t\t\t\t<center>\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/oke.png\"></a>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t<a href=\"#\"><img src=\"mos-css/img/detail.png\"></a>\n");
      out.write("\t\t\t\t</center>\n");
      out.write("\t\t\t\t</td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t</table>\n");
      out.write("\t</div>\n");
      out.write("<div class=\"clear\"></div>    \n");
      out.write("            \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("  \n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("root");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
