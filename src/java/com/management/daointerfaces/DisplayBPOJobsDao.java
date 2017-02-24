package com.management.daointerfaces;
import java.sql.SQLException;
import java.util.ArrayList;

import com.management.model.JobUploadForm;
public interface DisplayBPOJobsDao {
	public abstract ArrayList displayBPOUser() throws ClassNotFoundException, SQLException;
}
