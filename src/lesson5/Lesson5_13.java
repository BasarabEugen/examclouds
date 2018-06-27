package lesson5;/*
 * Created by basar on 25.06.2018
 * Создать двумерный массив типа char размером 4х2.
 * И записать туда значения с помощью блока для инициализации.
 * Распечатать значения массива с помощью метода Arrays.deepToString(m).
 */
import java.util.Arrays;
public class Lesson5_13 {
    public static void main(String[] args) {
        char[][] m = {
                {'A', 'B'},
                {'C', 'D'},
                {'E', 'F'},
                {'G', 'H'}
        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
            }
        System.out.println(Arrays.deepToString(m));
      }
  }
}

