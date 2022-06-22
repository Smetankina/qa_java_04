package Lesson4_while_array_refferenceType;

import java.util.Locale;

public class HW_42_Task3 {
    public static void main(String[] args) {
        /*
        Задача №3

Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.
 */
        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase(Locale.ROOT);

        int index = s.indexOf("рит");
        while (index != -1){
              System.out.println(index);

              index = s.indexOf("рит",index+1);
            }
        }

    }

