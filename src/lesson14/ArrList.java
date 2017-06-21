package lesson14;



import lesson8.Circle;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UITS-Admin on 07.06.2017.
 */

public class ArrList {
    public static void main(String[] args) {
        List<Circle> arrayList = new ArrayList<>();
        arrayList.add(new Circle(5));
        arrayList.add(new Circle(321));

        for (Circle x : arrayList) {
            System.out.println(x);
        }
    }
}
