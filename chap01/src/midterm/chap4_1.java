package midterm;

class Traiangle {
    double base, height;

    Traiangle(double a, double b) {
        this.base = a;
        this.height = b;
    }

    double getBase() {
        return base;
    }

    double getHeight() {
        return height;
    }

    double findArea() {
        return base * height / 2;
    }

    boolean isSameArea(Traiangle t) {
        if (this.findArea() == t.findArea())
            return true;
        else
            return false;
    }
}

public class chap4_1 {
    public static void main(String[] args) {
        Traiangle t1 = new Traiangle(10.0, 5.0);
        Traiangle t2 = new Traiangle(5.0, 10.0);
        Traiangle t3 = new Traiangle(8.0, 8.0);
        
        System.out.println(t1.findArea());
        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}