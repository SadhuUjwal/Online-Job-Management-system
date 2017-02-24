/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.daoimplementations;

import com.management.daointerfaces.JobUploadDao;
import com.management.model.JobUploadForm;
import com.management.util.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

/**
 *
 * @author mslc
 */
public class JobUploadDaoImplementations implements JobUploadDao {
    public void validateUser(JobUploadForm juf)throws ClassNotFoundException,SQLException{
        Connection con=DBUtility.getConnection();
        PreparedStatement psmt=con.prepareStatement("insert into JobUpload(jobName,domain,qualification,jobLocation,ctc,skills,company) values(?,?,?,?,?,?,?)");
        psmt.setString(1,juf.getJobName());
        psmt.setString(2,juf.getDomain());
        psmt.setString(3,juf.getQualification());
        psmt.setString(4,juf.getJobLocation());
        psmt.setString(5,juf.getCTC());
        psmt.setString(6,juf.getSkills());
        psmt.setString(7,juf.getCompanyName());
        psmt.executeUpdate();
        psmt.close();
        

    }

}
