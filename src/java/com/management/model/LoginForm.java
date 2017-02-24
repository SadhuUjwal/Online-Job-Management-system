package com.management.model;



import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.validator.ValidatorForm;

public class LoginForm extends ValidatorForm{

	private static final long serialVersionUID = 1L;
	private String password;
	private String userName;
	public LoginForm() {super();}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public ActionErrors validate(ActionMapping mapping,HttpServletRequest request)
	{
		System.out.println("in validate method");
		ActionErrors actionErrors = new ActionErrors();
		try
		{


			if(userName==null || userName.trim().equals(""))
			{
				actionErrors.add("userName", new ActionMessage("errors.username"));
			}

		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

		try
		{
			if(password==null || password.trim().equals(""))
			{
				actionErrors.add("password", new ActionMessage("errors.password"));
			}
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

		return actionErrors;
	}

}

