package String_Class;

public class Demo {
	public static void main(String[] args)
	{
		String s1=new String("Hello");
		System.out.println(s1);
		String s2=new String("Hello");
		String s3=new String("Hi");
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		String s="Hi";
		System.out.println(s.equals(s3));
		String s4=s1.concat(s3);
		System.out.println(s4);
		
	}

}
