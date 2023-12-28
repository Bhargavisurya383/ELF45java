package INHERITANCE;

public class Son extends Father {
	void Light()
	{
		System.out.println("LED light");
	}
	public static void main(String[] args) {
		Father f1=new Father();
		f1.Light();//halogen
		Son s1=new Son();
		s1.Light();//LED
		//f1=s1;
		Father f2=new Son();
		f2.Light();//LED
	}

}
