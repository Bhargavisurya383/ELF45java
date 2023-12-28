package November18;

public class Program3 
{
	public static int IndexOfGievnChar(String s,char c)
	{
		int index=s.indexOf(c);
		return index;
	}
	public static void main(String[] args)
	{
		String s="Basavanagudi";
		int res= IndexOfGievnChar(s,'B');
		System.out.println(res);
	}

}
