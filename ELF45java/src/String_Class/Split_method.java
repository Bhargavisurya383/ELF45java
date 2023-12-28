package String_Class;

public class Split_method {
	public static void main(String[] args) {
		
		String s1="I live in Bangalore";
		String arr[]=s1.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
