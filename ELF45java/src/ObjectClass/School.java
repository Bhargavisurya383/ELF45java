package ObjectClass;

public class School {

	String sname;
	double per;
	int rollno;
	int std;
	public School(String sname, double per, int rollno, int std) {
		super();
		this.sname = sname;
		this.per = per;
		this.rollno = rollno;
		this.std = std;
	}
	public String toString()
	{
		return "Student name="+this.sname
	      +" "+"Student's percentage="+this.per+" "+"Roll number="+this.rollno+" "+"Standard="+this.std;
	}
	public boolean equals(Object o)
	{
		School s=(School)o;
		if(s.sname==this.sname&&s.per==this.per)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args)
	{
		School s1=new School("Bhargs",85,12, 10);
		School s2=new School("Bhargs",85,10, 10);
		School s3=new School("Bhargs",84,10, 10);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		
	}
	
}
