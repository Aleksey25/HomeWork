package lesson8.flowers;

/**
 * Created by home pc on 10.06.2017.
 */
public class Rose extends Flower {
    public Rose(String name, int cost, String color) {
        super(name, cost, color);
    }

    @Override
    public int bouquet(int total) {
        total = total + this.getCost();
        return total;
    }

    @Override
    public String toString() {
        return "Rose{} " + super.toString();
    }
}
