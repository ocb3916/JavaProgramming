package midterm;

class GolfClub {
    private String golf = "입니다.";

    GolfClub() {
        this.golf = "7번 아이언입니다.";
    }
    GolfClub(int num) {
        this.golf = num + "번 아이언" + golf;
    }

    GolfClub(String name) {
        this.golf = name + golf;
    }

    void print() {
        System.out.println(golf);
    }
}

public class chap4_7 {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print();

        GolfClub g2 = new GolfClub(8);
        g2.print();

        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
    }
}