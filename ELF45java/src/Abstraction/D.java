package Abstraction;

public class D implements B,C {
	public void m1() 
	{
		System.out.println("method 1");
	}
	public void m2()
	{
		System.out.println("method 2");
	}
	public void m3() 
	{
		System.out.println("method 3");
	}
	public static void main(String[] args) {
		A a=new D();
		a.m1();//method 1
		//a.m2(); CTE
		//a.m3();CTE
		B b=new D();//upcasting
		b.m1();//method 1
		b.m2();//method 2
		//b.m3(); CTE
		
		C c=new D();
		c.m1();//method 1
		c.m3();//method 3
		//c.m2(); there is no relation between C and B
		
		
		
	}

}
