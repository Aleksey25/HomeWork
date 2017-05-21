package lesson8;

/**
 * Created by test23 on 13.05.2017.
 */
public class CircleMain {
    public static void main(String[] args) {

        Circle cr1 = new Circle(2.5);
        Circle cr2 = new Circle(17);
        Circle cr3 = new Circle(9);

        System.out.println("Радиус окружности: " + cr1.getRad());
        System.out.println("Длинна окружности: " + cr1.getLength());
        System.out.println("Площадь круга: " + cr1.getSquare());
        System.out.println();

        System.out.println("Радиус окружности: " + cr2.getRad());
        System.out.println("Длинна окружности: " + cr2.getLength());
        System.out.println("Площадь круга: " + cr2.getSquare());
        System.out.println();

        System.out.println("Радиус окружности: " + cr3.getRad());
        System.out.println("Длинна окружности: " + cr3.getLength());
        System.out.println("Площадь круга: " + cr3.getSquare());
        System.out.println();
    }
}
