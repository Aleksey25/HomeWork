package lesson10.fruitmarket;

/**
 * Created by home pc on 10.06.2017.
 */
public class FruitMain {
    public static void main(String[] args) {
        Fruit[] fruits = {
                new Apple(" Яблоко 1", 15.5, 2),
                new Apple(" Яблоко 2", 8, 1),
                new Apricot(" Сорт 1", 45,0.5),
                new Apricot(" Сорт 2", 50, 1.2),
                new Pear(" Груша 1", 20,1.5),
                new Pear(" Груша 2", 18.5, 1)};

        System.out.println("Общее кол-во фруктов: " + Fruit.getCount() + " общим весом " + totalWeght(fruits) + " кг. Стоимость всех проданных фруктов " + totalCost(fruits));
        System.out.println("Яблок продано: " + Apple.getCount() + " общим весом " + applesTotalWeght(fruits) + " кг. Стоимость всех проданых яблок " + applesTotalCost(fruits));
        System.out.println("Абрикос продано: " + Apricot.getCount() + " общим весом " + apricotTotalWeght(fruits) + " кг. Стоимость всех проданых абрикос " + apricotTotalCost(fruits));
        System.out.println("Груш продано: " + Pear.getCount() + " общим весом " + pearTotalWeght(fruits) + " кг. Стоимость всех проданых груш " + pearTotalCost(fruits));
    }

    public static double applesTotalCost(Fruit[] fruits) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) sum += fruit.cost()*fruit.getWeight();
        }
        return sum;
    }

    public static double applesTotalWeght(Fruit[] fruits) {
        double weght = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) weght += fruit.getWeight();
        }
        return weght;
    }

    public static double apricotTotalCost(Fruit[] fruits) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apricot) sum += fruit.cost()*fruit.getWeight();
        }
        return sum;
    }

    public static double apricotTotalWeght(Fruit[] fruits) {
        double weght = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apricot) weght += fruit.getWeight();
        }
        return weght;
    }

    public static double pearTotalCost(Fruit[] fruits) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Pear) sum += fruit.cost()*fruit.getWeight();
        }
        return sum;
    }

    public static double pearTotalWeght(Fruit[] fruits) {
        double weght = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Pear) weght += fruit.getWeight();
        }
        return weght;
    }

    public static double totalCost(Fruit[] fruits) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            sum += fruit.cost()*fruit.getWeight();
        }
        return sum;
    }
    public static double totalWeght(Fruit[] fruits) {
        double weght = 0;
        for (Fruit fruit : fruits) {
             weght += fruit.getWeight();
        }
        return weght;
    }
}
