package INHERITANCE;

public class C5 extends P5 {
  public C5(int a)
  {
	  this(a,20.5);
	  System.out.println("Constructor 4");
  }
  public C5(int a,double b)
  {
	  super(a);
	  System.out.println("Constructor 5");
  }
  public C5() {
	  this(10);
	  System.out.println("Constructor 6");
  }
}
