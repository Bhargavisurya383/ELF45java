package Interview_Questions;

public class Bhargs {
	public static void main(String[] args) {
		String s1="BHargs";
		char[] a=s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='A'&&a[i]<='Z')
			{
				a[i]=(char) (a[i]+32);
			}
			else if(a[i]>='a'&&a[i]<='z') {
				a[i]=(char)(a[i]-32);
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}

}
