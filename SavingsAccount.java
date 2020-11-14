package AccountsPackage;

public class SavingsAccount extends Account{
	private double apr;
	
	SavingsAccount(){
		apr =0;
	}
	
	SavingsAccount(long newNumber, double newBalance, double newApr){
		this.apr = newApr;
	}
	
	public String accountToString() {
		
		 return super.accountToString() + "  APR: " + apr + "%";
		 }
	

	public double getApr() {
		return apr;
	}

	public void setApr(double newApr) {
		if (newApr >0) this.apr = newApr;	
	}
	
	public static double calculateInterest(double balance, double apr)
	{
		return balance*apr;
		
	}

}
