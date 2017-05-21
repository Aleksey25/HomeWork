package lesson8;

/**
 * Created by test23 on 13.05.2017.
 */
public class Circle {
    private static final double PI = 3.14159;
    private double rad;

    public Circle(double rad) {
        this.rad = rad;
    }

    public double getLength() {
        return 2 * PI * rad;
    }

    public double getSquare() {
        return rad * PI * rad;
    }

    public double getRad() {
        return rad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.rad, rad) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(rad);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "rad=" + rad +
                '}';
    }
}
