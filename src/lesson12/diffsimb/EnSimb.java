package lesson12.diffsimb;

        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

/**
 * Created by home pc on 30.05.2017.
 */

public class EnSimb {
    public String enSearch(String text, String regexp) {
        Matcher m = Pattern.compile(regexp).matcher(text);
        int count = 0;
        while (m.find()) {
            System.out.println(text.substring(m.start(), m.end()));
            count++;
        }
        System.out.println("Количество слов содержащих только символы английского алфавита: " + count);
        return " ";
    }
}

