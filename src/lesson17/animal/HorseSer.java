package lesson17.animal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by student on 6/18/2017.
 */
public class HorseSer {
    public static void main(String[] args) {
        Horse horse = new Horse("Slevin");
        try {
            FileOutputStream fs = new FileOutputStream("testSer1.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(horse);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("testSer1.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            horse = (Horse) ois.readObject(); // 4
            ois.close();
            System.out.println(horse.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
