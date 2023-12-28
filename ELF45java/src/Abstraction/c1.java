package Abstraction;

public class c1 implements I5 {
	public void m1() {
		System.out.println("method 1");
	}
	public void m2()
	{
		System.out.println("method 2");
	}
	public static void main(String[] args) {
		I5 o1=new c1();
		o1.m1();
		o1.m2();
	}

}
