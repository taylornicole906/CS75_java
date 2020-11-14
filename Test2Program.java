package DefaultPackage;
/* Taylor Abbott, Test 2
 * 
 * Program reads input integers that have values between 1 and 100 
 * it counts the occurrences of each.
 *
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test2Program {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in); 	
        List<Integer> intList = new ArrayList<Integer>();
        int q = 1;
		System.out.print("Enter integers between 1 and 100, and 0 when done: ");
        while (q != 0) {
           q = input.nextInt();
           intList.add(q);
        }

        Integer[] intArr = new Integer[intList.size()];
        intArr = intList.toArray(intArr);
        Arrays.sort(intArr);
        int len=intArr[intArr.length-1]+1;
        int count[]=new int[len];
        
        for(int n:intArr){
            count[n]++;
        }
        System.out.print("\n");
        
        for(int j=0;j<count.length;j++){
        	
        	if (j != 0)
        	{
            if(count[j]>=1){
            	if (count[j] >1) System.out.println(j+" occurs "+count[j] + " times\n");
            	else if (count[j] == 1) System.out.println(j+" occurs "+count[j] + " time\n");
            }
        }
        }
        input.close();   
        
    }
    
}