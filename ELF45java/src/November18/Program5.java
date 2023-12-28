package November18;

public class Program5
{
	public static void main(String[] args)
	{
	  int count=0;
	  int num=1;
	  int n=6;
	  int i;
	  while(count<n)
	  {
		  num=num+1;
		  for( i=2;i<=num;i++)
		  {
			  if(num%i==0)
			  {
				  break;
			  }
		  }
		  if(i==num)
		  {
			  count++;
		  }
	  }
	  System.out.println(num);
	  
	}

}
