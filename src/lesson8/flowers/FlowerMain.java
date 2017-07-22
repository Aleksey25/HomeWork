package lesson8.flowers;

/**
 * Created by belkin on 08.06.2017.
 */

public class FlowerMain {
    public static void main(String[] args) {
        Flower[] b1 = new Flower[7];
        b1[0] = new Rose("Роза", 30, "red");
        b1[1] = new Rose("Роза", 30, "red");
        b1[2] = new Rose("Роза", 30, "red");
        b1[3] = new Rose("Роза", 30, "red");
        b1[4] = new Rose("Роза", 30, "red");
        b1[5] = new Rose("Роза", 30, "red");
        b1[6] = new Lily("Лилия", 70, "white");

        Flower[] b2 = new Flower[3];
        b2[0] = new Tulip("Тюльпан", 20, "rose");
        b2[1] = new Tulip("Тюльпан", 20, "rose");
        b2[2] = new Tulip("Тюльпан", 20, "rose");

        Flower[] b3 = new Flower[5];
        b3[0] = new Carnation("Гвоздика", 20, "rose");
        b3[1] = new Carnation("Гвоздика", 20, "rose");
        b3[2] = new Lily("Лилия", 70, "rose");
        b3[3] = new Lily("Лилия", 70, "rose");
        b3[4] = new Lily("Лилия", 70, "rose");

        int summ = 0;
        for (Flower x : b1) {
            summ = summ + x.getCost();
        }
        System.out.println("Стоимость букета 1: " + summ);

        summ = 0;
        for (Flower x : b2) {
            summ = summ + x.getCost();
        }
        System.out.println("Стоимость букета 2: " + summ);

        summ = 0;
        for (Flower x : b3) {
            summ = summ + x.getCost();
        }
        System.out.println("Стоимость букета 3: " + summ);

        System.out.println("Всего продано цветов: " + Flower.getCount());
    }
}
