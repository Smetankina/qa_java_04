package Lesson_5_increment_method;

public class HW_52_Task1 {

    public static void main(String[] args) {


    /*
0  1  2  3  4  5  6  7  8  9
0  1  2  3  4  5  6  7  8
0  1  2  3  4  5  6  7
0  1  2  3  4  5  6
0  1  2  3  4  5
0  1  2  3  4
0  1  2  3
0  1  2
0  1
0
 */

    for(int i = 9; i >= 0;i--) {
        for (int j = 0; j <= i; j++) {
          //  System.out.print(i + " ");
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }


}


