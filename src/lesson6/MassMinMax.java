package lesson6;

/**
 * Создать двухмерный массив 5х8 и инициализировать его с помощью блока для инициализации.
 * Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
 * Распечатать оба массива.
 */

import java.util.Arrays;

public class MassMinMax {
    public static final int ROW_COUNT = 5;
    public static final int COLUMN_COUNT = 8;

    public static void main(String[] args) {
        int start[][] = {
                {16566, -51, 2213, 311, 25, -541, -2, 125},
                {5, 1, -2, -31, 232, 11, -42, 1425},
                {4, 1, 2, -41, -52, 15, 2, 1325},
                {120, 1625, 12, -341, 52, 1, 22, 1225},
                {123, -541, -452, 32131, -2, 1123, 2, 1125}
        };
        System.out.println(Arrays.deepToString(start));
        minMax(start);
    }

    public static void minMax(int[][] start) {
        int finish[][] = new int[ROW_COUNT][2];
        for (int i = 0; i < ROW_COUNT; i++) {
            int min = start[i][0];
            int max = start[i][0];
            for (int j = 0; j < COLUMN_COUNT; j++) {
                if (start[i][j] < min) {
                    min = start[i][j];
                }
                if (start[i][j] > max) {
                    max = start[i][j];
                }
            }
            finish[i][0] = min;
            finish[i][1] = max;
        }
        System.out.println(Arrays.deepToString(finish));
    }
}

