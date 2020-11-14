package DefaultPackage;
/*Taylor Abbott, Assignment 3 (Selection Structures) Part 1. Shipping.java 
 * 
 * This program asks for the weight of the package and displays the shipping cost.
 *  If the weight is negative or zero, display a message “Invalid input.” 
 *  If the weight is greater than 20, display a message “The package cannot be shipped.”
 *  if invalid weight is entered it keeps looping until it gets a valid input
 *  
 */

import java.util.Scanner;

public class Shipping {

	public static void main(String[] args) {
			
		try { 
			Scanner input = new Scanner(System.in);
			
			//this value of q is used to determine if program keeps looping 
			int q = 0;
			
			while (q != 1) {
				
			System.out.print("Enter weight of package in pounds: ");		
			double weight  = input.nextDouble();
			String output = "";
			if (weight <= 0)
			{
				output = "Invalid weight";
				q = 0;
			}
			else if ((weight > 0) && (weight <= 1))
			{
				output = "Cost: 3.50";
				q = 1;
			}
			else if ((weight > 1) && (weight <= 3))
			{
				output = "Cost: 5.50";
				q = 1;
			}
			else if ((weight > 3) && (weight <= 10))
			{
				output = "Cost: 8.50";
				q = 1;
			}
			else if ((weight > 10) && (weight <= 20))			
			{
				output = "Cost: 10.50";
				q = 1;
			}
			else if (weight > 20)
			{
				output = "The package cannot be shipped.";
				q = 0;
			}
			
			System.out.print("\n");
			System.out.print(output + "\n");
			System.out.print("\n");
			
			} //while (q!=1)
			
			input.close();	
			}
		
			//catch block will execute if user input is a string or other incorrect format
			catch (Exception ex)
			{			
				System.out.print("\n");
				System.out.print("Something went wrong!! \n");
				System.out.print("\n");
				System.out.print(ex);
			}	

	}

}
