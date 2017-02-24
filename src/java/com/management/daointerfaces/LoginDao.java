/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.daointerfaces;

import com.management.model.LoginForm;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author MSLC
 */
public interface LoginDao {
public abstract String validateUser(String nam,String pass ) throws ClassNotFoundException, SQLException;

}
