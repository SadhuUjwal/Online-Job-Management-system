

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
       <% List<JobUploadForm> v1 = (List<JobUploadForm>) request.getAttribute("joblistinemp");
                           int sizeList = v1.size();
                        if(sizeList>0){

                            Iterator i = v1.iterator();


                            while (i.hasNext()) {

                               JobUploadForm v = (JobUploadForm) i.next();%>

<table border='2'>

<tr>
<td>
Job Name
</td>
<td>
<%= v.getJobName()%>
 </td>
</tr>
<tr>
<td>
Domain
</td>
<td>
<%= v.getDomain()%>
</td>
</tr>
<tr>
<td>
Qualification
</td>
<td>
<%=v.getQualification()%>
</td>
</tr>
<tr>
<td>
Job Location
</td>
<td>
    <%=v.getJobLocation()%>
</td>
</tr>
<tr>
<td>
CTC
</td>
<td>
    <%=v.getCTC()%>
</td>
</tr>
<tr>
<td>
Skills
</td>
<td>
    <%=v.getSkills()%>
</td>
</tr><tr>
<td>
Company Name
</td>
<td>
    <%=v.getCompanyName()%>
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
