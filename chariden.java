import java.util.Scanner;

public class chariden{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter your character:");
        String ch = inp.nextLine();

        

        if (ch.greaterThan('a') && ch.lessThan('z') || ch.greaterThan('A') && ch.lessThan('Z')) {
            if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u") ||
               ch.equals("A") || ch.equals("E") || ch.equals("I") || ch.equals("O") || ch.equals("U")) {
                System.out.println(ch + " is a vowel");
            }
            else {
                System.out.println(ch + " is a consonant");
            }
        }

        else if (ch>=("0") && ch<=("9")){
            System.out.println(ch + " is a digit");
        }
        else {
            System.out.println(ch + " is a special character");
        }

        inp.close();
    }
}