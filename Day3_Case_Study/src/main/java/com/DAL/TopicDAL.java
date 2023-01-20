package com.DAL;

import java.sql.SQLException;
import java.util.List;

import com.pojo.Topic;
import com.pojo.User;

public interface TopicDAL {
	List<Topic> getAllTopics() throws SQLException;
}
