package INHERITANCE;

public class Driver1 {
	public static void main(String[] args) {
		Super s1=new Super();
		s1.a=10;
		s1.b=29.9766;
		Sub s2=new Sub();
		s2.a=100;
		s2.b=293.987;
		s2.f=98183.76f;
		s2.ch='D';
		System.out.println("s1.a="+s1.a+" "+"s1.b="+s1.b);
		System.out.println("s2.a="+s2.a+" "+"s2.b="+s2.b+" "+"s2.f="+s2.f+" "+"s2.ch="+s2.ch);
	}

}
