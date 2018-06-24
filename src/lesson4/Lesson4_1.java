package lesson4;/*
 * Created by basar on 24.06.2018
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 */
import java.util.Scanner;
public class Lesson4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        int o;
        int x;
        System.out.println("Enter first number: ");
        n = sc.nextInt();
        System.out.println("Enter second number: ");
        m = sc.nextInt();
        System.out.println("Enter the third number: ");
        o = sc.nextInt();
        if ((Math.abs(n)) <= (Math.abs(m)) && (Math.abs(n)) <= (Math.abs(o))){
            System.out.println(Math.abs(n));
        } else if ((Math.abs(m)) <= (Math.abs(n)) && (Math.abs(m)) <= (Math.abs(o))) {
            System.out.println(Math.abs(m));
        } else {
            System.out.println(o);
        }


    }
}
