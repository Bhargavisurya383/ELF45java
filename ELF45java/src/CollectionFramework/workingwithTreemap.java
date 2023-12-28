package CollectionFramework;

import java.util.TreeMap;

public class workingwithTreemap {
	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<>();
		t.put(12, "Rohith");
		t.put(23,"Bhargs");
		t.put(6, "ba");//it will delete the old one new value will be over ridden;
		t.put(6,"sneha");
		t.put(6, "Bhargs");
		System.out.println(t);
		
	}

}
