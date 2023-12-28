package Block;

public class StaticBlock2 {
 static int a=10;
 static {
	 a=30;
 }
 public static void main(String[] args) {
	System.out.println(a);
}
}
