/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DR100623
 */
public class DBUtility {
public static Connection getConnection( ) throws ClassNotFoundException, SQLException{
        Connection con = null;

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con =DriverManager.getConnection("jdbc:odbc:Ojm");
            return con;

        }

     public static void closeConnection(Connection con) throws SQLException{
         con.close( );
    }
}
