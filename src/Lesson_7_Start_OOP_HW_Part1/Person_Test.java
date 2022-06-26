package Lesson_7_Start_OOP_HW_Part1;



public class Person_Test {
    public static void main(String[] args) {


        Person p1 = new Person("ss", 45, 'M');

        Person p2 = new Person("jhk", 78, 'a');

        Person[] array = {p1, p2};

        Person pMin = p2.getMinAge(array);

        System.out.println(pMin.getName());
    }

}
