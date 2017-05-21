package lesson8;

import java.util.Random;


public class Recurs {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(20);
        System.out.println("Число A = " + a);
        int b = random.nextInt(40);
        System.out.println("Число B = " + b);
        ab(a, b);
    }

    private static void ab(int a, int b) {
        if (a > b) {
            System.out.println(a);
            ab(a - 1, b);
        } else if (a < b) {
            System.out.println(a);
            ab(a + 1, b);
        } else {
            System.out.println(b);
        }
    }
}
