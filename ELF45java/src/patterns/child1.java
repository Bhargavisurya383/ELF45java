package patterns;

public class child1 extends parent1 {
	int c=30;
	int d=40;
	public static void main(String[] args) {
		child1 c1=new child1();
		parent1 p1=new parent1();
		child1 c2=(child1)p1;
		System.out.println(p1 instanceof child1);
	}

}