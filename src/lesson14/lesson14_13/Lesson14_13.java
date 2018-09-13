package lesson14.lesson14_13;

import java.util.function.IntFunction;

public class Lesson14_13 {
    public static void main(String[] args) {
        IntFunction<String> function =
                String::valueOf;
        System.out.println(function.apply(450));
    }
}
