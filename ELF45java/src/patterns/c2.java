package patterns;

public class c2 extends c1 {
	int b=200;
	static int a=300;
	public static void main(String[] args) {
		c1 o1=new c1();
		System.out.println(c1.a);
		System.out.println(o1.b);
		c2 o2=new c2();
		o1=o2;
		System.out.println(o1.a);
		System.out.println(o1.b);
		
		System.out.println(c2.a);
		System.out.println(o2.b);
		
	}

}
