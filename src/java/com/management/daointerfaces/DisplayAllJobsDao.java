/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.daointerfaces;

import com.management.model.JobUploadForm;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mslc
 */
public interface DisplayAllJobsDao {
public abstract ArrayList validateUser(JobUploadForm display ) throws ClassNotFoundException, SQLException;
}
