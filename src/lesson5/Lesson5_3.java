package lesson5;/*
 * Created by basar on 25.06.2018
 * Передать на вход программы число От 1 до 7 в качестве аргумента.
 * Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и т.д. Если 6 или 7 – “Выходной”.
 * Используем конструкцию if-else-if.
 */

public class Lesson5_3 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n == 1) {
            System.out.println("Понедельник");
        } else if (n == 2) {
            System.out.println("Вторник");
        } else if (n == 3) {
            System.out.println("Среда");
        } else if (n == 4) {
            System.out.println("Четверг");
        } else if (n == 5) {
            System.out.println("Пятница");
        } else if (n == 6 || n == 7) {
            System.out.println("Выходной");
        } else {
            System.out.println("Your loose");
        }
    }
}
