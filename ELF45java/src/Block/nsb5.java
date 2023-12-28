package Block;

public class nsb5 {
 int a=10;
 {
	 int a=20;
	 this.a=this.a+a;
	 System.out.println(a);
 }
 {
	 int a=40;
	 a=this.a;
	 System.out.println(a);
 }
 public static void main(String[] args) {
	nsb5 o1=new nsb5();
	System.out.println(o1.a);
}
}
