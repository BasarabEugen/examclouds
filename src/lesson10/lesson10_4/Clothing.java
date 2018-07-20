package lesson10.lesson10_4;/*
 * Created by BASARAB EUGEN on 20.07.2018
 */

import java.util.Objects;

public abstract class Clothing {
    private ClothesSize size;
    private double cost;
    private String color;

    public Clothing(ClothesSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public ClothesSize getSize() {
        return size;
    }

    public void setSize(ClothesSize size) {
        this.size = size;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothing clothing = (Clothing) o;
        return Double.compare(clothing.cost, cost) == 0 &&
                size == clothing.size &&
                Objects.equals(color, clothing.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(size, cost, color);
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
