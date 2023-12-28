package patterns;

public class MCQ {
	int a=10;
	{
		this.a=30;
	}
	public String toString()
	{
		return a+" ";
	}
	public static void main(String[] args) {
		MCQ m1=new MCQ();
		System.out.println(m1.toString());
	}

}
