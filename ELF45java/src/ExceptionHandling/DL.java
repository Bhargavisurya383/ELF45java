package ExceptionHandling;

import java.util.Scanner;

public class DL {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if(age>=20)
		{
			System.out.println("Eligible for DL");
		}
		else
		{
			throw new DrivingLicenseException("Not eligible for DL");
		}
		
		
	}
}
