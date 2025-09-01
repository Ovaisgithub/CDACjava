package vehiclesystem;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to refueling system\n");
		Car c=new Car();
		c.reFuel(sc);
		c.calcTraveldis(sc);
		sc.close();
	}
}
