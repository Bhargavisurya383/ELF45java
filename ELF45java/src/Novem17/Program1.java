package Novem17;

public class Program1 {
	public static boolean StrongOrNot(int n)
	{
		int temp1=n;
		int temp2=n;
		int sum=0;
		
		while(temp1!=0)
		{
			int pro=1;
			int rem=temp1%10;
			for(int i=1;i<=rem;i++)
			{
				pro=pro*i;
			}
			sum=sum+pro;
			temp1=temp1/10;
		}
		if(sum==n)
		{
		 return true;
		}
		else
		{
			return false;
		}
		
	}
	public static void main(String[] args)
	{
		boolean res=StrongOrNot(145);
		System.out.println(res);
	}

}
