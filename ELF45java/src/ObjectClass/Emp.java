package ObjectClass;

public class Emp {
	String ename;
	int id;
	double sal;
	public Emp(String name, int eid, double salaray) {
		super();
		this.ename = ename;
		this.id = id;
		this.sal = sal;
	}
	
	public static void main(String[] args) {
		Emp e1=new Emp("Bhargs",2,55000);
		Emp e2=new Emp("Gows",9,45000);
		System.out.println(e1);
		System.out.println(e2);
	}

}
