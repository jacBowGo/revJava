package override_my_demo;

import override_my_demo.Player;

public class PlayerMain {

	public static void main(String[] args) {
		
		Player p1=new Player(100, "Giri");
		System.out.println(p1);
		
		Player p2=new Player(100, "Giri");
		System.out.println(p2);
		
		if(p1.equals(p2)) {
			System.out.println("Both players are same");
		}else {
			System.out.println("Players are different");
		}
		
		Employee e1 = new Employee(874, "Jack");
		System.out.println(e1);
		
		Employee e2 = new Employee(234, "Maxie");
		System.out.println(e2);
		
		if(e1.equals(e2)) {
			System.out.println("Both employees are the same");
		} else {
			System.out.println("Employees are different");
		}
		
	}

}
