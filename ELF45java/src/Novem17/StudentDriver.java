package Novem17;

public class StudentDriver {
	public static void main(String[] args)
	{
		Student o1=new Student(10, "Bhargs", 10, 'A', 90);
		Student o2=new Student(11, "Sujana", 9, 'A', 95);
		String res=o2.getPercentage(11);
		System.out.println(res);
	}

}
