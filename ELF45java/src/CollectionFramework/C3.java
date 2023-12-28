package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class C3 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(true);
		al.add('A');
		System.out.println(al);
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
