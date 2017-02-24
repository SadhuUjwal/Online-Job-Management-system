<%-- 
    Document   : EmployeeHomePage
    Created on : Dec 6, 2013, 1:00:58 PM
    Author     : mslc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<style>
		body{background-image:url('abc2.jpg');}
		h1{text-decoration:underline;}
   		h1{color:black}
</style>

    <form action="displayjobs.do">
    <body>


        <h1><i><center>MAN RESOURCE CONSULTANCY</center></i></h1>

	<br><br/>
        <p align="right">
         <input type="button" value="Log Out" size="10" onclick="window.location.href='login.jsp'"/>
        </p>
        <hr/>
        <h3><i><left><center>Employee's Homepage</center></i></h3>

        <hr/>


        <p align="right">
            <input type="button" value="Update Job" size="10" onclick="window.location.href='update.jsp'"/>

        </p>



        <h2><center>Job List</center></h2>

        <p align="center">

        <input type="submit" value="View Job List Details" />
        </p>
    </body>
    </form>
    <form action="jobseeker.do">
        <p align="center">
            <input type="submit" value="View Job Seekers List"/>
        </p>
    </form>
</html>

