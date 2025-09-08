public class BankAccount {
	int accountNumber;
	float balance;
	
	BankAccount(int accountNumber,float balance){
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	void calculateInterest(){
		float interest=balance*0.02f;
		System.out.println("interest is rs."+interest);
	}
}