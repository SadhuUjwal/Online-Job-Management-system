/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.service;

import com.management.daointerfaces.JobUploadDao;
import com.management.model.JobUploadForm;
import java.sql.SQLException;
import com.management.daoimplementations.JobUploadDaoImplementations;

/**
 *
 * @author mslc
 */
public class JobUploadService {
    public void validateUser(JobUploadForm juf) throws ClassNotFoundException, SQLException{
    JobUploadDao jobuploadDao=new JobUploadDaoImplementations();
    jobuploadDao.validateUser(juf);
    }

}
