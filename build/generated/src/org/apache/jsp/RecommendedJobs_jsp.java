package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RecommendedJobs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("<style>\n");
      out.write("\t\tbody{background-image:url('images3.jpg');}\n");
      out.write("\t\th1{text-decoration:underline;}\n");
      out.write("   \t\timg\n");
      out.write("\t\t{\n");
      out.write("\t\t\tposition:absolute;\n");
      out.write("\t\t\tleft:0px;\n");
      out.write("\t\t\ttop:0px;\n");
      out.write("\t\t\tz-index:-1;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    <form action=\"RecommendedJobs.do\">\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <img src=\"jobseeker.jpg\" alt=\"e\" width=\"140\" height=\"130\">\n");
      out.write("        <h1><i><center>MAN RESOURCE CONSULTANCY</center></i></h1>\n");
      out.write("\n");
      out.write("\t<br><br/>\n");
      out.write("        <p align=\"right\">\n");
      out.write("            <input type=\"button\" value=\"Log Out\" size=\"10\" onclick=\"window.location.href='login.jsp'\"/>\n");
      out.write("        </p>\n");
      out.write("        <hr/>\n");
      out.write("        <h3><i><left>Job Seeker's Homepage</left></i></h3>\n");
      out.write("\n");
      out.write("        <hr/>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("        <h2><center>Job List</center></h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table border=\"1\" align=\"center\">\n");
      out.write("            <tr><th>Skills:</th><td><input type=\"text\" name=\"skills\"/></td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <tr><th>Qualification:</th><td><input type=\"text\" name=\"qual\"/></td><br/>\n");
      out.write("        </table>\n");
      out.write("        <p align=\"center\">\n");
      out.write("            <input type=\"submit\" value=\"Suitable Job List\"/>\n");
      out.write("        </p>\n");
      out.write("    </body>\n");
      out.write("    </form>\n");
      out.write("          <form action=\"recomjoblist.do\">\n");
      out.write("            <p align=\"right\">\n");
      out.write("               Enter Name:\n");
      out.write("                <input type=\"text\" name=\"username\"/>\n");
      out.write("            <input type=\"submit\" value=\"Recommended Jobs\" size=\"10\"/>\n");
      out.write("\n");
      out.write("        </p>\n");
      out.write("</form>\n");
      out.write("</html>\n");
      out.write("\n");
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
