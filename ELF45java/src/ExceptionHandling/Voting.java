package ExceptionHandling;

import java.util.Scanner;

public class Voting {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter your age");
				int age=sc.nextInt();
				if(age>=18)
				{
					System.out.println("Eligible for voting");
				}
				else
				{
			       throw new UnderAgeException("Not eligible for voting");
				}
							
	}

}
