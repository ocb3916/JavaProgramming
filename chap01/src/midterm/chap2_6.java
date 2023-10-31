package midterm;

import java.util.Scanner;

public class chap2_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("화씨온도를 입력하세요 : ");
        double Fahrenheit = in.nextDouble();
        double celsius = (5 * (Fahrenheit - 32)) / 9;
        System.out.printf("변환된 섭씨온도 : %.2f", celsius);
    }
}
