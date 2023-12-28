package INHERITANCE;

public class TestEngineer extends Emp {
	public static void main(String[] args) {
		TestEngineer t1=new TestEngineer();
		System.out.println(t1.ename);
		System.out.println(t1.DOB);
		t1.ename="Bhargavi";
		t1.Designantion="Associate software Engineer";
		t1.DOB="05/07/2001";
		System.out.println(t1.ename);
		System.out.println(t1.Designantion);
		System.out.println(t1.DOB);
		
	}

}
