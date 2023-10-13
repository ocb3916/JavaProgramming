package sec03;

import java.util.Scanner;

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double findArea() {
        return 3.14 * radius * radius;
    }
}

public class CircleArrayDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle circles[] = new Circle[5];
        double radius[] = new double[5];
        
        for (int i = 0; i < circles.length; i++) {
            radius[i] = in.nextDouble();
            circles[i] = new Circle(radius[i]);
            System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n", circles[i].radius, circles[i].findArea());
        }
    }
}