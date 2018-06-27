package lesson5;/*
 * Created by basar on 25.06.2018
 * Сделать задание 14 для алгоритма сортировки выбора.
 */

import java.util.Arrays;

public class Lesson5_19 {
    public static void main(String[] args) {
        int[] arr = new int[] {9, 1, 2, 3, 4, 5, 6, 7, 8, 0};
        System.out.print(Arrays.toString(arr)+ " => ");
        inverter(arr);
        System.out.print(Arrays.toString(arr));
    }
    private static void inverter(int[] array){
        for (int i = 0; i < array.length; i++) {
            int pos = i;
            int min = array[i];
            for (int j = i + 1; j <  array.length; j++) {
                if (array[j] < min){
                    pos = j;
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;
        }
    }
}
