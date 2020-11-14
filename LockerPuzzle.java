package DefaultPackage;
import java.util.Arrays;
/*Taylor Abbott, Assignment 6 (Single-Dimensional Arrays). LockerPuzzle.java
 * 
 * This program solves the locker puzzle:
 * 
 * A school has 100 lockers and 100 students. All lockers are closed on the first day of school. 
 * As the students enter, the first student, denoted as S1, opens every locker. 
 * Then the second student, S2, begins with the second locker, denoted as L2, and closes every other locker. 
 * Student S3 begins with the third locker and changes every third locker 
 * (closes it if it was open and opens it if it was closed). 
 * Student S4 begins with locker L4 and changes every fourth locker. 
 * Student S5 starts with locker L5 and changes every fifth locker, and so on, 
 * until student S100 changes L100.
 * After all the students have passed through the building and changed the lockers, which lockers are open?
 * 
 * We're gonna find out.
 * 
 * I know nested for loops are generally bad but idk how to do it otherwise
 */

public class LockerPuzzle {

	static Boolean[] lockerArray = new Boolean[100];
	
	public static void main(String[] args) {
	
	try
	{
		
	//Close all the lockers, false = closed, true= open
	Arrays.fill(lockerArray, Boolean.FALSE);
	
	//go through all the students opening/closing lockers
	flipLockers();
	
	//print out which ones are still open
	printOpenLockers();	

	}
	catch (Exception ex)
	{
		System.out.print("\n");
		System.out.println("Something went wrong! \n");
		System.out.print("\n");
		System.out.print("Exception:  " + ex);
	}
	
	}
	public static void flipLockers()
	{
		for (int s = 1; s <= lockerArray.length; s++) {
			
			for (int l = 0; l < lockerArray.length; l += s) {
				
				if (!lockerArray[l])
					lockerArray[l] = Boolean.TRUE;
				else
					lockerArray[l] = Boolean.FALSE;
			}
	}

}
	public static void printOpenLockers()
	{
		System.out.print("Lockers that are open: ");
		for (int i = 0; i < lockerArray.length; i++) {
			if ((lockerArray[i]) && (i != 81)) {
				System.out.print((i + 1) + ", ");
			}
			else if ((lockerArray[i]) && (i == 81)) {
				System.out.print("and " + (i + 1) + ". ");
			}
		}
		System.out.println();
		
	}
	
}
