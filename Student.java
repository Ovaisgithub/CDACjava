import java.util.Scanner;

public class Student {
    int rollNo;
    String name;
    String cname;
    String subject;
    int mark;

public void acceptDetails(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter student details:");
    rollNo = sc.nextInt();
    name = sc.next();
    cname = sc.next();
    subject = sc.next();
    mark = sc.nextInt();
}
public void displayStudentInfo(){
    System.out.println("Student Details:");
    System.out.println("Roll No: " + rollNo);
    System.out.println("Name: " + name);
    System.out.println("College Name: " + cname);
    System.out.println("Subject: " + subject);
    System.out.println("Mark: " + mark);
}
public void findResult() {
    if (mark >= 40){
        System.out.println("Result: Pass");
    } else {
        System.out.println("Result: Fail");
    }
}
public void main(String[] args) {
    Student s1 = new Student();
    s1.acceptDetails();
    s1.displayStudentInfo();
    s1.findResult();

    Student s2 = new Student();
    s2.acceptDetails();
    s2.displayStudentInfo();
    s2.findResult();

    Student s3 = new Student();
    s3.acceptDetails();
    s3.displayStudentInfo();
    s3.findResult();

    Student s4 = new Student();
    s4.acceptDetails();
    s4.displayStudentInfo();
    s4.findResult();

    Student s5 = new Student();
    s5.acceptDetails();
    s5.displayStudentInfo();
    s5.findResult();
}
}