package midterm;

import java.util.Scanner;

public class chap3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int age = in.nextInt();

        if (age >= 19)
            System.out.println("성년");
        else
            System.out.println("미성년");
    }
}
    
