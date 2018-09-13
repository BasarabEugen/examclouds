package lesson14.lesson14_15;

import java.util.function.Supplier;

public class Lesson14_15 {

    public static void main(String[] args) {


        Supplier<String> newString = String::new;
        System.out.println(newString.get());
    }
}