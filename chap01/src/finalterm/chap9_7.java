package finalterm;

class Box <T> {
    T x;

    public void set(T x) {
        this.x = x;
    }

    public T get() {
        return x;
    }
}

public class chap9_7 {
    public static void main(String[] args) {
        Box<Integer> i = new Box<>();
        // 오토박싱으로 그냥 100을 써도 무방한듯
        i.set(100);
        System.out.println(i.get());

        Box<String> s = new Box<>();
        s.set("만능이네!");
        System.out.println(s.get());
    }
}