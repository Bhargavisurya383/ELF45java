package CollectionFramework;

import java.util.Iterator;
import java.util.PriorityQueue;

public class workingWithPriority {
	public static void main(String[] args)
	{
		PriorityQueue p=new PriorityQueue<>();
		p.add(10);
		p.offer(20);
		p.add(30);
		p.add(3);
		p.add(2);
		p.offer(1);
		System.out.println(p);
		Iterator i=p.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		while(!p.isEmpty())
		{
			System.out.println(p.poll());
		}
		
	}

}
