package lesson5;/*
 * Created by basar on 25.06.2018
 * Передать на вход программы число От 1 до 7 в качестве аргумента.
   Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и т.д. Если 6 или 7 – “Выходной”.
   Используем конструкцию switch.
 */

public class Lesson5_4 {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        String nameDay;

        switch (day){
            case 1:
                nameDay = "Понедельник";
                break;
            case 2:
                nameDay = "Вторник";
                break;
            case 3:
                nameDay = "Среда";
                break;
            case 4:
                nameDay = "Четверг";
                break;
            case 5:
                nameDay = "Пятница";
                break;
            case 6:
                nameDay = "Выходной";
                break;
            case 7:
                nameDay = "Выходной";
                break;
                default:
                    nameDay = "Your loose";
        }
        System.out.println(nameDay);
    }
}
