package CollectionFramework;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MethodsOfAl {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(10);
		al.add(true);
		al.add(20);
		al.add(30);
		al.add(20);
		al.add("hey");
		System.out.println(al);
		System.out.println(al.indexOf(20));
		System.out.println(al.lastIndexOf(20));
		al.set(5, "hello");
		System.out.println(al);
		
		
		}
	}


