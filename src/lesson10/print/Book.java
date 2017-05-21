package lesson10.print;

/**
 * Created by student on 17.05.2017.
 */
public class Book implements Printable {
String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}
