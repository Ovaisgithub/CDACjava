import java.util.Scanner;
public class bill{
    public static void main(String[] args){
        System.out.println("enter your electricity unit");
        Scanner scanner = new Scanner(System.in);
        int unit = scanner.nextInt();
        int bill=0;

        if(unit <= 100){
            bill = unit * 1;
            System.out.println("your bill is " + bill);
        }
        else if(unit <=200 && unit > 100){
            bill = 100 + (unit - 100) * 2;
            System.out.println("your bill is " + bill);
        }
        else if(unit <=300 && unit > 200){
            bill = 300 + (unit - 200) * 3;
            System.out.println("your bill is " + bill);
        }
        else{
            bill = 600 + (unit - 300) * 4;
            System.out.println("your bill is " + bill);
        }    
        
    }

}