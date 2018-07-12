package lesson8.lesson8_5;/*
 * Created by BASARAB EUGEN on 10.07.2018
 */

public class Dog extends Animal {
    String Barks;

    public Dog(String food, String location, String barks) {
        super(food, location);
        Barks = barks;
    }

    @Override
    public String toString() {
        return "Dog " + Barks;
    }


}
