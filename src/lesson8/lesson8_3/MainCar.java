package lesson8.lesson8_3;/*
 * Created by BASARAB EUGEN on 09.07.2018
 */


import lesson8.lesson8_3.vehicles.Car;
import lesson8.lesson8_3.professions.Driver;
import lesson8.lesson8_3.details.Engine;
import lesson8.lesson8_3.Person;


public class MainCar {

    public static void main(String[] args) {
        Driver driver = new Driver("MyName", 30, 5);
//        driver.setDrivingExperience(10);
        Engine engine = new Engine("ToyotaEngine", 250);
//        engine.setPower(251);
        Car car = new Car("Celica", "Coupe", 1200, engine, driver);

        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();

        System.out.println("Car: " + car.getCarModel() + " " + car.getClassOfCar() + " " + car.getWeight());
        System.out.println("Driver is: " + driver.getFullName() + " " + driver.getAge() + " " + driver.getDrivingExperience());

    }
}
