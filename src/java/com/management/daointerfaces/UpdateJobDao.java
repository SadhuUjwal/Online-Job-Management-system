/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.daointerfaces;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mslc
 */
public interface UpdateJobDao {
public abstract ArrayList updateJob(int jobid ) throws ClassNotFoundException, SQLException;
}
