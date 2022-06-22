package Lesson4_while_array_refferenceType;

import java.util.Arrays;

public class HW_41_Task4 {
    public static void main(String[] args) {
        /*Задача №4

Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.
*/
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sum = 0;
        double average = 0;
        for (int i =0;i<array.length;i++){
            sum = sum + array[i];
            average = sum/array[i];
        }

        System.out.println(average);






        System.out.println(Arrays.stream(array).average());

    }
}
