package lesson5;
/*
 * Created by basar on 25.06.2018
 * Реализовать подсчет факториала используя цикл for.
n! = 1*2*...*n;​
0!=1;
5! = 1*2*3*4*5;
Число n задается случайным образом (используйте Math.random()).
 */

import java.util.Scanner;
import java.lang.*;

public class Lesson5_9 {

     private static long factorial() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        long n = sc.nextInt();
        int n = (int)(Math.random()*20);
         System.out.print("The factorial from [" + n +"]");
         long result = 1;
        for (long factor = 1; factor <= n; factor++) {
            result *= factor;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(" = " + factorial());
    }
}
