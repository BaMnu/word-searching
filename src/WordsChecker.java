import java.net.*;
import java.util.*;
import java.io.*;

public class WordsChecker {

    URL text;

    public WordsChecker(URL text) {
        this.text = text;
    }

    public static String urlReader(URL text) throws IOException {
        StringBuilder sb = new StringBuilder();

        String line;
        InputStream ins = text.openStream();

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
            while ((line = reader.readLine()) != null) {
                sb.append(line).append(System.lineSeparator());
            }
        } finally {
            ins.close();
        }
        return sb.toString();
    }

    protected boolean hasWord(String word) throws IOException {
        Set<String> set = new HashSet<>();

        String[] split = urlReader(text).toLowerCase().split("\\P{IsAlphabetic}+");
        Collections.addAll(set, split);

        if (!set.add(word)) {
            System.out.println("This text contains the word - " + word);
            return true;
        } else {
            System.out.println("This text doesn't contain the word - " + word);
            return false;
        }
    }
}
