package lesson11.clothes;

/**
 * Created by belkin on 23.05.2017.
 */
public class Skirt extends Clothing implements WomenClothing {
    public Skirt(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {

    }

    @Override
    public String toString() {
        return "Skirt{" +
                "size='" + getSize() + '\'' +
                ", cost=" + getCost() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
