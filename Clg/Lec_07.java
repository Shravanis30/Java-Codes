interface solid {
    public void printvolume();
}

interface surface {
    public void printarea();
}

class Rectangle implements surface {
    private int L, B;

    public Rectangle(int m, int n) {
        L = m;
        B = n;
    }

    public void printarea() {
        int a = L * B;
        System.out.println("Area is " + a);
    }
}

class Circle implements surface {
    private int r;

    public Circle(int n) {
        r = n;
    }

    public void printarea() {
        double a = 3.14 * r * r;
        System.out.println("Area is " + a);
    }
}

class box implements solid, surface {
    private int L, B, H;

    public box(int x, int y, int z) {
        L = x;
        B = y;
        H = z;
    }

    public void printvolume() {
        int v = L * B * H;
        System.out.println("Volume is " + v);
    }

    public void printarea() {
        int a = 2 * L * H + 2 * B * H + 2 * L + B;
        System.out.println("Area is " + a);
    }
}

public class Lec_07 {
    public static void main(String args[]) {
        Circle a = new Circle(5);
        Rectangle b = new Rectangle(10, 20);
        box c = new box(2, 3, 4);
        a.printarea();
        b.printarea();
        c.printarea();
        c.printvolume();
    }
}
