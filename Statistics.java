package DefaultPackage;
/*Taylor Abbott, Assignment 4 (Strings and Loops) Part 2. Statistics.java
 * 
 *This program repeatedly asks a user to enter a price of an item or -1 when finished. 
 * When the user enters -1, your program will compute and display the total number of items, 
 * the average price, and the standard deviation of the prices.
 * 
 */
import java.util.Scanner; 
import java.util.ArrayList;
public class Statistics {	
	
	public static void main(String[] args) {
				
		try {
		double sum = 0;
		double newSum = 0;
		double q = 0;
		Scanner input = new Scanner(System.in);	
		ArrayList<Double> priceList = new ArrayList<Double>();
		
		while (q != -1) {			
			System.out.print("Enter a price, or -1 to quit: $");
			q = input.nextDouble();
			priceList.add(q);					
		}
		
		if (priceList.size() > 1) //calculate standard dev. only if list size is greater than 1
		{
			priceList.remove(priceList.size()-1);
			Double[] priceArray = new Double[priceList.size()];
			priceArray = priceList.toArray(priceArray);
					
			for (int i = 0; i < priceArray.length; i++) {
		        sum = sum + priceArray[i];
		    }
		    double average = (sum) / (priceArray.length); 

		    for (int i = 0; i < priceArray.length; i++) {
		        newSum = newSum + ((priceArray[i] - average) * (priceArray[i] - average)); 
		    }
		    double squaredDiffMean = (newSum) / (priceArray.length); 
		    double stanDev = (Math.sqrt(squaredDiffMean));
	        double roundedStanDev = Math.round(stanDev * 100.0) / 100.0;
	        
		System.out.print("\n");
		System.out.print("Number of items: " + priceList.size());
		System.out.print("\n");
		System.out.print("Standard deviation of prices is:  $" + roundedStanDev);
		System.out.print("\n");
				
	    }
		else 
		{
			System.out.print("Not enough data entered to calculate standard deviation. ");
			System.out.print("\n");
		}
		
		input.close();
		}
		catch (Exception ex)
		{		
			System.out.print("\n");
			System.out.print("Something went wrong!! \n");
			System.out.print("\n");
			System.out.print(ex);
		}
		
	}
}
