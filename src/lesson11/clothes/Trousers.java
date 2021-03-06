package lesson11.clothes;

/**
 * Created by belkin on 23.05.2017.
 */
public class Trousers extends Clothing implements MensClothing, WomenClothing {
    public Trousers(Sizes size, int cost, String color) {
        super(size, cost, color);
    }


    @Override
    public void dressWoman() {
        System.out.println(" Брюки");
    }

    @Override
    public void dressMan() {
        System.out.println(" Брюки");
    }


    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public String toString() {
        return "Trousers{" +
                "size='" + getSize() + '\'' +
                ", cost=" + getCost() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
