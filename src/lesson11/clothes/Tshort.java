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
        System.out.println(" Футболка");
    }

    @Override
    public void dressWoman() {
        System.out.println(" Футболка");
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
