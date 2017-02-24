

<%@page import="com.management.model.JobUploadForm"%>
<%@page import="com.management.model.*"%>
<%@page import="java.util.List" %>
<%@page import="java.util.Iterator" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <% List<SuitableJobForm> v3 = (List<SuitableJobForm>) request.getAttribute("jobseeker");
                           int sizeList = v3.size();
                        if(sizeList>0){

                            Iterator i = v3.iterator();


                            while (i.hasNext()) {

                               SuitableJobForm v = (SuitableJobForm) i.next();%>

<table border='2'>

<tr>
<td>
Job Name
</td>
<td>
<%= v.getUsername()%>
 </td>
</tr>
<tr>
<td>
Skills
</td>
<td>
    <%=v.getSkills()%>
</td>
</tr>
<tr>
<td>
Domain
</td>
<td>
    <%=v.getDomain()%>
</td>
</tr>

</table>
<%
       }
                            }
%>

<a href="login.jsp">Home</a>

    </body>
</html>
