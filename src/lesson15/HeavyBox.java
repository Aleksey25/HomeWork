package lesson15;

/**
 * Created by belkin on 13.06.2017.
 */
public class HeavyBox {
    private int length;
    private int width;
    private int height;
    private int weight;

    public HeavyBox(int length, int width, int height, int weight) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HeavyBox heavyBox = (HeavyBox) o;

        if (length != heavyBox.length) return false;
        if (width != heavyBox.width) return false;
        if (height != heavyBox.height) return false;
        return weight == heavyBox.weight;
    }

    @Override
    public int hashCode() {
        int result = length;
        result = 31 * result + width;
        result = 31 * result + height;
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
