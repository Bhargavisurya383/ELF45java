package CollectionFramework;

import java.util.ArrayList;

public class C2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(10);
		al.add(100);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);
		System.out.println(al);
		al.add(2, 200);
		System.out.println(al);
		
		al.remove(al.size()-1);
		System.out.println(al);
		for (Object b : al) {
			System.out.println(b);
			
		}
		
		
		}

}
