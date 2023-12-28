package patterns;

import java.util.Scanner;

public class diamond {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i = 1 ; i<=num ; i++){
			
			for(int j = 1 ; j<=num-i ; j++)
			{
				System.out.print(" "+" ");
			} 
			for(int k = 1 ; k<=2*i-1 ; k++){
				System.out.print("*"+" ");
			}
		System.out.println( );
	}
		
		for(int i=num-1;i>=1;i--)
		{
			for(int j=i;j<num;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
