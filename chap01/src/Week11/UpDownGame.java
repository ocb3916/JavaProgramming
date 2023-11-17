package Week11;

import java.util.Scanner;

class GameInfo {
    private double key;
    private int count;
    int playernum;

    public void setKey() {
        try {
            this.key = Math.floor(Math.random() * 100) + 1; //Random한 1부터 100까지의 정수형태의 난수 생성.
            if (key < 1 || key > 100)
                throw new Exception();
        } catch (Exception e) { //1~100의 범위를 벗어난 경우 오류 출력
            System.out.printf("생성된 수 : %f -> 문제 범위를 넘어갔습니다.\n", key);
            setKey();
        }
        this.count = 0;
    }
    public void Guess() {
        Scanner in = new Scanner(System.in);
        while (count != 4) {
            System.out.printf("정답을 입력하세요(기회는 총 4번 제공됩니다. 남은 기회: %d): ", 4 - count); // 4 - count를 통해 현재 몇 번째 시도인지 알려줌.
            playernum = in.nextInt();
            if (playernum == key) { //사용자 입력과 비교하여 정오표기.
                System.out.println("정답입니다!");
                break;
            }
            else if (playernum > key) {
                System.out.println("Down!");
            }
            else 
                System.out.println("Up!");
            count++;
        }
        if (count == 4) {
            System.out.printf("정답은 %.0f이었습니다...\n", key);
            System.out.println("4번의 기회를 모두 소진하였으므로 key값이 초기화됩니다...");
            setKey();
        }        
    }
}

public class UpDownGame {
    public static void main(String[] args) {
        GameInfo game = new GameInfo();
        game.setKey();

        game.Guess();
    }
}
