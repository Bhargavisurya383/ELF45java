package November20;

public class Program1_b {
	public static void main(String[] args)
	{
		int n=6;
		int num=1;
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			char c='A';
			for(int k=1;k<=i;k++)
			{
				
				if(i%2!=0)
				{
				System.out.print(num+++" ");
				}
				else
				{
					System.out.print(c+++" ");
				}
			}
			System.out.println();
		}
			
		
	}

}
