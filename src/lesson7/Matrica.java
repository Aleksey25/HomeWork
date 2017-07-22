package lesson7;

import java.util.Arrays;
import java.util.Random;


public class Matrica {
    private int matrica[][] = new int[3][3];
    private int line;
    private int column;

    public Matrica(int line, int column) {
        matrica = new int[line][column];
        this.line = line;
        this.column = column;
    }

    public int[][] getMatrica(int i, int j) {
        return matrica;
    }

    public void setMatrica(int[][] matrica) {
        this.matrica = matrica;
    }

    public void setElement(int line, int column, int value) {
        matrica[line][column] = value;
    }

    public int matricaGetElement(int line, int column) {
        return matrica[line][column];
    }

    public void inicial() {
        Random random = new Random();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                this.setElement(i, j, random.nextInt(100));
            }
        }
    }

    public void umnog(int x) {
        for (int i = 0; i < line; i++) {
            for (i = 0; i < line; i++) {
                for (int j = 0; j < column; j++)
                    this.matrica[i][j] = this.matrica[i][j] * x;
            }
            print();
        }
    }

    public void summ(Matrica matrica) {
        if (matrica.line == this.line && matrica.column == this.column) {
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++)
                    this.matrica[i][j] = this.matrica[i][j] + matrica.matrica[i][j];
            }
            print();
        } else {
            System.out.println("Матрицы имеют разные размерности");
        }
    }

    public void print() {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(this.matrica[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrica matrica1 = (Matrica) o;

        if (line != matrica1.line) return false;
        if (column != matrica1.column) return false;
        return Arrays.deepEquals(matrica, matrica1.matrica);
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(matrica);
        result = 31 * result + line;
        result = 31 * result + column;
        return result;
    }

    @Override
    public String toString() {
        return "Matrica{" +
                "matrica=" + Arrays.toString(matrica) +
                ", line=" + line +
                ", column=" + column +
                '}';
    }
}



