package Novem17;

public class Program7 {
	int id;
	String name;
    double salary;
    String address;
	public Program7(int id, String name, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "id="+this.id+","+"name="+this.name+","+"salaray="+this.salary+", "+"address="+this.address;
	}

	public static void main(String[] args)
	{
		Program7 o1=new Program7(10, "sujana", 19340,"Chikkballapura");
		Program7 o2=new Program7(10, "Rohith", 19340,"Kolar");
		System.out.println(o1);
		
	}
    
	

}
