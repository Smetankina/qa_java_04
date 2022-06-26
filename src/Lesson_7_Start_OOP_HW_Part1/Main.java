package Lesson_7_Start_OOP_HW_Part1;

public class Main {

    public static void main(String[] args) {

        HW_75_Worker [] workers = {
                new HW_75_Worker(45, "B"),
                new HW_75_Worker(54, "A")
        };

       // workers.FindWorker(workers, "A");
    HW_75_Worker worker = new HW_75_Worker(1000, "WW");
    HW_73_Manager manager =new HW_73_Manager(1000, "A", 10);
    HW_74_Director director = new HW_74_Director(1000,"Direct", 50);



    }
}
