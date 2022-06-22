package Lesson3_if_for;

public class HW31Task3 {
    public static void main(String[] args) {
        int a = 40;
        if (a > 10) {
            System.out.println("больше 10");
        }
        if (a < 100) {
            System.out.println("меньше 100");
        }
        if ((a / 2) >= 20) {
            System.out.println("(a / 2) > 20");
        }
        if (a >= 5 && a <= 40) {
            System.out.println("a>5 && a<40");
        } else {
            System.out.println("a<5 && a>40");
        }
    }
}

