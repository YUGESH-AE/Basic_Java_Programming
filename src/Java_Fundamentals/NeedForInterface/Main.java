package Java_Fundamentals.NeedForInterface;

/*
1.Interface is used for loose coupling
2.In yugesh class instead of creating laptop and desktop
reference which will tight couple we use interface reference for creating our desired object
 */
public class Main {
    public static void main(String[] args) {
        Computer d = new Desktop();
        Computer l = new Laptop();
        Yugesh y = new Yugesh();
        y.execute(l);
    }
}

interface Computer {
    void compute();
}

class Laptop implements Computer {

    @Override
    public void compute() {
        System.out.println("Compile,run fast");
    }
}

class Desktop implements Computer {

    @Override
    public void compute() {
        System.out.println("compile,run");
    }
}

class Yugesh {

    public void execute(Computer c) {
        c.compute();
    }
}
