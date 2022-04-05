package reference.templates;
import java.util.HashMap;


public class Account {
	private static int counter = 100000;
	private int accountNumber;
	private String accountHolderName;
	private HashMap<String, String> address;
	private long balance;
	private String createdDate;
	private TYPE accountType;
	private STATUS accountStatus;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
//	private HashMap<String, String> addressInitializer() {
//		HashMap<String, String> map = new HashMap<>();
//		
//		map.put("House Number", "");
//		map.put("Street", "");
//		map.put("City", "");
//		map.put("Pincode", "");
//		map.put("State", "");
//		map.put("Phone Number", "");
//		
//		return map;
//	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public HashMap<String, String> getAddress() {
		return address;
	}

	public void setAddress(HashMap<String, String> address) {
		this.address = address;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
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
	
	private int generateAccountNumber() {
		return counter++;
	}
	public Account(String accountHolderName, HashMap<String, String> address, long balance, String createdDate,
			TYPE accountType, STATUS accountStatus) {
		super();
		this.accountHolderName = accountHolderName;
		this.address = address;
		this.balance = balance;
		this.createdDate = createdDate;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
		this.accountNumber = generateAccountNumber();
	}
	
	
	@Override
	public String toString() {
		String accountInfo = String.format("Account Number:: %s\n Owner Name:: %s\n Address:: %s\n Balance:: %d\n Created Date:: %s\n Account Status:: %s\n Account Type:: %s", getAccountNumber(), getAccountHolderName(), getAddress(), getBalance(), getCreatedDate(), getAccountStatus(), getAccountType());
		accountInfo += "\n------------------------------------\n";
		return accountInfo;
	}
	
	public long withdraw(long amount) {
		if(amount > this.getBalance()) {
			throw new IllegalArgumentException("Low Balance, the current balance is " + this.getBalance());
		}
		
		this.setBalance(this.getBalance() - amount);
		return this.getBalance();
	}
	
	public long deposit(long amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("Amount should not be negative, the entered amount is " + amount);
		}
		this.setBalance( amount + this.getBalance() );
		return this.getBalance();
	}
	
}
