package String_Class;

public class KARNATAKA {
	public static void main(String[] args) {
		String s1="KARNATAKA";
		char c[]=s1.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='A'||c[i]=='a')
			{
				count++;
			}
			
		}
		System.out.println("Number of occurance of A= "+count);
		
	}

}
