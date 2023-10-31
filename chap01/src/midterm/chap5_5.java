package midterm;

import java.util.Scanner;

public class chap5_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String star = "*";
        int input;
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        System.out.println("숫자를 10개 입력하세요.");

        for (int i = 0; i < arr1.length; i++) {
            input = in.nextInt();
            arr1[i] = input;

            if (arr1[i] < 0) {               
            }
            else if (arr1[i] < 10) {
                arr2[0]++;
            }
            else if (arr1[i] < 20) {
                arr2[1]++;
            }
            else if (arr1[i] < 30) {
                arr2[2]++;
            }
            else if (arr1[i] < 40) {
                arr2[3]++;
            }
            else if (arr1[i] < 50) {
                arr2[4]++;
            }
            else if (arr1[i] < 60) {
                arr2[5]++;
            }
            else if (arr1[i] < 70) {
                arr2[6]++;
            }
            else if (arr1[i] < 80) {
                arr2[7]++;
            }
            else if (arr1[i] < 90) {
                arr2[8]++;
            }
            else if (arr1[i] < 100) {
                arr2[9]++;
            }
        }
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("%d ~ %d : %s\n", i * 10, i * 10 + 9, star.repeat(arr2[i]));
        }
    }
}
