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
	 * Override toString() method to print account info.
	 * Maybe try writing test cases.
	 				* For withdrawal.
	 				* For deposit (deposit negative amount) 
	 */
	
	public static void main(String[] args) {
		
		List<Account> accounts = new ArrayList<>();
		
		for(int i=0;i<3;i++){
			
			Account account = new Account(Data.generateName(), Data.generateAddress(), Data.generateBalance(), Data.getDate(), Data.generateAccountType(), Data.generateAccountStatus());
			accounts.add(account);
		}
		
		accounts.forEach((Account a) -> System.out.println(a));
	}

}
