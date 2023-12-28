package practice;

public class propose {
	public static void main(String[] args)
	{
	   int age=21;
	   if(age>=22)
	   {
		   System.out.println("Accepte the proposal");
	   }
	   else
	   {
	        throw new Reject("Reject status");
	   }
	}

}
