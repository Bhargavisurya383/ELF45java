package Block;

public class StaticBlock3 {
	
	 static int a=10;
	 static {
		 int a=20;//local variable
		 a=30;
	 }
	 public static void main(String[] args) {
		System.out.println(a);
	}
	
}



