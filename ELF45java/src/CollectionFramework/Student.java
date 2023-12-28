package CollectionFramework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public  class Student implements Comparable {
	String sname;
	int rollno;
	double per;
	int std;
	public Student(String sname, int rollno, double per, int std) {
		
		this.sname = sname;
		this.rollno = rollno;
		this.per = per;
		this.std = std;
	}
	public String toString()
	{
	  return "Student name="+this.sname+" "+"Student rollno="+this.rollno+" "+"percentage="+this.per+" "+"Standard="+this.std;	
	}
	public int compareTo(Object o)
	{
		Student s=(Student)o;
		if(this.per==s.per)
			return 0;
		else if(this.per>s.per)
			return 1;
		else
			return -1;
	}
    public static void main(String[] args) {
    	LinkedList<Student> l=new LinkedList<>();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enetr the details");
    	System.out.println("Enter the name");
    	String sname=sc.nextLine();
    	System.out.println("enter the rollno");
    	int rollno=sc.nextInt();
    	System.out.println("Enter the percentage");
    	double per=sc.nextDouble();
    	System.out.println("enter the standard");
    	int std=sc.nextInt();
    	l.add(new Student(sname,rollno,per,std));
    	boolean flag=true;
    	do
    	{
    		System.out.println("Press Y to enter next details else press any key to exit");
    		char ch=sc.next().charAt(0);
    		if(ch=='Y'||ch=='y')
    		{
    			System.out.println("Enter the details");
    			System.out.println("enter the name");
    			sc.nextLine();
    			sname=sc.nextLine();
    			System.out.println("enter the rollno");
    	    	 rollno=sc.nextInt();
    	    	 System.out.println("Enter the percentage");
    	     	 per=sc.nextDouble();
    	     	  System.out.println("enter the standard");
    	          std=sc.nextInt();
    	          l.add(new Student(sname,rollno,per,std));
    		}else
    		{
    			flag=false;
    			
    		}
    	}while(flag);
    	System.out.println("before sorting");
    	System.out.println(l);
    	System.out.println("=======================================================");
    	System.out.println("After sorting");
    	Collections.sort(l);
    	System.out.println(l);
    	;
    	
    	
		
	}


}


