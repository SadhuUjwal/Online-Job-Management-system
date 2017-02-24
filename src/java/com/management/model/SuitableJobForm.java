/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.model;

/**
 *
 * @author mslc
 */
public class SuitableJobForm extends org.apache.struts.action.ActionForm{
   private String username;
    private String skills;
    private String domain;

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }

    public String getSkills(){
        return skills;
    }
    public void setSkills(String skills){
        this.skills=skills;
    }
    public String getDomain(){
        return domain;
    }
    public void setDomain(String domain){
        this.domain=domain;
    }
}
