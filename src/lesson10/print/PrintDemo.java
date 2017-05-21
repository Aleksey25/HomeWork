package lesson10.print;

/**
 * Created by student on 17.05.2017.
 */
public class PrintDemo {
    public static void main(String[] args) {
        Printable[] book = new Printable[3];
        book[0] = new Book("Книга 1");
        book[1] = new Book("Книга 2");
        book[2] = new Book("Книга 3");

        for (Printable x : book) {
            x.print();
            System.out.println();
        }
    }
}
