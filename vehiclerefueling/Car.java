package vehiclesystem;

import java.util.Scanner;

public class Car extends Vehicle{
	float mileage;
	
	void calcTraveldis(Scanner sc){
		
		System.out.println("Enter the mileage of your " + brands + " in km/ltr:");
		mileage=sc.nextFloat();
		float dis=(fuel*mileage);
		System.out.println("your " + brands+  " can go: " + dis + " km with " + fuel + " litres of fuel\n");
		System.out.println("thanks for refueling with us\n");
		System.out.println("have a safe journey");
		
	}
}
