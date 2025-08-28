import java.util.Scanner;
class minmaxarray{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[1000];
        System.out.println("Enter the size of your array:");
        int n=sc.nextInt();
        System.out.println("Enter your array:");
        for(int i=0;i<n;i++){
           a[i]= sc.nextInt();
        }
        int min=a[0];
        for(int i=0;i<n;++i){
         if(min>a[i]){
            min=a[i];
         }   
         }
         int max=a[0];
         for(int i=0;i<n;++i){
            if(max<a[i]){
               max=a[i];
        }   
        }    
        
        System.out.println("minimum number:"+ min);
        System.out.println("maximum number:"+ max);
        
      sc.close();
      }
}
