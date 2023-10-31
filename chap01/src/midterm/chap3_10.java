package midterm;

import java.util.Scanner;

public class chap3_10 {
    public static void main(String[] args) {
        System.out.print("양의 정수를 입력하세요 : ");
        int num = new Scanner(System.in).nextInt();
        if(isPrime(num))
            System.out.println(num + "은 소수입니다.");
        else
            System.out.println(num + "은 소수가 아닙니다.");
    }

    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}