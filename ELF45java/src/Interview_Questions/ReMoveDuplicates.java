package Interview_Questions;

import java.util.Arrays;

public class ReMoveDuplicates {
	public static void main(String[] args) {
		int a[]= {1,1,1,2,1,2,3,5,3,7,8,0,4,4,3,4,3};
		Arrays.sort(a);
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}
		}
		int b[]=new int[a.length-count];
		int k=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				b[k]=a[i];
				k++;
			}
		}
		b[k]=a[a.length-1];
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}
	

}
