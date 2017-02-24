/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.service;

import com.management.daoimplementations.UpdateJobDaoImplementations;
import com.management.daointerfaces.UpdateJobDao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mslc
 */
public class UpdateJobService {
    public ArrayList updateJob(int jobid) throws ClassNotFoundException, SQLException{
UpdateJobDao updatejobDao=new UpdateJobDaoImplementations();
    return updatejobDao.updateJob(jobid);
    }
}
