package lesson17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by student on 6/18/2017.
 */
public class First {
    public static void main(String args[])  {

        try (FileInputStream fileIn = new FileInputStream("src\\zzz\\lesson17\\1.txt");
             FileOutputStream fileOut = new FileOutputStream("src\\zzz\\lesson17\\2.txt");
        ) {
            int a;
                while ((a = fileIn.read()) != -1) {
                fileOut.write(a);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


