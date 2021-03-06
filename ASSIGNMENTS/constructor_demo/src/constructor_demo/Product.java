package constructor_demo;

public class Product {
	
	private int id;
	private String name;
	private int rating;
	private double cost;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String name, int rating) {
		// super();
		this.id = id;
		this.name = name;
		this.rating = rating;
	}

	public Product(int id, String name, int rating, double cost) {
		// super();
		this(id, name, rating);
		this.cost = cost;
	}

	// Right-click > "Source..." > "Generate to toString()"
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", rating=" + rating + ", cost=" + cost + "]";
	}
	
	
	
}

//Mimic the same example replace Employee with Product(id,name,rating,cost)