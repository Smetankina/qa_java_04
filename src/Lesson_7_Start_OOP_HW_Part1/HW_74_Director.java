package Lesson_7_Start_OOP_HW_Part1;

public class HW_74_Director extends HW_73_Manager{
    public HW_74_Director(double baseSalary, String name, int NumberOfSubordinates) {
        super(baseSalary, name, NumberOfSubordinates);
    }

    @Override
    public double getBaseSalary1() {
        if(getNumberOfSubordinates()>0){
            return  getBaseSalary() * (getNumberOfSubordinates() /100.0*9);
        }
        else {
            return getBaseSalary();
        }
}}
