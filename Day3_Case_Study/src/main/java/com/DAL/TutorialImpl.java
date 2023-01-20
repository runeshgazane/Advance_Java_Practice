package com.DAL;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.pojo.Tutorial;
import com.util.DBUtil;

public class TutorialImpl implements TutorialDAL {
	private Connection con;
	private Statement stmt;
	
	public TutorialImpl() {
		try {
			con=DBUtil.getCon();
			stmt=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Tutorial> getAllTutorials() throws SQLException {
		List<Tutorial> tutorialList=new ArrayList<Tutorial>();
		ResultSet rset=stmt.executeQuery("select * from tutorials");
		while(rset.next()) {
			// id | name| author | publish_date | visits | contents | topic_id
			int id=rset.getInt(1);
			String name=rset.getString(2);
			String author=rset.getString(3);
			Date publish_date=rset.getDate(4);
			int visits=rset.getInt(5);
			String contents=rset.getString(6);
			int topic_id=rset.getInt(2);
			Tutorial ttr=new Tutorial(id,name,author,publish_date,visits,contents,topic_id);
			tutorialList.add(ttr);
		}
		return tutorialList;
	}

}
