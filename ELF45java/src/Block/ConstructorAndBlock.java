package Block;

public class ConstructorAndBlock {

	public ConstructorAndBlock()
	{
		System.out.println("from constructor");
	}
	{
		System.out.println("from non static block");
	}
	public static void main(String[] args) {
		ConstructorAndBlock o1=new ConstructorAndBlock();
	}
}
