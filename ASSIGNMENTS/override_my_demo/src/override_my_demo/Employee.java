package override_my_demo;

public class Employee {

	private int id;
	private String name;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object p) {
		boolean c = false;
		Employee e2 = (Employee)p;
		if (this.id == e2.id) {
			c = true;
		}
		return c;
		
	}
}