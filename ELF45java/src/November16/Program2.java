package November16;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.TreeSet;

public class Program2 {
	
	public static void main(String[] args)
	{
	  String s1="SADF23HKJ56DR32LOI89WQ472NBM2V1BHU78";	
	  String res=extract(s1);
	  String[] str=res.split(" ");
	  ArrayList al=new ArrayList<>();
	  for(int i=0;i<str.length;i++) {
		  al.add(Integer.parseInt(str[i]));
	  }
	  Collections.sort(al);
	  System.out.println(al);
	
	  
	}
	public static String extract(String s) {
		char[] ch=s.toCharArray();
		String res="";
		String temp="";
		boolean flag=false;
		for(char c:ch) {
			if(Character.isDigit(c)) {
				temp+=c;
				flag=true;
			}
			else if(flag) {
				res+=temp+" ";
				flag=false;
				temp="";
			}
		}
		if(flag) {
			res+=temp+" ";
		}
		return res;
	}

}
