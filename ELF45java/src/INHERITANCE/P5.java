package INHERITANCE;

public class P5 {
	public P5(int a)
	{
		this(a,20.5);
		System.out.println("Constructor 1");
		
	}
	public P5(int a,double b)
	{
		this();
		System.out.println("Constructor 2");
	}
	public P5()
	{
		System.out.println("Constructor 3");
	}

}
