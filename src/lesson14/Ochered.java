package lesson14;

import lesson8.Circle;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by UITS-Admin on 07.06.2017.
 */
public class Ochered {
    public static void main(String[] args) {
        Deque<Circle> queue = new ArrayDeque<Circle>();
        queue.add(new Circle(5));
        queue.add(new Circle(32));

        while (!queue.isEmpty()) {
            System.out.println(queue.remove() + " ");
        }
    }
}
