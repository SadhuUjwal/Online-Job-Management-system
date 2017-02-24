<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body background="abc2.jpg">
    <h1 style="text-align:center;"><i>MAN RESOURCE ONLINE JOB MANAGEMENT</i></h1>

    <h1>About us</h1>
 <p>People aren't resumes.
Organizations aren't just stepping stones.There are hopes and aspirations behind each resume, each
placement. There are people on both sides of the table.We know. We have known it for over 44 years.
We are Manpower consultants - Building Careers, Building Organisations.</p>

 <form>
     <input type="button" value="Contact us" size="10" onclick="window.location.href='contact.jsp'"/>
<input type="button" value="Services"   size="10" onclick="window.location.href='service.jsp'"/>
  </form>

 <a href="terms.jsp">Terms and Conditions</a>

<form action="login.do">
<h3 align="center">LOGIN</h3>
<table border="2" align="center"  height="200" width="75">

<tr>
    <td>USERNAME</td>
    <td><input type="text" name="userName"/>
 </tr>
<tr>
    <td>PASSWORD</td>
    <td><input type="password" name="password"/>
  </tr>

  <tr>
   <td><input type="submit" value="login"/>
    <td><input type="reset" value="reset"/>
     </tr>



</table>
</form>



<!-- username<input type="text" name="fname"><br> -->
<!-- password<input type="password" name="pwd"><br> -->
<!-- <input type="submit" value="login"><br> -->
<!-- <a href="registration.html">newuser</a><br> -->
<!-- <a href="newpassword.html">change password</a> -->

</html>

</body>
</html>