package DefaultPackage;
/* Taylor Abbott, Test 1 
 * 
 * Program gets three cities from user input and then
 * outputs them in alphabetical order
 * 
 *
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Test1Program {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<String>();
		
		try {
		double first = 1.0;
		int sec = 3;
		if (first == sec)
		{
			
		}
		Scanner input = new Scanner(System.in);	
		System.out.print("Enter name of first city: ");
		String firstCity = input.nextLine();
		System.out.print("\n");		
		System.out.print("Enter name of second city: ");
		String secondCity = input.nextLine();
		System.out.print("\n");
		System.out.print("Enter name of third city: ");
		String thirdCity = input.nextLine();
		cities.add(firstCity);
		cities.add(secondCity);
		cities.add(thirdCity);
		java.util.Collections.sort(cities);
		System.out.print("The three cities in alphabetical order are: " + cities.get(0) + ", " +
				cities.get(1) + ", " + cities.get(2) + "." );
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


