package lesson8.lesson8_5;/*
 * Created by BASARAB EUGEN on 10.07.2018
 */

public class Horse extends Animal {
    String neighs;

    public Horse(String food, String location, String neighs) {
        super(food, location);
        this.neighs = neighs;
    }

    @Override
    public String toString() {
        return "Horse " + neighs;
    }
}
