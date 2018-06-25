package lesson5;/*
 * Created by basar on 25.06.2018
 * С помощью класса Scanner ввести целое число. Если это число от 0 до 10,
 * вывести на консоль сообщение “Положительное число меньше 10”,
 * иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
 * Используем оператор if-else
 */
import java.util.*;
public class Lesoon5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ( n < 10 && n > 0){
            System.out.println("Положительное число меньше 10");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }
     }
}
