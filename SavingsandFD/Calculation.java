import java.util.Scanner;

public class Calculation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int acctype=0;
		int accountNumber;
	    float balance;
		System.out.println("Enter Account Number");
		accountNumber=sc.nextInt();
		System.out.println("enter 1 for savings and 2 for fixed deposit");
		acctype=sc.nextInt();
		System.out.println("deposit amount ");
		balance=sc.nextFloat();
		
		if(acctype==1) {
		SavingsAccount s=new SavingsAccount(accountNumber,balance);
		s.calculateInterest();}
		else if(acctype==2) {
		FixedDepositAccount f=new FixedDepositAccount(accountNumber,balance);
		f.calculateInterest();}
		else {System.out.println("invalid deatails");}
		sc.close();
		
	}

}
