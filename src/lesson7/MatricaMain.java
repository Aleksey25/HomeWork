package lesson7;

import java.util.Scanner;

/**
 * Создать класс "Матрица"...
 */

public class MatricaMain {
    public static void main(String[] args) {
        Matrica mat1 = new Matrica(3, 3);
        Matrica mat2 = new Matrica(3, 3);
        mat1.inicial();
        mat2.inicial();
        mat1.print();
        System.out.println();
        mat2.print();

        System.out.println("Что вы хотите сделать с матрицей 1?  1 - умножить на число; 2 - сложить с другой;");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        switch (k) {
            case 1:
                mat1.umnog(3);
                break;
            case 2:
                mat1.summ(mat2);
                break;
            default:
                mat1.print();
                System.exit(0);
        }
    }
}