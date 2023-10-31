package midterm;

import java.util.Scanner;

public class chap3_7 {
    public static void main(String[] args) {
        String c = input("철수");
        String y = input("영희");
        whoswWin(c, y);
    }

    static String input(String x) {
        Scanner in = new Scanner(System.in);
        System.out.print(x + " : ");
        x = in.next();
        return x;
    }

    static void whoswWin(String c, String y) {
        if (c.equals(y)) {
            System.out.println("무승부");
        }
        else if ((c.equals("s") && y.equals("p")) || (c.equals("r") && y.equals("s")) ||
        (c.equals("p") && y.equals("r"))) {
            System.out.println("철수, 승!");
        }
        else
            System.out.println("영희, 승!");
    }
}
