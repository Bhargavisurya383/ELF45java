package String_Class;

public class ReverseStringSplit {
	public static void main(String[] args) {
		String s1="I live in Banaglore";
		String a[]=s1.split(" ");
		String s2=" ";
		for(int i=a.length-1;i>=0;i--)
		{
			s2=s2+a[i]+" ";
		}
		System.out.println(s2);
		
	}

}
