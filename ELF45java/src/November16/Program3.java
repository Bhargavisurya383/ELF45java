package November16;

public class Program3 {
	
	static int count=10;
	public static int Reverse(int n)
	{
		if(count!=0)
		{
			System.out.println(n);
			count--;
			Reverse(n-1);
			
		}
	return 0;
		
		
	}
	public static void main(String[] args)
	{
		Reverse(30);
		
	}

}
