package INHERITANCE;

public class ch2  extends pa2{
	char ch;
	boolean d;
	public static void main(String[] args) {
		ch2 c1=new ch2();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.ch);
		System.out.println(c1.d);
		pa2 p1=c1;//upcasting
		System.out.println(p1.a);
		System.out.println(p1.b);
		//System.out.println(p1.ch);
		//System.out.println(p1.d);
		
		ch2 c2=(ch2)p1;//downcasting
		System.out.println(c2.a);
		System.out.println(c2.b);
		System.out.println(c2.ch);
		System.out.println(c2.d);
		
		
	}

}
