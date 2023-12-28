package November18;

import java.util.Scanner;

public class Program4 {
	public static int[] SortArray(int b[])
	{
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(b[i]<b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		return b;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		int res[]=SortArray(a);
		System.out.println("Second largest element="+res[res.length-2]);
		
		
	}

}
