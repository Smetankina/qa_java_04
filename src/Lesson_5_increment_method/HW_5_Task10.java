package Lesson_5_increment_method;

public class HW_5_Task10 {
    public  String countingSheep(int num) {
        int i=1;
        String counting = "";

        for(;i<=num;i++){
            counting = counting + i + " sheep...";
        }

        return counting;
    }
}
