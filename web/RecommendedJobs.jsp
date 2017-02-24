<%-- 
    Document   : RecommendedJobs
    Created on : Apr 1, 2014, 7:42:09 PM
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
		body{background-image:url('images3.jpg');}
		h1{text-decoration:underline;}
   		img
		{
			position:absolute;
			left:0px;
			top:0px;
			z-index:-1;
		}

</style>
    <form action="RecommendedJobs.do">
    <body>

        <img src="jobseeker.jpg" alt="e" width="140" height="130">
        <h1><i><center>MAN RESOURCE CONSULTANCY</center></i></h1>

	<br><br/>
        <p align="right">
            <input type="button" value="Log Out" size="10" onclick="window.location.href='login.jsp'"/>
        </p>
        <hr/>
        <h3><i><left>Job Seeker's Homepage</left></i></h3>

        <hr/>



  


        <h2><center>Job List</center></h2>


        <table border="1" align="center">
            <tr><th>Skills:</th><td><input type="text" name="skills"/></td></tr>


            <tr><th>Qualification:</th><td><input type="text" name="qual"/></td><br/>
        </table>
        <p align="center">
            <input type="submit" value="Suitable Job List"/>
        </p>
    </body>
    </form>
          <form action="recomjoblist.do">
            <p align="right">
               Enter Name:
                <input type="text" name="username"/>
            <input type="submit" value="Recommended Jobs" size="10"/>

        </p>
</form>
</html>

