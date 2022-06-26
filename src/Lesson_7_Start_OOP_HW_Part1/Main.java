package Lesson_7_Start_OOP_HW_Part1;

public class Main {

    public static void main(String[] args) {

        HW_75_Worker [] workers = {
                new HW_75_Worker(45, "B"),
                new HW_75_Worker(54, "A")
        };

        workers.FindWorker(workers, "A");
    }
}
