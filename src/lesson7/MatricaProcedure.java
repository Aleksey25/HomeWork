package lesson7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создать класс "Матрица"...
 */

public class MatricaProcedure {
    public static void main(String[] args) {
        int matrica[][] = new int[3][3];

        for (int i = 0; i < 3; i++) {
            Random random = new Random();
            for (int j = 0; j < 3; j++) {
                matrica[i][j] = random.nextInt(100);
            }
        }

        System.out.println(Arrays.deepToString(matrica));
        System.out.println("Что вы хотите сделать с матрицей?  1 - умножить на число; 2 - сложить с другой;");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        switch (k) {
            case 1:
                umnog(matrica);
                break;
            case 2:
                summ(matrica);
                break;
            default:
                System.exit(0);
        }
    }

    private static void summ(int[][] array1) {
        int array2[][] = {
                {0, 1, 2},
                {3, 4, 5},
                {7, 8, 9}
        };
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                array1[a][b] = array1[a][b] + array2[a][b];
            }
        }
        System.out.println(Arrays.deepToString(array1));
    }

    private static void umnog(int[][] array3) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число на которое необходимо умножить матрицу");
        int x = 0;
        if (sc.hasNextInt()) {
            x = sc.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
            System.exit(0);
        }
        for (int a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++) {
                array3[a][b] = array3[a][b] * x;
            }
        }
        System.out.println(Arrays.deepToString(array3));
    }
}


