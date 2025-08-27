import java.util.Scanner;
class calculateSI { 
    static double SI;

    public static void calculateSI(double p, double r, double t) {
        SI=(p*r*t)/100;
       System.out.println("simple interest = "+SI);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of principle:");
        double p= sc.nextDouble();
        System.out.println("Enter the value of rate:");
        double r= sc.nextDouble();
        System.out.println("Enter the value of time in months:");
        double t= sc.nextDouble(); 
        calculateSI(p,r,t); 
     sc.close();  
    }
    
    
}