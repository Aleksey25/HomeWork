package lesson15;



import java.util.*;

/**
 * Created by student on 6/11/2017.
 */
public class Iter {
    public static void main(String[] args) {
        List<HeavyBox> arrayList = new ArrayList<>();
        arrayList.add(new HeavyBox(5, 4, 87, 1236));
        arrayList.add(new HeavyBox(32, 12, 8127, 312));
        arrayList.add(new HeavyBox(32, 12, 8127, 122));
        arrayList.add(new HeavyBox(32, 12, 8127, 412));

        List<HeavyBox> arrayList1 = new ArrayList<>();

        Iterator<HeavyBox> iterator = arrayList.iterator();
        System.out.println("Without sorting: ");
        while (iterator.hasNext()) {
            HeavyBox element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();


        Iterator<HeavyBox> iterator1 = arrayList.iterator();
        System.out.println("with sorting: ");
        while (iterator1.hasNext()) {
            HeavyBox element = iterator1.next();
            if (element.getWeight() > 300) {
                arrayList1.add(element);
                iterator1.remove();
                System.out.print(element + " ");
            }

        }
        Iterator<HeavyBox> iterator2 = arrayList.iterator();
        System.out.println("\nAfter all: ");
        while (iterator2.hasNext()) {
            HeavyBox element = iterator2.next();
            System.out.print(element + " ");
        }
    }
}
