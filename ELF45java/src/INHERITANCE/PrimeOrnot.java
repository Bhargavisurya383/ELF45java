package INHERITANCE;

import java.util.Scanner;

public class PrimeOrnot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(n+"  is a prime number ");
		}
		else
		{
			System.out.println(n+" is a composit number");
			
		}
		
	}
	

}
