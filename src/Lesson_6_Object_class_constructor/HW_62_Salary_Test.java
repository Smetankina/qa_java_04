package Lesson_6_Object_class_constructor;

public class HW_62_Salary_Test
{
    public static void main(String[] args) {

    HW_62_Employee[] employees = new HW_62_Employee[2];

    HW_62_Employee Anna = new HW_62_Employee("Anna", 55, "w", 5000);
    HW_62_Employee Sergey = new HW_62_Employee("Sergey", 33, "m", 9000);


    employees[0] = Anna;
    employees[1] = Sergey;

    HW_62_Salary c= new HW_62_Salary();
        System.out.println(c.getSum(employees));


    }
}
