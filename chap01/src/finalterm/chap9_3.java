package finalterm;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class chap9_3 {
    public static void main(String[] args) {
        String s = "of the people, by the people, for the people";
        try {
            showTokens(s, ", ");
        } catch (NoSuchElementException e) {
            System.out.println("끝");
        }
    }
    // while(true) {}을 사용하는 showTokens() 메서드 추가
    public static void showTokens(String s, String s2) throws NoSuchElementException {
        StringTokenizer st = new StringTokenizer(s, s2);
        while (true) {
            System.out.println(st.nextToken());
        }
    }
}