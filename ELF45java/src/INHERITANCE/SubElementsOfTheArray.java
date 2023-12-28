package INHERITANCE;

import java.util.Scanner;

public class SubElementsOfTheArray {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("elements of the array are:");
		for(int i=0;i<size;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(a[k]+" ");
				}
				System.out.println();
			}
		}
	}

}
