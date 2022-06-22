package Lesson4_while_array_refferenceType;

import java.util.Arrays;

public class HW_41_Task1 {
  /*  Задача №1

    Дан массив:
    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
    необходимо вывести сумму всех значений массива*/

    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum=0;
        for(int i = 0; i< array.length; i++){
            sum = sum + array[i];
                    }
        System.out.println(sum);
        System.out.println(Arrays.stream(array).sum());
    }

}
