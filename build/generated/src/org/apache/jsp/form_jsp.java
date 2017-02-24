package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function validate(){\n");
      out.write("                if(document.myform.jobName.value==\"\"){\n");
      out.write("                    alert(\"please provide valid Job Name!!!\");\n");
      out.write("                    document.myform.jobnme.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.myform.domain.value==\"\"){\n");
      out.write("                    alert(\"please provide valid domain\");\n");
      out.write("                    document.myform.domain.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.myform.qualification.value==\"\"){\n");
      out.write("                    alert(\"please provide valid qualification\");\n");
      out.write("                    document.myform.qual.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if(document.myform.skills.value==\"\"){\n");
      out.write("                    alert(\"please provide valid skills\");\n");
      out.write("                    document.myform.skills.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"images1.jpg\">\n");
      out.write("    <form action=\"form.do\" name=\"myform\" onsubmit=\"return(validate());\">\n");
      out.write("        \n");
      out.write("            <h2><i><center>List of Job to be uploaded</center></i></h2>\n");
      out.write("                <table border=\"1\" align=\"center\">\n");
      out.write("                    <tr><th align=\"left\">Company Name:</th><td><input type=\"text\" name=\"companyName\"/></td></tr>\n");
      out.write("                    <tr><th align=\"left\">Job Name:</th><td><input type=\"text\" name=\"jobName\"/></td></tr>\n");
      out.write("                    <tr><th align=\"left\">Domain:</th><td><input type=\"text\" name=\"domain\" /> </td></tr>\n");
      out.write("                    <tr><th align=\"left\">Qualification:</th><td><input type=\"text\" name=\"qualification\" /> </td></tr>\n");
      out.write("                    <tr><th align=\"left\">Job Location:</th><td><input type=\"text\" name=\"jobLocation\" /></td></tr>\n");
      out.write("                    <tr><th align=\"left\">CTC:</th><td><input type=\"text\" name=\"ctc\" /></td></tr>\n");
      out.write("                    <tr><th align=\"left\">Skills:</th><td><input type=\"text\" name=\"skills\"/></td></tr>\n");
      out.write("            <tr> <th> </th><td> <input type=\"submit\" value=\"Submit\" onclick=\"window.location.href='success.jsp'\" /></td></tr>\n");
      out.write("       \t\n");
      out.write("             </table>\n");
      out.write("        </form>\n");
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
