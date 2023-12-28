package ObjectClass;

public class Bank {
	private String Name;
	private double bal;
	private String ifsc;
	private String branch;
	private long acno;
	
	public Bank(String name, double bal, String ifsc, String branch, long acno) {
		super();
		Name = name;
		this.bal = bal;
		this.ifsc = ifsc;
		this.branch = branch;
		this.acno = acno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getBal() {
		return bal;
	}
	
	public String getIfsc() {
		return ifsc;
	}
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public long getAcno() {
		return acno;
	}
	
	
	

}
