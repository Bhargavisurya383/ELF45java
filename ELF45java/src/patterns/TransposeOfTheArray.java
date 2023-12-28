package patterns;

import java.util.Scanner;

public class TransposeOfTheArray {
	
	public static int[][] transpose(int b[][])
	{
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				if(i>j)
				{
					int temp= b[i][j];
					b[i][j]=b[j][i];
					b[j][i]=temp;
				}
			}
				
		}
		return b;
	}

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the row of the array");
		    int row=sc.nextInt();
		    System.out.println("Enter the col of the array");
		    int col=sc.nextInt();
		    
		   
	
			 int arr[][]=new int[row][col];
			 System.out.println("enter the elements of the array");
			 
			
			 for(int i=0;i<arr.length;i++)
			 {
				 for(int j=0;j<arr[i].length;j++)
				 {
					 arr[i][j]=sc.nextInt();
				 }
			 }
			 System.out.println();
			 System.out.println("array elements before transpose");
			 for(int i=0;i<arr.length;i++)
			 {
				 for(int j=0;j<arr[i].length;j++)
				 {
					 System.out.print(arr[i][j]+" ");
				 }
				 System.out.println();
			 }
			 System.out.println("array elements after the transpose");
			 int res[][]=transpose(arr);
		         for(int i=0;i<res.length;i++)
		         {
		        	 for(int j=0;j<res[i].length;j++)
		        	 {
		        		 System.out.print(res[i][j]+" ");
		        	 }
		        	 System.out.println();
		         }
	}
}
