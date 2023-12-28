package String_Class;

public class Assign3 {
	public static void main(String[] args) {
		String s1="28september2023#@";
		String num=" ";
		String let=" ";
		String ch=" ";
		
		char a[]=s1.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=65&&a[i]<=130)
			{
				let=let+a[i];
			}
			else if(a[i]>=0&&a[i]<=9)
			{
				num=num+a[i];
			}
			else
			{
				ch=ch+a[i];
				
			}
		}
		System.out.println(let);
		System.out.println(num);
		System.out.println(ch);
		
	}
	

}
