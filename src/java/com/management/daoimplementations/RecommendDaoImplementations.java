/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.daoimplementations;
import com.management.daointerfaces.RecommendDao;
import com.management.model.RecommendedJob;
import com.management.util.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author mslc
 */
public class RecommendDaoImplementations {
public String recommendUser(String username ) throws ClassNotFoundException,SQLException{
   String domain="invalid";
   Connection con=DBUtility.getConnection();
   PreparedStatement psmt = con.prepareStatement("select domain from jobseeker where username=?");
   psmt.setString(1,username);
   ResultSet rs = psmt.executeQuery();
        if(rs.next()){
            domain=rs.getString(1);
        }
   psmt.close();
   return domain;
}
}
