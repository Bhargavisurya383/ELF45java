package Block;

public class StaticBlock1 {
	static
	{
		System.out.println("from static block1");
	}
	static {
		System.out.println("from static block 2");
	}
	public static void main(String[] args) {
		System.out.println("from main method");
	}

}
