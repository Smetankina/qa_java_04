package Lesson_6_Object_class_constructor;
/*
* Необходимо создать класс Salary с единственным методом
* - getSum(Employee[] employeeArray), метод должен возвращать сумму зарплат всех сотрудников
* из массива переданного в качестве аргумента вызова метода.*/
public class HW_62_Salary {

    public HW_62_Employee[] employeeArray;


    public int getSum(HW_62_Employee[] employeeArray){

        int sum = 0;
        for(int i = 0; i<employeeArray.length; i++){
            sum += employeeArray[i].salary;
        }
        return  sum;
    }
}
