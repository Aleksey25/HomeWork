package lesson12;

/**
 * Created by belkin on 30.05.2017.
 */
public class Polindrom {
    public static void main(String[] args) {
        StringBuilder sb[] = new StringBuilder[6];
        sb[0].append("456");
        sb[1].append("798798");
        sb[2].append("654456");
        sb[3].append("010010");
        sb[4].append("8798978");
        sb[5].append("4565415");

        for (StringBuilder c : sb) {
            if (c == c.reverse()) {
                System.out.println(c);
            }
        }
    }
}
