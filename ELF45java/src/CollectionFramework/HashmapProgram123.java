package CollectionFramework;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashmapProgram123 {
     public static void main(String[] args) {
		String s1="hello hi hello how hi you";
		String[] s2=s1.split(" ");
		HashMap<String, Integer> h=new HashMap<>();
		int count=0;
		for(int i=0;i<s2.length;i++)
		{
			count=0;
			for(int j=0;j<s2.length;j++)
			{
				if(s2[i].equals(s2[j]))
				{
					count++;
				}
			}
			h.put(s2[i], count);
			
		}
		System.out.println(h);
		String s3="";
		for(Entry<String, Integer> data:h.entrySet())
		{
			if(data.getValue()>1)
			{
				s3=s3+data.getKey()+" ";
			}
		}
		System.out.println(s3+" ");
		
	}
}
