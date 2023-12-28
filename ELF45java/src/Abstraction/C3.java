package Abstraction;

public class C3  extends C2{
	public void m1() {
		System.out.println("from method 1");
	}
	public void m2()
	{
		System.out.println("from method 2");
	}
	public static void main(String[] args) {
		C3 o1=new C3();
		o1.m1();
		o1.m2();
		P2 o2=new C3();//upcasting
		o2.m1();
		//o2.m2();//
		
	}

}
