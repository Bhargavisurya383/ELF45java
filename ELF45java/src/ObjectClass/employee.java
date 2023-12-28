package ObjectClass;

public class employee {
	String ename;
	int id;
	double sal;
	public employee(String ename, int id, double sal) {
		super();
		this.ename = ename;
		this.id = id;
		this.sal = sal;
	}
	public String toString()
	{
		return "Employee name="+this.ename+" "+"Employee id="+" "+"Employee salary="+this.sal;
	}
  public static void main(String[] args) {
	employee e1=new employee("Bhargavi", 10,55000);
	System.out.println(e1);
}
  
}
