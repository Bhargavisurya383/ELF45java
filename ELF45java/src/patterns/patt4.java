package patterns;

public class patt4 {
	public static void main(String[] args) {
		int n=4;
		char c='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
		           if(i==j)
		           {
		        	   System.out.print(c++ + " ");
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
