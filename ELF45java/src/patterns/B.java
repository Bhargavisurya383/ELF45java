package patterns;

public class B extends A {
	B(){
		
		this(10);
		System.out.println("Const 3");
	}
	B(int a)
	{
		System.out.println("const 4");
	}
	{
		System.out.println("iib 2");
	}
	public static void main(String[] args) {
		B b1=new B();
		
	}

}
