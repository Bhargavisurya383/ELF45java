package Polymorphism;

import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
		System.out.println("Welcome to TicketBooking");
		System.out.println("Select your Choice");
		System.out.println("1.Second class");
		System.out.println("2.First class");
		System.out.println("3.Balcony");
		
		System.out.println("select your choice");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		MovieTicket mt=null;
		switch (choice)
		{
		case 1:
			{
			   mt=new FirstClass();
			   break;
			}
		case 2:
		{
			mt=new SecondClass();
			break;
		}
		case 3:
		{
			mt= new Balcony();
			break;
			
		}
		
		
		}
		if(mt instanceof FirstClass)
		{
			FirstClass ft=(FirstClass)mt;
			System.out.println("Your choice is Firstclass");
			System.out.println(ft.price);
		}
		else if(mt instanceof SecondClass)
		{
			SecondClass st=(SecondClass)mt;
			System.out.println("Your choice is second class");
			System.out.println(st.price);
		}
		else
		{
			Balcony bt=(Balcony)mt;
			System.out.println("Your choice is second class");
			System.out.println(bt.price);
			
		}
			
		
	}
}
	


