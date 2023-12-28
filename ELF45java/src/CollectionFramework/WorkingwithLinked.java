package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class WorkingwithLinked {
       public static void main(String[] args) 
       {
    	   LinkedList l=new LinkedList<>();
    	   l.add(10);
    	   l.add(20);
    	   l.add("hello");
    	   l.add(true);
    	   System.out.println(l);
    	   System.out.println(l.poll());
    	   System.out.println(l);
    	    Iterator i=l.iterator();
    	    while(i.hasNext())
    	    {
    	    	System.out.println(i.next());
    	    }
		
    	}
}
