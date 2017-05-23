package lesson8;

/**
 * Определить класс, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса. В программе организовать: ввод данных о читателях,  вывод информации о читателях.
 */

public class ReaderMain2 {
    public static void main(String[] args) {
        Reader2 st1 = new Reader2();
        Reader2 st2 = new Reader2();

        Book book1 = new Book("Отель", "Артур Хейли");
        Book book2 = new Book("Хоббит", "Дж.Толкиен");
        Book book3 = new Book("Гарри поттер и принц полукровка", "Дж.Роулинг");

        st1.setName("Alexey");
        st1.setNumber(215);
        st1.setDate("25/09/1990");
        st1.setFacult("Самолетостроения");
        st1.setPhone("0500005454");
        System.out.println("Студент " + st1.getName() + " с чит. билетом номер " + st1.getNumber() + " который учится на факультете " + st1.getFacult() + " зарегистрирован");
        System.out.println("Дата рождения: " + st1.getDate() + "; номер телефона: " + st1.getPhone());

        st2.setName("Sergey");
        st2.setNumber(216);
        st2.setDate("12/05/1990");
        st2.setFacult("Самолетостроения");
        st2.setPhone("0500546974");
        System.out.println("Студент " + st2.getName() + " с чит. билетом номер " + st2.getNumber() + " который учится на факультете " + st2.getFacult() + " зарегистрирован");
        System.out.println("Дата рождения: " + st2.getDate() + "; номер телефона: " + st2.getPhone());
        System.out.println();

        st1.takeBook("Мизери");
        st2.takeBook("Ангелы и демоны", "Буратино");
        System.out.println();

        st1.returnBook("Код да-винчи");
        st2.returnBook("Игра престолов", "Властелин колец");
        System.out.println();

        st1.takeBook(book1, book2, book3);
        st1.returnBook(book1, book2, book3);
        System.out.println();

        st1.info();
        st2.info();
    }
}
