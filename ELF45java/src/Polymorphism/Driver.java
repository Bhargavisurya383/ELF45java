package Polymorphism;

public class Driver {
	public static void main(String[] args) {
		Creditcard c1=new Creditcard();
		Swipe s1=new Swipe();
		s1.SwipweMachine(c1);
		Debitcard d1= new Debitcard();
		s1.SwipweMachine(d1);
		Card c2=new Card();
		s1.SwipweMachine(c2);
	}

}
