package lesson5;/*
 * Created by basar on 25.06.2018
 * Распечатать все числа от 1 до 100, которые делятся на 5 без остатка.
 * Используем цикл do-while.
 */

public class Lesson5_6 {
    public static void main(String[] args) {
       int n = 100;
       do {
           System.out.println(n = n - 5);
       } while (n > 0);

    }
}
