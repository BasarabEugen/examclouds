package lesson12.lesson12_9;/*
 * Created by BASARAB EUGEN on 29.07.2018
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        System.out.println(test("google.com"));
        System.out.println(test("reference1.ua"));
        System.out.println(test("reference1.org"));
        System.out.println(test("yandex.ru"));
    }

    public static boolean test(String testString) {
        Pattern pattern = Pattern.compile(".+\\.(com|ua|org)");
        Matcher matcher = pattern.matcher(testString);
        return matcher.matches();
    }
}
