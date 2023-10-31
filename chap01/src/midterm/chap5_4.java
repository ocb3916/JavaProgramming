package midterm;

import java.util.Scanner;

public class chap5_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        
        do {
            System.out.print("URL을 입력해주세요 : ");
            input = in.next();
            if (input.endsWith("com")) {
                System.out.println(input + "은 'com'으로 끝납니다.");
            }
            if (input.contains("java")) {
                System.out.println(input + "은 'java'를 포함합니다.");
            }
        } while (!input.equals("bye"));
    }
}