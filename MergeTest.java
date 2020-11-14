package DefaultPackage;
/*Taylor Abbott, Assignment 6 (Single-dimensional arrays). MergeTest.java
 * 
 * Prompts the user for the lengths and contents of two sorted lists. 
 * It will sort the input lists if they aren't in order.
 * Outputs merged sorted list.
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

public class MergeTest {

	public static void main(String[] args) {	
		Scanner input = new Scanner(System.in);	
		System.out.print("Enter size of list 1: ");		
		int size1 = input.nextInt();
		System.out.print("\n");

        int array1[] = new int[size1];
        Arrays.sort(array1);
        System.out.print("Enter list 1: ");

        for (int i = 0 ; i < size1; i++ ) {
           array1[i] = input.nextInt();
        }

    	System.out.print("\n");   	
    	System.out.print("Enter size of list 2: ");		
		int size2 = input.nextInt();
		System.out.print("\n");

        int array2[] = new int[size2];
        System.out.print("Enter list 2: ");

        for (int i = 0 ; i < array2.length; i++ ) {
           array2[i] = input.nextInt();
        }
        Arrays.sort(array2);
    	System.out.print("\n");
    	
    	int[] array1and2 = merge(array1, array2);
    	
    	 StringBuffer sb = new StringBuffer();
         for(int i = 0; i < array1and2.length; i++) {
        	 int element = array1and2[i];
        	 sb.append(Integer.toString(element));
        	 sb.append(" ");
         }
         String str = sb.toString();
         System.out.print("The merged list is:  " + 
                 str);
	input.close();
	}
		
	public static int[] merge(int[] array1, int[] array2)
	{
		int[] array1and2 = new int[array1.length + array2.length];
    	int j = 0;
    	int k = 0;
    	for(int i = 0; i < array1and2.length; i++) 
    	{
    		if (j == array1.length)
    		{
    			array1and2[i] = array2[k];
    			k++;
    			continue;
    		}
    		if (k == array2.length)
    		{
    			array1and2[i] = array1[j];
    			j++;
    			continue;
    		}
    		
    			if (array1[j] <= array2[k])
    			{array1and2[i] = array1[j];
    			j++;
    			}
    			else if (array1[j] > array2[k])
    			{
    			array1and2[i] = array2[k];
    			k++; 
    			}
    		}
    		  	
    	return array1and2;
    	 				
	}
		
	}

