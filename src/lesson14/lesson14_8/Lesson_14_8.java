package lesson14.lesson14_8;

import java.util.function.Predicate;

public class Lesson_14_8 {
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "not null";
        Predicate<String> predicate1;
        predicate1 = str -> str != null;

        System.out.println(predicate1.test(str1));
        System.out.println(predicate1.test(str2));
    }
}
