package INHERITANCE;

public class Constructor1 {
 public Constructor1()
 {
	 this(10);
	 System.out.println("from constructor 1");
 }
 public Constructor1(int a)
 {
	 
	 System.out.println("from constructor 2");
	 System.out.println(a);
 }
 public static void main(String[] args) {
	Constructor1 c1=new Constructor1();
	
}
 
}
