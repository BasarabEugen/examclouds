package lesson12.lesson12_10;/*
 * Created by BASARAB EUGEN on 29.07.2018
 * Дана строка “Versions: Java  5, Java 6, Java   7, Java 8.” .Найти все подстроки "Java X" и распечатать их.
 */

import java.util.Arrays;
import java.util.regex.Pattern;

public class Lesson12_10 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\[a-z]{4,4}");
        String[] words = pattern.split("Versions: Java  5, Java 6, Java   7, Java 8.");
        System.out.println(Arrays.toString(words));
    }
}
