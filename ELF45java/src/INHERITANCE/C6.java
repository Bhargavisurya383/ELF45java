package INHERITANCE;

public class C6 extends C5{
	public C6(char ch)
	{
		super();
		System.out.println("Constructor 7");
	}
	public C6(char ch,double b)
	{
		this(ch);
		System.out.println("Constructor 8");
	}
	public static void main(String[] args) {
		C6 o1=new C6('A',20.5);
	}

}
