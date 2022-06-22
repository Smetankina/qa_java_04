package Lesson_6_Object_class_constructor;

public class Person {

    public String name;
     public int age;
     char gender;

     String getName() {
         if (gender == 'M') {
             return "Mr. " + name;
         } else {
             return "Mrs. " + name;
         }
     }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

  Person getMinAge(Person[] arr){
         Person min = null;
         for( int i =0;i<arr.length; i++){
             if(min == null||min.age>arr[i].age){
                 min = arr[i];
             }

         }
      return min;
  }


     public void printObject () {
  /*       double a = 2.0 -1.1;
        System.out.printf("%.2f", a)*/;
 /*         String name = "FFF";
*/

    }






}
