package finalterm;

public class test {
    public static void main(String[] args) {
        Thread t = new Thread();

        // 스레드 t를 실행합니다.
        t.start();

        // 스레드 t가 살아 있는지 테스트합니다.
        boolean isAlive = t.isAlive();

        // 스레드 t가 살아 있으면 "스레드 t가 살아 있습니다."를 출력합니다.
        if (isAlive) {
            System.out.println("스레드 t가 살아 있습니다.");
        }

    }
}