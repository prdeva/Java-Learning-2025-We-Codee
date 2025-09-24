package schoolManagement;

public class UGstuent extends Student implements ScholarshipEligible {
    double marks;

    public UGstuent(int id, String name, int age, double marks) {
        super(id, name, age); // call parent constructor
        this.marks = marks;
    }

    @Override
    public void calculateGrade() {
        if (marks >= 60) {
            System.out.println(name + " Grade: A");
        } else {
            System.out.println(name + " Grade: B");
        }
    }

    @Override
    public boolean isEligible() {
        return marks >= 70;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("UG Student, Marks: " + marks);
    }
}
