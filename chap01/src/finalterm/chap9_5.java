package finalterm;

import java.util.ArrayList;
import java.util.List;

interface Animal {
    void sound();
}

// Dog 클래스와 Cuckoo 클래스
class Dog implements Animal{
    public void sound() {
        System.out.println("멍멍~~");
    }
}

class Cuckoo implements Animal{
    public void sound() {
        System.out.println("뻐꾹뻐꾹~~");
    }
}

public class chap9_5 {
    // printSound() 메서드
    static void printSound(List<? extends Animal> a) {
        for (Animal i : a) {
            i.sound();
        }
    }

    public static void main(String[] args) {
        List<Animal> lists = new ArrayList<>();
        lists.add(new Dog());
        lists.add(new Cuckoo());
        printSound(lists);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        printSound(dogs);
    }
}