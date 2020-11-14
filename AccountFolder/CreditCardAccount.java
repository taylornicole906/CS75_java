package AccountsPackage;

public class CreditCardAccount extends Account{
	private long number;
	private double balance;
	private double apr;
	private double creditLimit;
	
	CreditCardAccount(){
		creditLimit = 0;
	}
	
	CreditCardAccount(long newNumber, double newBalance, double newApr, double newCreditLimit){
		this.apr = newApr;
		this.number = newNumber;
		this.balance = newBalance;
		this.creditLimit = newCreditLimit;		
	}
	
	public String AccountToString() {
		 return super.accountToString() + "  APR " + this.apr + "  Credit limit: " + creditLimit;
		 }

	public double getApr() {
		return apr;
	}

	public void setApr(double newApr) {
		if (newApr >0) this.apr = newApr;	
	}
	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double newCreditLimit) {
		if (newCreditLimit > 0) this.creditLimit = newCreditLimit;	
	}


	
	public void withdraw(double amount)
	{
		if ((amount > 0) && ((balance - amount) > (-1*creditLimit)))
				{
					balance = balance - amount;	
				}
		
	}
	
	public static double calculatePayment(double apr, double balance)
	{
		double payment = 0;
		if (balance < 0) {
			  payment = 20 + ((apr/12)*(-balance));
		}
		
		return payment;
	}
	
}
