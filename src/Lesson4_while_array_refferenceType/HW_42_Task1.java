package Lesson4_while_array_refferenceType;

public class HW_42_Task1 {
    public static void main(String[] args) {
       /*Задача №1

Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)
*/

        String s = "Перестановочный алгоритм быстрого действия";
                for(int i= 0;i<s.length();i++){
                    if (s.charAt(i)=='о'){
                        System.out.println(s.charAt(i));
                    }
                }

    }
}
