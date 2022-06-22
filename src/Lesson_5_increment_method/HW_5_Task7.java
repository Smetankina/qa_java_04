package Lesson_5_increment_method;

public class HW_5_Task7 {

    public  boolean isLove(final int flower1, final int flower2) {
        boolean flower1IsEven;
        boolean flower2IsEven;
        boolean isLove;

        if (flower1 % 2 == 0) {
            flower1IsEven = true;
        } else {
            flower1IsEven = false;
        }

        if (flower2 % 2 == 0) {
            flower2IsEven = true;
        } else {
            flower2IsEven = false;
        }

        if(flower1IsEven == flower2IsEven){
            isLove = false;
        }
        else {
            isLove = true;
        }
       return isLove;
    }


}
