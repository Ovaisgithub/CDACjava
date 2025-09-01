package vehiclesystem;

import java.util.Scanner;

public class Vehicle {
	String brands;
	float fuel;
	
	void reFuel(Scanner sc) {
		
		System.out.println("enter your car brand:");
		brands=sc.nextLine();
		System.out.println("enter fuel to be filled in your " + brands + ":");
		fuel=sc.nextFloat();
		
	}
}
