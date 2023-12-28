package patterns;

public class SumOfNumberInString {
	public static void main(String[] args) {
		String s1="02 November 2023";
		char[] c=s1.toCharArray();
		int sum=0;
		String s2="";
		for(int i=0;i<c.length;i++)
		{
			  if(c[i]>='0' && c[i]<='9')
			  {
				 s2=s2+c[i];
			  }
		}
		int m=Integer.parseInt(s2);
		while(m!=0)
		{
			int res=m%10;
			sum=sum+res;
			m=m/10;
		}
		System.out.println(sum);
	}

}
