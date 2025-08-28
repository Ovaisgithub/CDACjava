import java.util.Scanner;
public class arrayfunc{
    
    public static void ascending(int[] arr,int n){
        
        int temp=0;
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }   System.out.println("ascending order of your array is: "); 
        for(int i=0;i<n;i++){
        System.out.println(arr[i]);
        }
      
    }
    public static void descending(int[] arr,int n){
        int i=0;
     int j=0;
        int temp=0;
        for(i=0;i<n;i++){
        for(j=i+1;j<n;j++){
            if(arr[i]<arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
        for(i=0;i<n;i++){
        System.out.println("descending order of your array is: " + arr[i]);
        }
      
    }
     public static void reverse(int[] arr,int n){
        int i=0;
     
        int[] arb= new int[n];
      for(i=n-1;i>=0;i--){
            arb[i]=arr[n-i-1];
        }
        System.out.println("reverse of your array is: ");
        for(i=0;i<n;i++){
        System.out.println(arb[i]);
        }
    }
    public static void duplicate(int[] arr,int n){
        int i;
        System.out.println("array before removal of duplicate"); 
        for(i=0;i<n;i++){
        System.out.println(arr[i]);
        }
        
        int j;
        int var=0;
        for(i=0;i<n;i++){
            var=0;
            int dup =0;
            int num=arr[i];
            for(j=i+1;j<n;j++){
                if(num/arr[j]==1){
                    dup++;
                    for(i=j;i<n;i++){
                        arr[j]=arr[j+1];
                    }
                    if(dup>0){
                        var=num;
                    }
                }
            }
            n=n-(dup);
            System.out.println(dup + " repeatation of element " + var + " found and duplicates were removed");
        }
        System.out.println("array after removal of duplicate"); 
        for(j=0;j<n;j++){
        System.out.println(arr[j]);
        }
    }
    public static void minarray(int[] arr,int n){
        int min=arr[0];
         for(int i=1;i<n;i++){
            if(min>arr[i]){
               min=arr[i];
            }
        }
         System.out.println("maximum element of array is: "+ min);
    }
    public static void maxarray(int[] arr,int n){
         int max=arr[0];
         for(int i=1;i<n;i++){
            if(max<arr[i]){
               max=arr[i];
            }
        }
         System.out.println("greatest element of array is: "+ max);
    }
    
    public static void main(String[] args){
        int[] arr=new int[1000];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of your array:");
        int n=sc.nextInt();
        System.out.println("enter your array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("select your operation: ");
        System.out.println("1 for ascending");
        System.out.println("2 for descending");
        System.out.println("3 for reverse");
        System.out.println("4 for duplicate element deletion");
        System.out.println("5 for smallest element");
        System.out.println("6 for largest element");
        int ch=sc.nextInt();

        switch(ch){
            case 1:ascending(arr,n);
            break;
             case 2:descending(arr,n);
            break;
             case 3:reverse(arr,n);
            break;
             case 4:duplicate(arr,n);
            break;
             case 5:minarray(arr,n);
            break;
             case 6:maxarray(arr,n);
            break;
            default:
            System.out.println("ïnvalid choice");
            
        }
        //System.out.println("enter 1 to see operations menu");
        //int m=sc.nextInt();
        sc.close();
    }

      
    
}