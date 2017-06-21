package lesson14.students;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by belkin on 13.06.2017.
 */
public class StudentMain {
    public static void main(String[] args) {
        ArrayList students = new ArrayList<>();
        students.add(new Student("Alex", 2));
        students.add(new Student("Sergey", 2));
        students.add(new Student("Andrey", 3));
        students.add(new Student("Victor", 4));
        students.add(new Student("Roman", 3));
        students.add(new Student("Igor", 4));
        students.add(new Student("Anton", 2));

        printStudents(students, 2);
    }


    public static void printStudents(ArrayList students, int a) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student element = iterator.next();
            int b = element.getCourse();
            if (b == a) {
                System.out.println(element);
            }
        }
    }
}
