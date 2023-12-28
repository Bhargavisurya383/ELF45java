package Block;

public class nsb4 {
	int a=10;//global
	{
		a=40;//reinitialisation of global 
	}
	{
		int a=20;//local
		a=this.a;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		nsb4 o1=new nsb4();
		System.out.println(o1.a);
	}

}
