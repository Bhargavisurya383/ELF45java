package November20;

public class Program_1_a {
	public static void main(String[] args)
	{
		int n=6;
		for(int i=1;i<=n;i++)
		{char c='A';
			for(int j=1;j<=n;j++)
			{
				
				if(i==j)
				{
					System.out.print("@"+" ");
				}
				else if(i>=j)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print(c++ + " ");
				}
			}
			System.out.println();
		}
		
	}

}
