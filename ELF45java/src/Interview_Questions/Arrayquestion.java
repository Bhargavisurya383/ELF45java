package Interview_Questions;

public class Arrayquestion {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		int k=3;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]+a[j]==k)
				{
					count++;
				}
			}
		}
		System.out.println(count);
		
	}

}
