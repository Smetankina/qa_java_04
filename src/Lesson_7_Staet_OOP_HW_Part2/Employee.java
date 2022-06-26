package Lesson_7_Staet_OOP_HW_Part2;

public class Employee {

    private String name;
    private int age;
    private char gender;
    private double salaryADay;


    public Employee(String name, int age, char gender, double salaryADay) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salaryADay = salaryADay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public double getSalaryADay() {
        return salaryADay;
    }

    public double getSalary(Month[] monthArray) {
       double result = 0;
       for(int i = 0;i  < monthArray.length;i++){
           result += getSalaryADay() * monthArray[i].getWorkDays();
       }
return result;
    }
}
