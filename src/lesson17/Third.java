package lesson17;

import java.io.*;

/**
 * Created by student on 6/18/2017.
 */
public class Third {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src\\lesson3\\file.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src\\lesson17\\4.txt"));
        ) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

