package AccountsPackage;
public class Account {
	private long number;
	private double balance;
	
	Account() {
		number = 0;
		balance = 0;		
	}
	
	Account(long newNumber, double newBalance) {
		setBalance(newBalance);
		
		this.number = newNumber;
		this.balance = newBalance;		
	}
	
	void setBalance(double newBalance)
	{
		this.balance = newBalance;
	}
	public double getBalance() {
		return this.balance;
	}
	
	public long getNumber() {
		return this.number;
	}
	
	public void deposit(double amount)
	{
		if (amount > 0)	balance = balance + amount;	
	}
	
	public void withdraw(double amount)
	{
		if ((amount > 0) && (amount < balance)) balance = balance - amount;	
		
	}
	
	public String accountToString()
	{
		
		String outputString = "Account Number:  " + this.number + "    Balance:  " + this.balance;
		return outputString;		
	}
	
}
