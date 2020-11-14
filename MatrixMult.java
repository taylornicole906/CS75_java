package DefaultPackage;
/*Taylor Abbott, Assignment 7 (Multiple-dimensional arrays). MatrixMult.java
* Program will prompt the user for the number of rows and columns for the first matrix, 
* then its contents. It will then prompt the user for the number of rows and columns
* for the second matrix, then its contents. It will call multiplyMatrix() 
* function and print the resulting matrix.
* If the matrices are not compatible, the program gives an error message.
*/

import java.util.Scanner;

public class MatrixMult {
	static int m1,n1,m2,n2;
	
	public static void main(String[] args) {
		try
		{
		Scanner input = new Scanner(System.in);	
		System.out.print("Matrix A \n");
		System.out.print("\n");
		System.out.print("Enter number of rows: ");		
		m1 = input.nextInt();
		System.out.print("\n");
		System.out.print("Enter number of columns: ");		
		n1 = input.nextInt();
		System.out.print("\n");
		System.out.print("Enter contents by rows: ");
		double matrixA[][] = new double[m1][n1];
		for (int i = 0; i < m1; i++)
		      for (int j = 0; j < n1; j++)
		        matrixA[i][j] = input.nextDouble();
		
		System.out.print("\n");
		System.out.print("Matrix B \n");
		System.out.print("\n");
		System.out.print("Enter number of rows: ");		
		m2 = input.nextInt();
		System.out.print("\n");
		System.out.print("Enter number of columns: ");		
		n2 = input.nextInt();
		System.out.print("\n");
		
		if (n1 == m2)
		{
			System.out.print("Enter contents by rows: ");
			 double matrixB[][] = new double[m2][n2];
				for (int i = 0; i < m2; i++)
				      for (int j = 0; j < n2; j++)
				        matrixB[i][j] = input.nextDouble();
				
				double product [][] = multiplyMatrix(matrixA, matrixB);
				
				System.out.print("\n");
				  System.out.println("Matrix C is: ");
				  System.out.print("\n");
				for (int i = 0; i < m1; i++) {
			        for (int j = 0; j < n2; j++)
			          System.out.print(product[i][j]+"\t");
			     System.out.print("\n");
				}
		 }
		
		else
		 {
			System.out.print("\n");
			System.out.println("The matrices can't be multiplied with each other.");
		   }		    	
		 
		input.close();
		}
		catch (Exception ex)
		{
			System.out.print("\n");
			System.out.print("Something went wrong, make sure inputs are of the correct type. \n");
			System.out.print("\n");
			System.out.print("Exception:  " + ex);
		}
	}

	
	public static double[][] multiplyMatrix(double[][] a, double [][] b)
	{
		double product [][] = new double [m1][n2];
		double sum = 0;
		  for (int i = 0; i < m1; i++) {
		         for (int j = 0; j < n2; j++) {
		           for (int k = 0; k < m2; k++)
		             sum = sum + a[i][k]*b[k][j];
		           
		           product[i][j] = sum;
		           sum = 0;
		         }}
		           return product;
	}
	
		  }
		  
		  

	
	
