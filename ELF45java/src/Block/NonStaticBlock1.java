package Block;

public class NonStaticBlock1 {
	{
		System.out.println("From nonstatic block");
	}
	public static void main(String[] args) {
		
		System.out.println("From main method");
		NonStaticBlock1 o1=new NonStaticBlock1();
	}

}
