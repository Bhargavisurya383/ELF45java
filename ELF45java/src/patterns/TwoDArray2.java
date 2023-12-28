package patterns;

import java.util.Scanner;

public class TwoDArray2 {
	public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the size of the array");
		    int size=sc.nextInt();
	
			 int arr[][]=new int[size][size];
			 System.out.println("enter the elements of the array");
			 
			
			 for(int i=0;i<arr.length;i++)
			 {
				 for(int j=0;j<arr[i].length;j++)
				 {
					 arr[i][j]=sc.nextInt();
				 }
			 }
			 System.out.println();
				
				 for(int i1=0;i1<arr.length;i1++)
				 {
					 for(int j=0;j<arr[i1].length;j++)
					 {
						 System.out.print(arr[i1][j]+" ");
					 }
					 System.out.println();
				 
			 }
			 
			}

	}


