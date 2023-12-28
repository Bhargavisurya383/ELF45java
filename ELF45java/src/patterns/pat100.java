package patterns;

public class pat100 {
	public static void main(String[] args)
	{
		String s1="hih";
		String temp="";
		for(int i=s1.length()-1;i>=0;i--)
		{	
				temp=temp+s1.charAt(i);
			
		}
		System.out.println(temp);
		if(s1.equals(temp))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
