package lesson8.lesson8_3.professions;/*
 * Created by BASARAB EUGEN on 09.07.2018
 */

import lesson8.lesson8_3.Person;
import lesson8.lesson8_3.vehicles.Car;

public class Driver extends Person {

    private double drivingExperience;

    public Driver(String fullName, int age, double drivingExperience) {
        super(age, fullName);

        this.drivingExperience = drivingExperience;
    }

    public double getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(double drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}
