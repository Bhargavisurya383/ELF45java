package INHERITANCE;

public class ch10 extends ch9{
	int c;
	int d;
	public static void main(String[] args) {
		ch10 c1=new ch10();
		ch9 c2=new ch9();
		ch10 c3=(ch10) c2 ;
		System.out.println(c3.c);
		
		
	}

}
