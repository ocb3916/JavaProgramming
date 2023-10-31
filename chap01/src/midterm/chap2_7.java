package midterm;

import java.util.Scanner;

public class chap2_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = in.nextInt();
        boolean a = (x % 4 == 0) && (x % 5 == 0);
        boolean b = (x % 4 == 0) || (x % 5 == 0);
        boolean c = (x % 4 == 0) ^ (x % 5 == 0);
        System.out.println("판별결과 1번 : " + a + " 2번 : " + b + " 3번 : " + c);
    }
}
