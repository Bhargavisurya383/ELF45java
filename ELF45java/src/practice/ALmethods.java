package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ALmethods {
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		ArrayList a2=new ArrayList<>();
		a2.add(100);
		a2.add(200);
		a2.add(300);
		System.out.println(a1);
		System.out.println(a2);
		a2.addAll(a1);
		System.out.println(a2);
		System.out.println(a2.containsAll(a1));
		System.out.println(a1.containsAll(a2));
	}

}
