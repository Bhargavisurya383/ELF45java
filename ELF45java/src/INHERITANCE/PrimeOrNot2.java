package INHERITANCE;

import java.util.Scanner;

public class PrimeOrNot2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+"  is a composit number");
		}
	}

}
