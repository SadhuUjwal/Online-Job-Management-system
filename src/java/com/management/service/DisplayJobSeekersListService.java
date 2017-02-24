/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.service;

import com.management.daoimplementations.DisplayJobSeekersListDaoImplementations;
import com.management.daointerfaces.DisplayJobSeekersListDao;
import com.management.model.SuitableJobForm;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mslc
 */
public class DisplayJobSeekersListService {
    public ArrayList displayJobSeeker(SuitableJobForm display)throws ClassNotFoundException, SQLException{
     DisplayJobSeekersListDao displayjobseeker =  new DisplayJobSeekersListDaoImplementations();
     return displayjobseeker.displayJobSeeker(display);
    }

}
