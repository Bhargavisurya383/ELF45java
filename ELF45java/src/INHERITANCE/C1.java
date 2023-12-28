package INHERITANCE;

public class C1  extends P1{
	public C1()
	{
		System.out.println("from constructor 3");
	}
	public C1(int a)
	{
		super();
		System.out.println("From constructor 4");
	}
	public static void main(String[] args) {
		C1 o1=new C1();
		C1 o2=new C1(10);
	}

}
