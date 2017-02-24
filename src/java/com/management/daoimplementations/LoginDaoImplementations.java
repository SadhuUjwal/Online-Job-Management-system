/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.daoimplementations;

import com.management.daointerfaces.LoginDao;
import com.management.model.LoginForm;
import com.management.util.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author mslc
 */
public class LoginDaoImplementations implements LoginDao {
    public String validateUser( String name,String pass) throws ClassNotFoundException,SQLException{
   String role="invalid";
        Connection con = DBUtility.getConnection();
    PreparedStatement psmt = con.prepareStatement("select role from Login where userName=? and password=?");
    psmt.setString(1,name);
        psmt.setString(2,pass);
        ResultSet rs = psmt.executeQuery();
        if(rs.next()){
            role=rs.getString("role");
        }
         
        psmt.close();
        return role;
    }

    }




