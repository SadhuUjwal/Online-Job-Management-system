/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.service;

import com.management.model.LoginForm;
import com.management.daoimplementations.LoginDaoImplementations;
import com.management.daointerfaces.LoginDao;
import java.sql.SQLException;


/**
 *
 * @author MSLC
 */
public class LoginService {
public String validateUser(String nam,String pass) throws ClassNotFoundException, SQLException{
        LoginDao loginDao=new LoginDaoImplementations();
        return loginDao.validateUser(nam,pass);
    }

}
