package com.DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.pojo.Topic;
import com.util.DBUtil;

public class TopicImpl implements TopicDAL {
	private Statement stmt;
	private Connection con;

	public TopicImpl() throws SQLException {
		con = DBUtil.getCon();
		stmt = con.createStatement();
	}

	@Override
	public List<Topic> getAllTopics() throws SQLException {
		List<Topic> topicList=new ArrayList<Topic>();
		ResultSet rset=stmt.executeQuery("select * from topics");
		while(rset.next()) {
			int id=rset.getInt(1);
			String name=rset.getString(2);
			Topic t=new Topic(id,name);
			topicList.add(t);
		}
		return topicList;
	}

}
