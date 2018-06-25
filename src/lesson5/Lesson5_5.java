package lesson5;/*
 * Created by basar on 25.06.2018
 * Распечатать 10 строк: “Task1”. “Task2”. … “Task10”
 */

public class Lesson5_5 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 10) {
             System.out.println("Task" + counter);
             counter++;
        }
    }
}
