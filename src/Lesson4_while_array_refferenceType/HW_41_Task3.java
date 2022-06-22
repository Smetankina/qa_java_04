package Lesson4_while_array_refferenceType;

import java.util.Arrays;

public class HW_41_Task3 {
    /*Задача №3

Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести минимальное значение массива.
*/

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {

            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);

        System.out.println(Arrays.stream(array).min());
    }
}
