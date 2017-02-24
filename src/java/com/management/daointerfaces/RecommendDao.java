/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.management.daointerfaces;
import com.management.model.RecommendedJob;
import java.sql.SQLException;
/**
 *
 * @author mslc
 */
public abstract class RecommendDao {
public abstract String recommendUser(String username ) throws ClassNotFoundException, SQLException;
}
