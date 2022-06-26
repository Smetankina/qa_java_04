package Lesson_7_Start_OOP_HW_Part1;

public class HW_73_Manager extends HW_72_Worker {
    private int NumberOfSubordinates;

    public HW_73_Manager(double baseSalary, String name, int NumberOfSubordinates) {
        super(baseSalary, name);
        this.NumberOfSubordinates = NumberOfSubordinates;
    }

    int getNumberOfSubordinates(){
        return NumberOfSubordinates;

    }

    void setNumberOfSubordinates(int NumberOfSubordinates){
        this.NumberOfSubordinates = NumberOfSubordinates;

    }

    public double getBaseSalary1() {
        if(getNumberOfSubordinates()>0){
        return  getBaseSalary() * (NumberOfSubordinates/100.0*3);
    }
        else {
            return getBaseSalary();
        }
}}
