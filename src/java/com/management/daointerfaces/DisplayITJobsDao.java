package com.management.daointerfaces;
import java.sql.SQLException;
import java.util.ArrayList;

import com.management.model.JobUploadForm;
public interface DisplayITJobsDao {
	public abstract ArrayList displayITUser() throws ClassNotFoundException, SQLException;
}
