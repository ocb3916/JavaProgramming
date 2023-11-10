package sec01;

abstract class Shape {
    double pi = 3.14;

    abstract void draw();

    public double findArea() {
        return 0.0;
    }
    
}

class Circle extends Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("원을 그리다.");
    }

    public double findArea() {
        return pi * radius * radius;
    }
}

class Rectangle extends Shape {
    int width;
    int hegiht;

    public Rectangle(int width, int height) {
        this.width = width;
        this.hegiht = height;
    }

    public void draw() {
        System.out.println("사각형을 그리다.");
    }

    public double findArea() {
        return width * hegiht;
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        // Shape a = new Shape();

        Circle c = new Circle(3);
        c.draw();
        System.out.printf("원의 넓이는 %.1f\n", c.findArea());

        Rectangle r = new Rectangle(3, 4);
        r.draw();
        System.out.printf("사각형의 넓이는 %.1f\n", r.findArea());
    }
}