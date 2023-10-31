package midterm;

class Dice {
    private int diceNum;
    private int diceSum;
    private static int diceWholeSum;

    void roll(int time) {
        for (int i = 0; i < time; i++) {
            diceNum = (int)(Math.random()*6) + 1;
            diceSum += diceNum;
            System.out.printf("%d회 주사위의 숫자 : %d\n", i + 1, diceNum);
        }
        diceWholeSum += diceSum;
        System.out.println("주사위의 합 : " + diceSum);
        System.out.println("주사위 총합 : " + diceWholeSum);
    }
}

public class chap4_8 {
    public static void main(String[] args) {
        Dice myDice = new Dice();
        Dice yourDice = new Dice();

        myDice.roll(5);
        yourDice.roll(5);
    }
}