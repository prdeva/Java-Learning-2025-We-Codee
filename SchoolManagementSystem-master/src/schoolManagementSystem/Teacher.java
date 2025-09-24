package schoolManagementSystem;

public class Teacher {
    private int id;
    private String Tname;
    private int salary;
    private int salaryEarned;

    public Teacher(int id,String Tname,int salary) {
        this.id=id;
        this.Tname=Tname;
        this.salary=salary;
        this.salaryEarned=0;
    }
    public int getId() {
        return id;
    }
    public  String getTname() {
        return Tname;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void receiveSalery(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary); // deduct from school
    }
    @Override
    public String toString() {
        return "Name of the Teacher: " + Tname
                +" Total salary earned so far $"
                + salaryEarned;
    }

}
