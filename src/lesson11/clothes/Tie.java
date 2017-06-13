package lesson11.clothes;

/**
 * Created by belkin on 23.05.2017.
 */
public class Tie extends Clothing implements MensClothing {
    public Tie(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println(" Галстук");
    }

    @Override
    public String toString() {
        return "Tie{" +
                "size='" + getSize() + '\'' +
                ", cost=" + getCost() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
