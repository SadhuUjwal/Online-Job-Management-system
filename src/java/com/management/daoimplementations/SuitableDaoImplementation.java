/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.daoimplementations;

import com.management.model.JobUploadForm;
import com.management.daointerfaces.SuitableDao;
import com.management.util.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author mslc
 */
public class SuitableDaoImplementation implements SuitableDao {
public ArrayList SuitableJob(String skills, String qualification)throws ClassNotFoundException,SQLException{
    Connection con=DBUtility.getConnection();

    PreparedStatement ps=con.prepareStatement("select * from JobUpload where skills=? and qualification=?");
    ps.setString(1,skills);
    ps.setString(2,qualification);
   
    ResultSet rs=ps.executeQuery();
    
    ArrayList<JobUploadForm> al=new ArrayList<JobUploadForm>();
    while(rs.next()){
       JobUploadForm jobUpload=new JobUploadForm();

       jobUpload.setJobName(rs.getString("jobName"));
       jobUpload.setDomain(rs.getString("domain"));
       jobUpload.setQualification(rs.getString(3));
       jobUpload.setJobLocation(rs.getString(4));
       jobUpload.setCTC(rs.getString(5));
       jobUpload.setSkills(rs.getString(6));
       jobUpload.setCompanyName(rs.getString(7));
       al.add(jobUpload);
       

    }
    ps.close();
       DBUtility.closeConnection(con);
       return al;
}



    
}
