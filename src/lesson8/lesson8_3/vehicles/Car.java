package lesson8.lesson8_3.vehicles;/*
 * Created by BASARAB EUGEN on 09.07.2018
 */

import lesson8.lesson8_3.details.Engine;
import lesson8.lesson8_3.professions.Driver;

public class Car {
    private String carModel;
    private String classOfCar;
    private double weight;
    private Engine engine;
    private Driver driver;

    public Car(String carModel, String classOfCar, double weight, Engine engine, Driver driver) {
        this.carModel = carModel;
        this.classOfCar = classOfCar;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getClassOfCar() {
        return classOfCar;
    }

    public void setClassOfCar(String classOfCar) {
        this.classOfCar = classOfCar;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }
}
