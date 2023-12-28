package patterns;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
				
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			int prod=1;
			for(int i=1;i<=rem;i++)
			{
			    prod=prod*i;
			}
			sum=sum+prod;
			num/=10;
			
		}
		if(temp==sum)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("not a strong number");
		}
	}

}
