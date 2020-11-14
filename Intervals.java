package DefaultPackage;
/* Taylor Abbott, Assignment 3 (Selection Structures) Part 3. Intervals.java 
 * 
 * This program prompts the use to input two time intervals
 * It will then calculate how many minutes are in each interval, 
 * which one is longer, and whether the intervals overlap
 * 
 * Gives the correct answer even if the user enters the beginning and end times in the wrong order.
 * If later interval is put before the earlier one, it can't tell if they overlap
 * Probably way too long and convoluted, not my favorite thing I've written
 * but it works
 */

import java.util.Scanner;
public class Intervals {
 
	public static void main(String[] args) {
		
		try {
			
		Scanner input = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int hours1;
		int hours2;
		int hours3;
		int hours4;
		int minutes1;
		int minutes2;
		int minutes3;
		int minutes4;
		int earlier;
		int later;
		int laterInterval = 0;
		int earlierInterval =0;
		int switched = 0;
		
		System.out.print("Enter earlier start and end time as two 24-hour format times, separated by a space (ex: 0700 1045): ");
		String a = input.nextLine();
		String[] first_interval = a.split(" ");
		String time_1 = first_interval[0];
		String time_2 = first_interval[1];
		
		System.out.print("\nEnter later start and end time as two 24-hour format times, separated by a space (ex: 0900 1130): ");
		String b = input.nextLine();
		String[] sec_interval = b.split(" ");
		String time_3 = sec_interval[0];
		String time_4 = sec_interval[1];
		
		//turn strings to character arrays
		char[] charArr1 = new char[time_1.length()];
		char[] charArr2 = new char[time_2.length()];
		char[] charArr3 = new char[time_3.length()];
		char[] charArr4 = new char[time_4.length()];
		
		for (int i =0; i< time_1.length(); i++) 
		{
		charArr1[i] = time_1.charAt(i);
		charArr2[i] = time_2.charAt(i);	
		charArr3[i] = time_3.charAt(i);
		charArr4[i] = time_4.charAt(i);	
		}	
		
		/////////////////////////////////////////////////////////////////////////array 1
		if (charArr1[0] == '0') {
			hours1 = Integer.parseInt(String.valueOf(charArr1[1]));
		}
		else 
		{
			sb.append(charArr1[0]);
			sb.append(charArr1[1]);
			hours1 = Integer.parseInt(String.valueOf(sb.toString()));
			sb.setLength(0);	
		}
		
		if (charArr1[2] == '0') {
			minutes1 = Integer.parseInt(String.valueOf(charArr1[3]));
		}
		else 
		{
			sb.append(charArr1[2]);
			sb.append(charArr1[3]);
			minutes1 = Integer.parseInt(String.valueOf(sb.toString()));
			sb.setLength(0);			
		}
		
		////////////////////////////////////////////////////////////////////////////////////////
		
		
		/////////////////////////////////////////////////////////////////////////array 2
		if (charArr2[0] == '0') {
			hours2 = Integer.parseInt(String.valueOf(charArr2[1]));
		}
		else 
		{
			sb.append(charArr2[0]);
			sb.append(charArr2[1]);
			hours2 = Integer.parseInt(String.valueOf(sb.toString()));
			sb.setLength(0);	
		}
		
		if (charArr2[2] == '0') {
			minutes2 = Integer.parseInt(String.valueOf(charArr2[3]));
		}
		else 
		{
			sb.append(charArr2[2]);
			sb.append(charArr2[3]);
			minutes2 = Integer.parseInt(String.valueOf(sb.toString()));
			sb.setLength(0);			
		}
		
		////////////////////////////////////////////////////////////////////////////////////////
		
		
		/////////////////////////////////////////////////////////////////////////array 3
		if (charArr3[0] == '0') {
			hours3 = Integer.parseInt(String.valueOf(charArr3[1]));
		}
		else 
		{
			sb.append(charArr3[0]);
			sb.append(charArr3[1]);
			hours3 = Integer.parseInt(String.valueOf(sb.toString()));
			sb.setLength(0);	
		}
		
		if (charArr3[2] == '0') {
			minutes3 = Integer.parseInt(String.valueOf(charArr3[3]));
		}
		else 
		{
			sb.append(charArr3[2]);
			sb.append(charArr3[3]);
			minutes3 = Integer.parseInt(String.valueOf(sb.toString()));
			sb.setLength(0);			
		}
		
		////////////////////////////////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////////////array 4
		if (charArr4[0] == '0') {
			hours4 = Integer.parseInt(String.valueOf(charArr4[1]));
		}
		else 
		{
			sb.append(charArr4[0]);
			sb.append(charArr4[1]);
			hours4 = Integer.parseInt(String.valueOf(sb.toString()));
			sb.setLength(0);	
		}
		
		if (charArr4[2] == '0') {
			minutes4 = Integer.parseInt(String.valueOf(charArr4[3]));
		}
		else 
		{
			sb.append(charArr4[2]);
			sb.append(charArr4[3]);
			minutes4 = Integer.parseInt(String.valueOf(sb.toString()));
			sb.setLength(0);			
		}
		
		////////////////////////////////////////////////////////////////////////////////////////
		
		//fix if inputted start/end time out of order
		if (hours1 > hours2)
		{
			later = hours1;
			earlier = hours2;
			hours1 = earlier;
			hours2 = later;
		}
		
		if (hours3 > hours4)
		{
			later = hours3;
			earlier = hours4;
			hours3 = earlier;
			hours4 = later;
		}
			
		//find how long each interval is
		
		int lenInterval1 = (hours2*60 + minutes2)-(hours1*60 + minutes1);
		int lenInterval2 = (hours4*60 + minutes4)-(hours3*60 + minutes3);
		
		if ((hours1*60 + minutes1) > (hours3*60 + minutes3))
		{
			laterInterval = lenInterval1;
			earlierInterval = lenInterval2;
			lenInterval1 = earlierInterval;
			lenInterval2 = laterInterval;
			switched =1;
		}
		System.out.println("  ");
		System.out.println("The earlier interval is " + String.valueOf(lenInterval1) + " minutes long.");
		System.out.println("The later interval is " + String.valueOf(lenInterval2) + " minutes long.");
		
		//find which interval is longer
				
		if (lenInterval1 > lenInterval2)
		{
			System.out.println("The earlier interval is longer.");
		}
		else if (lenInterval1 == lenInterval2)
		{
			System.out.println("The intervals are the same length.");
		}
		else {
			System.out.println("The later interval is longer.");
		}
		
		//find if intervals overlap
		if (((hours1*60 + minutes1) < (hours4*60 + minutes4)) && ((hours2*60 +minutes2)>(hours3*60+minutes3)) && switched ==0)
		{
			System.out.println("The intervals overlap.");
		}
		else if (switched == 1)
		{
			System.out.println("The later interval was input before the earlier interval. I can't tell if they overlap");
		}
		else
		{
			System.out.println("The intervals do not overlap.");	
		}
				
		input.close();
	}
	catch (Exception ex)
	{			
		System.out.print("\n");
		System.out.print("Something went wrong!! Make sure to input correct time formats. \n");
		System.out.print("\n");
		System.out.print(ex);
	}	
	}
}

