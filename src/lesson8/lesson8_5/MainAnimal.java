package lesson8.lesson8_5;/*
 * Created by BASARAB EUGEN on 12.07.2018
 */

public class MainAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("fish", "world", "MEOMS");
        Dog dog = new Dog("bone", "world", "HOWG");
        Horse horse = new Horse("grass", "world", "MPRR");

        {
            Animal.makeNoise();
            System.out.println(cat.toString());
            System.out.println(dog.toString());
            System.out.println(horse.toString());
        }
    }
}
