package Lesson4_while_array_refferenceType;

public class HW_42_Task2 {
    public static void main(String[] args) {
        /*Задача №2

Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4.
*/
        String s = "Перевыборы выбранного президента";
        int count = 0;
        for(int i = 0; i<s.length();i++){

            if(s.charAt(i)=='е'){
                count ++;
                            }

        }
        System.out.println(count);

    }
}
