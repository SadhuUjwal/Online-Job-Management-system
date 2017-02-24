
package com.management.service;

import com.management.model.JobUploadForm;

import com.management.daoimplementations.SuitableDaoImplementation;

import com.management.daointerfaces.SuitableDao;
//import com.management.model.SuitableJobForm;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DR100623
 */
public class SuitableJobService {
public ArrayList SuitableJob(String skills, String qualification)throws ClassNotFoundException, SQLException{
        SuitableDao suitableDao = new SuitableDaoImplementation();
         ArrayList a2=suitableDao.SuitableJob(skills,qualification);
        return a2;

         
    }
}
