package INHERITANCE;

public class ch4 extends ch3 
{
	int c;
	public static void main(String[] args) {
		ch4 c1=new ch4();
		//System.out.println(c1.a);
		//System.out.println(c1.b);
		//System.out.println(c1.c);
		ch3 c2=new ch4();
		System.out.println(c2.a);
		System.out.println(c2.b);
		//System.out.println(c2.c); CTE
		
		pa3 p1=c1;
		System.out.println(p1.a);
		//System.out.println(p1.b);CTE
		//System.out.println(p1.c);CTE
		
		ch4 c3=(ch4)p1;
		System.out.println(c3.a);
		System.out.println(c3.b);
		System.out.println(c3.c);
		
	}

}
