package lesson12.lesson12_2;/*
 * Created by BASARAB EUGEN on 28.07.2018
 *  а) Дано два числа, например 3 и 56, необходимо составить следующие строки:
 *  3 + 56 = 59
 *  3 – 56 = -53
 *  3 * 56 = 168.
 *  Используем метод StringBuilder.append().
 *  б) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
 *  в) Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 */

public class MainLesson12_2 {
    public static void main(String[] args) {
        String s = "3 + 56 = 59, 3 - 56 = -53, 3 * 56 = 168";
        stringBuilderInsertAndDelete(s);
        stringBuilderReplace(s);
    }

    private static void stringBuilderInsertAndDelete(String s) {
        StringBuilder str = new StringBuilder(s);
        int pos;
        while ((pos = str.indexOf("=")) != -1) {
            str.deleteCharAt(pos);
            str.insert(pos, "equally");
        }
        System.out.println(str);
    }

    private static void stringBuilderReplace(String s) {
        StringBuilder str = new StringBuilder(s);
        int pos;
        while ((pos = str.indexOf("=")) != -1) {
            str.replace(pos, pos + 1, "equally");
        }
        System.out.println(str);
    }
}
