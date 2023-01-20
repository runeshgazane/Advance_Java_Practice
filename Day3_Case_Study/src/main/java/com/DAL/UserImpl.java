package com.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.pojo.User;
import com.util.DBUtil;

public class UserImpl implements UserDAL {
	private PreparedStatement pstmt1;
	private Connection con;
	
	public UserImpl() throws SQLException {
		con=DBUtil.getCon();
		pstmt1=con.prepareStatement("select * from users where email=? and password=?");
	}

	@Override
	public User validateUser(User u) throws SQLException {
		User user=null;
		pstmt1.setString(1, u.getEmail());
		pstmt1.setString(2, u.getPassword());
		ResultSet rset=pstmt1.executeQuery();
		while(rset.next()) {
			int id=rset.getInt("id");
			String name=rset.getString("name");
			String email=rset.getString("email");
			String password=rset.getString("password");
			double regamt=rset.getDouble("reg_amt");
			Date regdate=rset.getDate("reg_date");
			String role=rset.getString("role");
			user=new User(id,name,email,password,regamt,regdate,role);
		}
		return user;
	}

}
