package midterm;

class Car {
    private String color;
    private static int count;
    private static int redCount;

    Car(String color) {
        this.color = color;
        count++;
        if (this.color == "red") {
            redCount++;
        }
    }

    static int getNumOfCar() {
        return count;
    }

    static int getNumOfRedCar() {
        return redCount;
    }
}

public class chap4_4 {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d",Car.getNumOfCar(),Car.getNumOfRedCar());
    }
}