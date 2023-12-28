package Novem17;

public class Program3 {
	public static void main(String[] args)
	{
		String s1="AAAAbbbbbccDDDeeeeeFFFFgggg";
	    char[] s2=s1.toCharArray();	
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i]>='A'&&s2[i]<='Z')
			{
				s2[i]=(char) (s2[i]+32);
			}
			else
			{
				s2[i]=(char) (s2[i]-32);
			}
			
		}
		String s3="";
		for(int i=0;i<s2.length;i++)
		{
			s3=s3+s2[i];
		}
		System.out.println(s3);
		
		
	}

}
