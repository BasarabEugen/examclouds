package lesson4;/*
 * Created by basar on 24.06.2018
 * Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
 * В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~);
б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
г) метод который будет распечатывать текущее состояние гирлянды.
Используйте побитовые операции. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).
 */

import java.util.Random;
import java.util.Scanner;

public class Lesson4_2 {
    public static void main(String[] args) {
        Lesson4_2  g = new Lesson4_2();
        Scanner sc = new Scanner(System.in);
        int randomNum = 1 + (int)(Math.random() * 9999);
        while (true){
            System.out.println("Select blinking mode " + "\n" +
                    "[1] Flashing mode" + "\n" +
                    "[2] Treadmill mode" + "\n" +
                    "[3] State of the first light bulb" + "\n" +
                    "[4] Condition of the garland" + "\n" +
                    "[5] Exit");
            int s = sc.nextInt();
            switch (s){
                case 1:
                    System.out.println("How many times does the garland");
                    int a = sc.nextInt();
                    g.flash(a, randomNum);
                    break;

                case 2:
                    g.line(randomNum);
                    break;
                case 3:
                    g.mask(randomNum);
                    break;
                case 4:
                    g.status(randomNum);
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
    private void flash (int a, int randomNum){
        int f = ~randomNum;
        String s = Integer.toBinaryString(f);
        for (int i = s.length(); i < 32; i++) {
            s = "0" + s;
        }
        String c = Integer.toBinaryString(randomNum);
        for (int i = c.length(); i < 32; i++) {
            c = "0" + c;
        }
        for (int i = 1; i <= a ; i++) {
            System.out.println(c);
            System.out.println(s);


        }

    }
    private void line (int randomNum){
        for (int i = randomNum; i > 0;) {
            i = i << 1;
            String s = Integer.toBinaryString(i);
            for (int j = s.length(); j < 32; j++) {
                s = "0" + s;
            }
            System.out.println(s);
        }
    }
    private void status (int randomNum){
        String s = Integer.toBinaryString(randomNum);
        for (int i = s.length(); i < 32; i++) {
            s = "0" + s;
        }
        System.out.println("\nStatus of garland\n");
        System.out.println(s + "\n");

    }
    private void mask (int randomNum){
        String s = Integer.toBinaryString(randomNum);
        for (int i = s.length(); i < 32; i++) {
            s = "0" + s;
        }
        if (s.startsWith("0", 0)) {
            System.out.println("\n In moment bulb not flash");
        } else {
            System.out.println("In moment bulb flash");
        }
    }

}
