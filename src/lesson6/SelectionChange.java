package lesson6;

import java.util.Arrays;


/**
 * Изменить сортировку выбором - исключите обмен значений, если найденный минимальный элемент равен array[i].
 */

public class SelectionChange {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {2, 3, 4, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7, 54, 4646, 464, 44, 4699, 97, 79, 21, 4564, 63, 21, 545, -8},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            sort(arr);
            System.out.println(Arrays.toString(arr));
            long finish = System.nanoTime();
            long time = finish - start;
            System.out.println(time);

        }
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int k = i;
            int x = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < x) {
                    k = j;
                    if (array[i] != array[j]) {
                        x = array[j];
                        array[k] = array[i];
                        array[i] = x;
                    }
                }
            }
        }
    }
}


