package ObjectClass;

public class Emp2 {
	String ename;
    int id;
    double sal;
	public Emp2(String ename, int id, double sal) {
		super();
		this.ename = ename;
		this.id = id;
		this.sal = sal;
	}
	public boolean equals(Object o)
	{
		Emp2 e=(Emp2)o;
		if(e.sal==this.sal)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
    public static void main(String[] args) {
    	Emp2 e1=new Emp2("Bhargs", 02, 51000);
    	Emp2 e2=new Emp2("Aanish",01, 51000);
    	System.out.println(e1.equals(e2));
		
	}

	

}
