import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {

    protected String text;

    public WordsChecker(String text) {
        this.text = text.toLowerCase();
    }

    protected boolean hasWord(String word) {

        Set<String> textSet = new HashSet<>();

        String[] textSplit = text.split("\\P{IsAlphabetic}+");

        textSet.addAll(List.of(textSplit));

        if (textSet.contains(word)) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}