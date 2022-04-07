package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	List<Account> accounts = new ArrayList<>();
	
	void save(Account account) {
		accounts.add(account);
	}

	public List<Account> getAllAccounts() {
		return accounts;
	}
}
