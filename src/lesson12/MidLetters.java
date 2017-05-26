package lesson12;

/**
 * Created by belkin on 26.05.2017.
 */
public class MidLetters {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello!");
        StringBuilder sb2 = new StringBuilder("World!");
        StringBuilder sb3 = new StringBuilder("The main");
        StringBuilder sb4 = new StringBuilder("123123");
        StringBuilder sb5 = new StringBuilder("789987");

        getMidLetters(sb1);
        getMidLetters(sb2);
        getMidLetters(sb3);
        getMidLetters(sb4);
        getMidLetters(sb5);
    }

    private static void getMidLetters(StringBuilder sb) {
        System.out.println(sb);
        StringBuilder mid = sb.delete(0, (sb.length() / 2 - 1));
        mid.setLength(2);
        System.out.println(mid);
        System.out.println();
    }
}
