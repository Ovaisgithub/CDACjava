public class savingsAccount extends bankAccsystem {
	double interestrate=6.50d;
	
	void calcint() {
		double SI=(balance*interestrate)/100;
		System.out.println("the interest for account number " + accountnum  + " is " +  SI + " at 6.50% per annum\n");
		System.out.println("thanks for banking with us");
	}
	
}
