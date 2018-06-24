package lesson4;/*
 * Created by basar on 24.06.2018
 * Вычислить среднее значение трех вещественных чисел передаваемых на вход программы в качестве аргументов.
 * Для преобразования из String в double используйте метод Double.parseDouble(String s).
 */
import java.lang.*;
import java.util.Scanner;
public class Lesson4_3 {
    public static void main(String[] args) {
        String str1 = "51";
        String str2 = "52";
        String str3 = "53";
        double d1 = Double.parseDouble(str1);
        double d2 = Double.parseDouble(str2);
        double d3 = Double.parseDouble(str3);
        System.out.println((d1 + d2 + d3) / 3);
    }
}
