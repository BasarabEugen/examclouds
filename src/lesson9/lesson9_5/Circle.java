package lesson9.lesson9_5;/*
 * Created by BASARAB EUGEN on 12.07.2018
 */

class Circle {
    private double radius;
    private final double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    void areaOfCircle() {
        double s = radius * radius * PI;
        System.out.println("area of a circle: " + s);
    }

    void leghtOfCircle() {
        double p = radius * 2 * PI;
        System.out.println("Area of a circle: " + p);
    }
}
