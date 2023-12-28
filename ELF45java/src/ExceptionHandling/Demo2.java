package ExceptionHandling;

public class Demo2 {
	public static void main(String[] args) {
		try
		{
			int a[]= {1,2,3,4,5};
			System.out.println(a[a.length-1]);
		}
		catch (Exception e) {
			System.out.println("Exception handled");
		}
		finally {
			try
			{
				System.out.println(1/0);
			}
			catch (Exception e) {
				System.out.println("Exception handled 1");
			}
			finally {
				System.out.println();
			}
		}
		
	}

}
