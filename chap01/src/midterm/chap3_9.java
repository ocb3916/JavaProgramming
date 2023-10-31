package midterm;

public class chap3_9 {
    public static void main(String[] args) {
        foo("안녕", 1);
        foo("안녕하세요", 1, 2);
        foo("잘 있어");
    }

    static void foo(String s, int i) {
        System.out.println(s + " " + i);
    }
    static void foo(String s, int a, int b) {
        System.out.println(s + " " + a + " " + b);
    }
    static void foo(String s) {
        System.out.println(s);
    }
}
