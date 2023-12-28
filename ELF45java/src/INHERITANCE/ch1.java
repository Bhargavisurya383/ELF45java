package INHERITANCE;

public class ch1 extends pa1 {
	int c;
	int d;
	public static void main(String[] args) {
		ch1 c1=new ch1();
		System.out.println(c1.a);
	    System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println(c1 instanceof ch1);
		System.out.println(c1 instanceof pa1);
		pa1 p1=new pa1();
		System.out.println(p1.a);
		System.out.println(p1.b);
		System.out.println(p1 instanceof ch1);
		System.out.println(p1 instanceof pa1);
		p1=c1;
		System.out.println(p1);
		System.out.println(c1);
		System.out.println(p1 instanceof ch1);
		System.out.println(p1 instanceof pa1);
		
		ch1 c2=(ch1)p1;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(p1);
		
		System.out.println(c2.a);
		System.out.println(c2.b);
		System.out.println(c2.c);
		System.out.println(c2.d);
		
		
		
	
	}

}
