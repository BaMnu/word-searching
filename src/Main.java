import java.net.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
//  ссылка на текстовый документ для примера - https://hsqldb.org/doc/2.0/changelist_2_0.txt

        System.out.println("Please insert desired link with text file:");
        WordsChecker checkWord = new WordsChecker(new URL(scanner.nextLine()));

        System.out.println("Insert the word to find:");
        String search = scanner.nextLine().toLowerCase();
        System.out.println("Searching...");
        checkWord.hasWord(search);
        scanner.close();
    }
}
