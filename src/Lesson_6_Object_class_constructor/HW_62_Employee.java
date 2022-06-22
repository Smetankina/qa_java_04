package Lesson_6_Object_class_constructor;

public class HW_62_Employee {

public String name;
public int age;
public String sex;
public int salary;

public HW_62_Employee(String name, int age, String sex, int salary){
    this.name = name;
    this.age = age;
    this.sex = sex;
    this.salary = salary;
    }


public void isSameName(String name){
    if(this.name == name){
        System.out.println(true);

    }
    else {
        System.out.println(false);
    }
}



}
