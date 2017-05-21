package lesson4_5;

import java.util.Scanner;

/**
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел. Для вычисления модуля используйте тернарную условную операцию..
 */
public class MinModule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double i = 0;
        double k = 0;
        double a = 0;
        System.out.print("Введите число 1 (если число нецелое используйте запятую): ");
        i = getValue(sc);
        System.out.print("Введите число 2 (если число нецелое используйте запятую): ");
        k = getValue(sc);
        System.out.print("Введите число 3 (если число нецелое используйте запятую): ");
        a = getValue(sc);
        double z = i < 0 ? -i : i;
        double x = k < 0 ? -k : k;
        double c = a < 0 ? -a : a;
        double t = Math.min(z, x);
        double r = Math.min(t, c);
        System.out.println(r + " - минимальный модуль из введеных чисел " + i + "; " + k + "; " + a + ";");
    }

    private static double getValue(Scanner sc) {
        double q = 0;
        if (sc.hasNextDouble()) {
            q = sc.nextDouble();
        } else {
            System.out.println("Вы ввели не числовое значение");
            System.exit(0);
        }
        return q;
    }
}


