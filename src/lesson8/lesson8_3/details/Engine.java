package lesson8.lesson8_3.details;/*
 * Created by BASARAB EUGEN on 09.07.2018
 */

import lesson8.lesson8_3.vehicles.Car;

public class Engine {
    private String manufacturer;
    private double power;

    public Engine(String manufacturer, double power) {

        this.manufacturer = manufacturer;
        this.power = power;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
