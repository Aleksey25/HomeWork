package lesson8.flowers;

/**
 * Created by home pc on 10.06.2017.
 */
public class Carnation extends Flower {

    public Carnation(String name, int cost, String color) {
        super(name, cost, color);
    }

       @Override
    public String toString() {
        return "Carnation{} " + super.toString();
    }
}
