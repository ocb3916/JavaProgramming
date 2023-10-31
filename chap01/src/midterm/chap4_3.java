package midterm;

class Member {
    private String name, id, pw;
    private int age;

    Member(String name, String id, String pw, int age) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }

    void Set_member(String name, String id, String pw, int age) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getId() {
        return id;
    }

    String getPw() {
        return pw;
    }

    int getAge() {
        return age;
    }
}

public class chap4_3 {
    public static void main(String[] args) {
        Member m = new Member("오찬빈", "ocb5351", "ocb5319*&", 23);
    }
}
