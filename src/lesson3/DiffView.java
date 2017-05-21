package lesson3;
/*
* Создать программу, в которой используются разные области видимости переменных. В каждой области объявите свои переменные.
*/
public class DiffView {
    public static void main(String[] args) {
        int x = 6;
        int y = 6;
        if (x > y) {
            int z = 16;
            System.out.println(z);
        } else System.out.println(y);
    }
}

