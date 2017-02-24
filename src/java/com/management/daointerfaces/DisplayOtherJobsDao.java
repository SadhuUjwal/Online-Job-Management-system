package com.management.daointerfaces;
import java.sql.SQLException;
import java.util.ArrayList;

import com.management.model.JobUploadForm;

public interface DisplayOtherJobsDao {
	public abstract ArrayList displayOtherUser() throws ClassNotFoundException, SQLException;
}
