package ExceptionHandling;

public class E2 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
		System.out.println(4/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled");
		}
		System.out.println(4/5);
		System.out.println(100);
	}

}
