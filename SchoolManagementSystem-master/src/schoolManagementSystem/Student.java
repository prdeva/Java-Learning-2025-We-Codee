package schoolManagementSystem;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int paidfees;
    private  int totalfees;

    public Student(int id,String name,int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.paidfees = 0;
        this.totalfees = 30000;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void Paidfees(int fees){
        this.paidfees += fees;
        School.updateTotalMoneyEarned(fees); // add only this payment
    }


    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public int getPaidfees() {
        return paidfees;
    }
    public int getTotalfees() {
        return totalfees;
    }
    public  int remainingFees(){
        return totalfees-paidfees;
    }
    @Override
    public String toString() {
        return "Student's name :"+name+
                " Total fees paid so far $"+ paidfees;
    }


}