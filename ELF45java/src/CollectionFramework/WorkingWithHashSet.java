package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class WorkingWithHashSet {
	public static void main(String[] args) {
		HashSet h=new HashSet<>();
		h.add(10);
		h.add(20);
		h.add("hello");
		h.add(true);
		h.add(23.987);
		h.add(true);
		System.out.println(h);
		Iterator i=h.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
