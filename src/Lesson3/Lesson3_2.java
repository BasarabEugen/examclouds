package Lesson3;/*
 * Created by basar on 24.06.2018
 * Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нечётным.
 * Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */
import java.util.Scanner;
public class Lesson3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (sc.hasNextInt()){
            int i = sc.nextInt();
            System.out.println(i);
            System.out.println("Good job!");

        } else {
            System.out.println("You did not enter an integer");
        }


    }
}
