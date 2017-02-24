<%-- 
    Document   : BPOJobs
    Created on : Apr 2, 2014, 10:44:59 AM
    Author     : mslc
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="com.management.model.JobUploadForm"%>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>BPO Jobs</h1>
        <form action="">
            <table border="1">
                <tr>

                    <th>Job Name</th>
                    <th>Domain</th>
                    <th>Qualification</th>
                    <th>Job Location</th>
                    <th>CTC</th>
                    <th>Skills</th>
                    <th>Company</th>
                </tr>
                <%ArrayList<JobUploadForm> list=(ArrayList<JobUploadForm>)request.getAttribute("list");
	Iterator i=list.iterator();
	while(i.hasNext()){
		JobUploadForm juf=(JobUploadForm)i.next();%>
		<tr>
		 
			<td><%=juf.getJobName() %></td>
			<td><%=juf.getDomain() %></td>
			<td><%=juf.getQualification()%></td>
                        <td><%=juf.getJobLocation()%></td>
                        <td><%=juf.getCTC()%></td>
                        <td><%=juf.getSkills()%></td>
                        <td><%=juf.getCompanyName()%></td>

         </tr>
	<%}%>
            </table>
            <input type="button" value="Return" onclick="window.location.href='RecommendedJobs.jsp'">



        </form>
    </body>
</html>
