package org.apache.jsp.jsp.recepcionista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class agregar_002dcliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" <html class=\"no-js\" lang=\"es\">\n");
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
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("\n");
      out.write("            <div id=\"page-container\" class=\"sidebar-partial sidebar-visible-lg sidebar-no-animations\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Main Container -->\n");
      out.write("                <div id=\"main-container\">\n");
      out.write("\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- Page content -->\n");
      out.write("                    <div id=\"page-content\">\n");
      out.write("\n");
      out.write("                        <!-- Product Edit Content -->\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-12\">\n");
      out.write("                                <!-- General Data Block -->\n");
      out.write("                                <div class=\"block\">\n");
      out.write("                                    <!-- General Data Title -->\n");
      out.write("                                    <div class=\"block-title\">\n");
      out.write("                                        <h2><i class=\"fa fa-pencil\"></i> <strong>Datos de </strong>cliente</h2>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- END General Data Title -->\n");
      out.write("\n");
      out.write("                                    <!-- General Data Content -->\n");
      out.write("                                    <form action=\"#\" method=\"post\" class=\"form-horizontal form-bordered\"\n");
      out.write("                                    onsubmit=\"return false;\" id=\"form-validation\" name=\"AgregarUsuario\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"col-md-3 control-label\" for=\"product-name\" name=\"nombre\">Nombres</label>\n");
      out.write("                                            <div class=\"col-md-9\">\n");
      out.write("                                                <input type=\"text\" id=\"nombre\" name=\"nombre\" class=\"form-control\" placeholder=\"Nombres...\" required required>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"col-md-3 control-label\" for=\"product-name\" name=\"Apellido\">Apellidos</label>\n");
      out.write("                                            <div class=\"col-md-9\">\n");
      out.write("                                                <input type=\"text\" id=\"apellido\" name=\"apellido\" class=\"form-control\" placeholder=\"Apellido...\" required>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"col-md-3 control-label\" for=\"product-name\" name=\"telefono\">Teléfono</label>\n");
      out.write("                                            <div class=\"col-md-9\">\n");
      out.write("                                                <input type=\"text\" id=\"telefono\" name=\"telefono\" class=\"form-control\" placeholder=\"Numero de telefono...\" required>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"col-md-3 control-label\" for=\"product-name\" name=\"DUI\">N° DUI</label>\n");
      out.write("                                            <div class=\"col-md-9\">\n");
      out.write("                                                <input type=\"text\" id=\"DUI\" name=\"DUI\" class=\"form-control\" placeholder=\"Numero de DUI\" required>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"col-md-3 control-label\" for=\"product-category\">Tipo</label>\n");
      out.write("                                            <div class=\"col-md-8\">\n");
      out.write("                                                <!-- Chosen plugin (class is initialized in js/app.js -> uiInit()), for extra usage examples you can check out http://harvesthq.github.io/chosen/ -->\n");
      out.write("                                                <select id=\"categoriausuario\" name=\"categoriausuario\" class=\"select-chosen\" data-placeholder=\"Seleccione uno...\" style=\"width: 250px;\">\n");
      out.write("                                                    <option></option><!-- Required for data-placeholder attribute to work with Chosen plugin -->\n");
      out.write("                                                    <option value=\"1\">Docente</option>\n");
      out.write("                                                    <option value=\"2\">Estudiante</option>\n");
      out.write("                                                    <option value=\"3\">Trabajador CETU</option>\n");
      out.write("                                                    <option value=\"2\">Otro</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label class=\"col-md-3 control-label\" for=\"product-name\" name=\"correo\">Correo</label>\n");
      out.write("                                            <div class=\"col-md-9\">\n");
      out.write("                                                <input type=\"text\" id=\"correo\" name=\"correo\" class=\"form-control\" placeholder=\"Correo electronico...\" required>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group form-actions\">\n");
      out.write("                                            <div class=\"col-md-9 col-md-offset-3\">\n");
      out.write("                                                <button type=\"submit\" class=\"btn btn-sm btn-primary\" ><i class=\"fa fa-floppy-o\" ></i> Guardar</button>\n");
      out.write("                                                <button type=\"reset\" class=\"btn btn-sm btn-warning\"><i class=\"fa fa-repeat\"></i> Cancelar</button>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                    <!-- END General Data Content -->\n");
      out.write("                                </div>\n");
      out.write("                                <!-- END General Data Block -->\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- END Product Edit Content -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- END Page Content -->\n");
      out.write("\n");
      out.write("                    <!-- Footer -->\n");
      out.write("                    <footer class=\"clearfix\">\n");
      out.write("\n");
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
      out.write("        <!-- END Page Wrapper -->\n");
      out.write("\n");
      out.write("        <!-- MODAL SUCCESS -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "helpers/modal-success.jsp", out, false);
      out.write("\n");
      out.write("        <!-- Modal Error-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "helpers/modal-error.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/validate.js\" ></script>\n");
      out.write("        <!-- jQuery, Bootstrap.js, jQuery plugins and Custom JS code -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "helpers/jquery-import-bootstrap.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- ckeditor.js, load it only in the page you would like to use CKEditor (it's a heavy plugin to include it with the others!) -->\n");
      out.write("        <script src=\"../administracion/js/helpers/ckeditor/ckeditor.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- ckeditor.js, load it only in the page you would like to use CKEditor (it's a heavy plugin to include it with the others!) -->\n");
      out.write("        <script src=\"../administracion/js/helpers/ckeditor/ckeditor.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- SCRIPTS DE VALIDACION DE INPUT -->\n");
      out.write("        <script src=\"../administracion/js/pages/formsValidation.js\"></script>\n");
      out.write("        <script>$(function(){ FormsValidation.init(); });</script>\n");
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
