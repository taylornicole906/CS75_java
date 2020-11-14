package DefaultPackage;
/*Taylor Abbott, Assignment 3 (Selection Structures), Part 2. Triangle.java
 * 
 * This program asks for the lengths of the three sides of a triangle.
 * Then it computes the perimeter if the input is valid.
 * An exception is thrown if input is not in correct format
 * 
 */
import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		try {
			
		Scanner input = new Scanner(System.in);
		int q = 0;
		while (q != 1) {
			
		System.out.print("Enter lengths of sides of the triangle, separated by a space: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();			
		
		if (a + b <= c || a + c <= b || b + c <= a) {	
			System.out.print("\n");
			System.out.print("Invalid Triangle \n");
			System.out.print("\n");					
		}
		
		else {			
			double perimeter = a + b + c;
			System.out.print("\n");
			System.out.print("Perimeter of the triangle: " + perimeter);
			System.out.print("\n");	
			q = 1;
		}
		    			
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

	




