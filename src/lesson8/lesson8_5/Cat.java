package lesson8.lesson8_5;/*
 * Created by BASARAB EUGEN on 10.07.2018
 */

public class Cat extends Animal {
    String meows;

    public Cat(String food, String location, String meows) {
        super(food, location);
        this.meows = meows;
    }
}
