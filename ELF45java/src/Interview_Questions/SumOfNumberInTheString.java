package Interview_Questions;

public class SumOfNumberInTheString {
	
	public static int Sum(String s1)
	{
		char[] c=s1.toCharArray();
		int sum=0;
		String res="0";
         for(int i=0;i<c.length;i++)
         {
        	 if(c[i]>='0'&&c[i]<='9')
        	 {
        		 res=res+c[i];
        	 }
        	 else
        	 {
        		 sum=sum+Integer.parseInt(res);
        		 res="0";
        	 }
        	 
         }
         sum=sum+Integer.parseInt(res);
		return sum;
	}
	
	public static void main(String[] args) 
	{
		String s1="ELF44AND45JAVASELENIUM2023";
		int res=Sum(s1);
		System.out.println(res);
	}
}
