package finalterm;

abstract class Abstract {
    int i;

    abstract void show() ;
    
}

class Concrete extends Abstract {
    int j;

    Concrete(int i, int j) {
        this.i = i;
        this.j = j;
    }

    @Override
    void show() {
        System.out.printf("i = %d, j = %d", i, j);
    }
}

public class chap7_1 {
    public static void main(String[] args) {
        Concrete c = new Concrete(100, 50);
        c.show();
    }
}