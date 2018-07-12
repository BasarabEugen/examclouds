package lesson9.lesson9_3;/*
 * Created by BASARAB EUGEN on 12.07.2018
 */

public class Rectangle extends Shape{

    double x1, x2, y1, y2;

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    @Override
    void draw() {
        System.out.println("draw rectangle" + getX1()+ " " + getX2() + " " + getY1() + " " + getY2());
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Rectangle rectangle = (Rectangle) o;
//
//        if (Double.compare(rectangle.x1, x1) != 0) return false;
//        if (Double.compare(rectangle.y1, y1) != 0) return false;
//        if (Double.compare(rectangle.x2, x2) != 0) return false;
//        return Double.compare(rectangle.y2, y2) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        int result;
//        long temp;
//        temp = Double.doubleToLongBits(x1);
//        result = (int) (temp ^ (temp >>> 32));
//        temp = Double.doubleToLongBits(y1);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        temp = Double.doubleToLongBits(x2);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        temp = Double.doubleToLongBits(y2);
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }
}
