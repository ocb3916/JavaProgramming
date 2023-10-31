package midterm;

class Complex {
    private double num1, num2;

    Complex(double num) {
        this.num1 = num;
    }

    Complex(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void print() {
        System.out.println(num1 + " + " + num2 + "i");
    }
}

public class chap4_6 {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.0);
        c1.print();
        Complex c2 = new Complex(1.5, 2.5);
        c2.print();
    }
}
