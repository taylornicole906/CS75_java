package DefaultPackage;
//Taylor Abbott, Assignment 2 (Variables)
/*This program prompts the user to enter a temperature between -58°F and 41°F and wind speed,
  then calculates and displays the wind-chill temperature.*/

import java.util.Scanner;

public class Windchill {
	public static void main(String[] args) {
		try { 
		Scanner input = new Scanner(System.in);
		//this value of q is used to determine if program keeps looping 
		//if invalid temp or wind speed is entered it keeps trying to get valid number from user
		//if wind chill is successfully calculated, q is set to 1 and program quits looping
		int q = 0;
		
		while (q != 1) {
			
		System.out.print("Enter a temperature between -58\u00b0F and 41\u00b0F: ");		
		double temperature  = input.nextDouble();
			
		if (temperature >= -58 && temperature <= 41) {
			System.out.print("\n");
			System.out.print("Enter a wind speed (>= 2) in miles per hour: ");	
			double windSpeed = input.nextDouble();
			
			if (windSpeed >= 2) {
				//both inputs valid, do wind chill calculation
				q = 1;
				double windExponent = Math.pow(windSpeed, 0.16);
				double windChillIndex = 35.74 + (0.6215*temperature) - (35.75*windExponent) + (0.4275*temperature*windExponent);
				System.out.print("\n");
				System.out.print("Wind Chill Index is: " + windChillIndex);		
			}
			
			else {
				System.out.print("\n");
				System.out.print("Invalid wind speed. \n");
				System.out.print("\n");
				q = 0; }						
		}
		else {
			System.out.print("\n");
			System.out.print("Invalid temperature.\n");
			System.out.print("\n");
			q = 0; }
		
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


