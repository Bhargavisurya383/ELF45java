package FileHandling;

public class School {
	String sname;
	int rollno;
	int std;
	public School(String sname,int rollno,int std)
	{
		this.sname=sname;
		this.rollno=rollno;
		this.std=std;
	}
	public String toString()
	{
		return "Student name="+this.sname+" "+"Rollno="+this.rollno+" "+"Standard="+this.std;
	}
	public static void main(String[] args) {
		School a[]= {new School("Rohit",2,3),new School("sujana",10,2),new School("bhargs",1,2)};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
