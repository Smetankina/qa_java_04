package Lesson_7_Start_OOP_HW_Part1;

public class HW_75_Worker {
    private double salary;
    private String name;


    public HW_75_Worker(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public  HW_75_Worker FindWorker(HW_75_Worker[] workers, String name) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName() == name) {
            } else
                System.out.println("Worker " + name + " wasn't find");

        }

    return null;

    }


    public static HW_75_Worker FindWorkerBySubName(HW_75_Worker[] workers, String subName) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().contains(subName)) {
            } else
                System.out.println("Worker with" + subName + " wasn't find");

        }

        return null;

    }

}





