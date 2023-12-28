package INHERITANCE;

public class Son2 extends Son1 {
	int b=200;

	void method()
	{
		System.out.println("method 3");
	}
	public static void main(String[] args) {
		Son2 s2=new Son2();
		System.out.println(s2.a);
		s2.method();
		Son1 s3=new Son2();//
		Son2 s4=(Son2)s3;
		s3.method();
		System.out.println(s4.b);
		
		
	}
}
