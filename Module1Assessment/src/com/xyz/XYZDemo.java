package com.xyz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import reference.templates.Account;

import java.lang.Enum;

public class XYZDemo {
	
	/*
	 * Problems - 
	 * If Account was in another package, it was not visible in Data for me to write in the generate code.
	 * XYZDemo and Account should be in same package, for XYZDemo to access enums under Account. 
	 */
	
	//TO-DOs - 
	/*
	 * Create a hashmap of account numbers (Keys) and accounts (Values) to access them.
	 * Try out a logic for generating account numbers other than counters. (Maybe)
	 * 
	 * (Done) - Override toString() method to print account info.
	 * (Done) - Maybe try writing test cases. 
	 				* For withdrawal.
	 				* For deposit (deposit negative amount)
	 * Perform withdraw and deposit for each account under accounts.
	 */
	
	public static void main(String[] args) {
		
		List<Account> accounts = new ArrayList<>();
		
		for(int i=0;i<3;i++){
			
			Account account = new Account(Data.generateName(), Data.generateAddress(), Data.generateBalance(), Data.getDate(), Data.generateAccountType(), Data.generateAccountStatus());
			accounts.add(account);
		}
		
		//Displaying the account info.
		accounts.forEach((Account account) -> System.out.println(account));
		
		System.out.println("------------------------------------");
		System.out.println("\nDemo of Withdrawing 200 Rs\n");
			//For each of the accounts, lets withdraw 200 Rs and view the account information.
			accounts.forEach((Account account) -> {
				System.out.println(String.format("Account Number:: %d", account.getAccountNumber()));
				System.out.println(String.format("Previous Balance:: %d", account.getBalance()));
				account.withdraw(200);
				System.out.println(String.format("Balance after withdrawal:: %d", account.getBalance()));
				System.out.println("------------------------------------");
			});
		
		System.out.println("------------------------------------");
		System.out.println("\nDemo of Deposit 500 Rs\n");
			//For each of the accounts, lets deposit 500 Rs and view the account information.
			accounts.forEach((Account account) -> {
				
				System.out.println(String.format("Account Number:: %d", account.getAccountNumber()));
				System.out.println(String.format("Previous Balance:: %d", account.getBalance()));
				account.deposit(500);
				System.out.println(String.format("Balance after deposit:: %d", account.getBalance()));
				System.out.println("------------------------------------");
					});
		//Error in withdrawal and deposit is shown in AccountActivityTest. Run that as a Junit test.
	}

}
