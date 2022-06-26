package Lesson_7_Staet_OOP_HW_Part2;

public class Manager extends Employee {

    int subordinate;

    public Manager(String name, int age, char gender, double salaryADay, int subordinate) {
        super(name, age, gender, salaryADay);
    }

    public int getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(int subordinate) {
        this.subordinate = subordinate;
    }

   public double getSalary(Month[] monthArray){
        double result = 0;
        for (int i = 0; i < monthArray.length; i++){
            result += (getSalaryADay() * monthArray[i].getWorkDays())+ getSubordinate()*0.01;

        }
        return result;
    }


}
