package midterm;

import java.util.Scanner;

public class chap2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int a = in.nextInt();
        System.out.printf("%d의 제곱은 %d\n", a, a*a);
    }
}
