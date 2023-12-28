package INHERITANCE;

public class ch6 extends ch5 {
	int y=190;
	public static void main(String[] args) {
		ch6 c1=new ch6();
		System.out.println(c1.x);
		c1.x=200;
		System.out.println(c1.x);
		System.out.println(c1.y);
		
	}

}
