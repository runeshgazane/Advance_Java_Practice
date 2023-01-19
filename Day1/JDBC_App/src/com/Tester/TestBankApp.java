package com.Tester;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.DAL.AccountsImpl;
import com.Pojo.Account;
import com.Pojo.Type;
import com.Util.DBUtil;

public class TestBankApp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		DBUtil.openConnection();
		Scanner sc = new Scanner(System.in);
		AccountsImpl acct = new AccountsImpl();
		boolean flag = true;

		while (flag) {
			System.out.println("1.Display all accounts 2.Insert account 3.Update account"
					+ " 4.Delete account 5.Exit");
			System.out.println("Enter your choice : ");

			switch (sc.nextInt()) {
			case 1:
				List<Account> acctList = acct.getAllAccounts();
				acctList.forEach(a -> System.out.println(a));
				break;

			case 2:
				System.out.println("Enter name, account type, balance : ");
				Account a1 = new Account(sc.next(), Type.valueOf(sc.next().toUpperCase()), sc.nextDouble());
				int i = acct.insert(a1);
				if (i > 0) {
					System.out.println(i + " row inserted");
				}
				break;

			case 3:
				System.out.println("Enter id, name, account type, balance : ");
				a1 = new Account(sc.nextInt(), sc.next(), Type.valueOf(sc.next().toUpperCase()), sc.nextDouble());
				i = acct.update(a1);
				if (i > 0) {
					System.out.println(i + " row updated");
				}
				break;

			case 4:
				System.out.println("Enter id : ");
				i = acct.delete(sc.nextInt());
				if (i > 0) {
					System.out.println(i + " row deleted");
				}
				break;

			case 5:
				flag = false;
				break;
			}

		}
	}

}
