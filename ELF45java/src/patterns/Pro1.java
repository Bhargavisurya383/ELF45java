package patterns;

public class Pro1 {

	{
		
		System.out.println("from non static block 1");
	}
	{
		System.out.println("From non static block 2");
	}
	public static void main(String[] args) {
		Pro1 o1=new Pro1();
	}
	{
		System.out.println("From non static block 3");
	}
	
   
}
