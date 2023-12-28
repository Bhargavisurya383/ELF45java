 package CollectionFramework;

import java.util.LinkedHashMap;

public class WorkingWithLinkedhashmap {
	public static void main(String[] args) 
	{
		LinkedHashMap l=new LinkedHashMap<>();
		l.put(1, 'v');
		l.put(23, "Hello");
		l.put(23,"hello");//
		System.out.println(l);
	}

}
