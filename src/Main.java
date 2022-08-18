import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://hsqldb.org/doc/2.0/changelist_2_0.txt");
        BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));


    }
}