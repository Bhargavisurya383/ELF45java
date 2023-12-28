package practice;

public class Driver {
	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.deposit(-1000);
		b.withdrawal(1234, 100);
		System.out.println(b.getBal(1234));
	}

}
