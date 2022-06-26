import Lesson_7_Start_OOP_HW_Part1.HW_72_Worker;
import Lesson_7_Start_OOP_HW_Part1.HW_73_Manager;
import Lesson_7_Start_OOP_HW_Part1.HW_74_Director;
import Lesson_7_Start_OOP_HW_Part1.HW_75_Worker;

public class Main {
    public static void main(String[] args) {

        HW_72_Worker worker = new HW_72_Worker(1000, "YYY");
        System.out.println(worker.getBaseSalary());

        HW_73_Manager manager = new HW_73_Manager(1000, "Aghgu", 60);

        System.out.println(manager.getBaseSalary1());

        HW_74_Director director = new HW_74_Director(1000, "JJJ", 60);
        System.out.println(director.getBaseSalary1());

        HW_75_Worker worker1 = new HW_75_Worker(5, "hj");
        HW_75_Worker worker2 = new HW_75_Worker(8, "hygu");


        HW_75_Worker[] workerss = {worker1, worker2};

        System.out.println(workerss);
                
    
    
    }}
