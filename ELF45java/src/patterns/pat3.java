package patterns;

public class pat3 {
	public static void main(String[] args) {
		int n=3;
		char c='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j)
				{
					System.out.print(c+" ");
					c=(char) (c+n);
					
				}
				else
				{
					System.out.print((i+j)*i+ " ");
				}
				
			}
			System.out.println();
		}
	}
}
