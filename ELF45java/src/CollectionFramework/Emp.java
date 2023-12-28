package CollectionFramework;

import java.util.Collections;
import java.util.LinkedList;

public  class Emp implements Comparable {
	String ename;
	int eid;
	double sal;
	public Emp(String ename, int eid, double sal) {

		this.ename = ename;
		this.eid = eid;
		this.sal = sal;
	}
	public String toString()
	{
		return "Ename="+this.ename+" "+"Employee id="+this.eid+" "+"Salary="+this.sal;
	}
	
	@Override
	public int compareTo(Object o) {
		Emp e=(Emp)o;
		if(this.sal==e.sal)
		return 0;
		else if(this.sal>e.sal)
			return -1;
		else
			return 1;
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList<Emp> data=new LinkedList<>();
		Emp e1=new Emp("Bhargs",1,23000);
		Emp e2=new Emp("Rohith",2,19340);
		Emp e3=new Emp("sujana",3,35000);
		data.add(e1);
		data.add(e2);
		data.add(e3);
		
		System.out.println(data);
		Collections.sort(data);
		System.out.println("AFter sorting");
		for(Emp e: data) {
			System.out.println(e);
		}
		
		
	}
	
	

}
