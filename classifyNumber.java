import java.util.Scanner;
public class classifyNumber {

public static void classifyNumber(int num) {
    if (num > 0) {
        System.out.println("Positive");
    } else if (num < 0) {
        System.out.println("negative");
    } else {
        System.out.println("Zero");
    }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    classifyNumber(num);
    sc.close();


 }
}