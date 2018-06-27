package lesson5;/*
 * Created by basar on 25.06.2018
 * Создать табличку для любого массива, в котором последовательно прописать значения i, j,
 * массива для  каждого цикла алгоритма сортировки пузырька. Используйте debugger.
 * Например для массива 0 2 5 3 4:
i	j	Значение массива	Выполнился ли блок if?
0	4	 0 2 5 3 4	        -
0	3	 0 2 3 5 4	        +
0	2	 0 2 3 5 4	        -
0	1	 0 2 3 5 4	        -
1	4	 0 2 3 4 5	        +
1	3	 0 2 3 4 5	        -
1	2	 0 2 3 4 5	        -
2	4	 0 2 3 4 5	        -
2	3	 0 2 3 4 5	        -
3	4	 0 2 3 4 5	        -
4	-	 0 2 3 4 5	        -
 */

import java.util.Arrays;

public class Lesson5_15 {
    public static void main(String[] args) {
        int[] arr = {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7};
        System.out.println(Arrays.toString(arr) + " - UNSORTED");
        bulbeSortUp(arr);
        System.out.println(Arrays.toString(arr) + " - SORT UP");
        bulbeSortDown(arr);
        System.out.println(Arrays.toString(arr) + " - SORT DOWN");

    }

    private static void bulbeSortUp(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--){
                if (array[j - 1] > array[j]){
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    private static void bulbeSortDown(int[] array) {
        boolean Sorted = false;
        int buf;
        while (!Sorted){
        Sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]){
                Sorted = false;
                buf = array[i];
                array[i] = array[i + 1];
                array[i + 1] = buf;
                }
            }
        }
    }
}
