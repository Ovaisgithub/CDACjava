import java.util.Scanner;

public class Studentresults{
    int rollNo;
    String name;
    int maths;
    int science;
    int english;
    int avg;

    Studentresults(int rollNo,String name,int maths,int science,int english){
        this.rollNo=rollNo;
        this.name=name;
        this.maths=maths;
        this.science=science;
        this.english=english;
    }

    void averageMarks(){
        avg=(maths+science+english)/3;
        System.out.println("Average marks of student "+ name +" is: "+avg);
    }

    void grades(){
        if(avg>=90){
            System.out.println("Grade A");
        } else if (avg>=80) {
            System.out.println("Grade B");
        } else if (avg>=70) {
            System.out.println("Grade C");
        } else if (avg>=60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade F");
        }
    }

        public static void main(String[] args) {
        Studentresults[] s = new Studentresults[50];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=sc.nextInt();

        System.out.println("Enter student details:");
        for(int i=0;i<n;i++){
            s[i]=new Studentresults(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
            System.out.println("Enter details of next student:");
        }
        for (int i = 0; i < n; i++) {
            s[i].averageMarks();
            s[i].grades();
            System.out.println();
        }


        sc.close();
    }
}