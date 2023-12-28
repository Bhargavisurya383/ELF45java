package String_Class;

public class ToUpperCase {
	public static void main(String[] args) {
		String s1="i live in bengalore";
		String a[]=s1.split(" ");
		String res=" ";
		for(int i=0;i<a.length;i++)
		{
			res=res+a[i].substring(0,1).toUpperCase()+a[i].substring(1)+" ";
			
		}
		res=res.trim();
		System.out.println(res);
	}

}
