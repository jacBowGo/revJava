package ex2;

public class Project {

	//add has-A relationship Project-pid,name,clientname,cost
	//don't know if did has-A relationship properly
	
	private int pid;
	private String name;
	private String clientname;
	private double cost;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}
	
	public Project(int pid, String name, String clientname, double cost) {
		super();
		this.pid = pid;
		this.name = name;
		this.clientname = clientname;
		this.cost = cost;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClientname() {
		return clientname;
	}

	public void setClientname(String clientname) {
		this.clientname = clientname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", name=" + name + ", clientname=" + clientname + ", cost=" + cost + "]";
	}
	
	
	
}
