package com.management.service;

import com.management.model.JobUploadForm;
import com.management.daoimplementations.DisplayITJobsDaoImplementation;

import com.management.daointerfaces.DisplayITJobsDao;
import java.sql.SQLException;
import java.util.ArrayList;

public class DisplayITJobService {

        public ArrayList DisplayITUser() throws ClassNotFoundException, SQLException{
        DisplayITJobsDao displayDao = new DisplayITJobsDaoImplementation();
        ArrayList a2=displayDao.displayITUser();
        return a2;
    }
}
