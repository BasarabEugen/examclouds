package lesson10.lesson10_4;/*
 * Created by BASARAB EUGEN on 20.07.2018
 */

import lesson10.lesson10_4.interfaces.MenClothing;

public class Tie extends Clothing implements MenClothing {

    public Tie(ClothesSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void toDressMan() {
        System.out.println("I dress the man " + this);
    }

    @Override
    public String toString() {
        return "Tie " + super.toString();
    }
}
