package AccountsPackage;
import java.util.ArrayList;
import java.util.List;

public class TestAccounts {

	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>();
		Account account1 = new Account(1006, 7500);
		accounts.add(account1);
		
		System.out.println(account1.accountToString());
		
		Account account2 = new SavingsAccount(30507, 4500, 1.5);
		
		System.out.println(accounts.get(0).accountToString());
		System.out.println(accounts.get(1).accountToString());
		//accounts[1] = new SavingsAccount(30507, 4500, 1.5);
		//accounts[2] = new CreditCardAccount(51782737, 7000, 8, 1000);
		//accounts[3] = new CreditCardAccount(629553328, 1500, 7.5, 5000);
		//accounts[4] = new CreditCardAccount(4977201043L, 0, 7.0, 3000);
		
	
			//System.out.println(accounts[j].accountToString()+ "\n");
		
		//System.out.println(accounts[0].getNumber());
		//System.out.println(accounts[0].accountToString()+ "\n");
	
	}

}
