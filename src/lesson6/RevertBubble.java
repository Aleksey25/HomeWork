package lesson6;

/**
 * Изменить программу сортировки пузырьком: а) добавить возможность досрочного окончания сортировки;
 * б) программа написана таким образом, что минимальный элемент "всплывает" в начало массива.
 * Измените программу так чтобы минимальный элемент "всплывал" в конец массива (внутренний цикл for должен перебирать элементы не с конца, а с начала).
 */

import java.util.Arrays;

public class RevertBubble {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {2, 3, 4, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void sort(int[] array) {
        boolean change;
        for (int i = 0; i < array.length; i++) {
            change = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                    change = true;
                }
            }
            if (!change) {
                return;
            }
        }
    }
}



