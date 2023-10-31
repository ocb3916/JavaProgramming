package midterm;

import java.util.Scanner;

public class chap3_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("철수 : ");
        String chulSu = in.next();
        System.out.print("영희 : ");
        String yeongHyi = in.next();

        if (chulSu.equals(yeongHyi)) {
            System.out.println("무승부");
        }
        else if ((chulSu.equals("s") && yeongHyi.equals("p")) || (chulSu.equals("r") && yeongHyi.equals("s")) ||
        (chulSu.equals("p") && yeongHyi.equals("r"))) {
            System.out.println("철수, 승!");
        }
        else
            System.out.println("영희, 승!");
    }
}
