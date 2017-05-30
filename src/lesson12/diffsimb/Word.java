package lesson12.diffsimb;

/**
 * Created by home pc on 30.05.2017.
 */
public class Word {
    private String word;
    private int uniqueSymb;

    public Word(String word) {
        this.word = word;
        uniqueSymb = uniqueSymbCount(word);
    }

    private int uniqueSymbCount(String word) {
        int count = word.length();
        for (int i = 0; i < word.length() - 1; i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

    public String getWord() {
        return word;
    }

    public int getUniqueSymb() {
        return uniqueSymb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word1 = (Word) o;

        if (uniqueSymb != word1.uniqueSymb) return false;
        return word != null ? word.equals(word1.word) : word1.word == null;
    }

    @Override
    public int hashCode() {
        int result = word != null ? word.hashCode() : 0;
        result = 31 * result + uniqueSymb;
        return result;
    }

    @Override
    public String toString() {
        return "Word{" +
                "word='" + word + '\'' +
                ", uniqueSymb=" + uniqueSymb +
                '}';
    }
}
