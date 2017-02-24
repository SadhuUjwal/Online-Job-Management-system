package com.management.daoimplementations;
import com.management.model.JobUploadForm;
import com.management.daointerfaces.DisplayBPOJobsDao;
import com.management.util.DBUtility;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;

public class DisplayBPOJobsDaoImplementation implements DisplayBPOJobsDao{
	public ArrayList displayBPOUser() throws ClassNotFoundException, SQLException{
        ArrayList <JobUploadForm> ls=new ArrayList<JobUploadForm>();
        Connection con = DBUtility.getConnection();
        Statement st = con.createStatement();

        ResultSet rs=st.executeQuery("select * from BPO");
        
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