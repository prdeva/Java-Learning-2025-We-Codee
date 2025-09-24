package schoolManagement;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student type(UG/PG)");
        String type=sc.next();
        System.out.println("Enter Student ID");
        int id=sc.nextInt();
        System.out.println("Enter Student Name");
        String name=sc.next();
        System.out.println("Enter Student Age");
        int age=sc.nextInt();
        System.out.println("Enter Student Marks");
        double marks=sc.nextDouble();
        Student student;
        if(type.equalsIgnoreCase("UG")){
            student = new UGstuent(id, name, age, marks);
        }else{
            student=new PGstudent(id, name, age, marks);
        }
        student.displayInfo();
        student.calculateGrade();


    }
}
