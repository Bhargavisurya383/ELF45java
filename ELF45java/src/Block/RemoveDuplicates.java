package Block;
import java.util.*;

public class RemoveDuplicates {
	public static int[] sort(int b[])
	{
		for(int i=0;i<b.length;i++)
			{
				for(int j=i+1;j<b.length;j++)
				{
					if(b[i]>b[j])
					{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
					}
				}
			}
			return b;
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of the array");
	    int size=sc.nextInt();
	    int a[]=new int[size];
	    System.out.println("enter the elements");
	    for(int i=0;i<a.length;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
		int res[]=sort(a);
		int count=0;
		for(int i=0;i<res.length-1;i++)
		{
			
				if(res[i]==res[i+1])
					count++;
			
		}
		int b[]=new int[res.length-count];
		int k=0;
		for(int i=0;i<res.length-1;i++)
		{
			if(res[i]!=res[i+1])
			{
				b[k]=res[i];
				k++;
						
			}
			
		}
		b[k]=res[res.length-1];
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		
		
	}

}
