package Interview_Questions;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int c=0;
		while(n-2>0) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
			n--;
		}
	}

}
