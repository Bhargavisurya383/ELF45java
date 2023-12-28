package patterns;

public class pat2 {
	public static void main(String[] args) {
		int n=3;
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j)
				{
					System.out.print(ch++ + " ");
				}
				else
				{
				System.out.print(i+j + " ");
				}
			}
			System.out.println();
		}
		
	}

}
