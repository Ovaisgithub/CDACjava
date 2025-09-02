import java.util.Scanner;

public class Test{
	
	public static void main(String[] args) {
		System.out.println("welcome to bank management system\n");
		savingsAccount s=new savingsAccount();
		
		Scanner sc=new Scanner(System.in);
		int i=0;
		while(i!=3) {
		System.out.println("1. Deposit\n2. Calculate Interest\n3.Exit\nEnter your choice");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
		s.deposit(sc);
		break;
		case 2:
		s.calcint();
		break;

		default:
			System.out.println("invalid choice");
		}
		if(ch==3) {
			i=3;
			System.out.println("thank you for banking with us");
		}
	}
		sc.close();
	}

}
