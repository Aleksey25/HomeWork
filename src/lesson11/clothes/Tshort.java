package lesson11.clothes;

/**
 * Created by belkin on 23.05.2017.
 */
public class Tshort extends Clothing implements MensClothing, WomenClothing {


    public Tshort(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }

    @Override
    public String toString() {
        return "Tshort{" +
                "size='" + getSize() + '\'' +
                ", cost=" + getCost() +
                ", color='" + getColor() + '\'' +
                '}';
    }


}
