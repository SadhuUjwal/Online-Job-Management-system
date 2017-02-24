package com.management.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.management.model.LoginForm;
import com.management.service.LoginService;



public class LoginAction extends Action{
        //private static final String SUCCESS = "success";
    //private static final String FAIL = "fail";


	 public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        String a1="";
        LoginForm l=(LoginForm)form;
        String username=l.getUserName();
        String password=l.getPassword();
        try
        {
            LoginService ls=new LoginService();

            a1=ls.validateUser(username,password);
           
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
       // request.setAttribute("dlist", a1);
           return mapping.findForward(a1);
  
    }
}




