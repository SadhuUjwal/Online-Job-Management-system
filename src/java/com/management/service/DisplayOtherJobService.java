package com.management.service;

import com.management.model.JobUploadForm;

import com.management.daoimplementations.DisplayOtherJobsDaoImplementation;
import com.management.daointerfaces.DisplayOtherJobsDao;
import java.sql.SQLException;
import java.util.ArrayList;

public class DisplayOtherJobService {

        public ArrayList DisplayOtherUser() throws ClassNotFoundException, SQLException{
        DisplayOtherJobsDao displayDao = new DisplayOtherJobsDaoImplementation();
        ArrayList a2=displayDao.displayOtherUser();
        return a2;
    }
}
