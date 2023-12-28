package Abstraction;

public class Child1 extends Parent1 {
      public void method1()
      {
    	  System.out.println("method 1 of  child");
      }
      public void method1 (int a)
      {
    	  System.out.println("from method1 of child with param");
      }
      public static void main(String[] args) {
		Child1 c1=new Child1();
		c1.method1();
		Parent1 p1=c1;//upcasting
		p1.method();
		p1.method1();//
		p1.method1(10);
	}

}
