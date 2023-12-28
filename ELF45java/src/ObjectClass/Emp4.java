package ObjectClass;
import java.util.Objects;


public class Emp4 extends Object {
	String ename;
	int id;
	 double sal;
	  
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Emp4(String ename, int id, double sal) {
		super();
		this.ename = ename;
		this.id = id;
		this.sal = sal;
	}
	public boolean equals(Object o)
	{
		Emp4 e=(Emp4)o;
		if(e.sal==this.sal)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public int hashCode() {
		return Objects.hash(sal);
		
	}
	public static void main(String[] args) {
		Emp4 e1=new Emp4("Bhargs", 1, 55000);
		Emp4 e2= new Emp4("anish",2,55000);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		
	}
	 

}
