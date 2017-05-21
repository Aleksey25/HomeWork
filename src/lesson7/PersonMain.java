package lesson7;

/**
 * Создать класс Person...
 */

public class PersonMain {
    public static void main(String[] args) {
        Person pers1 = new Person("Igor", 40);
        Person pers2 = new Person();

        pers2.setName("Aleksey");
        pers2.setAge(25);

        pers1.talk();
        pers2.talk();

        pers1.move();
        pers2.move();
    }
}
