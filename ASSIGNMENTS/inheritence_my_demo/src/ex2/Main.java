package ex2;

import ex2.Address;
import ex2.Employee;
import ex2.Person;
import ex2.Player;
import ex2.Project;

public class Main {

	public static void main(String[] args) {
		Person person=new Person(100, "Sachin");
		System.out.println(person);
		
		Address a=new Address(188888, "XYZ Street Name", "San Fan", "Kansas", 1222222);
		Employee employee=new Employee(102, "Raj", "Manager", 123344.44d);
		employee.setPermenantAddress(a);
		Address present=new Address(11, "This That Ave", "CityVille", "Texas", 10001);
		employee.setPresentAddress(present);
		Project projects = new Project(4, "training program", "Casey Bobbet", 234957);
		employee.setProject(projects);
		
		System.out.println(employee);
		
		Player player=new Player(900, "Chris Morris", 100, "Cricket");
		Team team = new Team(23,"Blizters","Bobby Styne");
		player.setTeam(team);
		System.out.println(player);
		
		Project proj = new Project(34, "new jerseys", "Alex Moore", 430.50);
		System.out.println(proj);
		//verify if did has-A relationship correctly

	}

}
