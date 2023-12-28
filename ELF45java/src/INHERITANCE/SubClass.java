package INHERITANCE;

public class SubClass extends SuperClass {
	public SubClass()
	{
		super();
		System.out.println("from constructor 2");
	}
	public static void main(String[] args) {
		SubClass s1=new SubClass();
		
	}

}
