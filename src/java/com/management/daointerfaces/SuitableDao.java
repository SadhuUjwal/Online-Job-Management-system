/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.daointerfaces;

import com.management.model.JobUploadForm;
//import com.management.model.SuitableJobForm;
import java.sql.SQLException;
import java.util.ArrayList;


public interface SuitableDao {
public abstract ArrayList SuitableJob(String skills, String qualification)throws ClassNotFoundException,SQLException;
}
