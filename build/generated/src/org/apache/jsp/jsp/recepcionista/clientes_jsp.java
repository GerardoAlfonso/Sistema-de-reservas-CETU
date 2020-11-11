package org.apache.jsp.jsp.recepcionista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class clientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Administración CETU - Clientes</title>\n");
      out.write("\n");
      out.write("        <meta name=\"description\" content=\"ProUI is a Responsive Bootstrap Admin Template created by pixelcave and published on Themeforest.\">\n");
      out.write("        <meta name=\"author\" content=\"pixelcave\">\n");
      out.write("        <meta name=\"robots\" content=\"noindex, nofollow\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0,user-scalable=0\">\n");
      out.write("\n");
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
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- Page content -->\n");
      out.write("                    <div id=\"page-content\">\n");
      out.write("\n");
      out.write("                        <div class=\"row text-center\">\n");
      out.write("                            <div class=\"col-sm-6 col-lg-3\">\n");
      out.write("                                <a href=\"agregar-cliente.jsp\" class=\"widget widget-hover-effect2\">\n");
      out.write("                                    <div class=\"widget-extra themed-background-success\">\n");
      out.write("                                        <h4 class=\"widget-content-light\"><strong>Agregar nuevo</strong> Cliente</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"widget-extra-full\"><span class=\"h2 text-success animation-expandOpen\"><i class=\"fa fa-plus\"></i></span></div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                        <!-- END Quick Stats -->\n");
      out.write("\n");
      out.write("                        <!-- All Products Block -->\n");
      out.write("                        <div class=\"block full\">\n");
      out.write("                          \n");
      out.write("                            <table id=\"ecom-products\" class=\"table table-bordered table-striped table-vcenter\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th class=\"text-center\" style=\"width: 70px;\">ID</th>\n");
      out.write("                                        <th>Nombre</th>\n");
      out.write("                                        <th class=\"text-right hidden-xs\">Apellido</th>\n");
      out.write("                                        <th class=\"hidden-xs\">Tipo</th>\n");
      out.write("                                        <th class=\"hidden-xs text-center\">Telefono</th>\n");
      out.write("                                        <th class=\"hidden-xs text-center\">Correo</th>\n");
      out.write("                                        <th class=\"text-center\">Accion</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td class=\"text-center\"><a href=\"editar-cliente.html\"><strong>1</strong></a></td>\n");
      out.write("                                        <td><a href=\"editar-cliente.html\">Rudy Ricardo</a></td>\n");
      out.write("                                        <td class=\"text-right hidden-xs\"><strong>Colocho Rodríguez</strong></td>\n");
      out.write("                                        <td class=\"hidden-xs\">\n");
      out.write("                                            <span class=\"label label-success\">Estudiante</span>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td class=\"hidden-xs text-center\">6159-9501</td>\n");
      out.write("                                        <td class=\"hidden-xs text-center\">2520432018@mail.utec.edu.sv</td>\n");
      out.write("                                        <td class=\"text-center\">\n");
      out.write("                                            <div class=\"btn-group btn-group-xs\">\n");
      out.write("                                                <a href=\"editar-cliente.html\" data-toggle=\"tooltip\" title=\"Edit\" class=\"btn btn-default\"><i class=\"fa fa-pencil\"></i></a>\n");
      out.write("                                                <a href=\"javascript:void(0)\" data-toggle=\"tooltip\" title=\"Delete\" class=\"btn btn-xs btn-danger\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("              \n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                            <!-- END All Products Content -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- END All Products Block -->\n");
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
      out.write("\n");
      out.write("        <!-- jQuery, Bootstrap.js, jQuery plugins and Custom JS code -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "helpers/jquery-import-bootstrap.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Load and execute javascript code used only in this page -->\n");
      out.write("        <script src=\"js/pages/ecomProducts.js\"></script>\n");
      out.write("        <script>$(function(){ EcomProducts.init(); });</script>\n");
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
