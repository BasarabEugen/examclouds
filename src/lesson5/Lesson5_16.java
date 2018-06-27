package lesson5;/*
 * Created by basar on 25.06.2018
 * Изменить программу сортировки пузырьком:
а) добавить возможность досрочного окончания сортировки;
б) программа написана таким образом, что минимальный элемент "всплывает" в начало массива.
Измените программу так чтобы минимальный элемент "всплывал" в конец массива
(внутренний цикл for должен перебирать элементы не с конца, а с начала).
public class BubbleSorter {
    public static void sort(int[] array) {
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
}
 */
import java.util.Arrays;
public class Lesson5_16 {

    public static void main(String[] args) {
        int array[] = {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7};
        System.out.println(Arrays.toString(array) + " UNSORTED ARRAY");
            for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
//                change symbol > to <
                if (array[j - 1] < array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array) + " SORTED ARRAY");
    }
}
