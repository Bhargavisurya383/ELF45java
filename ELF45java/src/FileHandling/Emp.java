package FileHandling;

public class Emp {
	String ename;
	int id;
	double sal;
	public Emp(String ename, int id, double sal) {
		
		this.ename = ename;
		this.id = id;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", id=" + id + ", sal=" + sal + "]";
	}
	public static void main(String[] args) {
		Emp e1=new Emp("Sujana", 10, 50000);
		Emp e2=new Emp("Rohit", 20, 50000);
		Emp e3=new Emp("Bhargs", 1, 50000);
		Emp a[]=new Emp[3];
		a[0]=e1;
		a[1]=e2;
		a[2]=e3;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
		
	}	
}

