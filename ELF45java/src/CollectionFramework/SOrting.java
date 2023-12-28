package CollectionFramework;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class SOrting {
	public static void main(String[] args) {
		LinkedList l=new LinkedList<>();
		l.add(10);
		l.add(2);
		l.add(30);
		l.add(400);
		l.add(40);
		Collections.sort(l);
		System.out.println(l);
			
	}

}
