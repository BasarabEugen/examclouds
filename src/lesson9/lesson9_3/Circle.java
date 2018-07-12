package lesson9.lesson9_3;/*
 * Created by BASARAB EUGEN on 12.07.2018
 */

public class Circle extends Shape {
    double radius, x1, y1;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    @Override
    void draw() {
        System.out.println("draw circle: " + getX1()+ " " + getY1()+ " " + getRadius());
    }
}
