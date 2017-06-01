package lesson7.car.vehicles;

import lesson7.car.details.Engine;
import lesson7.car.professions.Driver;

public class Car {
    private String name;
    private String type;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car() {
    }

    public Car(String name, String type, int weight, Driver driver, Engine engine) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Автомобиль " + name + " начинает движение");
    }

    public void stop() {
        System.out.println("Автомобиль " + name + " останавливается");
    }

    public void turnLeft() {
        System.out.println("Автомобиль " + name + " поворачивает налево");
    }

    public void turnRight() {
        System.out.println("Автомобиль " + name + " поворачивает направо");
    }

    public void printInfo() {
        System.out.println(toString());
         }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (weight != car.weight) return false;
        if (name != null ? !name.equals(car.name) : car.name != null) return false;
        if (type != null ? !type.equals(car.type) : car.type != null) return false;
        if (driver != null ? !driver.equals(car.driver) : car.driver != null) return false;
        return engine != null ? engine.equals(car.engine) : car.engine == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + weight;
        result = 31 * result + (driver != null ? driver.hashCode() : 0);
        result = 31 * result + (engine != null ? engine.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
