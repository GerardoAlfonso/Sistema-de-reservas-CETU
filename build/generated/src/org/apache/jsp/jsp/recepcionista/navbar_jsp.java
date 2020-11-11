package org.apache.jsp.jsp.recepcionista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class navbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                    <header class=\"navbar navbar-default\">\n");
      out.write("                        <!-- Left Header Navigation -->\n");
      out.write("                        <ul class=\"nav navbar-nav-custom\">\n");
      out.write("                            <!-- Main Sidebar Toggle Button -->\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"javascript:void(0)\" onclick=\"App.sidebar('toggle-sidebar');this.blur();\">\n");
      out.write("                                    <i class=\"fa fa-bars fa-fw\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("               \n");
      out.write("                            <!-- END Template Options -->\n");
      out.write("                        </ul>\n");
      out.write("                       \n");
      out.write("                     \n");
      out.write("                        <ul class=\"nav navbar-nav-custom pull-right\">\n");
      out.write("                             ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../recepcionista/navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                            <!-- User Dropdown -->\n");
      out.write("                            <li class=\"dropdown\">\n");
      out.write("                                <a href=\"javascript:void(0)\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                    <img src=\"img/placeholders/avatars/avatar2.jpg\" alt=\"avatar\"> <i class=\"fa fa-angle-down\"></i>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu dropdown-custom dropdown-menu-right\">\n");
      out.write("                                    <li class=\"dropdown-header text-center\">Account</li>\n");
      out.write("                                \n");
      out.write("                                    <li class=\"divider\"></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"page_ready_user_profile.html\">\n");
      out.write("                                            <i class=\"fa fa-user fa-fw pull-right\"></i>\n");
      out.write("                                            Profile\n");
      out.write("                                        </a>\n");
      out.write("                                        <!-- Opens the user settings modal that can be found at the bottom of each page (page_footer.html in PHP version) -->\n");
      out.write("                                        <a href=\"#modal-user-settings\" data-toggle=\"modal\">\n");
      out.write("                                            <i class=\"fa fa-cog fa-fw pull-right\"></i>\n");
      out.write("                                            Settings\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"divider\"></li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"login.html\"><i class=\"fa fa-ban fa-fw pull-right\"></i> Logout</a>\n");
      out.write("                                    </li>\n");
      out.write("                                 \n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                            <!-- END User Dropdown -->\n");
      out.write("                        </ul>\n");
      out.write("                        <!-- END Right Header Navigation -->\n");
      out.write("                    </header>\n");
      out.write("                    \n");
      out.write("                    <!-- END Header -->");
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
