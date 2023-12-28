package FileHandling;

import java.util.Scanner;

public class College {
	String sname;
	int regno;
	String branch;
	public College(String sname,int regno,String branch )
	{
		this.sname=sname;
		this.regno=regno;
		this.branch=branch;
	}
	public String toString()
	{
		return "Student name="+this.sname+" "+"reg no="+this.regno+" "+"Branch name="+this.branch;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=sc.nextInt();
		College a[]=new College[size];
		System.out.println("enter the details");
		
		for(int i=0;i<size;i++)
		{
		    sc.nextLine();
			System.out.println("enter the name");
			String sname=sc.nextLine();
			System.out.println("enter the regno");
			int regno=sc.nextInt();
			System.out.println("enter the branch");
			String branch=sc.next();
			a[i]=new College(sname, regno, branch);
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}

}
