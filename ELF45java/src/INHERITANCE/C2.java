package INHERITANCE;

public class C2 extends P2 
{

	public C2(int a ) {
		super(a);
		System.out.println("from constructor 2");
	} 
	public static void main(String[] args) {
		C2 o1=new C2( 10);
		
		
	}
}
