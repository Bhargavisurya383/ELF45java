package November16;

public class Program1 {
	public static int[] SortAsGiven(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				int q=a[i]/10;
				int rem1=q%10;
				int q2=a[j]/10;
				int rem2=q2%10;
				if(rem1<rem2)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a;
		
	}
	public static void main(String[] args)
	{
		int a[]= {234,654,876,789,927,713,643};
		int[] res=SortAsGiven(a);
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]+" ");
		}
		
		
	}

}
