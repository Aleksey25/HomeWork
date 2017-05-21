package lesson10.shape;


public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] figures = new Shape[2];
        figures[0] = new Circle("red", 2, 2, 5);
        figures[1] = new Rectangle("green", 6, 7, 5, 2);

        for (Shape figure : figures) {
            figure.draw();
            System.out.println();
        }
    }
}


