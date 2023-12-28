package patterns;

public class mixCharPat {
	public static void main(String[] args) {
		int a=1;
		char c='A';
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==j)
				{
					System.out.print("@"+" ");
				}
				else if(i<=j)
				{
					System.out.print(c++ +" ");
				}
				else if(i>=j)
				{
					System.out.print(a++ +" ");
				}
			}
			System.out.println();
		}
	}

}
