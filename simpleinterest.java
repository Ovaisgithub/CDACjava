import java.util.Scanner;
class simpleinterest{ 
    static int cost;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of principle:");
        int p= sc.nextInt();
        System.out.println("Enter the value of rate:");
        int r= sc.nextInt();
        System.out.println("Enter the value of time:");
        int t= sc.nextInt(); 
        
        
       find(p,r,t); 
     sc.close();  
    }
    
    public static void find(int p, int r,int t){
        cost=(p*r*t)/100;
       System.out.println("simple interest ="+cost);
    }
}