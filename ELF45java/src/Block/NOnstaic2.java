package Block;

public class NOnstaic2 {
	
		{
			System.out.println("From nonstatic block 1");
		}
		{
			System.out.println("From nonstatic block 2");
		}
		{
			System.out.println("From nonstatic block 3");
		}
		public static void main(String[] args) {
			NOnstaic2 o1=new NOnstaic2();
			System.out.println("From main method");
			
		}

	}



