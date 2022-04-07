package com.rakuten;


public class Account {
	private Integer accountNumber;
	
	private String accountHolderName;
	private String address;
	private int balance;
	private String createdDate;
	private TYPE accountType;
	private STATUS accountStatus;
	
//	public int getAccountNumber() {
//		return accountNumber;
//	}
//	public void setAccountNumber(int accountNumber) {
//		this.accountNumber = accountNumber;
//	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public TYPE getAccountType() {
		return accountType;
	}

	public void setAccountType(TYPE accountType) {
		this.accountType = accountType;
	}

	public STATUS getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(STATUS accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	
	
//	@Override
//	public String toString() {
//		String accountInfo = String.format("Account Number:: %d\n Owner Name:: %s\n Address:: %s\n Balance:: %d\n Created Date:: %s\n Account Status:: %s\n Account Type:: %s", getAccountNumber(), getAccountHolderName(), getAddress(), getBalance(), getCreatedDate(), getAccountStatus(), getAccountType());
//		accountInfo += "\n------------------------------------\n";
//		return accountInfo;
//	}
	
	public long withdraw(int amount) {
		if(amount > this.getBalance()) {
			throw new IllegalArgumentException("Low Balance, the current balance is " + this.getBalance());
		}
		
		this.setBalance(this.getBalance() - amount);
		return this.getBalance();
	}
	
	public long deposit(int amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("Amount should not be negative, the entered amount is " + amount);
		}
		this.setBalance( amount + this.getBalance() );
		return this.getBalance();
	}
	
}
