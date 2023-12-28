package practice;

import java.util.ArrayList;

public class StringAL {
	public static void main(String[] args)
	{
		ArrayList a=new ArrayList<>();
		a.add("Bhargs");
		a.add("aanish");
		a.add("sujana");
		a.add("rohith");
		for(int i=0;i<a.size();i++)
		{
			a.set(i, (((String) a.get(i)).substring(0, 1).toUpperCase())+((String) a.get(i)).substring(1));
		}
		System.out.println(a);
				
	}

}
