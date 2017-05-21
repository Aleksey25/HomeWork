package lesson6;
/*
* Реализовать подсчет факториала используя цикл for.
*/
import java.util.Random;

public class Faktorial {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(10);
        System.out.println(i);
        double faktorial = 1;
        for (int a = 1; a <= i ; a++) {
            faktorial = faktorial * a;
        }
        System.out.println(faktorial);
    }
}

