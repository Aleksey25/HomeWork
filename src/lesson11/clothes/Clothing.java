package lesson11.clothes;


abstract public class Clothing {
    private Sizes size;
    private int cost;
    private String color;

    public Clothing(Sizes size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Clothing() {
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
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

        Clothing clothing = (Clothing) o;

        if (cost != clothing.cost) return false;
        if (size != null ? !size.equals(clothing.size) : clothing.size != null) return false;
        return color != null ? color.equals(clothing.color) : clothing.color == null;
    }

    @Override
    public int hashCode() {
        int result = size != null ? size.hashCode() : 0;
        result = 31 * result + cost;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                "size='" + size + '\'' +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                '}';
    }
}
