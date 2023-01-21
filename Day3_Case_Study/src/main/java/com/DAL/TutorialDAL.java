package com.DAL;

import java.sql.SQLException;
import java.util.List;

import com.pojo.Tutorial;


public interface TutorialDAL {
	List<Tutorial> getAllTutorials() throws SQLException;
	
	List<Tutorial> getTutorialsById(int topicId) throws SQLException;
}
