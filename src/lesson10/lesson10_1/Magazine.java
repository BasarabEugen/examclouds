package lesson10.lesson10_1;/*
 * Created by BASARAB EUGEN on 19.07.2018
 */

import java.util.Arrays;

public class Magazine implements Printable {
    private String name;
    private int edition;

    Magazine(String name, int edition) {
        this.name = name;
        this.edition = edition;
    }

    public static void printMagazine(Printable[] array) {
        for (Printable printable : array) {
            if (printable instanceof Magazine) {
                System.out.println(printable);
            }
        }
    }

    @Override
    public void print() {
        System.out.println("The magazine " + name + " was solds on the " + edition + " copies ");
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
}
