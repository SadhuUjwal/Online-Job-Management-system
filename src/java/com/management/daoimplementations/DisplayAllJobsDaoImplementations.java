/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.daoimplementations;

import com.management.daointerfaces.DisplayAllJobsDao;
import com.management.model.JobUploadForm;
import com.management.util.DBUtility;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mslc
 */
public class DisplayAllJobsDaoImplementations implements DisplayAllJobsDao {
    public ArrayList validateUser(JobUploadForm display)throws ClassNotFoundException,SQLException{
       ArrayList ls=new ArrayList();
       Connection con = DBUtility.getConnection();
         Statement st = con.createStatement();
      ResultSet rs=st.executeQuery("select * from JobUpload");
      while(rs.next()){
          JobUploadForm j=new JobUploadForm();
            j.setJobName(rs.getString("jobName"));
            j.setDomain(rs.getString("domain"));
            j.setQualification(rs.getString("qualification"));
            j.setJobLocation(rs.getString("jobLocation"));
            j.setCTC(rs.getString("ctc"));
            j.setSkills(rs.getString("skills"));
            j.setCompanyName(rs.getString("company"));
            ls.add(j);
      }
        DBUtility.closeConnection(con);
        return ls;
    }


}
