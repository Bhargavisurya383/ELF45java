package Novem17;

public class Program8
{
	public static int[] MergeArray(int[] a,int[] b)
	{
		int[] res=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			res[k]=a[i];
			k++;
		}
		if(k>a.length-1)
		{
		for(int j=b.length-1;j>=0;j--)
		{
			res[k]=b[j];
			k++;
		}
		}
			
		return res;
	}
 public static void main(String[] args)
 {
	int[] a= {1,2,3,4};
	int[] b= {5,6,7,8};
	int[] result=MergeArray(a,b);
	for(int i=0;i<result.length;i++)
	{
		System.out.print(result[i]+" ");
	}
	
 
 }
}
