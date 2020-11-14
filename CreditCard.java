package DefaultPackage;
/*Taylor Abbott, Assignment 5 (Methods). CreditCard.java
 * 
 * This program prompts the user for a valid credit card number. 
 * Then, it determines if the card number is valid or not. 
 * It will keep asking for a valid number indefinitely until it gets one.
 * If you input a string or other invalid format it catches an exception 
 * and prints the exception. 
 * 
 */

import java.util.Scanner;

public class CreditCard {
	
	public static void main(String[] args) 
    { 
		Scanner input = new Scanner(System.in);	
		try
		{	
		int q = 0;		
		while (q ==0)
		{
		System.out.print("Enter a valid credit card number:  ");
		long creditCardNumber = input.nextLong();
		
		boolean valid = (getSize(creditCardNumber) >= 13 &&  
	               getSize(creditCardNumber) <= 16) && 			 	
				 	((getPrefix(creditCardNumber, 1) == 4) ||
				 	(getPrefix(creditCardNumber, 1) == 5) || 
				 	(getPrefix(creditCardNumber, 2) == 37) ||
				 	(getPrefix(creditCardNumber, 1) == 6)
				 	) &&    
	              ((sumOfDoubleEvenPlace(creditCardNumber) +  
	                sumOfOddPlace(creditCardNumber)) % 10 == 0);  
		if (valid)
		{			
			System.out.print("\n");
			System.out.print(creditCardNumber + " is a valid credit card number.");
			System.out.print("\n");
			
			if (getPrefix(creditCardNumber, 1) == 4)
			{
				System.out.print("\n");
				System.out.print("This is a Visa card.");
				System.out.print("\n");
			}
			if (getPrefix(creditCardNumber, 1) == 5)
			{
				System.out.print("\n");
				System.out.print("This is a Master card.");
				System.out.print("\n");
			}
			if (getPrefix(creditCardNumber, 1) == 6)
			{
				System.out.print("\n");
				System.out.print("This is a Discover card.");
				System.out.print("\n");
			}
			if (getPrefix(creditCardNumber, 2) == 37)
			{
				System.out.print("\n");
				System.out.print("This is an American Express  card.");
				System.out.print("\n");
			}
			q = -1;
		}
		else 
		{
			System.out.print("\n");
			System.out.print(creditCardNumber + " is NOT a valid credit card number. \n");
			System.out.print("\n");
		}
		}		
        input.close();
		}
		
		catch (Exception ex)
		{
			System.out.print("\n");
			System.out.print("Invalid input, make sure credit card number is an integer. \n");
			System.out.print("\n");
			System.out.print("Exception:  " + ex);
		}
    } 
	
	/** Return true if the card number is valid */
	public static boolean isValid(long number)
	{
		return false;
		
	}

	/** Return the sum of the doubled even-place digits */
	public static int sumOfDoubleEvenPlace(long creditCardNumber)
	{
		int sum = 0; 
        String num = creditCardNumber + ""; 
        for (int i = getSize(creditCardNumber) - 2; i >= 0; i -= 2)  
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2); 
        return sum;       
        
	}

	/** Return the given number if it is a single digit,
	 *  otherwise return the sum of the two digits */
	public static int getDigit(int n)
	{

		if (getSize(n) > 1)
		{
			String nString = Integer.toString(n);
			char firstDigit = nString.charAt(0);
			char secondDigit = nString.charAt(1);
			n = Character.getNumericValue(firstDigit) + Character.getNumericValue(secondDigit);			
		}
		return n;
		
	}

	/** Return the sum of the odd-place digits */
	public static int sumOfOddPlace(long creditCardNumber)
	{
		int sum = 0; 
	     String num = creditCardNumber + ""; 
	     
	     	//for loop has to go from i = length of number to 0
	        for (int i = getSize(creditCardNumber) - 1; i >= 0; i -= 2)  
	            sum += Integer.parseInt(num.charAt(i) + "");         
	        return sum; 
	}

	/** Return the number of digits in the given number */
	public static int getSize(long number)
	{
		 String num = number + ""; 
	      return num.length(); 
		
	}

	/** Return the first k number of digits from number. If the
	 *  number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k)
	{
		if (getSize(number) > k) { 
            String num = number + ""; 
            return Long.parseLong(num.substring(0, k)); 
        } 	
		return k;		
	}

}
