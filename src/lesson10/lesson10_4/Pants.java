package lesson10.lesson10_4;/*
 * Created by BASARAB EUGEN on 20.07.2018
 */

import lesson10.lesson10_4.interfaces.MenClothing;
import lesson10.lesson10_4.interfaces.WomenClothing;

public class Pants extends Clothing implements MenClothing, WomenClothing {

    public Pants(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void toDressMan() {
        System.out.println("I dress the man " + this);
    }

    @Override
    public void toDressWomen() {
        System.out.println("I dress the women " + this);
    }

    @Override
    public String toString() {
        return "Pants " + super.toString();
    }
}
