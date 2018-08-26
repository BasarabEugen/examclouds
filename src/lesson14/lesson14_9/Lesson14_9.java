package lesson14.lesson14_9;

import java.util.function.Predicate;

public class Lesson14_9 {
    public static void main(String[] args) {
        String str1 = "JorA";
        String str2 = "NynzyA";
        String str3 = "Balalayka";

        Predicate<String> predicate1 = str -> str.startsWith("J");
        Predicate<String> predicate2 = str -> str.startsWith("N");
        Predicate<String> predicate3 = str -> str.endsWith("A");

        System.out.println(predicate1.and(predicate3).test(str1));
        System.out.println(predicate2.and(predicate3).test(str2));
        System.out.println(predicate3.test(str3));

    }
}
