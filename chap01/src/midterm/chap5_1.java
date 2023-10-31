package midterm;

public class chap5_1 {
    public static void main(String[] args) {
        System.out.println(countChar("apple", 'p'));
    }

    static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}