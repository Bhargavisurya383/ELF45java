package CollectionFramework;

import java.util.ArrayList;

public class subArrays {
	public static void main(String[] args) {
		
		ArrayList al =new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=i;j<al.size();j++)
			{
			  	for(int k=i;k<=j;k++)
			  	{
			  		System.out.print(al.get(k)+" ");
			  	}
				System.out.println();
			  
			}
		}
		for (Object ob : al) {
			System.out.print(ob+" ");
			
		}
		
	}

}