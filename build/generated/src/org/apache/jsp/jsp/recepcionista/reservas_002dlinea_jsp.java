package org.apache.jsp.jsp.recepcionista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservas_002dlinea_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <html class=\"no-js\" lang=\"es\"> \n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("        <title>Administración CETU - Reservas</title>\n");
      out.write("\n");
      out.write("        <meta name=\"description\" content=\"ProUI is a Responsive Bootstrap Admin Template created by pixelcave and published on Themeforest.\">\n");
      out.write("        <meta name=\"author\" content=\"pixelcave\">\n");
      out.write("        <meta name=\"robots\" content=\"noindex, nofollow\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,user-scalable=0\">\n");
      out.write("\n");
      out.write("        <!-- Icons -->\n");
      out.write("        <!-- The following icons can be replaced with your own, they are used by desktop and mobile browsers -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "helpers/icons-css-import.jsp", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     \n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("             \n");
      out.write("            <div id=\"page-container\" class=\"sidebar-partial sidebar-visible-lg sidebar-no-animations\">\n");
      out.write("              \n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Main Container -->\n");
      out.write("                <div id=\"main-container\">\n");
      out.write("              \n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- Page content -->\n");
      out.write("                    <div id=\"page-content\">\n");
      out.write("                        <!-- Inbox Header -->\n");
      out.write("                        <div class=\"content-header\">\n");
      out.write("                            <div class=\"header-section\">\n");
      out.write("                                <h1><i class=\"gi gi-envelope\"></i>Reservas confirmadas</small></h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        <!-- END Inbox Header -->\n");
      out.write("\n");
      out.write("                        <!-- Inbox Content -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                      \n");
      out.write("                            <!-- Messages List -->\n");
      out.write("                            <div class=\"col-sm-8 col-lg-11\">\n");
      out.write("                                <!-- Messages List Block -->\n");
      out.write("                                <div class=\"block\">\n");
      out.write("                                    <!-- Messages List Title -->\n");
      out.write("                                    <div class=\"block-title\">\n");
      out.write("                                        <div class=\"block-options pull-right\">\n");
      out.write("                                            <a href=\"javascript:void(0)\" class=\"btn btn-alt btn-sm btn-default\" data-toggle=\"tooltip\" title=\"Settings\"><i class=\"fa fa-cog\"></i></a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <h2>Solicitudes de Reservas</h2>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- END Messages List Title -->\n");
      out.write("\n");
      out.write("                                    <!-- Messages List Content -->\n");
      out.write("                                    <div class=\"table-responsive\">\n");
      out.write("                                        <table class=\"table table-hover table-vcenter\">\n");
      out.write("                                           \n");
      out.write("                                            <tbody>\n");
      out.write("                                                <!-- Use the first row as a prototype for your column widths -->\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td class=\"text-center\" style=\"width: 30px;\">\n");
      out.write("                                                        <input type=\"checkbox\" id=\"checkbox1\" name=\"checkbox1\">\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"text-center\" style=\"width: 30px;\">\n");
      out.write("                                                        <a href=\"javascript:void(0)\" class=\"text-muted msg-fav-btn\"><i class=\"fa fa-star-o\"></i></a>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"text-center\" style=\"width: 30px;\">\n");
      out.write("                                                        <a href=\"javascript:void(0)\" class=\"text-success msg-read-btn\"><i class=\"fa fa-circle\"></i></a>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td style=\"width: 20%;\">Debra Stanley</td>\n");
      out.write("                                                    <td>\n");
      out.write("                                                        <a href=\"page_ready_inbox_message.html\"><strong>New Follower</strong></a>\n");
      out.write("                                                        <span class=\"text-muted\">Hey, just wanted to let you know..</span>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"text-center\" style=\"width: 30px;\">\n");
      out.write("                                                        <i class=\"fa fa-paperclip\"></i>\n");
      out.write("                                                    </td>\n");
      out.write("                                                    <td class=\"text-right\" style=\"width: 90px;\"><em>just now</em></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                                \n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- END Messages List Content -->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- END Messages List Block -->\n");
      out.write("                            </div>\n");
      out.write("                            <!-- END Messages List -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- END Inbox Content -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- END Page Content -->\n");
      out.write("\n");
      out.write("                    <!-- Footer -->\n");
      out.write("                    <footer class=\"clearfix\">\n");
      out.write("                       \n");
      out.write("                        <div class=\"pull-left\">\n");
      out.write("                         &copy; Restaurante CETU 2020</a>\n");
      out.write("                        </div>\n");
      out.write("                    </footer>\n");
      out.write("                    <!-- END Footer -->\n");
      out.write("                </div>\n");
      out.write("                <!-- END Main Container -->\n");
      out.write("            </div>\n");
      out.write("            <!-- END Page Container -->\n");
      out.write("        </div>\n");
      out.write("    \n");
      out.write("        <!-- END User Settings -->\n");
      out.write("\n");
      out.write("        <!-- jQuery, Bootstrap.js, jQuery plugins and Custom JS code -->\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "helpers/jquery-import-bootstrap.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Load and execute javascript code used only in this page -->\n");
      out.write("        <script src=\"..administracion/js/pages/readyInbox.js\"></script>\n");
      out.write("        <script>$(function(){ ReadyInbox.init(); });</script>\n");
      out.write("    </body>\n");
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
