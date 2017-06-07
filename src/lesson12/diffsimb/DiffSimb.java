package lesson12.diffsimb;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DiffSimb {
    public String search(String text, String regexp) {
        Word result = new Word(text);
        Matcher m = Pattern.compile(regexp).matcher(text);
        while (m.find()) {
            Word currentWord = new Word(text.substring(m.start(), m.end()));
            if (currentWord.getUniqueSymb() > result.getUniqueSymb()) {
                result = currentWord;
            }
        }
        return result.getWord();
    }
}

