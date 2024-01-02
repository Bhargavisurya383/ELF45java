package Interview_Questions;

public class Aanish {
	public static void main(String[] args) {
		String s1="Aanish";
		s1=s1.toLowerCase();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!='a')
			{
				s2=s2+s1.charAt(i);
			}
			
		}
		System.out.println(s2);
	}

}
