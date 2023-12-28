package practice;

public class p3 {
	int a;
	String name;
	public p3(int a, String name) {
		
		this.a = a;
		this.name = name;
	}
	@Override
	public String toString() {
		return " a=" + a + ", name=" + name ;
	}
	public static void main(String[] args) {
		p3 o1=new p3(10,"Rohit");
		System.out.println(o1);
		
	}
}
	

