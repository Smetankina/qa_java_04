package Lesson_7_Staet_OOP_HW_Part2;

public class Main {

    public static void main(String[] args) {


        Employee Kristina = new Employee("Kristina", 23, 'W', 12);

        Month[] months = {
                new Month("Jan", 31, 21),
                new Month("Feb", 28, 20)
        };
        System.out.println(Kristina.getSalary(months));

        Manager manager = new Manager("Anna", 12, 'W', 100, 6);

        System.out.println(manager.getSalary(months));



    }
}