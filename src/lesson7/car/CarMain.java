package lesson7.car;

import lesson7.car.details.Engine;
import lesson7.car.professions.Driver;
import lesson7.car.vehicles.Car;
import lesson7.car.vehicles.types.Lorry;
import lesson7.car.vehicles.types.SportCar;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Daewoo", "budget", 1000, new Driver("Anton", 24, 2), new Engine("Melitopol", 75));
        SportCar sp1 = new SportCar("Subaru", "Sport", 1800, new Driver("Andrey", 40, 5), new Engine("Subaru_jp", 250), 250);
        Lorry gr1 = new Lorry("Kamaz", "Lorry", 10000, new Driver("Vova", 33, 6), new Engine("ural", 250), 5000);

        car1.start();
        sp1.start();
        gr1.start();
        System.out.println();

        car1.stop();
        sp1.stop();
        gr1.stop();
        System.out.println();

        car1.turnLeft();
        sp1.turnLeft();
        gr1.turnLeft();
        System.out.println();

        car1.turnRight();
        sp1.turnRight();
        gr1.turnRight();
        System.out.println();

        System.out.println(car1);
        System.out.println();
        System.out.println(sp1);
        System.out.println();
        System.out.println(gr1);
        System.out.println();

    }
}
