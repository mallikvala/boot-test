package com.procorp.api.procorppoc.utils;


import com.procorp.api.procorppoc.models.Account;
import com.procorp.api.procorppoc.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MockerUtil {

	public static Map<String, User> mockUsers() {
		Map<String, User> userMap = new HashMap<>();

		User u1 = stubUser("Viswa", "Gowkanapalli", "*******1234");
		User u2 = stubUser("Mallik", "Vala", "*******2344");
		User u3 = stubUser("Nag", "Vinnakota", "*******2345");
		User u4 = stubUser("Tom", "Chuck", "*******5566");
		User u5 = stubUser("Sara", "Rachelle", "*******6677");
		User u6 = stubUser("Marcus", "Wellcase", "*******9988");

		/*
		 * User u7 = stubUser("Viswa", "Gowkanapalli", "*******1234"); User u8 =
		 * stubUser("Viswa", "Gowkanapalli", "*******1234"); User u9 =
		 * stubUser("Viswa", "Gowkanapalli", "*******1234"); User u10 =
		 * stubUser("Viswa", "Gowkanapalli", "*******1234");
		 */

		u1.setAccounts(getAccountsForUser(1));
		u2.setAccounts(getAccountsForUser(2));
		u3.setAccounts(getAccountsForUser(3));
		u4.setAccounts(getAccountsForUser(4));
		u5.setAccounts(getAccountsForUser(5));
		u6.setAccounts(getAccountsForUser(6));
		//u1.setAccounts(getAccountsForUser(6));
	

		

		userMap.put("12312312", u1);
		userMap.put("12314312", u2);
		userMap.put("12374312", u3);
		userMap.put("62314316", u4);
		userMap.put("52314315", u5);
		userMap.put("82314310", u6);

		return userMap;
	}

	private static User stubUser(String firstName, String lastName, String ssn) {
		User user = new User();
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setSsn(ssn);
		return user;
	}

	private static Account stubAccount(String accountNumber,
			String accountType, String accountTitle) {

		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setAccountType(accountType);
		account.setAccountTitle(accountTitle);
		return account;

	}

	private static List<Account> getAccountsForUser(int userIdx) {

		List<Account> accounts = new ArrayList<>();
		switch (userIdx) {
		case 1:
			Account aa1 = stubAccount("234567", "Checking", "Checking Account");
			Account aa2 = stubAccount("234568", "Credit", "Credit Account");
			Account aa3 = stubAccount("234569", "Mortgage", "Mortgage Account");
			
			accounts.add(aa1);
			accounts.add(aa2);
			accounts.add(aa3);
			break;
		case 2:
			Account a1 = stubAccount("234570", "Checking", "Checking Account");
			Account a2 = stubAccount("234571", "Credit", "Credit Account");
			Account a3 = stubAccount("234572", "Mortgage", "Mortgage Account");

			accounts.add(a1);
			accounts.add(a2);
			accounts.add(a3);
			break;
		case 3:
			Account a4 = stubAccount("234573", "Checking", "Checking Account");
			Account a5 = stubAccount("234574", "Credit", "Credit Account");
			//Account a3 = stubAccount("234572", "Mortgage", "Mortgage Account");

			accounts.add(a4);
			accounts.add(a5);
			//accounts.add(a3);
			break;
		case 4:
			Account a6 = stubAccount("234575", "Checking", "Checking Account");
			//Account a2 = stubAccount("234571", "Credit", "Credit Account");
			//Account a3 = stubAccount("234572", "Mortgage", "Mortgage Account");

			accounts.add(a6);
			break;
		case 5:
			Account a7 = stubAccount("234576", "Checking", "Checking Account");
			Account a8 = stubAccount("234577", "Credit", "Credit Account");
			Account a9 = stubAccount("234578", "Mortgage", "Mortgage Account");

			accounts.add(a7);
			accounts.add(a8);
			accounts.add(a9);
			break;
		case 6:
			Account a10 = stubAccount("234579", "Checking", "Checking Account");
			Account a12 = stubAccount("234580", "Credit", "Credit Account");
			Account a11 = stubAccount("234581", "Mortgage", "Mortgage Account");

			accounts.add(a10);
			accounts.add(a12);
			accounts.add(a11);
			break;
		}

		return accounts;

	}
	
	public static void main(String as[]){
		Map<String,User> map = mockUsers();
		System.out.println(map);
		
		User user = map.get(""+12374312);
		
		for (Account account:user.getAccounts()){
			System.out.println(account.getAccountNumber());
		}
	}
}
