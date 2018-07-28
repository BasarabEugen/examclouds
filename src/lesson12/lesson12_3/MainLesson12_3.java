package lesson12.lesson12_3;/*
 * Created by BASARAB EUGEN on 28.07.2018
 * Напишите метод, заменяющий в строке все вхождения «object oriented programming»(не учитываем регистр символов) на «OOP».
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainLesson12_3 {
    public static void main(String[] args) {
        replace("object oriented programming");
    }

    static void replace(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.replace(0,27,"OOP");
        System.out.println(stringBuilder);
    }
}
