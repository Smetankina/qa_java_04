package Lesson_6_Object_class_constructor;

public class HW_62_Person {

    public String name;
    public int age;
    public char sex;

  /*  public HW_62_Person(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }*/


    public void getName(){
        if(sex == 'm'){
            System.out.println("Mr " + name);
        }
        else if(sex == 'w'){
            System.out.println("Mrs " + name);
        }

    }


}
