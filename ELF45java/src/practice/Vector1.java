package practice;

import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(10);
		v1.add(20);
		v1.addElement(23);
		v1.add(25);
		v1.add(true);
		v1.add("Hello");
		System.out.println(v1);
		for (Object o : v1) {
			System.out.println(o);
			
		}
		ListIterator l=v1.listIterator(v1.size());
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		
	}

}
