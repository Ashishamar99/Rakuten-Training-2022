package com.xyz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.lang.Enum;

public class XYZDemo {
	
	
	
	public static void main(String[] args) {
		
		List<Account> accounts = new ArrayList<>();
		
		for(int i=0;i<3;i++){
			
			Account account = new Account(Data.generateName(), Data.generateAddress(), Data.generateBalance(), Data.getDate(), Data.generateAccountType(), Data.generateAccountStatus());
			accounts.add(account);
		}
		
		accounts.forEach((Account a) -> System.out.println(a));
	}

}
