package ObjectClass;

public class Student {
	String sname;
	int stu_id;
	int std;
	public Student(String sname, int stu_id, int std) {
		super();
		this.sname = sname;
		this.stu_id = stu_id;
		this.std = std;
	}
	public String toString()
	{
		return "Student name="+this.sname+" "+"Student id="+this.stu_id+" "+"Standard="+this.std;
	}
	public static void main(String[] args) {
		Student s1=new Student("Bhargavi", 01, 10);
		Student s2=new Student("Sujana", 30, 10);
		Student s3=new Student("Rohit", 20, 5);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	

}
