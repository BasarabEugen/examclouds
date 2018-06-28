package lesson5;/*
 * Created by basar on 25.06.2018
 * Создать двухмерный массив 5х8 и инициализировать его с помощью блока для инициализации.
 * Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
 * Распечатать оба массива.
 */

import java.util.*;


public class Lesson5_17 {
    public static void main(String[] args) {
        int arr[][] = {
                {49, 48, 97, 46, 45, 14, 43, 42},
                {39, 38, 37, 36, 35, 34, 33, 92},
                {29, -28, 27, 26, 25, 24, 21, 22},
                {19, 18, 17, 16, 15, 14, 13, 10},
                {59, 58, 57, 56, 95, 54, 53, -2},
        };
            for (int[] m : arr) {
                bulbeSortMax(m);
                int k = m[0];
                bulbeSortMin(m);
                int h = m[0];
                System.out.println("Max =>"  + k + "  |  "+ h +"<= Min");
            }
        }
    private static void bulbeSortMin(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    private static void bulbeSortMax(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}


