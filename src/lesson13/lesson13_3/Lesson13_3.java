package lesson13.lesson13_3;/*
 * Created by BASARAB EUGEN on 31.07.2018
 * Напишите программу, выводящую на консоль всю метаинформацию о выбранном классе.
 */

import sun.plugin.javascript.navig.Array;

import java.util.Arrays;

public class Lesson13_3 {
    public static void main(String[] args) {
        printInfo();
    }

    private static void printInfo() {
        System.out.println("getSuperclass " + ((Class) Array.class).getSuperclass());
        System.out.println("getPackage " + Array.class.getPackage());
        System.out.println("getModifiers " + Array.class.getModifiers());
        System.out.println("isArray " + Array.class.isArray());
        System.out.println("isInterface " + Array.class.isInterface());
        System.out.println("getDeclaredClasses " + Arrays.toString(((Class) Array.class).getDeclaredClasses()));
        System.out.println("getDeclaredConstructors " + Arrays.toString(((Class) Array.class).getDeclaredConstructors()));
        System.out.println("getDeclaredMethods " + Arrays.toString(Array.class.getDeclaredMethods()));
        System.out.println("getDeclaredFields " + Arrays.toString(Array.class.getDeclaredFields()));
        System.out.println("getClasses " + Arrays.toString(((Class) Array.class).getClasses()));
        System.out.println("getConstructors " + Arrays.toString(((Class) Array.class).getConstructors()));
        System.out.println("getMethods " + Arrays.toString(Array.class.getMethods()));
        System.out.println("getFields " + Arrays.toString(Array.class.getFields()));
    }
}
