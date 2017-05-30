package lesson7.car.vehicles.types;

import lesson7.car.details.Engine;
import lesson7.car.professions.Driver;
import lesson7.car.vehicles.Car;

public class SportCar extends Car {
    public int topSpeed;

    public SportCar(String name, String type, int weight, Driver driver, Engine engine, int topSpeed) {
        super(name, type, weight, driver, engine);
        this.topSpeed = topSpeed;
    }

    public void printSport() {
        printInfo();
        System.out.println("Максимальная скорость: " + topSpeed + " км/ч");
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SportCar sportCar = (SportCar) o;

        return topSpeed == sportCar.topSpeed;
    }

    @Override
    public int hashCode() {
        return topSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "topSpeed=" + topSpeed +
                "} " + super.toString();
    }
}
