/**
 * Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
 * Используем функциональный интерфейс Supplier. (Задание с урока)
 */

package lesson14.lesson14_12;

import java.util.function.Supplier;

import static java.lang.Math.*;

public class Lesson14_12 {

    public static void main(String[] args) {

        Supplier<Double> supplier = () -> Math.random() * 10;
        System.out.println(supplier.get());
    };
}


