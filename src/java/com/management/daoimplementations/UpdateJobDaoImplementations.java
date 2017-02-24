/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.daoimplementations;

import com.management.daointerfaces.UpdateJobDao;
import com.management.model.JobUploadForm;
import com.management.util.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mslc
 */
public class UpdateJobDaoImplementations implements UpdateJobDao{
  public ArrayList updateJob(int jobid)throws ClassNotFoundException,SQLException{
       ArrayList ls=new ArrayList();
       Connection con = DBUtility.getConnection();
          PreparedStatement ps=con.prepareStatement("select * from JobUpload where jobId=?");
           ps.setInt(1,jobid);
          ResultSet rs=ps.executeQuery();
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
