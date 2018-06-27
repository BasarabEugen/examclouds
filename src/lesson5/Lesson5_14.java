package lesson5;/*
 * Created by basar on 25.06.2018
 * Добавить в программу ArrayInverterTest2 еще один тестовый массив.
 * Делаем дебаг и смотрим как работает.
 */

import java.util.Arrays;

public class Lesson5_14 {
    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print(Arrays.toString(arr)+ " => ");
        inverter(arr);
        System.out.print(Arrays.toString(arr));
    }
    private static void inverter(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] =  tmp;
        }
    }
}
