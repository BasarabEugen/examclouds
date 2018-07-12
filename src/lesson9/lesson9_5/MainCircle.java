package lesson9.lesson9_5;/*
 * Created by BASARAB EUGEN on 12.07.2018
 * Создать класс Circle, который содержит
 *  - переменную radius;
 *  - методы, вычисляющие площадь и длину окружности;
 *  - константу PI.
 *  Создать несколько объектов данного класса.
 */

public class MainCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle(100);
        Circle c2 = new Circle(50);

        c1.areaOfCircle();
        c1.leghtOfCircle();
        c2.areaOfCircle();
        c2.leghtOfCircle();
    }
}
