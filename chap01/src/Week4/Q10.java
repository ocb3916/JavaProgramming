package Week4;

// 문제 10
// 다음은 주어진 정수가 소수(prime)인지를 조사하는 프로그램의 일부이다. isPrime() 메서드를 완성하라. 여기서 소수는 1보다 크면서 1과 자신 외에는 나누지 않는 수이다.

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        System.out.print("양의 정수를 입력하세요 : ");
        int num = new Scanner(System.in).nextInt();
        if (isPrime(num))
            System.out.println(num + "는 소수입니다.");
        else
            System.out.println(num + "는 소수가 아닙니다.");
    }
    
    static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}