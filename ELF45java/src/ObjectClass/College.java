package ObjectClass;

public class College {
	private String name;
	private int regno;
	private int sem;
	private int noOfBackLogs;
	private String branch;
	public College(String name, int regno, int sem, int noOfBackLogs, String branch) {
		super();
		this.name = name;
		this.regno = regno;
		this.sem = sem;
		this.noOfBackLogs = noOfBackLogs;
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public int getSem() {
		return sem;
	}
	public void setSem(int sem) {
		this.sem = sem;
	}
	public int getNoOfBackLogs() {
		return noOfBackLogs;
	}
	public void setNoOfBackLogs(int noOfBackLogs) {
		this.noOfBackLogs = noOfBackLogs;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", regno=" + regno + ", sem=" + sem + ", noOfBackLogs=" + noOfBackLogs
				+ ", branch=" + branch + "]";
	}
	

}
