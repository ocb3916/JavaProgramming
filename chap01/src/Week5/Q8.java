package Week5;

// 주사위 굴리기
// myDice 5개 yourDice 5개 myDice 각 주사위 값 myDice의 주사위 총합 yourDice의 각 주사위 값 yourDice 주사위 총합 myDice 총합 + yourDice 총합

public class Q8 {
    public static void main(String[] args) {
        Dice myDice = new Dice();
        Dice yourDice = new Dice();
        int myDice_sum = 0;
        int yourDice_sum = 0;
        
        for (int i = 0; i < 5; i++) {
            int myDice_num = myDice.roll();
            System.out.println("myDice 주사위의 숫자 : " + myDice_num);
            myDice_sum += myDice_num;
        }
        
        System.out.println("myDice 합계 : " + myDice_sum);

        for (int i = 0; i < 5; i++) {
            int yourDice_num = yourDice.roll();
            System.out.println("yourDice 주사위의 숫자 : " + yourDice_num);
            yourDice_sum += yourDice_num;
        }
        
        System.out.println("yourDice 합계 : " + yourDice_sum);

        System.out.println("전체 합계 : " + Dice.sum_whole);
    }
}

class Dice {
    int face;
    static int sum_whole;

    public int roll() {
        face = (int)(Math.random()*5) + 1;
        sum_whole += face;
        return face;
    }
}