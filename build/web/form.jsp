<html>
    <head>
        <script type="text/javascript">
            function validate(){
                if(document.myform.jobName.value==""){
                    alert("please provide valid Job Name!!!");
                    document.myform.jobnme.focus();
                    return false;
                }
                if(document.myform.domain.value==""){
                    alert("please provide valid domain");
                    document.myform.domain.focus();
                    return false;
                }
                if(document.myform.qualification.value==""){
                    alert("please provide valid qualification");
                    document.myform.qual.focus();
                    return false;
                }
                if(document.myform.skills.value==""){
                    alert("please provide valid skills");
                    document.myform.skills.focus();
                    return false;
                }

                return true;
            }
            </script>
    </head>
    <body background="abc1.jpg">
    <form action="form.do" name="myform" onsubmit="return(validate());">
        
            <h2><i><center>List of Job to be uploaded</center></i></h2>
                <table border="1" align="center">
                    <tr><th align="left">Company Name:</th><td><input type="text" name="companyName"/></td></tr>
                    <tr><th align="left">Job Name:</th><td><input type="text" name="jobName"/></td></tr>
                    <tr><th align="left">Domain:</th><td><input type="text" name="domain" /> </td></tr>
                    <tr><th align="left">Qualification:</th><td><input type="text" name="qualification" /> </td></tr>
                    <tr><th align="left">Job Location:</th><td><input type="text" name="jobLocation" /></td></tr>
                    <tr><th align="left">CTC:</th><td><input type="text" name="ctc" /></td></tr>
                    <tr><th align="left">Skills:</th><td><input type="text" name="skills"/></td></tr>
            <tr> <th> </th><td> <input type="submit" value="Submit" onclick="window.location.href='success.jsp'" /></td></tr>
       	
             </table>
        </form>
    </body>
</html>