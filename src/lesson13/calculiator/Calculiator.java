package lesson13.calculiator;

/**
 * Created by belkin on 07.06.2017.
 */
public class Calculiator {

    public static <T extends Number, V extends Number> void summ(T a, V b) {
        double c = a.doubleValue() + b.doubleValue();
        System.out.println("сумма чисел " + a + " и " + b + " = " + c);
    }

    public static <T extends Number, V extends Number> void minus(T a, V b) {
        double c = a.doubleValue() + b.doubleValue();
        System.out.println("разность чисел " + a + " и " + b + " = " + c);
    }

    public static <T extends Number, V extends Number> void umnog(T a, V b) {
        double c = a.doubleValue() * b.doubleValue();
        System.out.println("произведение чисел " + a + " и " + b + " = " + c);
    }

    public static <T extends Number, V extends Number> void div(T a, V b) {
        double c = a.doubleValue() / b.doubleValue();
        System.out.println("частное чисел " + a + " и " + b + " = " + c);
    }
}
