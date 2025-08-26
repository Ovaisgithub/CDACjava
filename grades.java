import java.util.Scanner;
public class grades{
    public static void main(String[] args){
        System.out.println("enter your percentage");
        Scanner perinp = new Scanner(System.in);
        int per = perinp.nextInt();
        
        if(per >= 90){
            
            System.out.println("your grade is A");
        }
        else if(per >= 80 && per < 90){
            
            System.out.println("your grade is B ");
        }
        else if(per >= 70 && per < 80){
            
            System.out.println("your grade is C " );
        }
        else if(per >= 60 && per < 70){
            
            System.out.println("your grade is D ");
        }
        else{
            System.out.println("your grade is fail ");
        }
        perinp.close();   
        
    }

}