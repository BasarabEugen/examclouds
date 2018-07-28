package lesson12.lesson12_5;/*
 * Created by BASARAB EUGEN on 28.07.2018
 * Создать строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету].
 * Форматирование и вывод строки на консоль написать в отдельном методе,
 * который принимает фамилию, оценку и название предмета в качестве параметров.
 * Выделить под фамилию 15 символов, под оценку 3 символа, предмет – 10.
 */

import java.util.Formatter;

public class Lesson12_5 {
    public static void main(String[] args) {
    formatString("Mark Spencer", 9, "programming");
    formatString("Jora Utkin", 1, "programming");
    }

    private static void formatString(String fullName, int mark, String subject){
        Formatter formatter = new Formatter();
        formatter.format("Студент %15s получил %3d по %10s", fullName, mark, subject);
        System.out.println(formatter);
    }

}
