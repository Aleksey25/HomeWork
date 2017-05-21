package lesson6;
/**
 * Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.
 */
import java.util.Arrays;

public class Div5 {
    public static void main(String[] args) {
        int[] count = new int[100];
        int j = 0;
        int i = 1;
        do {
            count[j] = i;
            if (i % 5 == 0)
                System.out.println(i);
            i++;
            j++;
        } while (i < 101);
        System.out.println(Arrays.toString(count));
    }
}

