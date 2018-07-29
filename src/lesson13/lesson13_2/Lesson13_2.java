package lesson13.lesson13_2;/*
 * Created by BASARAB EUGEN on 29.07.2018
 * Создайте объект класса LocalDate, указывая дату своего рождения.
 * Вывести на консоль день недели, день в году, месяц, год.
 * Создайте  объект класса LocalDate, представляющий текущее время.
 * Сравните его со своим днем рождения используя методы isAfter(), isBefore()
 */

import java.sql.SQLOutput;

public class Lesson13_2 {
    public static void main(String[] args) {
        java.time.LocalDate today = java.time.LocalDate.now();
        java.time.LocalDate dayOfBright = java.time.LocalDate.of(1985, 8, 25);

        System.out.println("My birthday : " + dayOfBright.getDayOfWeek() + " " + dayOfBright.getDayOfMonth() + " " +
                dayOfBright.getMonth() + " " + dayOfBright.getYear());
        System.out.println("Date today is: " + today.getDayOfWeek() + " " + today.getDayOfMonth() + " "
                + today.getMonth() + " " + today.getYear());

        System.out.println("Today after my birthday: "+today.isAfter(dayOfBright));
        System.out.println("Today before my birthday: "+today.isBefore(dayOfBright));


    }


}


