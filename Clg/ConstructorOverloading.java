// program to create two rectangles A and B of size 5/7 and 10/20 display area, perimeter of A and B
// Design a class rectangle 
class rectangle {
    private int length, breadth;

    public void area() {
        int a = length * breadth;
        System.out.println(("Area is " + a));
    }

    public void perimeter() {
        int p = 2 * (length + breadth);
        System.out.println("Perimeter is " + p);
    }

    public void Setdimensions(int m, int n) {
        length = m;
        breadth = n;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        rectangle a, b;
        a = new rectangle();
        b = new rectangle();
        a.Setdimensions(5, 7);
        b.Setdimensions(10, 20);
        a.area();
        a.perimeter();
        b.area();
        b.perimeter();
    }
}
