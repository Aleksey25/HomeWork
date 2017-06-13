package lesson8.flowers;

/**
 * Created by belkin on 08.06.2017.
 */
public abstract class Flower {
    private String name;
    private int cost;
    private static int count;

    public Flower(String name, int cost) {
        this.name = name;
        this.cost = cost;
        count++;
    }

    public abstract int bouquet (int total);

    public static int getcount() {
        return count;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    protected void finalize() {
        System.out.println("In finalize");
        count--;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (cost != flower.cost) return false;
        return name != null ? name.equals(flower.name) : flower.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

}
