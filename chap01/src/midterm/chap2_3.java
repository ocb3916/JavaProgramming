package midterm;

import java.util.Scanner;

public class chap2_3 { 
    final static float PI = 3.14f;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("원기둥의 밑면 반지름은? ");
        int radius = in.nextInt();
        System.out.print("원기둥의 높이는? ");
        int height = in.nextInt();
        System.out.printf("원기둥의 부피는 %-5.1f", (float)PI*radius*radius*height);
    }
}
