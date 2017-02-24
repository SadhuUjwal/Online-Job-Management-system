/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.service;
import com.management.daoimplementations.RecommendDaoImplementations;
import com.management.daointerfaces.RecommendDao;
import java.sql.SQLException;
/**
 *
 * @author mslc
 */
public class RecommendedJobService {
public String recommendUser(String username) throws ClassNotFoundException, SQLException{
        RecommendDaoImplementations recommendDao=new RecommendDaoImplementations();



        return recommendDao.recommendUser(username);

    }
}
