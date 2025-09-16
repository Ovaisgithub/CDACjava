package vehiclesystem;
import java.util.Scanner;
public class Rental {
	
	public static void main(String[] args) {
		int ch=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to vehicle rentals:");
		System.out.println("enter number of days you want to rent the vehicle:");
		int days=sc.nextInt();
		System.out.println("choose your vehicle:\n 1. Bike\n 2.Car");
		ch=sc.nextInt();
		switch(ch) {
		case 1:System.out.println("Enter vehicle ID, brand, and rent per day:");

		Bikeinh b1=new Bikeinh(sc.nextInt(),sc.next(),sc.nextFloat());
			b1.calculateRental(days);
		break;
		case 2:System.out.println("Enter vehicle ID, brand, and rent per day:");

		Carinh c1=new Carinh(sc.nextInt(),sc.next(),sc.nextFloat());
			c1.calculateRental(days);
		break;
		default:System.out.println("invalid choice:");
		}
		
		sc.close();
	}
}
