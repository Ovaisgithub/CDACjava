import java.util.Scanner;
public class temperatureconversion {

    public static void celsiusToFahrenheit(double c) {
        double f = (c * 9/5) + 32;
        System.out.println(c + " Celsius is " + f + " Fahrenheit.");
    }
    public static void fahrenheitToCelsius(double f) {
        double c = (f - 32) * 5/9;
        System.out.println(f + " Fahrenheit is  " + c + " Celsius.");
    }
    public static void main(String[] args) {
        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch(ch){
            case 1:
        System.out.println("Enter temperature in Celsius:");
        double c = sc.nextDouble();
        celsiusToFahrenheit(c);
        break;
        case 2:
        System.out.println("Enter temperature in Fahrenheit:");
        double f = sc.nextDouble();
        fahrenheitToCelsius(f);
        break;
            default:
            System.out.println("Invalid choice");
    }
        sc.close();
    }
}