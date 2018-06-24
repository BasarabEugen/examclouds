package lesson3;/*
 * Created by basar on 24.06.2018
 * Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел, введённых пользователем.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */
import java.util.Scanner;
public class Lesson3_4 {
    public static void main(String[] args) {
        number();
    }

    private static void number(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an two integer numbers: ");
        if (sc.hasNextInt()){
            int i = sc.nextInt();
            int e = sc.nextInt();
            System.out.println("sum = " + (i + e));

        } else {
            System.out.println("You did not enter an integer");
        }
    }
}
