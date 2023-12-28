package CollectionFramework;

import java.util.LinkedList;

public class WorkingWithLinkedList {
	public static void main(String[] args) {
		LinkedList l=new LinkedList<>();
		l.add(10);
		l.add(20);
		l.add("Hello");
		System.out.println(l);
		l.addFirst(100);
		l.addLast(200);
		System.out.println(l);
		System.out.println(l.getLast());
	}

}
