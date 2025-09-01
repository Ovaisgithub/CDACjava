import java.util.Scanner;

public class BankAccount {
    int accountNumber;
    String holderName;
    float balance;

    BankAccount(int accountNumber, String holderName, float balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit() {
        Scanner sc = new Scanner(System.in);
        float amount;
        System.out.println("Enter amount to deposit:");
        amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Amount deposited successfully. New balance: " + balance);
    }

    void withdraw() {
        Scanner sc = new Scanner(System.in);
        float amount;
        System.out.println("Enter amount to withdraw:");
        amount = sc.nextFloat();
        if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully. New balance: " + balance);
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Number:");
        int accountNumber = sc.nextInt();
        System.out.println("Enter Account Holder Name:");
        String holderName = sc.next();
        System.out.println("Enter Initial Balance:");
        float balance = sc.nextFloat();

        BankAccount account = new BankAccount(accountNumber, holderName, balance);

        while (true) {
            System.out.println("\nChoose operation:");
            System.out.println("1 - Deposit");
            System.out.println("2 - Withdraw");
            System.out.println("3 - Check Balance");
            System.out.println("4 - Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> account.deposit();
                case 2 -> account.withdraw();
                case 3 -> account.checkBalance();
                case 4 -> {
                    System.out.println("Thank you for banking with us!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }

        }
    }
}