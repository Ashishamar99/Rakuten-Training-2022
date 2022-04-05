package xyz.operations;

import reference.templates.Account;

public class AccountActivity {
	 public boolean validateWithdraw(long amount, Account account) {
		if(amount > account.getBalance()) {
			throw new IllegalArgumentException("Low Balance");
		}
		return true;
	}
	
	 public boolean validateDeposit(long amount, Account account) {
		if(amount < 0) {
			throw new IllegalArgumentException("Amount should not be negative");
		}
		account.setBalance( amount + account.getBalance() );
		return true;
	}
}
