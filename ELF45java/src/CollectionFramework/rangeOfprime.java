package CollectionFramework;

public class rangeOfprime {
	public static void main(String[] args) 
	{
		for(int i=2;i<=100;i++)
		{
			int num=i;
			if(num!=1)
			{
				int count=0;
				for(int j=2;j<100;j++)
				{
					if(num%j==0)
					{
						count++;
						break;
					}
				}
				if(count==0)
				{
					System.out.println(num);
				}
			}
			
		}
	}
}
		


	

