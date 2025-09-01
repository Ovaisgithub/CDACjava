import java.util.Scanner;
public class Employee{
    int empId;
    String name;
    float basicSalary;
    float hra;
    float da;

    Employee(){
        
    }
    void acceptDetails(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employee details:");
    System.out.println("employee id:");
    empId = sc.nextInt();
    System.out.println("employee name:");
    name = sc.next();
    System.out.println("basic salary:");
    basicSalary = sc.nextFloat();
    
    }
     void grossSalary(){
        hra=0.5f*basicSalary;
        da=0.2f*basicSalary;
        float gross=basicSalary+hra+da;
        System.out.println("gross salary of " + name + " is :Rs"  + gross);
    }
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.acceptDetails();
        emp.grossSalary();
    }

}