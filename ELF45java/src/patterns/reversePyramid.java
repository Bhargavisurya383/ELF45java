package patterns;
import java.util.Scanner;
public class reversePyramid {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		
		for(int i=num;i>=1;i--)
		{
			for(int j=i;j<num;j++)
			{
				System.out.print(" "+" ");
			}
			for(int k=1;k<=2*i-1;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
	

}
