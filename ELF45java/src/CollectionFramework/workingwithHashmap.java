package CollectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class workingwithHashmap {
	public static void main(String[] args)
	{
		HashMap<Integer, String> h=new HashMap<>();
		h.put(1, "ohith");
		h.put(10, "sujana");
		h.put(20, "hargs");
		h.put(200, "nammu");
		h.put(9, "ivedita");
		System.out.println(h);
		Set<Integer> keydata=h.keySet();
		for(Integer data:keydata)
		{
			System.out.println(data);
		}
		Collection<String> valuedata=h.values();
		for(String data:valuedata)
		{
			System.out.println(data);
		}
		for(Entry<Integer, String> data:h.entrySet())
		{
			System.out.println(data.getKey()+" "+data.getValue());
		}
		h.remove(9);
		System.out.print(h);
	}

}
