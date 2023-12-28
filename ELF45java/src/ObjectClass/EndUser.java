package ObjectClass;

public class EndUser {
	public static void main(String[] args) {
		Bank b1=new Bank("Bhargs", 27000,"ABC28363","Shivamogga", 9187265526257282l);
		
		System.out.println(b1.getName());
		System.out.println(b1.getBal());
		System.out.println(b1.getIfsc());
		b1.setName("sujana");
		System.out.println(b1.getName());
		System.out.println(b1.getAcno());
	}

}
