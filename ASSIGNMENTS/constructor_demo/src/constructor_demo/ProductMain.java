package constructor_demo;

public class ProductMain {

	public static void main(String[] args) {
		
		Product prod = new Product(12, "Camera", 5);
		//System.out.println(prod);
		System.out.println(prod.toString());
		//System.out.println(prod.hashCode());
		
		Product prod1 = new Product(87, "Dog Leash", 4);
		System.out.println(prod1);
		System.out.println(prod1.toString());
		System.out.println(prod1.hashCode());
		
		Product prod2 = new Product(43, "Avocado", 3, 5.99);
		System.out.println(prod2);
		System.out.println(prod2.toString());
		System.out.println(prod2.hashCode());
		
	}
	
}

//(int id, String name, int rating, double cost)