package Abstraction;

public class class2 implements I6,I7 {
	public void method1()
	{
		System.out.println("method 1");
	}
	public void method2() {
		System.out.println("method 2");
	}
	public static void main(String[] args) {
		I6 o1=new class2();
		o1.method1();
		//o1.method2(); there is no is a relation between I6 and I7
		
		I7 o2=new class2();
		o2.method2();
		
		I6 o3=new class2();
	    o3.method1();
	    
	
	}
}
