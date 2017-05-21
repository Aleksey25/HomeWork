package lesson6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Задача с гирляндой. Использовать массивы
 */

public class Girlianda2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[32];
        for (int i = 0; i < 32; i++) {
            Random random = new Random();
            arr[i] = random.nextInt(2);
        }
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
                for (int x = 0; x < b; x++) {
                    miganie(arr);
                    System.out.println(Arrays.toString(arr));
                }
                break;
            case 2:
                System.out.println("Введите кол-во раз которое гирлянда дожна сдвинуться");
                b = checkParameter(sc);
                for (int x = 0; x < b; x++) {
                    run(arr);
                    System.out.println(Arrays.toString(arr));
                }
                break;
            case 3:
                if (arr[0] == 1) {
                    System.out.println("Лампочка включена");
                } else System.out.println("Лампочка выключена");
                break;
            default:
                System.out.println(Arrays.toString(arr));
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

    private static void miganie(int[] array) {
        for (int i = 0; i < 32; i++) {
            if (array[i] == 1)
                array[i] = 0;
            else array[i] = 1;
        }
    }

    private static void run(int[] arr) {
        int tmp = arr[0];
        for (int i = 0; i < 31; i++) {
            arr[i] = arr[i + 1];
        }
        arr[31] = tmp;
    }
}






