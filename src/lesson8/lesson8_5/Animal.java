package lesson8.lesson8_5;/*
 * Created by BASARAB EUGEN on 10.07.2018
 */

public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    static void makeNoise() {
        System.out.println("to make noise");
    }

    static void eat() {
        System.out.println("eat");
    }

    static void sleep() {
        System.out.println("sleap");
    }
}
