import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = scanner.nextLine();

        System.out.println("Enter password:");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

        scanner.close(); 
    }
}