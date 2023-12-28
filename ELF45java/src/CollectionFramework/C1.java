package CollectionFramework;

import java.util.ArrayList;

public class C1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(true);
		al.add("Hello");
		al.add(20);
		System.out.println(al);
		System.out.println(al.size());
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}

}
