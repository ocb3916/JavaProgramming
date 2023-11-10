package sec05;

public class MemberClassDemo {
    private String secret = "비공개";
    String s = "외부";

    class MembereClass {
        String s = "내부";

        public void show1() {
            System.out.println("내부 클래스");
            System.out.println(secret);

            System.out.println(s);

            System.out.println(MemberClassDemo.this.s);
        }
    }

    public static void main(String[] args) {
        MemberClassDemo m = new MemberClassDemo();
        MemberClassDemo.MembereClass m1 = m.new MembereClass();

        System.out.println(m1.s);
        m1.show1();
    }
}
