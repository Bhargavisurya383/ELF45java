package Interview_Questions;

public class Consecutive {
	public static int Conones(int[] a)
	{
		int high=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1)
			{
				count++;
			}
			else
			{
				if(high<count)
				{
					high=count;
					count=0;
				}
			}
		}
		return high;
	}
	public static void main(String[] args) {
		int arr[]= {1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1};
		System.out.println(Conones(arr));
	}
		

}
