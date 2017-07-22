package lesson10.fruitmarket;

/**
 * Created by home pc on 10.06.2017.
 */
public class Apricot extends Fruit  {
    private static int count;

    public Apricot(String name, double cost, double weight) {
        super(name, cost, weight);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public double cost() {
        return this.getCost();
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}


