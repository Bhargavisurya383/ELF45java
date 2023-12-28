package Novem17;

public class Program4 {
	public static void main(String[] args) {
		
		int sum=0;
		for(int i=5;i<=35;i++)
		{
			int count=0;
			for(int j=2;j<=i/2;j++)
			{
				
				if(i%j==0)
				{
					count++;
				}
							
			}
			
			if(count==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("Sum of all prime numbers 5 to 35="+sum);
		
	}

}
