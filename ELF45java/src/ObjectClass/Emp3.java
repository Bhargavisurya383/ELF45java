package ObjectClass;

public class Emp3 {
	String ename;
	int id;
	double sal;
	public Emp3(String ename, int id, double sal) {
		super();
		this.ename = ename;
		this.id = id;
		this.sal = sal;
	}
	public static void main(String[] args)
	{
		Emp3 e1=new Emp3("Bhargs", 2,55000);
		Emp3 e2=new Emp3("sujana",9, 55000);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		Emp3 e3=e2;
		System.out.println(e3.equals(e2));
		System.out.println(e3.hashCode());
		System.out.println(e2.hashCode());
	}
	

} 
