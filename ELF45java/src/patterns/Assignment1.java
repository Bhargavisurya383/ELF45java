package patterns;

public class Assignment1 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			int n=i;
			for(int j=1;j<=3;j++)
			{
				if(j%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(n);
					n=n+2;
				}
			}
			System.out.println();
				
		}
	}

}
