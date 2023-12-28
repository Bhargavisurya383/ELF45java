package patterns;

public class SumofNumberS {
	public static void main(String[] args) {
		String s1="02 November 2023";
		char[] c=s1.toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0'&& c[i]<='9')
			{
				sum=sum+Integer.parseInt(c[i]+"");
			}
		}
		System.out.println(sum);
		
	
	}

}
