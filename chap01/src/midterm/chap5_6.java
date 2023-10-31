package midterm;

public class chap5_6 {
    public static void main(String[] args) {
        int[] org = {1, 2, 3, 4, 5};
        int[] newArray;
        newArray = reverse(org);

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    public static int[] reverse(int[] org) {
        int[] newArray = new int[org.length];
        int j = 0;
        for (int i = org.length - 1; i >= 0; i--) {
            newArray[j] = org[i];
            j++;
        }
        return newArray;
    }
}