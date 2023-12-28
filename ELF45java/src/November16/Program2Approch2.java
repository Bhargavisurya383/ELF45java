package November16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Program2Approch2 
 {
	
	public static ArrayList SortAsGiven(String s1)
	{
		ArrayList a=new ArrayList<>();
		char[] ch=s1.toCharArray();
		String s2="0";
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				s2=s2+ch[i];
			}
			else
			{
				if(Integer.parseInt(s2)!=0)
				{
				a.add(Integer.parseInt(s2));
				s2="0";
				}
			}
		}
		return a;
		
	}
	public static void main(String[] args) {
		String s1="SADF23HKJ56DR32LOI89WQ472NB23M2V1BHU78";
		ArrayList res=SortAsGiven(s1);
		System.out.println(res);
		Collections.sort(res);
		System.out.println(res);
	}

 }
