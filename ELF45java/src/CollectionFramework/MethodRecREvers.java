package CollectionFramework;

public class MethodRecREvers {
	public static void Printrev(int num)
	{
		if(num==0)
		{
			return;
		}
		System.out.print(num+" ");
		Printrev(num-1);
		System.out.print(num+" ");
		return;
	}
	public static void main(String[] args)
	{
	  Printrev(5);	
	}

}
