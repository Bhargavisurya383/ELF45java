package November20;

public class Program2_approach2 {
	public static String removeDuplicates(String s)
	{
		
		String res="";
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
				else if(count==0)
				{ 
					
					res=res+s.charAt(j);
				}
			}
		}
		return res;
	}

	   public static void main(String[] args) {
		  System.out.println(removeDuplicates("Selenium"));
		
	}
}
