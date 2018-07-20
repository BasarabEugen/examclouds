package lesson5;/*
 * Created by basar on 25.06.2018
 * Изменить сортировку выбором - исключите обмен значений,
 * если найденный минимальный элемент уже находится на своем месте.
public class SelectionSorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }
}
 */

public class Lesson5_20 {
}
