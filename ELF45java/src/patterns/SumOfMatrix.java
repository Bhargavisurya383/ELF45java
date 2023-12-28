package patterns;
import java.util.Scanner;

public class SumOfMatrix {
	
	public static int[][] add(int arr[][],int brr[][])
	{
		int res[][]=new int[arr.length][brr.length];
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				res[i][j]=arr[i][j]+brr[i][j];
			}
		}
		return res;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row");
		int row=sc.nextInt();
		System.out.println("enter the col");
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		int brr[][]=new int[row][col];
		System.out.println("enter the elements of first matrix ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("elemts of the first matrix:");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("enter the elements of second matrix");
		
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				brr[i][j]=sc.nextInt();
			}
		}
		System.out.println("elemts of the second matrix:");
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<brr[i].length;j++)
			{
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("after summation");
		
		
		int result[][]=add(arr,brr);
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result[i].length;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
