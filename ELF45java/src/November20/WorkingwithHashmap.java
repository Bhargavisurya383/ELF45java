package November20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class WorkingwithHashmap 
{ 
	
	public static void main(String[] args) 
	{
		HashMap<String, Integer> h=new HashMap<>();
		h.put("Bhargs", 22);
		h.put("Rohith", 23);
		h.put("sujana",24);
		Iterator i=h.entrySet().iterator();
		while(i.hasNext())
				{
			//map.entry super class hashmap
			Map.Entry<String,Integer> entry=(Entry<String, Integer>)i.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
				}
	}

}
