/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.model;

import java.io.Serializable;
import org.apache.struts.action.ActionForm;

/**
 *
 * @author mslc
 */
public class JobUploadForm extends org.apache.struts.action.ActionForm
{
  private String jobName;
    private String domain;
    private String qualification;
    private String jobLocation;
    private String ctc;
    private String skills;
    private String companyName;
    private int jobId;
   

    public JobUploadForm( ){
        // no code
    }

    public int getJobId(){
        return jobId;
    }

   public String getCompanyName() {
        return companyName;
    }
   public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification= qualification;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation= jobLocation;
    }
    public String getCTC() {
        return ctc;
    }

    public void setCTC(String ctc ) {
        this.ctc= ctc;
    }
    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills ) {
        this.skills= skills;
    }
}

