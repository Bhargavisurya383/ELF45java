package November20;

public class Program2 {
	public static String RemoveDuplicates(String s)
	{
		char[] c=s.toCharArray();
		String s2="";
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length-1;j++)
			{
				if(c[i]==c[j])
				{
					c[i]='0';
					c[j]='0';
				}
			}
			if(c[i]!='0')
			{
			  s2=s2+c[i];	
			}
		}
		
		return s2;
	}
	
	public static void main(String[] args)
	{
		String s="Selenium";
		System.out.println(RemoveDuplicates(s));
	}

}
