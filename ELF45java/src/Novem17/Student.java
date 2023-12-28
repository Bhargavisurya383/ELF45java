package Novem17;

public class Student
{
  private int StudentId;
  private String name;
  private int std;
  private char sec;
  private double percentage;
  
  
public Student(int studentId, String name, int std, char sec, double percentage) {
	super();
	StudentId = studentId;
	this.name = name;
	this.std = std;
	this.sec = sec;
	this.percentage = percentage;
}
public int getStudentId() {
	return StudentId;
}
public void setStudentId(int studentId) {
	StudentId = studentId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStd() {
	return std;
}
public void setStd(int std) {
	this.std = std;
}
public char getSec() {
	return sec;
}
public void setSec(char sec) {
	this.sec = sec;
}
public String getPercentage( int StudentId)
{
	if(this.StudentId==StudentId)
		
	{
	return percentage+" " ;
	}
	else
	{
		return "Can't be disclosed";
	}
		
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
  
 
}
