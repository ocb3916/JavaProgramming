package sec03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReaderDemo {
    public static void main(String[] args) {
        String input = "chap01\\src\\sec03\\mytext\\org.txt";

        try (FileInputStream fi = new FileInputStream(input); 
         InputStreamReader in = new InputStreamReader(fi, "US-ASCII")) {
            int c;

            System.out.println(in.getEncoding());
            while ((c = in.read()) != -1)
                System.out.print((char) c);
         } catch (IOException e) {
            
         }
    }
}