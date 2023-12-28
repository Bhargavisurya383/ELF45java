package ExceptionHandling;

public class Demo {
	public static void main(String[] args) {
		try
		{
			int a[]= {1,2,3,4,5};
			System.out.println(a[a.length]);
		}
		catch (Exception e) {
			System.out.println("Exception is handled");
		}
		finally {
			System.out.println("this is a finally block");
		}
	}

}
