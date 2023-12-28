package INHERITANCE;

public class C4 extends P4 {
      public C4(int a)
      {
    	  super();
    	  System.out.println("from constructor 3");
      }
      public C4()
      { this(10);
    	  System.out.println("from constructor 4");
      }
      public static void main(String[] args) {
		C4 o1=new C4();
		
	}
}
