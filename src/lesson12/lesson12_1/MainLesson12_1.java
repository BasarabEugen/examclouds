package lesson12.lesson12_1;/*
 * Created by BASARAB EUGEN on 28.07.2018
 *  1) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
 *  2) Распечатать последний символ строки. Используем метод String.charAt().
 *  3) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 *  4) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
 *  5) Найти позицию подстроки “Java” в строке “I like Java!!!”.
 *  6) Заменить все символы “а” на “о”.
 *  7) Преобразуйте строку к верхнему регистру.
 *  8) Преобразуйте строку к нижнему регистру.
 *  9) Вырезать строку Java c помощью метода String.substring.
 *
 */

public class MainLesson12_1 {
    public static void main(String[] args) {
        acceptString("I like Java!!!");
    }

    public static void acceptString(String s) {
        char result1 = s.charAt(13);
        boolean lastSuffix;
        boolean startSuffix;
        lastSuffix = s.endsWith("!!!");
        startSuffix = s.startsWith("I like");

        System.out.println("Task 1 - " + s);
        System.out.println("Task 2 - " + result1);
        System.out.println("Task 3 - " + lastSuffix);
        System.out.println("Task 4 - " + startSuffix);
        System.out.println("Task 5 - " + s.indexOf("Java"));
        System.out.println("Task 6 - " + s.replace('a', 'o'));
        System.out.println("Task 7 - " + s.toUpperCase());
        System.out.println("Task 8 - " + s.toLowerCase());
        System.out.println("Task 9 - " + s.substring(7, 11));
    }
}
