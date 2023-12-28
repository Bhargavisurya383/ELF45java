package Block;

public class StaticBlock4 {
	static int a=10;
	static 
	{
		int a=20;
		StaticBlock4.a=a;
		System.out.println(a);
	}
	static
	{
	 a=30;
	}
    public static void main(String[] args) {
    	
	System.out.println(a);
    	}
}
