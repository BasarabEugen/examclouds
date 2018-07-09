package lesson8.lesson8_3;/*
 * Created by BASARAB EUGEN on 09.07.2018
 */

import lesson8.lesson8_3.details.Engine;
import lesson8.lesson8_3.professions.Driver;
import lesson8.lesson8_3.vehicles.Car;

public class SportCar extends Car {
    private double speed;

    public SportCar(String carModel, String classOfCar, double weight, Engine engine, Driver driver, double speed) {
        super(carModel, classOfCar, weight, engine, driver);
        this.speed = speed;
    }
}
