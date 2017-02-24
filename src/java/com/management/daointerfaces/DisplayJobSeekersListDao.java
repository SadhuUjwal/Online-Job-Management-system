/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.daointerfaces;

import com.management.model.SuitableJobForm;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mslc
 */
public interface DisplayJobSeekersListDao {
    public abstract ArrayList displayJobSeeker(SuitableJobForm display ) throws ClassNotFoundException, SQLException;

}
