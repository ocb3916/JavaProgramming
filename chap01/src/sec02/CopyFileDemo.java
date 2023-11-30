package sec02;

import java.io.*;

public class CopyFileDemo {
    public static void main(String[] args) {
        String input = "chap01\\src\\sec02\\mytext\\org.txt";
        String output = "chap01\\src\\sec02\\mytext\\dup.txt";

        try (FileInputStream fis = new FileInputStream(input); FileOutputStream fos = new FileOutputStream(output)) {
            int c;

            while ((c = fis.read()) != -1)
                fos.write(c);
            
        } catch (IOException e) {

        }
    }
}
