/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.model;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
/**
 *
 * @author mslc
 */
public class RecommendedJob extends ActionForm{
    private String domain;
    private String username;
    public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;

}
        public String getUsername(){
            return username;
        }
        public void setUsername(String username){
            this.username=username;
        }
}
