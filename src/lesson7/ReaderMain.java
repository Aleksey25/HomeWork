package lesson7;

/**
 * Определить класс, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета, факультет, дата рождения, телефон. Методы takeBook(), returnBook().
 * Разработать программу, в которой создается массив объектов данного класса. В программе организовать: ввод данных о читателях,  вывод информации о читателях.
 */

public class ReaderMain {
    public static void main(String[] args) {
        Reader st1 = new Reader();
        Reader st2 = new Reader();

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

        st1.takebook("Мизери");

        st1.returnbook("Код да-винчи");

        st1.info();
        st2.info();
    }
}
