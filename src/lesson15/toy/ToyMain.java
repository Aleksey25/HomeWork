package lesson15.toy;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by student on 6/11/2017.
 */
public class ToyMain {
    public static void main(String[] args) {
        Map<String, Toy> hm = new HashMap<>();
        hm.put("Doll", new Toy("Doll", 100));
        hm.put("Lego", new Toy("Lego", 500));
        hm.put("Bear", new Toy("Bear", 70));
        hm.put("Car", new Toy("Car", 250));
        hm.put("Gun", new Toy("Gun", 220));

        Set<Map.Entry<String, Toy>> set = hm.entrySet();
        for (Map.Entry<String, Toy> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
       // System.out.println(hm.entrySet());

        for (String key : hm.keySet()) {
            System.out.println(key + " " + hm.get(key));
        }
        System.out.println();

        for (Toy k : hm.values()) {
            System.out.println(k);
        }

    }
}