package November18;

public class Program2 {
	public static int CountTheWords(String s)
	{
		String[] s1=s.split(" ");
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!=null)
			{
				count++;
			}
				
		}
		return count;
	}
	public static void main(String[] args)
	{
		String s1="Sky is Beautiful";
		int res=CountTheWords(s1);
		System.out.println(res);
	}

}
