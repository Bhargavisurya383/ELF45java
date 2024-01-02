package Interview_Questions;

public class Bhargavi {
	public static void main(String[] args) {
		String s1="Bhargavi";
		s1=s1.toLowerCase();
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(i%2==0) {
				s2=s2+s1.substring(i, i+1).toLowerCase();
			}
			else
			{
				s2=s2+s1.substring(i, i+1).toUpperCase();
			}
		}
		System.out.println(s2);
	}

}
