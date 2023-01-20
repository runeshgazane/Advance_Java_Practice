package com.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.Users;
import com.util.DBUtil;

public class UserImpl implements UserDAL {
	private PreparedStatement pstmt1;
	private PreparedStatement pstmt2;
	private Connection con;
	
	public UserImpl() throws SQLException {
		con=DBUtil.getCon();
		pstmt1=con.prepareStatement("select * from users where email=? and password=?");
		pstmt2=con.prepareStatement("insert into users (custName,city,email,password) values(?,?,?,?)");;
	}

	@Override
	public String validateUser(Users u) throws SQLException {
		pstmt1.setNString(1, u.getEmail());
		pstmt1.setNString(2, u.getPassword());
		ResultSet rset=pstmt1.executeQuery();
		while(rset.next()) {
			String name=rset.getString("custName");
			return name;
		}
		return null;
	}

	@Override
	public int insertUser(Users u) throws SQLException {
		pstmt2.setString(1, u.getName());
		pstmt2.setString(2, u.getCity());
		pstmt2.setString(3, u.getEmail());
		pstmt2.setString(4, u.getPassword());
		int i=pstmt2.executeUpdate();
		
		return i;
	}

}
