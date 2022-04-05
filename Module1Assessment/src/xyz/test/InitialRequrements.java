package xyz.test;


import org.junit.Before;

import com.xyz.Data;

import reference.templates.Account;
import xyz.operations.AccountActivity;

public class InitialRequrements {
	
	public Account account;
	@Before
	public void init() {
		account = new Account(Data.generateName(), Data.generateAddress(), Data.generateBalance(), Data.getDate(), Data.generateAccountType(), Data.generateAccountStatus());
	}

}
