package Lesson4_while_array_refferenceType;

import java.util.Arrays;

public class HW_41_Task2 {
    public static void main(String[] args) {
        /*Задача №2
Дан массив:

необходимо вывести максимальное значение массива.
*/

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = array[0];
        for(int i =0;i<array.length;i++){

            if (max<array[i]){
                max = array[i];
            }
        }
        System.out.println(max);


        System.out.println(Arrays.stream(array).max());

    }
}
