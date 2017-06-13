package lesson8.flowers;

/**
 * Created by home pc on 10.06.2017.
 */
public class Lily extends Flower {
    String color;

    public Lily(String name, int cost, String color) {
        super(name, cost);
        this.color = color;
    }

    @Override
    public int bouquet(int total) {
        total = total + this.getCost();
        return total;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Lily lily = (Lily) o;

        return color != null ? color.equals(lily.color) : lily.color == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Lily{" +
                "color='" + color + '\'' +
                "} " + super.toString();
    }
}
