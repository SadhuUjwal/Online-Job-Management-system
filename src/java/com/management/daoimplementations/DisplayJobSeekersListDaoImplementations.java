/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.daoimplementations;

import com.management.daointerfaces.DisplayJobSeekersListDao;

import com.management.model.SuitableJobForm;
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
public class DisplayJobSeekersListDaoImplementations implements DisplayJobSeekersListDao{
    public ArrayList displayJobSeeker(SuitableJobForm display)throws ClassNotFoundException,SQLException{
       ArrayList al=new ArrayList();
       Connection con = DBUtility.getConnection();
         Statement st = con.createStatement();
      ResultSet rs=st.executeQuery("select * from jobseeker");
      while(rs.next()){
          SuitableJobForm j=new SuitableJobForm();
            j.setUsername(rs.getString(1));
            j.setSkills(rs.getString("skills"));
            j.setDomain(rs.getString("domain"));
            al.add(j);
        }
      st.close();
      DBUtility.closeConnection(con);
        return al;

    }
}
