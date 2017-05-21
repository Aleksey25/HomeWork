package lesson4_5;

/**
 * Вычислить среднее значение вещественных чисел передаваемых на вход программы в качестве аргументов.
 */
public class SummArg {
    public static void main(String[] args) {
        double mid;
        double sum = 0;
        int i = 0;
        for (String m : args) {
            double d = Double.parseDouble(m);
            System.out.println(d);
            sum += d;
            i = i + 1;
        }
        mid = sum / i;
        System.out.println("Среднее значение введеныых аргументов: " + mid);
    }
}


