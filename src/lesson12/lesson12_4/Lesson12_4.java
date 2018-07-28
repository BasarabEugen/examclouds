package lesson12.lesson12_4;/*
 * Created by BASARAB EUGEN on 28.07.2018
 * Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака:
 * "string" → "ri", "code" → "od", "Practice"→"ct".
 */

public class Lesson12_4 {
    public static void main(String[] args) {
        String s1 = "string";
        String s2 = "code";
        String s3 = "Practice";
        returnSymbol(s1);
        returnSymbol(s2);
        returnSymbol(s3);
    }

    private static void returnSymbol(String s) {
        int i = (s.length() / 2) - 1;
        int k = (s.length() / 2) + 1;

        System.out.println(s.substring(i, k));
    }
}
