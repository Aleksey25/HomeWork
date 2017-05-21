package lesson10.shape;

/**
 * Created by student on 17.05.2017.
 */
public class Circle extends Shape {
    private int x;
    private int y;
    private int rad;

    public Circle(String color, int x, int y, int rad) {
        super(color);
        this.x = x;
        this.y = y;
        this.rad = rad;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public void draw(){
        System.out.println("Рисую " + getColor() + " круг");
        System.out.println("С координатами x:y " + x + " : " + y + " R= " + rad);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (x != circle.x) return false;
        if (y != circle.y) return false;
        return rad == circle.rad;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + rad;
        return result;
    }
}
