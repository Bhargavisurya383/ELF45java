package CollectionFramework;

public class MethodRecursion {
 public static void printName(int num)
 {
	if(num==0)
	{
	return ;
	}
	 System.out.println("Bhargavi");
	 printName(num-1);
 }
 public static void main(String[] args) {
	printName(5);
}
}
