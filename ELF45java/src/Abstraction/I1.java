package Abstraction;

public interface I1 {
 void m1();
 static void m2()
 {
	 System.out.println("from method 2");
 }
 int a=100;
 public static void main(String[] args) {
	System.out.println(a);
	m2();
	
}
 
}
