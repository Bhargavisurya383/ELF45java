package INHERITANCE;

public class C3 extends  P3{

	public C3() {
		super(10);
		System.out.println("constructor 4");
	}
	public C3(int a)
	{
		super(a,20.5);
		System.out.println("constructor 5");
	}
	public C3(int a,double b)
	{
		System.out.println("constructor 6");
	}
	public static void main(String[] args)
	{
		C3 o1=new C3();
		C3 o2=new C3(10);
		C3 o3=new C3(10,20.5);
	}
}
