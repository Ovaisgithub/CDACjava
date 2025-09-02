import java.util.Scanner;
public class bankAccsystem {
	int accountnum;
	double balance;
	
	void deposit(Scanner sc) {
		
		System.out.println("enter account number");
		accountnum=sc.nextInt();
		System.out.println("enter deposit amount");
		double amt=sc.nextDouble();
		balance=balance+amt;
		System.out.println("your updated balance is Rs."+balance);
		
		
	}

}
