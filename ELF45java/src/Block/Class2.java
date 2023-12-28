package Block;
public class Class2 {
	public static void main(String[] args) {
		Class1 o1=new Class1();
		System.out.println(o1.a);
		System.out.println(o1.b);
		o1.a=100;
		Class1.b=100.098;
		System.out.println(o1.a);
		System.out.println(Class1.b);
	}

}
