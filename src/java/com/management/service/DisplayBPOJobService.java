package com.management.service;

import com.management.model.JobUploadForm;

import com.management.daoimplementations.DisplayBPOJobsDaoImplementation;
import com.management.daointerfaces.DisplayBPOJobsDao;
import java.sql.SQLException;
import java.util.ArrayList;

public class DisplayBPOJobService {

        public ArrayList DisplayBPOUser() throws ClassNotFoundException, SQLException{
        DisplayBPOJobsDao displayDao = new DisplayBPOJobsDaoImplementation();
        ArrayList a2=displayDao.displayBPOUser();
        return a2;
    }
}
