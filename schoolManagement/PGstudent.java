package schoolManagement;

public class PGstudent extends Student implements ScholarshipEligible {
    double marks;

    public PGstudent(int id, String name, int age, double marks) {
        super(id, name, age);
        this.marks = marks;
    }

    @Override
    public void calculateGrade() {
        if (marks >= 70) {
            System.out.println(name + " Grade: A");
        } else {
            System.out.println(name + " Grade: B");
        }
    }

    @Override
    public boolean isEligible() {
        return marks >= 80;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("PG Student, Marks: " + marks);
    }
}
