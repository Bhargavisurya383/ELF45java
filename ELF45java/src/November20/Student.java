package November20;

import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable
{
   int sid;
   String sname;
   int std;
   char sec;
   double percentage;
public Student(int sid, String sname, int std, char sec, double percentage)
 {
	
	this.sid = sid;
	this.sname = sname;
	this.std = std;
	this.sec = sec;
	this.percentage = percentage;
 }

@Override
public String toString() {
	return "Student id="+this.sid+" "+"Student name="+this.sname+" "+"Standard="+this.std+" "+"Section="+this.sec+" "+"Percentage="+this.percentage;
}

@Override
public int compareTo(Object o) 
{
	 Student s=(Student) o;
	 if(this.percentage==s.percentage)
	 {
	return 0;
	 }
	 else if(this.percentage>s.percentage)
	 {
		 return 1;
	 }
	 else
	 {
		 return -1;
	 }
}
public static void main(String[] args)
{ 
	Student s1=new Student(1,"Rohith",1, 'A',98);
	Student s2=new Student(2, "Bhargs", 2, 'B',90);
	Student s3=new Student(3, "Sujana", 5, 'C', 89);
	ArrayList<Student> al=new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	Collections.sort(al);
	for (Student student : al) {
		System.out.println(student);
		
	}
	
	
}
  
   
}
