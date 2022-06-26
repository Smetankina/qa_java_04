package Lesson_7_Start_OOP_HW_Part1;

public class HW_71_Employee {
    private String name;
    private double baseSalary;
    private int Salary;



    public HW_71_Employee(double baseSalary, String name){
        this.baseSalary = baseSalary;
        this.name = name;

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int BaseSalary){
        this.baseSalary = BaseSalary;
    }

    public String getName(){
        return name;
    }

    public  void setName(String name){
        this.name = name;
    }




}
