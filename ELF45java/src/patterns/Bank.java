package patterns;

public class Bank {
	private double balance;
	private int pin=1998;
	
	
	
	public String getBalance(int pin) {
		
		if(this.pin==pin)
		{
			return "Balance="+balance;
		}
		else
		{
			return "Invalid pin";
		}
		
	}
	public int getPin() {
		return pin;
	}
	



}
