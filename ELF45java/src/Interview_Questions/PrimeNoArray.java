package Interview_Questions;

import java.util.Scanner;

public class PrimeNoArray {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elemnet");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Prime numbers are");
		for(int i=0;i<size;i++)
		{
			int flag=0;
			for(int j=2;j<arr[i]/2;j++)
			{
				if(arr[i]%2==0)
				{
					flag++;
				}
			}
			if(flag==0&&arr[i]!=1)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
