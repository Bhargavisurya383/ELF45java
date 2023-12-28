package INHERITANCE;

public class Class2 extends Class1 {
	public static void method()
	{
		System.out.println("Method 2");
	}
	public static void main(String[] args) {
		Class1 c1=new Class1();
		c1.method();//method 1
		Class2 c2=new Class2();
		c2.method();//method 2
		c1=c2;
		c1.method();//method 1
	}

}
