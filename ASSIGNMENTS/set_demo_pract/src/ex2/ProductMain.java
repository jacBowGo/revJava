package ex2;

import java.util.HashSet;
import java.util.Set;

public class ProductMain {
	
	public static void main(String[] args) {
	
		Set<Flight> flightList = new HashSet<>();
		flightList.add(new Flight(3526, "Orlando", 241.62, 3.5f));
		flightList.add(new Flight(5163, "Vancouver", 425.30, 4.1f));
		flightList.add(new Flight(8240, "Vienna", 893.23, 4.2f));
		flightList.add(new Flight(3526, "Orlando", 241.62, 3.5f));
		flightList.add(new Flight(1352, "Little Rock", 253.00, 3.7f));
		flightList.add(new Flight(4252, "Cleveland", 130.35, 3.2f));
		flightList.add(new Flight(3526, "Orlando", 241.62, 3.5f));
		flightList.add(new Flight(1435, "Houston", 213.62, 3.4f));
		flightList.add(new Flight(5163, "Vancouver", 425.30, 4.1f));

		System.out.println("Printing all Flights:");
		printFlights(flightList);
	
	}
	
	public static void printFlights(Set<Flight> flightList) {
		for (Flight f:flightList) {
			System.out.println(f);
		}
	}
	
}
