package schoolManagementSystem;

import java.util.*;


public class Main {
    public static void main(String[] args) {
//        String nivi;
        Teacher Nivi=new Teacher(1,"Nivi",40000);
        Teacher Pavi=new Teacher(2,"Pavi",60000);
        Teacher Kavi=new Teacher(2,"Kavi",90000);
        List<Teacher> teacherList=new ArrayList<Teacher>();
        teacherList.add(Nivi);
        teacherList.add(Pavi);
        teacherList.add(Kavi);

        Student Deva=new Student(1,"Deva",10);
        Student Jeeva=new Student(1,"Deva",1);
        Student Jai=new Student(1,"Deva",12);
        List<Student> studentList=new ArrayList<>();
        studentList.add(Deva);
        studentList.add(Jeeva);
        studentList.add(Jai);

        School Kms=new School(teacherList,studentList);

        Deva.Paidfees(100000);
        System.out.println("Kms earned\n " + Kms.getTotalMoneyEarned());
        Jeeva.Paidfees(200000);
        System.out.println("Kms earned\n " + Kms.getTotalMoneyEarned());

        System.out.println("total money given as salery");
        Nivi.receiveSalery(Nivi.getSalary());
        System.out.println("GHS has spent for salary to " + Nivi.getTname()
                +" and now has " + Kms.getTotalMoneyEarned()); Kavi.receiveSalery(Kavi.getSalary());
        System.out.println("GHS has spent for salary to " + Kavi.getTname()
                +" and now has " + Kms.getTotalMoneyEarned());
        Pavi.receiveSalery(Pavi.getSalary());
        System.out.println("GHS has spent for salary to " + Pavi.getTname()
                +" and now has " + Kms.getTotalMoneyEarned());


        System.out.println(Pavi);

        Pavi.receiveSalery(Pavi.getSalary());

        System.out.println(Pavi);
    }
}
