package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EmployeeHomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("<style>\n");
      out.write("\t\tbody{background-image:url('images2.jpg');}\n");
      out.write("\t\th1{text-decoration:underline;}\n");
      out.write("   \t\th1{color:black}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    <form action=\"displayjobs.do\">\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h1><i><center>MAN RESOURCE CONSULTANCY</center></i></h1>\n");
      out.write("\n");
      out.write("\t<br><br/>\n");
      out.write("        <p align=\"right\">\n");
      out.write("         <input type=\"button\" value=\"Log Out\" size=\"10\" onclick=\"window.location.href='login.jsp'\"/>\n");
      out.write("        </p>\n");
      out.write("        <hr/>\n");
      out.write("        <h3><i><left><center>Employee's Homepage</center></i></h3>\n");
      out.write("\n");
      out.write("        <hr/>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <p align=\"right\">\n");
      out.write("            <input type=\"button\" value=\"Update Job\" size=\"10\" onclick=\"window.location.href='update.jsp'\"/>\n");
      out.write("\n");
      out.write("        </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h2><center>Job List</center></h2>\n");
      out.write("\n");
      out.write("        <p align=\"center\">\n");
      out.write("\n");
      out.write("        <input type=\"submit\" value=\"View Job List Details\" />\n");
      out.write("        </p>\n");
      out.write("    </body>\n");
      out.write("    </form>\n");
      out.write("    <form action=\"Jobseeker.do\">\n");
      out.write("        <p align=\"center\">\n");
      out.write("            <input type=\"submit\" value=\"View Job Seekers List\"/>\n");
      out.write("        </p>\n");
      out.write("    </form>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
