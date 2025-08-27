import java.util.Scanner;
public class findMax {
    public static void findMax(int[] arr){
         int max=arr[0];
         for(int i=1;i<10;i++){
            if(max<arr[i]){
               max=arr[i];
            }
        }
         System.out.println("maximum element of array is: "+ max);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter your array:");
        for(int i=0;i<10;i++){
           arr[i]= sc.nextInt();
        }
        findMax(arr);
        sc.close();
    }
}        