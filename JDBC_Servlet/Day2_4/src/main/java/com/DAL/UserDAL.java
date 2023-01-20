package com.DAL;

import java.sql.SQLException;

import com.pojo.Users;

public interface UserDAL {
	String validateUser(Users u) throws SQLException;
	int insertUser(Users u) throws SQLException;
}
