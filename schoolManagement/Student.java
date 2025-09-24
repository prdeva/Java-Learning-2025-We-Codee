package schoolManagement;
import java.util.*;
public abstract class Student {
    int id;
    String name;
    int age;

    public Student(int id,String name){
        this(id,name,18);

    }
    public  Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public abstract void calculateGrade();
    public void displayInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", Age: " + age);
    }

}
