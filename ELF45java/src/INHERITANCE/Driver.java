package INHERITANCE;

public class Driver {
 public static void main(String[] args) {
	Parent p1=new Parent();
	p1.a=10;
	p1.b=20.876;
	p1.c=820373;
	System.out.println(p1.a);
	System.out.println(p1.b);
	System.out.println(p1.c);
	Child c1=new Child();
	c1.a=40;
	c1.b=28.987;
	System.out.println(c1.a);
	System.out.println(c1.b);
	System.out.println(c1.c);
	
	
}
}
