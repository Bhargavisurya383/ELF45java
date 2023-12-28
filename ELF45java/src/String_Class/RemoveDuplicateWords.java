package String_Class;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String s1="Hello hi Hello How are you";
		String a[]=s1.split(" ");
		String s2=" ";
		for(int i=0;i<a.length;i++)
		{
			
			if(s2.contains(a[i])==false)
				
			{
				s2=s2+a[i];
				System.out.print(a[i]+" ");
			}
			
		}
	}
}

	

