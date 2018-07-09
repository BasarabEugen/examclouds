package lesson8.lesson8_3;/*
 * Created by BASARAB EUGEN on 09.07.2018
 */

import lesson8.lesson8_3.details.Engine;
import lesson8.lesson8_3.professions.Driver;
import lesson8.lesson8_3.vehicles.Car;

public class Lorry extends Car {
    private double carrying;

    public Lorry(String carModel, String classOfCar, double weight, Engine engine, Driver driver, double carrying) {
        super(carModel, classOfCar, weight, engine, driver);
        this.carrying = carrying;
    }
}
