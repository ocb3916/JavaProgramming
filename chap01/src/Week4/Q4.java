package Week4;

// 문제 4
// 다음 실행 결과를 출력하는 프로그램을 for 문을 사용해 작성하라.

public class Q4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}