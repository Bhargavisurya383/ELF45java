package Block;

public class nsb6 {

	static
	{
		System.out.println("from sib1");
	}
	static
	{
		System.out.println("from sib 2");
	}
	public nsb6()
	{
		System.out.println("constructor 1");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	public nsb6(int a)
	{
		System.out.println("from constructor 2");
	}
	public static void main(String[] args) {
		nsb6 n1=new nsb6();
		System.out.println("from main");
		nsb6 n2=new nsb6(10);
		
	}
}
