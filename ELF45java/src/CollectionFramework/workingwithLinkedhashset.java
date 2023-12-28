package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class workingwithLinkedhashset {
 public static void main(String[] args) {
	LinkedHashSet l=new LinkedHashSet<>();
	l.add(10);
	l.add(120);
	l.add(100.6);
	l.add(true);
	l.add(10.98);
	l.add(10);
	System.out.println(l);
	Iterator i=l.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
}
}
