package lesson10.shape;

/**
 * Created by student on 17.05.2017.
 */
abstract public class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract public void draw();
}
