package patterns;

public class random {
	public static void main(String[] args) {
		int n=4;
		char ch='A';
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=n;j++)
			 {
				 if(i==j)
				 {
					 System.out.print(ch+" ");
					 ch++;
				 }
				 else
				 {
					 System.out.print(i+" ");
				 }
				 
			 }
			 System.out.println();
		 }
	}

}
