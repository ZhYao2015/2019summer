/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-06-11 18:41:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("  <title>AdminLTE 2 | Log in</title>\r\n");
      out.write("  <!-- Tell the browser to be responsive to screen width -->\r\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\r\n");
      out.write("  <!-- Bootstrap 3.3.7 -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"static/assets/bower_components/bootstrap/dist/css/bootstrap.min.css\">\r\n");
      out.write("  <!-- Font Awesome -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"static/assets/bower_components/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("  <!-- Ionicons -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"static/assets/bower_components/Ionicons/css/ionicons.min.css\">\r\n");
      out.write("  <!-- Theme style -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"static/assets/css/AdminLTE.min.css\">\r\n");
      out.write("  <!-- iCheck -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"static/assets/plugins/iCheck/square/blue.css\">\r\n");
      out.write("\r\n");
      out.write("  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\r\n");
      out.write("  <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("  <![endif]-->\r\n");
      out.write("\r\n");
      out.write("  <!-- Google Font -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic\">\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition login-page\">\r\n");
      out.write("<div class=\"login-box\">\r\n");
      out.write("  <div class=\"login-logo\">\r\n");
      out.write("    <a href=\"#\"><b>Admin</b>LTE</a>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.login-logo -->\r\n");
      out.write("  <div class=\"login-box-body\">\r\n");
      out.write("    <p class=\"login-box-msg\">Sign in to start your session</p>\r\n");
      out.write("\r\n");
      out.write("    <form action=\"login\" method=\"post\">\r\n");
      out.write("      <div class=\"form-group has-feedback\">\r\n");
      out.write("        <input name=\"email\" type=\"email\" class=\"form-control\" placeholder=\"Email\">\r\n");
      out.write("        <span class=\"glyphicon glyphicon-envelope form-control-feedback\"></span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group has-feedback\">\r\n");
      out.write("        <input name=\"password\" type=\"password\" class=\"form-control\" placeholder=\"Password\">\r\n");
      out.write("        <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-xs-8\">\r\n");
      out.write("          <div class=\"checkbox icheck\">\r\n");
      out.write("            <label>\r\n");
      out.write("              <input name=\"remember-me\" type=\"checkbox\"> Remember Me\r\n");
      out.write("            </label>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.col -->\r\n");
      out.write("        <div class=\"col-xs-4\">\r\n");
      out.write("          <button type=\"submit\" class=\"btn btn-primary btn-block btn-flat\">Sign In</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.col -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </form>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"social-auth-links text-center\">\r\n");
      out.write("      <p>- OR -</p>\r\n");
      out.write("      <a href=\"#\" class=\"btn btn-block btn-social btn-facebook btn-flat\"><i class=\"fa fa-facebook\"></i> Sign in using\r\n");
      out.write("        Facebook</a>\r\n");
      out.write("      <a href=\"#\" class=\"btn btn-block btn-social btn-google btn-flat\"><i class=\"fa fa-google-plus\"></i> Sign in using\r\n");
      out.write("        Google+</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /.social-auth-links -->\r\n");
      out.write("\r\n");
      out.write("    <a href=\"#\">I forgot my password</a><br>\r\n");
      out.write("    <a href=\"#\" class=\"text-center\">Register a new membership</a>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- /.login-box-body -->\r\n");
      out.write("</div>\r\n");
      out.write("<!-- /.login-box -->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery 3 -->\r\n");
      out.write("<script src=\"static/assets/bower_components/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("<!-- Bootstrap 3.3.7 -->\r\n");
      out.write("<script src=\"static/assets/bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("<!-- iCheck -->\r\n");
      out.write("<script src=\"static/assets/plugins/iCheck/icheck.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("  $(function () {\r\n");
      out.write("    $('input').iCheck({\r\n");
      out.write("      checkboxClass: 'icheckbox_square-blue',\r\n");
      out.write("      radioClass: 'iradio_square-blue',\r\n");
      out.write("      increaseArea: '20%' /* optional */\r\n");
      out.write("    });\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
