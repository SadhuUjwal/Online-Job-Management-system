/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.daointerfaces;

import com.management.model.JobUploadForm;
import java.sql.SQLException;

/**
 *
 * @author mslc
 */
public interface JobUploadDao {
public abstract void validateUser(JobUploadForm juf ) throws ClassNotFoundException, SQLException;
}
