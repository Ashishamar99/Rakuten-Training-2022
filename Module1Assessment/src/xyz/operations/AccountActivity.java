package xyz.operations;

import com.xyz.Account;

public class AccountActivity {
	static void validateWithdraw(long amount, Account account) {
		if(amount > account.getBalance()) {
			throw new IllegalArgumentException("Low Balance");
		}
	}
	
	static void validateDeposit(long amount, Account account) {
		account.setBalance( amount + account.getBalance() );
	}
}
