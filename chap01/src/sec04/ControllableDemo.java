package sec04;

import sec03.Computer;
import sec03.Controllable;
import sec03.TV;

public class ControllableDemo {
    public static void main(String[] args) {
        Controllable[] controllable = {new TV(), new Computer()};

        for (Controllable c : controllable) {
            c.tunrOn();
            c.turnOff();
            c.repair();
        }
        Controllable.reset();
    }
}
