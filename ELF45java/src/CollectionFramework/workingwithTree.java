package CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class workingwithTree {
	public static void main(String[] args) {
		
		TreeSet t=new TreeSet();
		t.add(10);
		t.add(100);
		t.add(60);
		t.add(90);
		t.add(10);
		Iterator i=t.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("descending order");
		Iterator i1=t.descendingIterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	
		
	}

}
