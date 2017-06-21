package lesson17;

import java.io.*;

/**
 * Created by student on 6/18/2017.
 */
public class Second {
    public static void main(String args[]) {

        try (OutputStream output = new FileOutputStream("src\\lesson17\\3.txt");
             InputStream input = new FileInputStream("file.txt");
        ) {
            char c[] = {'a', 'b', 'c'};

            for (char c1: c) {
                output.write(c1);
            }
            int size = input.available();
            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " ");
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}

