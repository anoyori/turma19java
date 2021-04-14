package entities;

public class Account {
	
	private String accountNumber = "";
	private String name;
	private double balance = 0.00;
	
	//construtor	

	public Account(String accountNumber, String name, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	//sobrecarga
	public Account(String accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
	}

	//getter and setter

	public String getAccount() {
		return accountNumber;
	}

	/*public void setAccount(String account) {
		this.account = account;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//methods
	
	public void add(double depositValue) {
		balance += depositValue;
	}

	public void remove(double withdrawValue) {
		balance -= withdrawValue + 5.0;
	}
	public String toString() {
		return "Account " + accountNumber + ", holder: " + name + " balance: " + String.format("%.2f", balance);
	}
}
