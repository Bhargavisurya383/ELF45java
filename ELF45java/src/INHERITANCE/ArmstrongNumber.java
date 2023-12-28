package INHERITANCE;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
	
		int temp1=num;
		int temp2=num;
		int count=0;
		while(temp1!=0)
		{
			count++;
			temp1/=10;
			
		}
		int sum=0;
	    int temp3=num;
		while(temp2!=0)
		{
			int rem=temp2%10;
			int pow=1;
			for(int i=1;i<=count;i++)
			{
				pow=pow*rem;
			}
			sum=sum+pow;
			temp2/=10;
		}
		if(temp3==sum)
		{
			System.out.println("Given number is armstrong number");
		}
		else
		{
			System.out.println("Not an armstrong");
		}
		
	}

}
