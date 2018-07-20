package lesson10.lesson10_4;/*
 * Created by BASARAB EUGEN on 20.07.2018
 */

import lesson10.lesson10_4.interfaces.WomenClothing;

public class Skirt extends Clothing implements WomenClothing {
    public Skirt(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void toDressWomen() {
        System.out.println("I dress the women " + this);
    }

    @Override
    public String toString() {
        return "Skirt " + super.toString();
    }
}
