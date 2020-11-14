package DefaultPackage;
/*Taylor Abbott, Assignment 4 (Strings and Loops) Part 1. Phoneword.java
 * 
 * This program prompts the user for a “phone word,” an alphabetic mnemonic for a phone number. 
 * Then, print out the phone number corresponding to that sequence.
 * If the word entered is too short, it will keep trying to get a valid input from the user. 
 * 
 */

import java.util.Scanner;

public class Phoneword {

	public static void main(String[] args) {
		
		try {
			
			int q = 0;

			Scanner input = new Scanner(System.in);	
				
			while (q != 1) {
				System.out.print("Enter a phone word: ");
				String input_word = input.nextLine();
				String output_number = "";
			if (input_word.length() < 7)
			{
				System.out.print("\n");
				System.out.println("Word is not long enough for a phone number. ");
				System.out.print("\n");
				continue;
			}
		
		    for (char c : input_word.toLowerCase().toCharArray())
		    {
		    	if (output_number.length() >= 7) {
		    		q = 1;
		    		break;		    		
		    	}
			if (Character.isDigit(c))
		        output_number = output_number.concat(Character.toString(c));
		    else {
		        switch (c) {
		            case 'a' : case 'b' : case 'c' : {output_number = output_number.concat(Character.toString('2')); break;}
		            case 'd' : case 'e' : case 'f' : {output_number = output_number.concat(Character.toString('3')); break;}
		            case 'g' : case 'h' : case 'i' : {output_number = output_number.concat(Character.toString('4')); break;}
		            case 'j' : case 'k' : case 'l' : {output_number = output_number.concat(Character.toString('5')); break;}
		            case 'm' : case 'n' : case 'o' : {output_number = output_number.concat(Character.toString('6')); break;}
		            case 'p' : case 'q' : case 'r' : case 's' : {output_number = output_number.concat(Character.toString('7')); break;}
		            case 't' : case 'u' : case 'v' : {output_number = output_number.concat(Character.toString('8')); break;}
		            case 'w' : case 'x' : case 'y' : case 'z' : {output_number = output_number.concat(Character.toString('9')); break;}
		            default : continue;
		        }				
		        }
					
		}
		    System.out.print("\n");
		    System.out.print("The number is: " + output_number);
		    q = 1;
		    System.out.print("\n");
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
