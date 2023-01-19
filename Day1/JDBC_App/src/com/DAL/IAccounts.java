package com.DAL;

import java.sql.SQLException;
import java.util.List;

import com.Pojo.Account;

public interface IAccounts {
	int insert(Account act) throws SQLException;
	int update(Account act) throws SQLException;
	int delete(int id) throws SQLException;
	List<Account> getAllAccounts() throws SQLException;
	
}
