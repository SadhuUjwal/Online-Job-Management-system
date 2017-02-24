/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.service;

import com.management.daoimplementations.DisplayAllJobsDaoImplementations;
import com.management.daointerfaces.DisplayAllJobsDao;
import com.management.model.JobUploadForm;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mslc
 */
public class DisplayAllJobsService {
    public ArrayList validateUser(JobUploadForm display)throws ClassNotFoundException, SQLException{
     DisplayAllJobsDao displayalljobsdao =  new DisplayAllJobsDaoImplementations();
     return displayalljobsdao.validateUser(display);
    }

}
