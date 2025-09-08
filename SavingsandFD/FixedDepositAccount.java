public class FixedDepositAccount extends BankAccount{

	FixedDepositAccount(int accountNumber, float balance) {
		super(accountNumber, balance);
		
	}
	void calculateInterest(){
		float interest=balance*0.07f;
		System.out.println("interest is rs."+interest+ " @ 7% per annum");
	}
	
}
