package lesson10.print;

/**
 * Created by student on 17.05.2017.
 */
public class PrintDemo {
    public static void main(String[] args) {
        Printable[] typo = new Printable[6];
        typo[0] = new Book("Книга 1");
        typo[1] = new Book("Книга 2");
        typo[2] = new Book("Книга 3");
        typo[3] = new Magazine("Журнал 1");
        typo[4] = new Magazine("Журнал 2");
        typo[5] = new Magazine("Журнал 3");

        for (Printable x : typo) {
            x.print();
            System.out.println();
        }
    }
}
