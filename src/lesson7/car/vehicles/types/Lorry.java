package lesson7.car.vehicles.types;

import lesson7.car.details.Engine;
import lesson7.car.professions.Driver;
import lesson7.car.vehicles.Car;


public class Lorry extends Car {
    public int carrying;

    public Lorry(String name, String type, int weight, Driver driver, Engine engine, int carrying) {
        super(name, type, weight, driver, engine);
        this.carrying = carrying;
    }

    public void printLorry() {
        printInfo();
       // System.out.println("Грузоподъемность: " + carrying + " кг");
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lorry lorry = (Lorry) o;

        return carrying == lorry.carrying;
    }

    @Override
    public int hashCode() {
        return carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying= " + carrying +
                " кг} " + super.toString();
    }
}
