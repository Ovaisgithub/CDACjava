public class SavingsAccount extends BankAccount{

	SavingsAccount(int accountNumber, float balance) {
		super(accountNumber, balance);
		
	}
	void calculateInterest(){
		float interest=balance*0.04f;
		System.out.println("interest is rs."+interest+ " @ 4% per annum");
	}
	
}
