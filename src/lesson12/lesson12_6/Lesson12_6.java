package lesson12.lesson12_6;/*
 * Created by BASARAB EUGEN on 28.07.2018
 * Переделать toString() для класса Person используя форматирование.
 */

public class Lesson12_6 {
    public static void main(String[] args) {
        Pers pers = new Pers("Name", 35);
        System.out.println(pers.toString());
    }
}

class Pers {
    private String fullName;
    private int age;

    Pers(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person{fullName = %s, age = %d}", fullName, age);
    }
}