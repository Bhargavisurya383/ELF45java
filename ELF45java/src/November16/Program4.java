package November16;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
 
public class Program4 {
	public static int minConsOne(int[] a)
	{
	    int min=Integer.MAX_VALUE;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				count++;
				
				
			}
			else
			{
				min=Integer.min(min, count);
				count=0;
			}
				
						
			
		}	
		return min ;
	}
	public static void main(String[] args)
	{
		int[] a= {1,1,1,0,0,0,0,1,0,0,1,0,0,0,1,1,1,1,0,1,1,1,1,1,1};
		int res=minConsOne(a);
		System.out.println(res);
		
		
		
	}

}
