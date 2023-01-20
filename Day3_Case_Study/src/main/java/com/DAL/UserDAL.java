package com.DAL;

import java.sql.SQLException;

import com.pojo.User;

public interface UserDAL {
	User validateUser(User u) throws SQLException;
}
