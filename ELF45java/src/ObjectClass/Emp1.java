package ObjectClass;

public class Emp1 {
	String ename;
	int id;
	double sal;
	public Emp1(String ename, int id, double sal) {
		super();
		this.ename = ename;
		this.id = id;
		this.sal = sal;
	}
	public static void main(String[] args) {
		Emp1 e1=new Emp1("Bhargs", 02, 55000);
		Emp1 e2=new Emp1("Aanish", 01, 55000);
		Emp1 e3=e2;
		System.out.println(e1.equals(e2));
		System.out.println(e3.equals(e2));
		
		
		
		
	}
	
}
