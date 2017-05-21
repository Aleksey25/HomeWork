package lesson4_5;

import java.util.Scanner;
import java.util.Random;

/**
 * Задача с гирляндой.
 */

public class Girlianda {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2147483647);
        System.out.println(i);
        Scanner sc = new Scanner(System.in);
        int k = 0;
        System.out.println("Введите число 1...4, в зависимости от того что вы хотите сделать с гирляндой");
        System.out.println("1 - гирлянда будет мигать лампочками");
        System.out.println("2 - гирлянда перейдет в режим бегущей строки");
        System.out.println("3 - проверка работы лампочки №1");
        System.out.println("4 - программа распечатает текущее состояние гирлянды");
        k = checkParameter(sc);
        if (k > 4 || k < 1) {
            System.out.println("Вы ввели некорректное значение");
            System.exit(0);
        }
        int b = 0;
        switch (k) {
            case 1:
                System.out.println("Введите кол-во раз которое гирлянда дожна мигнуть");
                b = checkParameter(sc);
                miganie(b, i);
                break;
            case 2:
                System.out.println("Введите кол-во раз которое гирлянда дожна сдвинуться");
                b = checkParameter(sc);
                run(b, i);
                break;
            case 3:
                int w = i & 1;
                if (w == 1)
                    System.out.println("Первая лампочка включена");
                else System.out.println("Первая лампочка выключена");
                break;
            default:
                System.out.println(Integer.toBinaryString(i));
                break;
        }
    }

    private static int checkParameter(Scanner sc) {
        int b = 0;
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
            System.exit(0);
        }
        if (b < 0) {
            System.out.println("Вы ввели некорректное значение");
            System.exit(0);
        }
        return b;
    }

    private static void miganie(int b, int i) {
        int n = 1;
        while (n <= b) {
            int w = ~i;
            System.out.println(Integer.toBinaryString(w));
            i = w;
            n++;
        }
    }

    private static void run(int b, int i) {
        int n = 1;
        while (n <= b) {
            int w = i >> 1;
            System.out.println(Integer.toBinaryString(w));
            i = w;
            n++;
        }
    }
}




