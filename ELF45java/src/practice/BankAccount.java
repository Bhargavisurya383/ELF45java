package practice;

public class BankAccount {
	private int pin=1234;
	private double bal;
	
	
	public String getBal(int pin)
	{
		if(this.pin==pin)
		{
			return "balance"+bal;
		}
		else
		{
			return "Invalid pin";
		}
	}
	public void deposit(int deposit)
    
	{
		if(deposit>0)
		{
			this.bal=deposit;
			System.out.println("deposited successfully");
		}
		else
		{
			System.err.println("amount must be greater than zero");
		}
	}
	public void withdrawal(int pin,int amnt)
	{
		if(this.pin==pin)
		{
			if(amnt<=bal && amnt>0)
			{
				this.bal-=amnt;
				System.out.println(amnt);
			}
			else
			{
				System.out.println("Amnt enterd can not be withdrawn");
			}
		}
		else {
			System.out.println("invalid pin");
		}
	}

}
